package advancejava;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        x= sc.nextInt();
        y= sc.nextInt();
        z= sc.nextInt();
        if (x>y && x>z){
            System.out.println("First Number is Largest");
        }
            else if (y>x && y>z){
           System.out.println("Second number is Largest");

        } else if (z>x && z>y) {
          System.out.println("Third Number is Largest");
        }
    }
}
