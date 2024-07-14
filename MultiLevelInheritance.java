public class MultiLevelInheritance {
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
        class Puppy extends Dog{
            void weep(){
                System.out.println("This animal can weep");;
            }
        }        
    
        public static void main(String[] args) {
            MultiLevelInheritance.Puppy P1 = new MultiLevelInheritance().new Puppy();
            P1.weep();
            P1.bark();
            P1.eat();
        }
}
