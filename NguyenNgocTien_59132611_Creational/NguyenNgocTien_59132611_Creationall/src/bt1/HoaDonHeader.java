/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author ngoct
 */
public class HoaDonHeader {
    String MaHoaDon,tenKhachHang;
    String ngayban;

    public HoaDonHeader() {
    }
    

    public HoaDonHeader(String MaHoaDon, String tenKhachHang, String ngayban) {
        this.MaHoaDon = MaHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayban = ngayban;
    }

    @Override
    public String toString() {
        return "HoaDon: "+  "\n"+
                            "MaHoaDon = " + MaHoaDon + "\n"+
                            "TenKhachHang = " + tenKhachHang + "\n"+
                            "ngayban = " + ngayban;
    }
    
    
}
