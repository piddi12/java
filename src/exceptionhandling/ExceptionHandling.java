package exceptionhandling;

public class ExceptionHandling {

    public static void main(String[]args){

        try {
            int myInt = Integer.parseInt("andf");
        }
        catch (Exception e){
            System.out.println("Hey Ddude");
        }
        finally {
            System.out.println("Always execute");
        }
        System.out.println("End here");
    }
}
