import java.util.Scanner;

public class Sinhvien {
    private String ten;
    private int masv;
    private double diem;
    private double diemgk;
    private double diemtb;
    Scanner scan = new Scanner(System.in);

    // Constructor mặc định
    public Sinhvien() {
    }

    // Constructor có tham số
    public Sinhvien(int masv, String ten, double diem, double diemgk, double diemtb) {
        this.ten = ten;
        this.masv = masv;
        this.diem = diem;
        this.diemgk = diemgk;
        this.diemtb = diemtb;
    }

    // Setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setDiemgk(double diemgk) {
        this.diemgk = diemgk;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    // Getter
    public String getTen() {
        return ten;
    }

    public int getMasv() {
        return masv;
    }

    public double getDiem() {
        return diem;
    }

    public double getDiemgk() {
        return diemgk;
    }

    /*
     * các hàm set sẽ được dùg cho các costructor mặc định và tham số
     * vd : // Tạo đối tượng Sinhvien với constructor có tham số
     * Sinhvien A = new Sinhvien(883, "Van", 4, 5, 6);
     * 
     * // Sử dụng các phương thức setter để thay đổi giá trị của đối tượng A
     * A.setTen("Nam");
     * A.setMasv(885);
     * A.setDiem(9.0);
     * A.setDiemgk(8.5);
     * A.setDiemtb(8.8);
     * 
     * // Tạo đối tượng Sinhvien với constructor mặc định
     * Sinhvien B = new Sinhvien();
     * 
     * // Sử dụng các phương thức setter để gán giá trị cho đối tượng B
     * B.setTen("Lan");
     * B.setMasv(884);
     * B.setDiem(8.5);
     * B.setDiemgk(7.5);
     * B.setDiemtb(8.);
     */

    public void nhapdulieu() {
        System.out.println("NHAP TEN SV");
        ten = scan.nextLine();
        System.out.println("NHAP MA SO SINH VIEN");
        masv = Integer.parseInt(scan.nextLine());
        System.out.println("NHAP DIEM ");
        diem = scan.nextDouble();
        System.out.println("NHAP DIEM GK");
        diemgk = scan.nextDouble();
        System.out.println("NHAP DIEM TB");
        diemtb = scan.nextDouble();
    }

    @Override
    public String toString() {
        // Sử dụng String.format để định dạng chuỗi
        String res = String.format("%-15s%-15d%-15.2f%-15.2f%-15.2f", ten, masv, diem, diemgk, diemtb);
        // %-15s định dạng chuỗi với chiều rộng 15, căn trái.
        // %-15d định dạng số nguyên với chiều rộng 15, căn trái.
        // %-15.2f định dạng số thực với chiều rộng 15, căn trái, và 2 chữ số thập phân.

        return res;
    }
}
