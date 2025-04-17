package com.example.sudoku.model;

/**
 * Singleton class that represents the current user's session.
 * <p>
 * Stores session-related data, such as the username of the player.
 * Ensures that only one instance of the session exists during the application's lifecycle.
 * </p>
 *
 * <p>This class is useful for sharing user information between different stages or controllers.</p>
 *
 * @author lady vanessa matabanchoy
 * @version 1.0
 * @since 1.0
 */
public class UserSession {

    /**
     * The single instance of the UserSession (Singleton pattern).
     */
    private static UserSession instance;

    /**
     * The username of the currently logged-in user.
     */
    private String username;

    /**
     * Private constructor to prevent external instantiation.
     * Use {@link #getInstance()} to access the singleton instance.
     */
    private UserSession() {}

    /**
     * Returns the singleton instance of {@code UserSession}.
     * If no instance exists, a new one is created.
     *
     * @return the unique instance of {@code UserSession}.
     */
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    /**
     * Sets the username for the current session.
     *
     * @param username the username to associate with this session.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the username associated with the current session.
     *
     * @return the current username, or {@code null} if not set.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Clears the current session data.
     * This method sets the username to {@code null}.
     */
    public void cleanSession() {
        username = null;
    }
}
