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
public class bt2_main 
{
    public static void main(String[] args) 
    {
        MyStringBuilder str = new MyStringBuilder.Builder()
                .addString("Chuoi String hien ra o day ")
                .addFloat(100 )
                .addBool(true)                
                .build();
        System.out.println(str.toString());
        
    }
}
