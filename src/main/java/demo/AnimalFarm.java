package demo;

public class AnimalFarm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Wolf();
        animals[2] = new Lion();
        // Animal[] animalsArray = {new Cat(), new Wolf(),new Lion() };
        for (Animal a :animals) {
            a.eat();
            //putting
            a.giveShot(a);
        }
    }
}