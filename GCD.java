//11. Find GCD of two numbers using for loop and if statement:-
import java.util.Scanner;
public class A{
public static void main(String args[]){
System.out.println("Enter any two numbers: ");
 
Scanner sc=new Scanner(System.in); int a=sc.nextInt();
int b=sc.nextInt();
int gcd=1;
for(int i=1;i<=a&&i<=b;i++){ if(a%i==0&&b%i==0){
gcd=i; }
}
System.out.println("The GCD of the numbers is: "+ gcd); }
}
