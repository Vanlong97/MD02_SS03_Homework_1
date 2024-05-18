package MD03_SS03_B2;

import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        /*
        Chèn một phần tử vào mảng
        Khai báo số phần tử và nhập giá trị
        Nhập chỉ số phần tử muốn chèn
        Chèn phần tử vào mảng có số phần tử là n
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng");
        int length = Integer.parseInt(sc.nextLine());
        int[] oldArray = new int[length];
        System.out.println("Nhập giá trị vào phần tử trong mảng");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.printf("Number[%d]\t", i);
            oldArray[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng vừa nhập là:" + Arrays.toString(oldArray));
        System.out.println("\n");
        System.out.println("Nhập chỉ số phần tử thêm vào mảng");
        int index = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập phần tử muốn thêm vào mảng");
        int number = Integer.parseInt(sc.nextLine());
        if (index < 0) {
            System.err.println("Chỉ số không tồn tại");
        } else if ( index >= length) {
            System.err.println("Chỉ số không tồn tại");
        } else {
            int[] newArray = new int[length+1];
            for ( int i = 0; i< index;i++) {
                newArray[i] = oldArray[i];
            }
            newArray[index] = number;
            for( int i = newArray.length -1 ; i > index; i--) {
                newArray[i] = oldArray[i-1];
            }
            System.out.println("Mảng vừa nhập là:" + Arrays.toString(newArray));
        }
    }
}
