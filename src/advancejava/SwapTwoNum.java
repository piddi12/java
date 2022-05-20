package advancejava;

import java.util.Scanner;

public class SwapTwoNum {

    public static void main(String[] args) {
        int a,b;
        Scanner swap= new Scanner(System.in);
        a= swap.nextInt();
        b=swap.nextInt();
        System.out.println("Before Swapping"+ a+","+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping"+a+","+b);
    }

}
