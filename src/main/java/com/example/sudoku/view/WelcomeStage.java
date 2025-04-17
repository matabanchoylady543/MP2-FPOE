package com.example.sudoku.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Represents the welcome window (stage) shown at the start of the application.
 *
 * <p>This class loads the FXML layout for the welcome screen and sets basic
 * properties for the window such as title, icon, and size. It follows a
 * Singleton-like pattern using an internal holder class to manage a single instance.</p>
 *
 * @author lady vanessa matabanchoy
 * @version 1.0
 * @since 1.0
 */
public class WelcomeStage extends Stage {

    /**
     * Constructs the WelcomeStage by loading the FXML file and setting up the scene.
     *
     * @throws IOException if the FXML file cannot be loaded.
     */
    public WelcomeStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/sudoku/welcome-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        setScene(scene);
        setTitle("Sudoku - Welcome");
        getIcons().add(new Image(String.valueOf(getClass().getResource("/com/example/sudoku/favicon.png"))));
        setResizable(false);
        show();
    }

    /**
     * Closes and deletes the current instance of the WelcomeStage.
     */
    public static void deleteInstance() {
        WelcomeStageHolder.INSTANCE.close();
    }

    /**
     * Returns the singleton instance of {@code WelcomeStage}.
     * If a new instance is requested, it replaces the previous one.
     *
     * @return the current instance of {@code WelcomeStage}.
     * @throws IOException if the FXML file cannot be loaded.
     */
    public static WelcomeStage getInstance() throws IOException {
        WelcomeStageHolder.INSTANCE = new WelcomeStage();
        return WelcomeStageHolder.INSTANCE;
    }

    /**
     * Internal static holder class for managing the single instance of WelcomeStage.
     * This approach ensures lazy initialization and avoids thread-safety issues
     * in single-threaded JavaFX applications.
     */
    private static class WelcomeStageHolder {
        private static WelcomeStage INSTANCE;
    }
}
