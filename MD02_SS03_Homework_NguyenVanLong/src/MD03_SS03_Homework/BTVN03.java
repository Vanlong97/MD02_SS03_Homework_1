package MD03_SS03_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN03 {
    public static void main(String[] args) {
        // Cho người dùng nhập vào hai mảng
        // rồi gộp lại vào thành một mảng chung
        Scanner sc = new Scanner(System.in);
        // Nhập vào mảng 1
        System.out.println("Nhập váo số phần tử muốn có trong mảng thứ nhất");
        int number1 = Integer.parseInt(sc.nextLine());
        int[] arrNumber1 = new int [number1];
        for ( int i = 0; i < arrNumber1.length; i++ ) {
            System.out.printf("Nhập váo phần tử thứ %d\t",i);
            arrNumber1[i] = Integer.parseInt(sc.nextLine());
        }
        // Nhập vào mảng hai
        // Nhập vào mảng 1
        System.out.println("Nhập váo số phần tử muốn có trong mảng thứ hai");
        int number2 = Integer.parseInt(sc.nextLine());
        int[] arrNumber2 = new int [number2];
        for ( int i = 0; i < arrNumber2.length; i++ ) {
            System.out.printf("Nhập váo phần tử thứ %d\t", i);
            arrNumber2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(" Hai mảng vừa nhập là:");
        System.out.println(" Mảng vừa nhập là:" + Arrays.toString(arrNumber1));
        System.out.println(" Mảng vừa nhập là:" + Arrays.toString(arrNumber2));
        // Tạo một mảng gộp
        int [] arrNumber = new int [arrNumber1.length + arrNumber2.length];
        // ghi đè lên vào mảng
        for ( int i = 0; i< arrNumber1.length; i++ ) {
            arrNumber[i] = arrNumber1[i];
        }
        for ( int i = 0; i< arrNumber2.length; i++ ) {
            arrNumber[arrNumber1.length + i] = arrNumber1[i];
        }
        System.out.println(" Mảng vừa gộp là:" + Arrays.toString(arrNumber));
    }
}
