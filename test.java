public class Test {
    public static void main(String[] args) {
      System.out.println("Tạo đối tượng sách thứ nhất:");
        Sach sach1 = new Sach("JV01", "Lập trình Java cơ bản", "John Doe", 2022, 50);
        sach1.hienThiThongTin();

        System.out.println("\n==============================\n");
        System.out.println("Tạo đối tượng sách thứ hai:");
        Sach sach2 = new Sach();
        sach2.setMaSach("CS02");
        sach2.setTieuDe("Cấu trúc dữ liệu & Giải thuật");
        sach2.setTacGia("Jane Smith");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(35);
        sach2.hienThiThongTin();
        System.out.println("\nLấy riêng tên tác giả của sách 2: " + sach2.getTacGia());
    }
}