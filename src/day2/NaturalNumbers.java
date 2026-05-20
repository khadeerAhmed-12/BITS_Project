package day2;

import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args)
    {
        int n=100;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           System.out.print(i+" "); 
        }
        System.out.println();
    }
}
