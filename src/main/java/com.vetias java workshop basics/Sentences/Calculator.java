
public class Calculator {

      public int divide(int a,int b) {
             try{
                if (b==0) {
                  throw new ArithmeticException("divisable by zero is not allowed:");

                }
             }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                return 0;
            }
            return a/b;
        }
      public int addtion(int a,int b) {
        return a+b;

      }
      public int Subtraction(int a,int b) {
        return a-b;
      }
      public int multiplication(int a,int b) {
        return a*b;
      }


      public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("Division"+calculator.divide(0,5));
        System.out.println("Addition"+calculator.addtion(18,35));
        System.out.println("Subtraction"+calculator.Subtraction(30,25));
        System.out.println("multiplication"+calculator.multiplication(35,78));

      }  
    

}
 