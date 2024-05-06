package assignments.assignment4;

import java.util.HashMap;
import java.util.Map;

import assignments.assignment3.DepeFood;
import assignments.assignment3.User;
import assignments.assignment4.components.form.LoginForm;
import assignments.assignment4.page.AdminMenu;
import assignments.assignment4.page.CustomerMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage window;
    private Map<String, Scene> allScenes = new HashMap<>();
    private Scene currentScene;
    private static User user;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("DepeFood Ordering System");
        DepeFood.initUser(); // Initialize users

        // Initialize all scenes
        Scene loginScene = new LoginForm(window, this).getScene();

        // Populate all scenes map
        allScenes.put("Login", loginScene);

        // Set the initial scene of the application to the login scene
        setScene(loginScene);
        window.show();
    }

    public void setUser(User newUser) {
        user = newUser;
    }

    // Method to set a scene
    public void setScene(Scene scene) {
        window.setScene(scene);
        currentScene = scene;
    }

    // Method to get a scene by name
    public Scene getScene(String sceneName) {
        return allScenes.get(sceneName);
    }

    public void addScene(String sceneName, Scene scene){
        allScenes.put(sceneName, scene);
    }

    public void logout() {
        setUser(null); // Clear the current user
        setScene(getScene("Login")); // Switch to the login scene
    }

    public static void main(String[] args) {
        launch(args);
    }
}
