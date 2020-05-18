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
public class bt3_main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.createInstance();
        Shape shape1 = shapeFactory.createShape(ShapeType.Circle);
        shape1.setBrush("bang co");
        shape1.setPaper("");
        System.out.println(shape1.toString());
    }
}
