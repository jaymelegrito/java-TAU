package chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private double allotedMinutes;
    private double minutesUsed;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    } 

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public double getAllotedMinutes(){
        return allotedMinutes;
    }

    public void setAllotedMinutes(double allotedMinutes){
        this.allotedMinutes = allotedMinutes;
    }

    public double getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverChargeFee(){
        return (allotedMinutes - minutesUsed) * 0.25;
    }

    public double calculateSubtotal(){
        return calculateOverChargeFee() + baseCost;
    }

    public double calculateTax(){
        return calculateSubtotal() * 0.15;
    }

    public double calculateTotal(){
        return calculateTax() + calculateSubtotal();
    }

    //Constructors
    public PhoneBill(){
        id = 0;
        baseCost = 799;
        allotedMinutes = 150;
        minutesUsed = 150;
    }

    public PhoneBill(int id){
        setId(id);
        baseCost = 799;
        allotedMinutes = 150;
        minutesUsed = 150;
    }

    public PhoneBill(int id, double baseCost, double allotedMinutes, double minutesUsed){
        setId(id);
        setBaseCost(baseCost);
        setAllotedMinutes(allotedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public void printItemizedBill(){
        System.out.println("Your Phone Bill");
        System.out.println("ID Number: " + id);
        System.out.println("Base Cost: $" + String.format("%.2f",baseCost));
        System.out.println("Overage Fee: $" + String.format("%.2f",calculateOverChargeFee()));
        System.out.println("Tax: $" + String.format("%.2f",calculateTax()));
        System.out.println("Total: $" + String.format("%.2f",calculateTotal()));    
    }


    
}
