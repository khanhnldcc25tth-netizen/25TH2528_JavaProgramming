package Main;

import java.util.Scanner;

public class BaiTap1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        double diemTB = scanner.nextDouble();

        System.out.println("\n===== THÔNG TIN SINH VIÊN =====");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);

        scanner.close();
    }
}