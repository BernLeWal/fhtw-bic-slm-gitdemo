package at.fhtw.slm.consoleapp;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter
    private int id;
    @Getter
    private String login;
    @Getter @Setter
    private String passwordHash;

    public User(int id, String login, String passwordHash) {
        this.id = id;
        this.login = login;
        this.passwordHash = passwordHash;
    }
}
