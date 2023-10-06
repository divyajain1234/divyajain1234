class Data{
    private String name;
    public String setter(string name){
        this.name=name;

    }
    public String getter(){
        return name;
    }
    
}
public class Main{
    public static void main(String[] args){
    
    Data d=new Data();
   
    System.out.println(d.getter());
}
}
