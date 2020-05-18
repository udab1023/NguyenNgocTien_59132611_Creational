/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
import java.util.Date;
/**
 *
 * @author ngoct
 */
public class HoaDon {
    String MaHoaDon,tenKhachHang;
    Date ngayban;

    public HoaDon(String MaHoaDon, String tenKhachHang, Date ngayban) {
        this.MaHoaDon = MaHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayban = ngayban;
    }
    
}
