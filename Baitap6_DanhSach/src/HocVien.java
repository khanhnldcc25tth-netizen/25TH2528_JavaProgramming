public class HocVien {
    private String maHocVien;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;

    // Hàm tạo
    public HocVien(String maHocVien, String hoTen, int namSinh, String gioiTinh) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    // Getter
    public String getMaHocVien() {
        return maHocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    // Setter
    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã HV: " + maHocVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("---------------------------");
    }
}