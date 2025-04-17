package com.example.sudoku.controller;

import com.example.sudoku.model.UserSession;
import com.example.sudoku.view.GameStage;
import com.example.sudoku.view.WelcomeStage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;

/**
 * Controller class for the Welcome Stage of the Sudoku game.
 * Handles user interactions on the welcome screen, including username input
 * and transitioning to the game stage.
 *
 * This controller is associated with the FXML file that defines the welcome UI.
 * It captures the username entered by the player and initializes the game view.
 *
 * @author Lady vanessa matabanchoy
 * @version 1.0
 * @since 1.0
 */
public class WelcomeController {

    /**
     * Text field where the user enters their username.
     */
    @FXML
    private TextField usernameField;

    /**
     * Button that starts the game when clicked.
     */
    @FXML
    private Button playButton;

    /**
     * Handles the logic when the Play button is clicked.
     *
     * <p>This method:
     * <ol>
     *   <li>Retrieves the username from the text field.</li>
     *   <li>Stores it in a singleton {@link UserSession} instance.</li>
     *   <li>Closes the WelcomeStage window.</li>
     *   <li>Opens the GameStage window.</li>
     * </ol>
     *
     * @throws IOException if there is an error loading the GameStage FXML.
     */
    @FXML
    private void handlePlayButton() throws IOException {
        UserSession userSession = UserSession.getInstance();
        userSession.setUsername(usernameField.getText().trim());

        WelcomeStage.deleteInstance();
        GameStage.getInstance();
    }
}
