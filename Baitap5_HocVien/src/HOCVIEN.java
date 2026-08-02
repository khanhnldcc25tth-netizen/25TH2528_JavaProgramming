public class HOCVIEN {

    // Thuộc tính
    private String maHocVien;
    private String hoTen;
    private int namSinh;
    private String gioiTinh;

    // Constructor không tham số
    public HOCVIEN() {

    }

    // Constructor có tham số
    public HOCVIEN(String maHocVien, String hoTen, int namSinh, String gioiTinh) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    // Getter và Setter
    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}