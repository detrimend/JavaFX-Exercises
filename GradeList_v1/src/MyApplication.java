import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewHandler;

public class MyApplication extends Application
{
  public void start(Stage primaryStage)
  {
    ViewHandler view = new ViewHandler();
    view.start(primaryStage);
  }
}