import java.util.ArrayList;

public class DuLieu {

    public static void main(String[] args) {

        ArrayList<HocVien> danhSach = new ArrayList<>();

        // Tạo sẵn 3 học viên
        danhSach.add(new HocVien("HV01", "Nguyen Van An", 2004, "Nam"));
        danhSach.add(new HocVien("HV02", "Tran Thi Binh", 2002, "Nu"));
        danhSach.add(new HocVien("HV03", "Le Van Cuong", 2005, "Nam"));

        // In danh sách học viên
        System.out.println("DANH SACH HOC VIEN");
        System.out.println("==========================");

        for (HocVien hv : danhSach) {
            hv.hienThiThongTin();
        }

        // Tìm học viên nhiều tuổi nhất
        HocVien lonTuoiNhat = danhSach.get(0);

        for (HocVien hv : danhSach) {
            if (hv.getNamSinh() < lonTuoiNhat.getNamSinh()) {
                lonTuoiNhat = hv;
            }
        }

        System.out.println("HOC VIEN NHIEU TUOI NHAT");
        System.out.println("==========================");
        lonTuoiNhat.hienThiThongTin();
    }
}