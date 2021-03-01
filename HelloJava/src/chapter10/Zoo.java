package chapter10;

public class Zoo {
    
    public static void main(String[] args){
        Dog sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        Animal rocky = new Dog();
        rocky.makeSound();
        feed(rocky);

        rocky = new Cat();
        rocky.makeSound();
        ((Cat) rocky).scratch(); //casting
        feed(rocky);
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("Here's your dog food.");
        }

        else if(animal instanceof Cat){
            System.out.println("Here's your cat food.");
        }

    }
}
