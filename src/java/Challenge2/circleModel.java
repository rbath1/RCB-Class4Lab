package Challenge2;

/**
 *
 * @author Robert Bath
 */
public class circleModel {
    
    public final double getArea(String r){
        double radius = Double.parseDouble(r);
        return (3.14159265359 * (radius*radius));
    }
    
}
