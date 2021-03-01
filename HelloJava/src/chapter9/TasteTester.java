package chapter9;

public class TasteTester {

    public static void main(String[] args){
        
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(5);
        birthdayCake.setPrice(560.00);

        System.out.println("Your birthday cake:");
        System.out.println("Flavor: " + birthdayCake.getFlavor());
        System.out.println("Number of tiers: " + birthdayCake.getCandles());
        System.out.println("Price: " + birthdayCake.getPrice());

    }
    
}
