//20. Box Program:-
public class Box{ private int height; private int length; private int breadth; Box(){
height=0; length=0; breadth=0;
}
Box(int height, int length, int breadth){
this.height=height; this.length=length; this.breadth=breadth;
}
public int Volume(){
return(length*breadth*height); }
public static void main(String args[]){
Box cuboid1=new Box(); System.out.println("The area of the cuboid is" +
cuboid1.Volume());
Box cuboid2=new Box(10,15,30);

System.out.println("The area of cuboid is"+ cuboid2.Volume());
} }
