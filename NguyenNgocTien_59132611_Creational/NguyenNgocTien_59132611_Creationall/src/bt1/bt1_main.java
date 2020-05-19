/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Asus
 */
public class bt1_main 
{
    public static void main(String[] args)
    {
        HoaDonHeader HDH = new HoaDonHeader("HD01","Nguyen Ngoc Tien","01/01/2021");
        CTHD CT1 = new CTHD("TiVi",1,10000000,15);
        CTHD CT2 = new CTHD("May Giat",2,250000000,32.5);
        CTHD CT3 = new CTHD("Tu Lanh",1,150000000,10);
        
        HoaDon HD = new HoaDon.Builder()
            .addHoaDonHeader(HDH)
            .addCTHD(CT1)
            .addCTHD(CT2)
            .addCTHD(CT3)
            .build();
        
        System.out.println(HD.toString());
    }
    
}
