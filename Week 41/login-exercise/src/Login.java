public class Login extends Bank{
    private String name = "";
    private String pass = "";
    private boolean nameCorrect = false;
    private boolean loggedIn = false;
    //setters
    protected void name(String _name){
        this.name = _name;
    }

    protected void pass(String _pass){
        this.pass = _pass;
    }

    protected void setNameCheck(boolean _nameCorrect){
        this.nameCorrect = _nameCorrect;
    }

    protected void setLoggedIn(boolean _loggedIn){
        this.loggedIn = _loggedIn;
    }
    //getters
    protected String getName(){
        return name;
    }

    protected String getPass(){
        return pass;
    }

    protected boolean getNameCheck(){
        return nameCorrect;
    }

    protected boolean isLoggedIn(){
        return loggedIn;
    }
}