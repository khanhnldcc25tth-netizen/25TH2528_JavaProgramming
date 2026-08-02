/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Baitap2_ChuviDT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập chiều dài
		System.out.print("Nhap chieu dai: ");
		double dai = sc.nextDouble();

		// Nhập chiều rộng
		System.out.print("Nhap chieu rong: ");
		double rong = sc.nextDouble();

		// Tính chu vi
		double chuVi = (dai + rong) * 2;

		// Tính diện tích
		double dienTich = dai * rong;

		// Tìm cạnh nhỏ
		double canhNho;
		if (dai < rong) {
		    canhNho = dai;
		} else {
		    canhNho = rong;
		}

		// Xuất kết quả
		System.out.println("Chu vi = " + chuVi);
		System.out.println("Dien tich = " + dienTich);
		System.out.println("Canh nho = " + canhNho);

		sc.close();

	}

}
