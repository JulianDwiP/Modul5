package Tugas;

public class MainTest {
    public static void main(String[] args) {
        User user1 = new User("initial_name", "initial_pass");
        user1.saveCredentials("admin_baru", "password_aman");
        System.out.println("Current Username: " + user1.username);
    }
}