public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý
        QuanLySach ql = new QuanLySach();

        // Tạo sách giáo trình
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A",
                2024, 10, "Công nghệ thông tin", "Đại học");

        // Tạo sách tiểu thuyết
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko Fujio",
                2000, 20, "Phiêu lưu", true);

        // Thêm vào danh sách
        ql.themSach(gt1);
        ql.themSach(tt1);

        // Hiển thị toàn bộ
        ql.hienThiTatCa();

        // Tìm sách
        Sach kq = ql.timSach("GT01");
        if (kq != null) {
            System.out.println("\nTìm thấy sách có mã GT01:");
            System.out.println(kq.toString());
        } else {
            System.out.println("\nKhông tìm thấy sách!");
        }

        // Xóa sách
        ql.xoaSach("TT01");

        // Hiển thị sau khi xóa
        ql.hienThiTatCa();
    }
}
