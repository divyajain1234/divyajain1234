//9. Generate multiplication table using for loop:-
import java.util.Scanner;
public class Main{
public static void main(String args[]){
System.out.println("Enter the number whose table you want to print:");
Scanner sc=new Scanner(System.in); int n=sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(n+" "+"*"+" "+i+" "+"="+n*i); }
 
} }
