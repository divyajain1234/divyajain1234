import java.util.Scanner;
public class Main{
public static void main(String args[]){
System.out.println("Enter any alphabet: "); Scanner sc=new Scanner(System.in); char a=sc.next().charAt(0); if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
System.out.println("The entered alphabet is a vowel."); }
else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){ System.out.println("The entered alphabet is a vowel.");

} else{
System.out.println("The entered alphabet is a consonant.");
} }
