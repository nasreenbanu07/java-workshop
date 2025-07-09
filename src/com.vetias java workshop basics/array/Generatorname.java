import java.util.Scanner;
import java.lang.String;
public class Generatorname {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String name= sc.next();
        System.out.println("enter the gender:");
        String gender=sc.next();
        System.out.println("enter the qualification:");
        String qualification=sc.next();
        if("male".equalsIgnorecase(gender)){
            System.out.println("Mr. ");
        }
        else if ("female".equalsIgnorecase(gender)){
        System.out.println("Ms. ");
        }
        else{
            System.out.println("invalid gender:");
        }

        
        
        }


    }
        
    


