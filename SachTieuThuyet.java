public class SachTieuThuyet extends Sach {
    private String theLoai;
    private Boolean laSachSeries;
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, Boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
public String getTheLoai(){
    return theLoai;
}
public void setTheLoai(String theLoai)
{
    this.theLoai = theLoai;
}
public Boolean getLaSachSeries()
{
    return laSachSeries;
}
public void setLaSachSeries(Boolean laSachSeries)
{
    this.laSachSeries = laSachSeries;
}
@Override
public String toString() {
        return super.toString() +
               "\nLoại sách: Tiểu thuyết" +
               "\nThể loại: " + theLoai +
               "\nThuộc series: " + (laSachSeries ? "Có" : "Không");
    }
}
