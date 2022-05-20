package exceptionhandling;

public class Finally {
    public static void main(String[] args) {
        try{
            int num=121/0;
            System.out.println(num);
        }
        catch (ArithmeticException e){
            System.out.println("Number Should Not be Divided By Zero");
        }
        finally {
            System.out.println("This is Finally Method");
        }
    }
}
