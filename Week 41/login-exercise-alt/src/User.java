public class User extends Bank{
    private String name;
    private String pass;

    //constructors
    User(String name, String pass, long balance){
        this.name = name;
        this.pass = pass;
        setBalance(balance);
    }

    //getters
    protected String getName(){
        return this.name;
    }

    protected String getPass(){
        return this.pass;
    }
}
