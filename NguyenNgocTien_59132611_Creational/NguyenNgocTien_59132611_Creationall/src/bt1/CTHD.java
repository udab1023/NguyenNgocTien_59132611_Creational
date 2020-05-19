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
public class CTHD {
    String SanPham;
    int SoLuong,DonGia;
    double ChietKhau;

    public CTHD() {
    }

    public CTHD(String SanPham, int SoLuong, int DonGia, double ChietKhau) {
        this.SanPham = SanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }

    @Override
    public String toString() {
        return "SanPham = " + SanPham + ", SoLuong = " + SoLuong + ", DonGia = " + DonGia + ", ChietKhau = " + ChietKhau;
    }

}
