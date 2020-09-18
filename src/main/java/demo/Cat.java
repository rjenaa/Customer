package demo;

public class Cat extends  Feline{
    @Override
    public void eat(){
        System.out.println("Cat eats fish");
    }
    @Override
    public void makeNoise(){
        System.out.println("meeooow");
    }
}