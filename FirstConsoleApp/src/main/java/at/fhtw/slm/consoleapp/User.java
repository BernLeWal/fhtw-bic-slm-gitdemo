package at.fhtw.slm.consoleapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class User {
    @Getter
    private int id;
    @Getter
    private String login;
    @Getter @Setter
    private String passwordHash;
}
