/**
 *
 * @author Moaibad
 */
public class Square extends Rectangle{
    // constructor //
    public Square (double side){
        super(side,side);    
    }
    // to string //
    @Override 
    public String toString(){
        return "A Square with side = "+super.getWidth()+", which is a subclass of "+super.toString();
    }
    
    // methods //
    @Override
    public double getArea(){
        return super.getWidth()*super.getWidth();
    }
    @Override
    public double getPerimeter(){
        return (4*super.getWidth());
    }
    @Override 
    public void setLength(double length){
        super.getLength();
    }
    @Override 
    public void setWidth(double width){
        super.getWidth();
    }
}