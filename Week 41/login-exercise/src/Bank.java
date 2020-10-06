public class Bank {
    private int defaultCapital = 1000;
    //setters
    protected void withdraw(int num){
        if(num > 0 && defaultCapital-num >= 0){
            this.defaultCapital -= num;
        }else{
            System.out.println("This action is not possible!");
        }
    }

    protected void deposit(int num){
        if(num > 0){
            this.defaultCapital += num;
        }else{
            System.out.println("This action is not possible!");
        }
    }
    //getters
    protected int viewAccount() {
        return defaultCapital;
    }
}
