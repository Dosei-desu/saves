import java.util.ArrayList;

public class User{

    //ArrayList<String> name = new ArrayList<String>();

    private String name;
    private String pass;
    private int wallet;

    User( String name, String pass,int wallet){
        this.name = name;
        this.pass = pass;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
}
