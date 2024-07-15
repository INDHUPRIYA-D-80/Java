public class HierachicalInheritance {
    class Animal{
            void eat(){
                System.out.println("This animal can eat");
            }
        }
        class Dog extends Animal{//Sub class-I
            void bark(){
                System.out.println("This animal can bark");;
            }
        } 
        class Cat extends Animal{//Sub class-II
            void meow(){
                System.out.println("This animal says meow");;
            }
        }        
    
        public static void main(String[] args) {
            HierachicalInheritance.Dog P1 = new HierachicalInheritance().new Dog();
            P1.bark();
            P1.eat();
            HierachicalInheritance.Cat C1 = new HierachicalInheritance().new Cat();
            C1.meow();
            C1.eat();
        }
}


