package MD03_SS03_Homework;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN04 {
    public static void main(String[] args) {
        /*
        Cho người dùng nhập vào mảng hai chiều sau đó tìm ra tọa độ cũng
        như giá trị của phần tử lớn nhất
         */

        // khai báo mảng hai chiều
        // cho vòng lặp chạy các phần tử trong mảng
        // array[i] > max => max = array[i]
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng cho mảng hai chiều: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột cho mảng hai chiều: ");
        int col = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập vào phan tử có tọa độ %d,%d\t", i, j);
               matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập là:" );
        for (int[] element : matrix) {
            System.out.println(Arrays.toString(element));
        }
        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if( matrix[i][j] > max ){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là:" + max);
    }
}
