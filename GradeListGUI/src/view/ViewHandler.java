package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.GradeListModel;

public class ViewHandler
{
  private Scene currentScene;
  private Stage primaryStage;
  private AddGradeViewController gradeViewController;
  private GradeListViewController gradeListViewController;
  private DetailsViewController detailsViewController;
  private GradeListModel gradeListModel;

  public ViewHandler(GradeListModel gradeListModel)
  {
    this.currentScene = new Scene(new Region());
    this.gradeListModel = gradeListModel;
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView();
  }

  public void openView()
  {
    Region root = loadGradeListView("GradeListView.fxml");
    currentScene.setRoot(root);
    String title = "";
    if (root.getUserData() != null)
    {
      title += root.getUserData();
    }
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }

  private Region loadLoginView(String fxmlFile)
  {
    if (loginViewController == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        Region root = loader.load();
        loginViewController = loader.getController();
        loginViewController.init(this, gradeListModel,root);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      loginViewController.reset();
    }
    return loginViewController.getRoot();
  }

  public void closeView()
  {
    primaryStage.close();
  }

}
