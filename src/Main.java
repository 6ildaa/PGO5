public class Main {
    public static void main(String[] args) {

        //Zadania 1 i 2

        Car Tesla = new Car(4);
        Tesla.start();
        Tesla.stop();
        Tesla.start();
        Tesla.stop();
        System.out.println("Number of seats: " + Tesla.getNumberOfSeats());

        //Zadania 3 i 4
        Animal animal = new Animal();
        animal.sleep();
        animal.makeNoise();
        animal.roam();
        System.out.println();
        Lion lion = new Lion();
        lion.sleep();
        lion.makeNoise();
        lion.roam();
        System.out.println();
        Cat cat = new Cat();
        cat.sleep();
        cat.makeNoise();
        cat.roam();
        System.out.println();
        Wolf wolf = new Wolf();
        wolf.sleep();
        wolf.makeNoise();
        wolf.roam();
        System.out.println();
        Dog dog = new Dog();
        dog.sleep();
        dog.makeNoise();
        dog.roam();














    }
}
