// Abstraction
abstract class Animal {
    abstract void makeSound();  // abstract method
}

// Inheritance and Encapsulation
class Dog extends Animal {
    private String breed;  // Encapsulation: private field

    public Dog(String breed) {  // constructor
        this.breed = breed;
    }

    public String getBreed() {  // getter for encapsulated field
        return breed;
    }

    @Override
    void makeSound() {  // Polymorphism: runtime method overriding
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Labrador");
        myDog.makeSound();  // Polymorphism: method behavior depends on object type
    }
}
