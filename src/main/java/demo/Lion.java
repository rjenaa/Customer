package demo;

public class Lion extends Feline{
    public void eat(){
        System.out.println("Lions eat people");
    }
    @Override
    public void makeNoise(){
        System.out.println("Rooar");
    }
}
