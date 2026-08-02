import java.util.Scanner;

public class Baitap4_BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhap chieu cao (m): ");
        double chieuCao = sc.nextDouble();

        System.out.print("Nhap can nang (kg): ");
        double canNang = sc.nextDouble();

        // Tính BMI
        double bmi = canNang / (chieuCao * chieuCao);

        // Xuất BMI
        System.out.printf("Chi so BMI = %.2f\n", bmi);

        // Đánh giá
        if (bmi < 18.5) {
            System.out.println("Tinh trang: Gay");
        } else if (bmi < 23) {
            System.out.println("Tinh trang: Binh thuong");
        } else if (bmi < 25) {
            System.out.println("Tinh trang: Thua can");
        } else if (bmi < 30) {
            System.out.println("Tinh trang: Beo phi do I");
        } else {
            System.out.println("Tinh trang: Beo phi do II");
        }

        sc.close();
    }
}