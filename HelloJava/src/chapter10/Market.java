package chapter10;

public class Market {
    
    public static void main(String[] args){
        Watermelon watermelon = new Watermelon();
        System.out.println("Calories: " + watermelon.getCalories());
        watermelon.makeJuice();
        watermelon.peelWatermelon();

        Fruit avocado = new Avocado();
        System.out.println("Calories: " + avocado.getCalories());
        avocado.makeJuice();

        avocado = new Watermelon();
        System.out.println("Calories: " + avocado.getCalories());
        ((Watermelon)avocado).peelWatermelon();
    }
}
