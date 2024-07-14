public class SingleInheritance {
    class Animal{
        void eat(){
            System.out.println("This animal can eat");
        }
    }
    class Dog extends Animal{
        void bark(){
            System.out.println("This animal can bark");;
        }
    }        

    public static void main(String[] args) {
        SingleInheritance.Dog D1 = new SingleInheritance().new Dog();
        D1.bark();
        D1.eat();
    }
}
