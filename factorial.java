//8. Find factorial of a number using for loop:-
import java.util.Scanner;
public class Main{
public static void main(String args[]){
System.out.println("Enter number of terms: "); Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 
int fact=1;
for(int i=1;i<=n;i++){
fact*=i; }
System.out.println("The factorial is "+fact); }
}
