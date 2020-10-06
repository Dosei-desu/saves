public class Bank {
    long defaultBalance;

    //setter
    protected void setBalance(long num){
        this.defaultBalance = num;
    }
    //getter
    protected long getBalance(){
        return this.defaultBalance;
    }

    protected void withdraw(long num){
        if(num > 0 && defaultBalance - num >= 0){
            defaultBalance -= num;
        }else{
            System.out.println("This action is not possible!");
        }
    }

    protected void deposit(long num){
        if(num > 0){
            defaultBalance += num;
        }else{
            System.out.println("This action is not possible!");
        }
    }
}
