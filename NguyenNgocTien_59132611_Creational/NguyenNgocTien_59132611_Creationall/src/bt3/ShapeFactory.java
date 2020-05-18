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
public class ShapeFactory {
    private static ShapeFactory instance;

    public static ShapeFactory createInstance(){
        if(instance==null)
            instance=new ShapeFactory();
        return instance;
    }
    public Shape createShape(ShapeType shapetype)
    {
        switch(shapetype)
        {
            case Circle: return Circle.createInstance();
            case Triangle: return Triangle.createInstance();
            case Rectangle: return Rectangle.createInstance();
        }
        Shape shape = createShape(shapetype);
        shape.draw();
        return shape;
    }
}
