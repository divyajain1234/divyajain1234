//create an interface for calculator.
interface Calculator{
    void calculator(double num1,double num2,char operations);
}
public class BasicCalculator implements Calculator{
    public void calculate(Double num1,double num2,char operator){
        switch(operator){
            case'+':
                System.out.println("Result:"+(num+ num2));
                break;
                case'-':
                    System.out.println("Result:"+(num1+num2));
                    break;
                    case'-':
                        System.out.println("Result:"+(num1-num2));
                        break;
                        case'*':
                            System.out.println("Result:"+(num1/num2));
        }
        else 
        {
            System.out.println("Error:Division by zero");
        }
        break;
        default:
        System.out.println("Error:Invalid operator.");
    }
    public static void main (String[] args){
        Calculator calculator = new BasicCalculator();
        double num1=10.0;
        double num2=5.0;
        char operator = '+';
        
        calculator.calculate(num1,num2,operator);
    }
}
