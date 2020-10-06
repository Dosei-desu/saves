public class Bank {
    private long defaultCapital = 0;

    //setters
    protected void withdraw(long num){
        if(num > 0 && defaultCapital-num >= 0){
            this.defaultCapital -= num;
        }else{
            System.out.println("This action is not possible!");
        }
    }

    protected void deposit(long num){
        if(num > 0){
            this.defaultCapital += num;
        }else{
            System.out.println("This action is not possible!");
        }
    }

    //getters
    protected long viewAccount() {
        return defaultCapital;
    }

    protected void setCapital(long num){
        defaultCapital = num;
    }
}
