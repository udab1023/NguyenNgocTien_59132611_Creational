/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author ngoct
 */
public class Rectangle extends Shape{
    private static Rectangle instance;
    protected Rectangle(){
        
    }
    protected Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Rectangle createInstance(){
        if(instance==null)
            instance=new Rectangle();
        return instance;
    }
    @Override
    public String draw() {
        return "hinh chu nhat ";
    }
    
}
