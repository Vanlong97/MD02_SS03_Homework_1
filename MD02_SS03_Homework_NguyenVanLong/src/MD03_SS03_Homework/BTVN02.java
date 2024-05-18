package MD03_SS03_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN02 {
    public static void main(String[] args) {
        /*
        cho người dùng nhập một mảng có n phần tử
        sau đấy cho người dùng thêm một phần tử vào mảng từ bàn phím
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập váo số phần tử muốn có trong mảng");
        int number = Integer.parseInt(sc.nextLine());
        int[] arrNumber = new int [number];
        for ( int i = 0; i < arrNumber.length; i++ ) {
            System.out.printf("Nhập váo phần tử thứ %d\t",i);
            arrNumber[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(" Mảng vừa nhập là:" + Arrays.toString(arrNumber));
        System.out.println("Nhập váo số muốn thêm vào mảng");
        int addNumber = Integer.parseInt(sc.nextLine());
        int[] arrNewNumber = new int[number+1];
        for ( int i = 0 ; i < arrNumber.length ; i++) {
            if ( arrNumber[i] == addNumber) {
                System.out.println("Số vừa nhập đã có trong mảng");
                break;
            } else {
                for ( int j = 0; j< arrNumber.length; j++) {
                    arrNewNumber[j] = arrNumber[j];
                    }
                arrNewNumber[arrNewNumber.length-1] = addNumber;

            }
        }
        arrNumber = arrNewNumber;
        System.out.println(" Mảng mới là:" + Arrays.toString(arrNewNumber));
    }
}
