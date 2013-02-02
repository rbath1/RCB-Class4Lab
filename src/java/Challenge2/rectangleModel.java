package Challenge2;

/**
 *
 * @author Robert Bath
 */
public class rectangleModel {
    
    
    
    public final double getArea(String l, String w){
        double length = Double.parseDouble(l);
        double width = Double.parseDouble(w);
        return length * width;
    }
}
