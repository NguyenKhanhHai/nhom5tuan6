public class Test {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();

        // Tạo sách giáo trình
        SachGiaoTrinh sgk1 = new SachGiaoTrinh("GT001", "Giải tích 1", "TS. Lê Văn A", 2023, 10, "Toán", "Đại học");
        SachGiaoTrinh sgk2 = new SachGiaoTrinh("GT002", "Vật lý đại cương", "PGS. Nguyễn B", 2022, 5, "Vật lý", "Đại học");

        // Tạo sách tiểu thuyết
        SachTieuThuyet stt1 = new SachTieuThuyet("TT001", "Doraemon", "Fujiko F Fujio", 1995, 20, "Hài hước", true);
        SachTieuThuyet stt2 = new SachTieuThuyet("TT002", "Tuổi thơ dữ dội", "Phùng Quán", 1988, 7, "Chiến tranh", false);

        // Thêm vào danh sách
        qls.themSach(sgk1);
        qls.themSach(sgk2);
        qls.themSach(stt1);
        qls.themSach(stt2);

        // Hiển thị danh sách
        qls.hienThiDanhSach();

        // Tìm sách theo mã
        System.out.println("\n>>> Tìm sách có mã 'TT001':");
        Sach timDuoc = qls.timSachTheoMa("TT001");
        if (timDuoc != null) {
            System.out.println(timDuoc);
        } else {
            System.out.println("Không tìm thấy sách.");
        }

        // Cập nhật sách
        System.out.println("\n>>> Cập nhật sách có mã 'GT002':");
        SachGiaoTrinh sachCapNhat = new SachGiaoTrinh("GT002", "Vật lý nâng cao", "PGS. Nguyễn B", 2024, 6, "Vật lý", "Sau đại học");
        boolean capNhat = qls.capNhatSach("GT002", sachCapNhat);
        System.out.println(capNhat ? "Cập nhật thành công!" : "Không tìm thấy sách để cập nhật.");

        // Xóa sách
        System.out.println("\n>>> Xóa sách có mã 'TT002':");
        boolean xoa = qls.xoaSach("TT002");
        System.out.println(xoa ? "Xóa thành công!" : "Không tìm thấy sách để xóa.");

        // Hiển thị lại sau cập nhật và xóa
        System.out.println("\n>>> Danh sách sau cập nhật và xóa:");
        qls.hienThiDanhSach();
    }
}
