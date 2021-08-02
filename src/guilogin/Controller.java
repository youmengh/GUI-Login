package guilogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @Author Youmeng Hin
 * @Version 1.0
 */
public class Controller {

    @FXML
    private Button buttonLogin;
    @FXML
    private Label labelPrompt;
    @FXML
    private TextField textFieldUsername;
    @FXML
    private PasswordField textFieldPassword;

    private final String USERNAME = "developer";
    private final String PASSWORD = "password";

    /**
     * Handles the logic when the login button is clicked..
     * prompts the user whether the username and password entered match with the username and password stored in the program
     *
     * @param event
     */
    public void actionLogin(ActionEvent event) {

        if (textFieldUsername.getText().equals(USERNAME)
                && textFieldPassword.getText().equals(PASSWORD)) {
            labelPrompt.setText("Login was successful :D");
            textFieldUsername.clear();
            textFieldPassword.clear();
        } else {
            labelPrompt.setText("Incorrect username or password... please try again :(");
            textFieldUsername.clear();
            textFieldPassword.clear();
        }

    }

}
