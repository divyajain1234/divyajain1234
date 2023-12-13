import java.io.*;
class Main{
     public static void main (String[] args){
         try{
             
         
         File file = new File("a.txt");
         FileWriter fr= new FileWriter(file,true);
         fr.write(" data is append");
         fr.close();
         }
         
        catch(Exception e)
        
{}
}
}
