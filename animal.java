ublic class Animal
{
    public int legcount;
    public void display() {
        system.out.println("I am an animal,");
        System.out.println("I have"+"legs,");
    }
}
public class Main{
    public static void main(String[] args){
        Animal animal=new Animal();
        animal.legcount=4;
        animal.display();
    }
}
