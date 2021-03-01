package chapter10;

public class Avocado extends Fruit {

    @Override
    public void makeJuice(){
        System.out.println("Avocado juice is ready!");
    }

    public void removeSeed(){
        System.out.println("Seed removed.");
    }

    public Avocado(){
        super(20);
    }
    
}
