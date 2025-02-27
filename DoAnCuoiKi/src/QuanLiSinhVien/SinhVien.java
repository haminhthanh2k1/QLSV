package QuanLiSinhVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SinhVien {
    private String lop;
    private String maSV;
    private String hoTen;
    private LocalDate ngaySinh;
    private String gioiTinh;
    private String soDienThoai;
    private String email;
    private List<MonHoc> danhSachMonHoc; // Khai báo biến danhSachMonHoc

    // Constructor
    public SinhVien(String lop, String maSV, String hoTen, LocalDate ngaySinh, String gioiTinh, String soDienThoai, String email) {
        this.lop = lop;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.danhSachMonHoc = new ArrayList<>(); // Khởi tạo danhSachMonHoc
    }

    // Getter và Setter
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MonHoc> getDanhSachMonHoc() {
        return danhSachMonHoc;
    }

    public void setDanhSachMonHoc(List<MonHoc> danhSachMonHoc) {
        this.danhSachMonHoc = danhSachMonHoc;
    }

    // Thêm môn học
    public void themMonHoc(MonHoc monHoc) {
        danhSachMonHoc.add(monHoc);
    }

    // Tìm môn học theo mã môn học
    public MonHoc timMonHoc(String maMonHoc) {
        for (MonHoc monHoc : danhSachMonHoc) {
            if (monHoc.getMaMonHoc().equals(maMonHoc)) {
                return monHoc;
            }
        }
        return null; // Nếu không tìm thấy
    }

    // Xóa môn học
    public void xoaMonHoc(String maMonHoc) {
        MonHoc monHoc = timMonHoc(maMonHoc);
        if (monHoc != null) {
            danhSachMonHoc.remove(monHoc);
        }
    }

    // Sửa thông tin sinh viên
    public void suaThongTinSinhVien(String hoTen, LocalDate ngaySinh, String lop, String gioiTinh, String soDienThoai, String email) {
        if (hoTen != null && !hoTen.trim().isEmpty()) this.hoTen = hoTen;
        if (ngaySinh != null) this.ngaySinh = ngaySinh;
        if (lop != null && !lop.trim().isEmpty()) this.lop = lop;
        if (gioiTinh != null && !gioiTinh.trim().isEmpty()) this.gioiTinh = gioiTinh;
        if (soDienThoai != null && !soDienThoai.trim().isEmpty()) this.soDienThoai = soDienThoai;
        if (email != null && !email.trim().isEmpty()) this.email = email;
    }
}
