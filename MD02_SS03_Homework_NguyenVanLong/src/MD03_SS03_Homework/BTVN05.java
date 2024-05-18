package MD03_SS03_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN05 {
    public static void main(String[] args) {
        /*
        Nhập vào một mảng tìm giá trị nhỏ nhất
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử muốn có trong mảng:");
        int n = Integer.parseInt(sc.nextLine());
        int[] arrNumber = new int[n];
          for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d trong mảng:\t",i);
            arrNumber[i] = Integer.parseInt(sc.nextLine());
          }
        System.out.println("Mảng vừa nhập là:" + Arrays.toString(arrNumber));
          int min = arrNumber[0];
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] < min) {
                min = arrNumber[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là:" + min);

    }
}
