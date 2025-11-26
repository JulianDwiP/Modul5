package Tugas;


import java.util.Objects; 

class User {
    protected String username;
    protected String password;

    public User(String n, String p) {
        this.username = n;
        this.password = p;
        System.out.println("User " + n + " created.");
    }

    public void saveCredentials(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Credentials updated for user: " + username);
    }
}

