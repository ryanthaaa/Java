public class Login {
    private String username;
    private String password;

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    
    public boolean loginLog(String inputUser, String inputPass) {
        if (inputUser.equals(this.username) && inputPass.equals(this.password)) {
            return true;
        }else {
            return false;
        }
    }

}