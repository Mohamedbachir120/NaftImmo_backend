package dz.com.naftal.naftimo.payload.request;


public class ChangePasswordRequest {

    private String password;
    private String newpassword;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNewpassword() {
        return newpassword;
    }
    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    
    
}
