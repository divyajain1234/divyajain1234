import java.io.FileWrite;
class Main{
     public static void main (String[] args){
         String data = " This is the data in the output File";
        
         try{
             FileWrite output= new FileWrite("a.txt");
             output.write(data);
             System.out.println("Data in Written to the file");
            
             output .close();
         }
         catch(Exception e){
            e.getStackTrace();
}
}
}
