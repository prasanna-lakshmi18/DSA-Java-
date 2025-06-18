package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");
        nameField.getStyleClass().add("text-field");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.getStyleClass().add("password-field");

        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");
        emailField.getStyleClass().add("text-field");

        TextField phoneField = new TextField();
        phoneField.setPromptText("Enter your phone number");
        phoneField.getStyleClass().add("text-field");
        phoneField.textProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal.matches("\\d*")) {
                phoneField.setText(newVal.replaceAll("[^\\d]", ""));
            } else if (newVal.length() > 10) {
                phoneField.setText(oldVal);
            }
        });

        Label genderLabel = new Label("Select Gender:");
        RadioButton maleButton = new RadioButton("Male");
        RadioButton femaleButton = new RadioButton("Female");
        RadioButton otherButton = new RadioButton("Other");

        ToggleGroup genderGroup = new ToggleGroup();
        maleButton.setToggleGroup(genderGroup);
        femaleButton.setToggleGroup(genderGroup);
        otherButton.setToggleGroup(genderGroup);
        maleButton.setSelected(true);

        HBox genderBox = new HBox(10, maleButton, femaleButton, otherButton);

        Button submitButton = new Button("Submit");
        submitButton.getStyleClass().add("button");

        Label outputLabel = new Label();
        outputLabel.getStyleClass().add("label");

        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String password = passwordField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();
            String gender = selectedGender != null ? selectedGender.getText() : "Not selected";

            outputLabel.setText(
                "Name: " + name + "\n" +
                "Password: " + password + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Gender: " + gender
            );
        });

        VBox layout = new VBox(12,
                nameField,
                passwordField,
                emailField,
                phoneField,
                genderLabel,
                genderBox,
                submitButton,
                outputLabel
        );
        layout.getStyleClass().add("root");

        Scene scene = new Scene(layout, 400, 450);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        primaryStage.setTitle("User Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
