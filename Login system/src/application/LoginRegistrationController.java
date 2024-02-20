package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginRegistrationController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	@FXML
    private PasswordField confirmp;

    @FXML
    private DatePicker dateofbirth;

    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phone;
	@FXML
	private TextField LogInEmail;
	@FXML
	private TextField LogInPassword;
	
	
	public void LoginButtonClicked(ActionEvent event) throws IOException {
		String loginemail = LogInEmail.getText();
		String loginpassword = LogInPassword.getText();
		
		if(loginemail.isEmpty() || loginpassword.isEmpty() ) {
			Alert("error " , " Enter username and password ");
		}
		
		else {
		Parent root = FXMLLoader.load(getClass().getResource("User.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	}
	
	private void Alert(String name , String content) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setContentText(content);
		alert.showAndWait();
	}
	
	public void RegistrationButtonClicked(ActionEvent event )throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void logOutButton(ActionEvent event )throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void RegisterMeButtonClicked(ActionEvent event) throws IOException {
		String ConfirmPassword = confirmp.getText();
		String UserName = name.getText();
		String UserEmail = email.getText();
		String DateOfBirth = dateofbirth.getAccessibleText();
		//String password = password.getText();
		String Password = password.getText();
		String phoneNumber = phone.getText();
		
		if(ConfirmPassword.isEmpty() ||  UserName.isEmpty() || UserEmail.isEmpty() || Password.isEmpty() || phoneNumber.isEmpty()) {
			Alert("error" , "fill all the spaces above ");
		}
		else {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		//Alert("sucess " , "login with the information provided ");
		}
	}
}
