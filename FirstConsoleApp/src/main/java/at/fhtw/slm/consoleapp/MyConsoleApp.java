package at.fhtw.slm.consoleapp;

public class MyConsoleApp {
    public static void main(String[] args) {
        System.out.println("A big hello to all of the world!....");

        User user = new User(1, "Rudi", "Ratlos");
        System.out.println(user);
        var user2 = new User(2, "Susi", "Sorglos");
        System.out.println(user2);
    }
}
