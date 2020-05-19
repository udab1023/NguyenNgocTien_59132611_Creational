/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author ngoct
 */
public class HoaDon {
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> CTHD = new ArrayList<>();

    public HoaDon(Builder builder) {
        this.CTHD=builder.CTHD;
        this.hoaDonHeader=builder.hoaDonHeader;
    }
    public static class Builder{
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> CTHD = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader)
        {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }
        
        public Builder addCTHD(CTHD CTHD)
        {
            this.CTHD.add(CTHD);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() 
    {
        String s = hoaDonHeader.toString();
        for(int i=0; i < CTHD.size(); i++)
        {
            s += "\n" + CTHD.get(i).toString();
        }
        return s;      
    }
}
