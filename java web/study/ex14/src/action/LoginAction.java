package action;

public class LoginAction {
    String username;
    String password;

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

    public String execute() throws Exception{
        System.out.println("LoginAction");
        if (username.equals(password)){
            return "success";
        }
        return "fail";
    }
}
