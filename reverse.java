//12. Program to find the reverse of a number:-
import java.util.Scanner;
public class A{
public static void main(String args[]){
System.out.println("Enter any number: "); Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rev=0;
while(n>0){
int a=n%10; n=n/10;
 
rev=(rev*10)+a; }
System.out.println("The reversed number is: "+rev); }
}
