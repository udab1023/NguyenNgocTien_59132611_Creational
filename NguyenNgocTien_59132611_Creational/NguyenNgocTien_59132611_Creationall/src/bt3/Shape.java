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
public abstract class Shape {
    private String brush,paper,frame;

    public Shape() {
    }
    
    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }


    public abstract String draw();

    @Override
    public String toString() {
        return "Ve " + draw() + brush + paper + frame;
    }
    
}
