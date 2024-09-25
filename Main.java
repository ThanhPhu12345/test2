
public class Main {
    public static void main(String[] args) {
        Sinhvien A = new Sinhvien(883, "van", 4, 5, 6);

        Sinhvien B = new Sinhvien();
        B.nhapdulieu();
        // In tiêu đề
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "TEN", "MASO", "DIEM", "DIEMGK", "DIEMTB");
        // %-15s định dạng chuỗi với chiều rộng 15, căn trái.
        // %-15d định dạng số nguyên với chiều rộng 15, căn trái.
        // %-15.2f định dạng số thực với chiều rộng 15, căn trái, và 2 chữ số thập phân.
        // In thông tin sinh viên
        System.out.println(A.toString());
        System.out.println(B.toString());
    }
}