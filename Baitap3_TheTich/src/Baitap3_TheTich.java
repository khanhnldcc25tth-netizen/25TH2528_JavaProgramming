import java.util.Scanner;

public class Baitap3_TheTich {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập cạnh của khối lập phương
        System.out.print("Nhap canh cua khoi lap phuong: ");
        double canh = sc.nextDouble();

        // Tính thể tích
        double theTich = canh * canh * canh;

        // Xuất kết quả
        System.out.println("The tich cua khoi lap phuong = " + theTich);

        sc.close();
    }
}