import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    // Thêm sách
    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    // Xóa sách theo mã
    public void xoaSach(String maSach) {
        Sach sachCanXoa = null;
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                sachCanXoa = s;
                break;
            }
        }
        if (sachCanXoa != null) {
            danhSach.remove(sachCanXoa);
            System.out.println("Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách cần xóa!");
        }
    }

    // Tìm kiếm sách theo mã
    public Sach timSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    // Hiển thị toàn bộ danh sách
    public void hienThiTatCa() {
        System.out.println("\n===== DANH SÁCH SÁCH =====");
        for (Sach s : danhSach) {
            System.out.println(s.toString());
            System.out.println("---------------------------");
        }
    }
}
