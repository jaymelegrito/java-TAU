package chapter9;

public class InheritanceTester {

    public static void main(String[] args){

        Mother mom = new Mother();
        mom.setName("Rachel");

        System.out.println(mom.getName() + " is a " + mom.getGender());

    }
    
}
