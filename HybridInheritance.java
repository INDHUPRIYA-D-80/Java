public class HybridInheritance {
    class Animal{//super class
        void eat(){
            System.out.println("This animal can eat");
        }
    }
    class Dog extends Animal{//Sub class-I
        void bark(){
            System.out.println("This animal can bark");;
        }
    } 
    class Puppy extends Dog{//Derived class
        void weep(){
            System.out.println("This animal can weep");;
        }
    }
    class Cat extends Animal{//Sub class-II
        void meow(){
            System.out.println("This animal says meow");;
        }
    }       

    public static void main(String[] args) {
        HybridInheritance.Puppy P1 = new HybridInheritance().new Puppy();
        P1.weep();
        P1.bark();
        P1.eat();
        HybridInheritance.Cat C1 = new HybridInheritance().new Cat();
        C1.meow();
        C1.eat();
    }
}
