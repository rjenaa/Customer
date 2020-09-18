package demo;

public class  Animal {
    private String food;


    public  void eat(){

    }
    public void makeNoise(){
        System.out.println("Animals make noise");
    }
    public void roam(){
        System.out.println("Riding around and getting it");
    }
    public void giveShot(Animal a){
        System.out.println("Do horrible things to animal");
        a.makeNoise();
    }


}
