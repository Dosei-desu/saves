public class Login extends Bank{
    private String name = "";
    private String pass = "";
    private boolean nameCorrect = false;
    private boolean loggedIn = false;

    Login(String _name, String _pass, long _money){
        this.name = _name;
        this.pass = _pass;
        setCapital(_money);
    }

    //setters
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