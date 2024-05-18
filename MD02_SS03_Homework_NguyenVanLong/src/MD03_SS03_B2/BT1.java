package MD03_SS03_B2;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        /*
        Nhập số phần tử mảng và khai báo mảng số nguyên
        nhập giá trị cho các phần tử của mảng
        Nhập chỉ số phần tử cần xóa
           Nếu chỉ số <0 thông báo lỗi chỉ số không tồn tại
           Nếu chỉ số >=n thông báo lỗi không tồn tại
           Nếu chỉ số nằm trong khoảng 0-(n-1) thì thực hiện
           khoi tạo một mảng mới và copy các phần tử không bị xóa sang
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
        System.out.println("Nhập chỉ số phần tử muốn xóa trong mảng");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0) {
            System.err.println("Chỉ số không tồn tại");
        } else if ( index >= length) {
            System.err.println("Chỉ số không tồn tại");
        } else {
            for ( int i = index ; i < oldArray.length-1 ; i ++) {
                oldArray[i] = oldArray[i+1];
            }
            int[] newArray = new int[length-1];
            for ( int i = 0 ; i < newArray.length; i ++) {
               newArray[i] = oldArray[i];
            }
            System.out.println("Mảng mới là:" + Arrays.toString(newArray));
        }
    }
}
