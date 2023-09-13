/convert string to upper case to lower case and vice versa
import java.util.Scanner;
class Main{
 public static void main (String[] args) {
     
    System.out.println("enter String");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println("Entr choice:- 0 for uppercase and 1 for lowercase");
    int i=sc.nextInt();
    switch(i){
        case 0:
        System.out.println(s.toUpperCase());
        break;
        case 1:
        System.out.println(s.toLowerCase());
        break;
        default:
        System.out.println("Wrong number entered");
    }
   
}
}
