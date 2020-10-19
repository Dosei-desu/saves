public class Main {
    public static void main(String[] args) {
        //example usage
        ConsoleColors cc = new ConsoleColors();
        cc.printTxtGreen("text").printTxtYellow("Ok yay").printTxtUnderline("---- OMG ----").print(true);
        cc.clearTxtBuffer();
        cc.printTxtBlue("SØREN ER EN VANDMELON!!").print(true);
    }
}
