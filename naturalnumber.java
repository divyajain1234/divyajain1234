//7. Sum of natural numbers using for loop:-
  
import java.util.Scanner;
public class Main{
public static void main(String args[]){
System.out.println("Enter number of terms: "); Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++){ sum+=i;
}
System.out.println("The sum is "+sum); }
}
