public class LogInPageConstraint {

    private String emailId;
    private String passwordId;
    private String loginButtonId;

    public LogInPageConstraint(){

        emailId="email";
        passwordId="pass";
        loginButtonId="loginbutton";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPasswordId() {
        return passwordId;
    }

    public String getLoginButtonId() {
        return loginButtonId;
    }
}

