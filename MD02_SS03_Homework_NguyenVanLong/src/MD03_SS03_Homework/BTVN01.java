package MD03_SS03_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN01 {
    public static void main(String[] args) {
        // xóa một phần tử được nhập từ bàn phím ra khỏi mảng
        // nếu phần tử đó xuất hiện trong mảng
        int[] arrNumber = {1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP VÀO SỐ MUỐN XÓA RA KHỎI MẢNG: ");
        int number = Integer.parseInt(sc.nextLine());
        int index = -1;
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] == number) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int[] arrNewNumber = new int[arrNumber.length-1];
            for ( int i = index; i < arrNumber.length - 1; i++) {
                arrNumber[i] = arrNumber[i+1];
            }
            arrNumber[arrNumber.length-1] = 0;
            for ( int i = 0 ; i < arrNewNumber.length ; i++) {
                arrNewNumber[i] = arrNumber[i];
            }
            arrNumber = arrNewNumber;
            System.out.println(" Mảng sau khi xóa là:" + Arrays.toString(arrNumber));
        }else {
            System.out.println("Không có phần tử này trong mảng");
        }
    }
}
