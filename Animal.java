//to demonstrate method overriding and inheritance
class Animal {
    public void Eat(){
       System.out.println("eat in parent class");
}
}

        class Dog extends Animals {
            public void Eat(){
                System.out.println("eat in subclass");
            }
            public void Bark()
            {
                System.out.println("Barking");
            }
           }
            public class Main{
                public static void main(String[] args)
                {
                Animal a=new Animal();
                a.eat();
                Dog d=new Dog();
                d.eat();
                Animal c= new Dog()
                c.eat();
            }
   
