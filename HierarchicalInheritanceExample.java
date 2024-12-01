
class Animal // Parent class
{ 
    String name;

    Animal(String name)  // Constructor
     {
        this.name = name;
    }

  
    void eat()  // Common method
    {
        System.out.println(name + " is eating.");
    }


    void sleep() // Common method
     {
        System.out.println(name + " is sleeping.");
    }
}


class Bird extends Animal // Child class 1
{
    Bird(String name) {
        super(name);
    }

    void fly()  // Specific method for Bird
    {
        System.out.println(name + " is flying.");
    }
}


class Fish extends Animal // Child class 2
{
    Fish(String name) {
        super(name);
    }

 
    void swim()   // Specific method for Fish
     {
        System.out.println(name + " is swimming.");
    }
}


public class HierarchicalInheritanceExample // Main class
{
    public static void main(String[] args) {
        // Create Bird object
        Bird sparrow = new Bird("Sparrow");
        sparrow.eat();
        sparrow.fly();
        sparrow.sleep();

        System.out.println();

        // Create Fish object
        Fish goldfish = new Fish("Goldfish");
        goldfish.eat();
        goldfish.swim();
        goldfish.sleep();
    }
}

