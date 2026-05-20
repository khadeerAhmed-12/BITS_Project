package day2;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("insert the element at position"+ i );
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

    }
    
}
