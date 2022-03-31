/**
 *
 * @author Moaibad
 */
public class Rectangle extends Shape{
    // instances //
    private double width;
    double length;
    
    // constructor //
    public Rectangle (){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle (double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle (String color,boolean filled,double width, double length){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    
    // getter dan setter //
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    // methods //
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
    
    // to String //
    @Override 
    public String toString(){
        return "A Rectangle with width = "+this.width+" and length = "+this.length+", which is a subclass of "+super.toString();
    }
}