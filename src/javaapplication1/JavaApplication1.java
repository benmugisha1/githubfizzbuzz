package javaapplication1;
import java .util .*;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number:");
        int number=scanner.nextInt();
        if(number%5==0&& number%3==0){
            System.out.println("FizzBuzz");
        }
        else if (number%5==0){
            System.out.println("Fizz");
        }
        else if (number%3==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
        
        
    }
    
}
