package day2;

import java.util.Scanner;
public class SeriesOfArmStrongNumber {
        public static boolean solution(int num){
        
        //step 1: get count of digits
        int temp = num;
        int count = 0;

        while(temp != 0) {
            count++;
            temp = temp / 10;
        }

        //step 2: calculate the consicutive sum of all digits with
        temp = num;
        double result =0;
        while(temp != 0){
            int digit = temp % 10;
            result = result + Math.pow(digit,count);
            temp /= 10;
        }
        System.out.println(result+ " " + num);
        return result == num;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //if(solution(num)) {
             //   System.out.println("This is a Armstrong number");
            //}else{
            //  System.out.println("Not an Armstrong number");
            for(int i=1;i<=num;i++){
                if(solution(i)){
                    System.out.println(i + " ");
                }
            }
              System.out.println();
        }
    }

