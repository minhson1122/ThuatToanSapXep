import sun.security.mscapi.CPublicKey;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng");
        int doDai = input.nextInt();
        int[] arr = new int[doDai];
        System.out.println("nhập các phần tử vào mảng");
        for (int i = 0; i < doDai; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);


        System.out.println(binarySearch(arr,5));
    }
    public static int binarySearch(int[] arr, int value){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            if (arr[middle] == value){ 
                return middle;
            } else if (value < arr[middle] ) {
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return -1;
    }





}
