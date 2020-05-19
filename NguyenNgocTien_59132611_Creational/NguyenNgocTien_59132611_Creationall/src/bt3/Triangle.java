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
public class Triangle extends Shape{
    private static Triangle instance;
    protected Triangle(){
        
    }
    protected Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Triangle createInstance(){
        if(instance==null)
            instance=new Triangle();
        return instance;
    }
    @Override
    public String draw() {
        return "hinh tam giac ";
    }
    
}
