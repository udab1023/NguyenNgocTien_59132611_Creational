/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Asus
 */
public class MyStringBuilder 
{
    String str;
    
    public MyStringBuilder (Builder builder) 
    {
        this.str = builder.str;
    }
    
    public static class Builder 
    {
        String str = "";
        
        public Builder(){
        }
                
        public Builder addString(String s) 
        {
            this.str = this.str.concat(s);
            return this;
        }
        
        public Builder addFloat(float F) 
        {
            this.str = this.str.concat(Float.toString(F));
            return this;
        } 
        
        public Builder addBool(boolean b) 
        {
            this.str = this.str.concat(Boolean.toString(b));
            return this;
        }
        
        public MyStringBuilder build() 
        {
            return new MyStringBuilder(this);
        }
    }
    
    @Override
    public String toString() 
    {
        return "Chuoi: " +str;
    }
}
