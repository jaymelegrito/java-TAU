package chapter10;

public class Watermelon extends Fruit {
    
    @Override
    public void makeJuice(){
        System.out.println("Watermelon juice is ready!");
    }

    public void peelWatermelon(){
        System.out.println("Watermelon is peeled");
    }

    public Watermelon(){
        super(12);
    }
}
