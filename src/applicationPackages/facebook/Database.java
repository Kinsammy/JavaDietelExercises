package applicationPackages.facebook;


import java.util.Objects;

public class Database {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String newsFeed(){
        return "Welcome to my Facebook page";
    }

    public void login(String username, String password){
        if (Objects.equals(username, getUsername()) && Objects.equals(password, getPassword())){
            System.out.println(newsFeed());
        }
    }
}
