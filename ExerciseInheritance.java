public class ExerciseInheritance {
    static class Animal{
        String name;
        int age;
        void makeSound(){
            System.out.println("Animal makes Sound");
        }
    }
    static class Dog extends Animal{
        String breed;
        void makeSound(){
            System.out.println("Dog Barks.");
        }
    }
    static class Cat extends Animal{
        String colour;
        void makeSound(){
            System.out.println("Meows..");
        } 
        void climb(){
            System.out.println("Cat is Climbing");
        }
    }

    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.name = "Giraffe";
        a1.age = 23;
        a1.makeSound();
        Dog d1=new Dog();
        d1.name = "Tommy";
        d1.age = 2;
        d1.makeSound();
        Cat c1 =new Cat();
        c1.name = "Bujju";
        c1.age = 1;
        c1.makeSound();
        c1.climb();
    }
}
