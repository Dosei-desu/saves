import sun.awt.image.ImageWatched;

public class Main {



    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        for(int i = 1; i <= 10; ++i){
            list.append(i);
        }

        //list.printList();

        //list.append(31);
        //list.prepend(51);
        list.deleteData(1);
        list.printList();
    }
}
