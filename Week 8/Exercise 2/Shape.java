/**
 *
 * @author Moaibad
 */
public class Shape {
    private String color;
    private boolean filled;
    
    /*Constructor*/
    public Shape(){
        color = "red";
        filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    /*Accessor*/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public String toString() {
        return "Shape[color=" + color + " filled=" + filled + "]";
    }
}
