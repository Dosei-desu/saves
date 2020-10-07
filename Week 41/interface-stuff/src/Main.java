import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Deer());
        animals.add(new Tuna());
        animals.add(new Hawk());
        animals.add(new Bob());

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).flying()) {
                System.out.println("I am a "+animals.get(i).animalType()+"and I can fly.");
            }
            if (animals.get(i).walking()) {
                System.out.println("I am a "+animals.get(i).animalType()+"and I can walk.");
            }
            if (animals.get(i).swimming()) {
                System.out.println("I am a "+animals.get(i).animalType()+"and I can swim.");
            }
            if (animals.get(i).talking()) {
                System.out.println("I am a "+animals.get(i).animalType()+"and I can talk.");
            }
            System.out.println("I am a "+animals.get(i).animalType()+"and I make this sound: "+animals.get(i).animalNoise()+"\n");
        }

        animals.get(3).setAlive(false);

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).stats();
        }
    }
}

//Johan's notes on aggregation, composition, and inferfaces:
/*
- https://www.notion.so/Aggregation-Composition-Interfaces-766493e9623e4ef794bc3a9883242895
*/

//Java stuff about inferfaces:
/*
- https://www.tutorialspoint.com/java/java_interfaces.htm
*/