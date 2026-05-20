package day2;

public class MinMax {
    public static void main(String[] args){
        int[] arr = {2,3,7,12,1,4};

        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
    }
    
}
