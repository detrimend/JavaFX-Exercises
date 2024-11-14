package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.LoginModel;

public class LoginViewController
{
  @FXML private TextField usernameField;
  @FXML private PasswordField passwordField;
  @FXML private Label errorLabel;
  private Region root;
  private ViewHandler viewHandler;
  private LoginModel loginModel;

  public void init(ViewHandler viewHandler, LoginModel loginModel, Region root)
  {
    this.viewHandler = viewHandler;
    this.loginModel = loginModel;
    this.root = root;
  }

  public void reset()
  {
    usernameField.setText("");
    passwordField.setText("");
    errorLabel.setText("");
  }

  public Region getRoot()
  {
    return root;
  }

  @FXML private void loginButtonPressed()
  {
    boolean ok = loginModel.isLoggedIn();
    if (ok)
    {
      errorLabel.setText("Great success");
    }
    else
    {
      errorLabel.setText("Login failure");
    }
  }

  @FXML private void cancelButtonPressed()
  {
    viewHandler.closeView();
  }

}
