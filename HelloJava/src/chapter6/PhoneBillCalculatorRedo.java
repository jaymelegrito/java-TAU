package chapter6;

public class PhoneBillCalculatorRedo{
    public static void main(String [] args){
        PhoneBill phoneBill = new PhoneBill(123890, 1450.75, 10, 6.50);
        phoneBill.printItemizedBill();
    }
}