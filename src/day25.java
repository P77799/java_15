class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow moos");
    }
}

public class day25 {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal a : animals) {
            a.makeSound();   // Polymorphism in action!
        }
    }
}
