package Challenge2;

/**
 *
 * @author Robert Bath
 */
public class triangleModel {
    
    public final double getHypotenuse(String triA, String triB){
        double sideA = Double.parseDouble(triA);
        double sideB = Double.parseDouble(triB);
        double sideC;
        sideA = sideA * sideA;
        sideB = sideB * sideB;
        sideC = sideA + sideB;
        return Math.sqrt(sideC);
    }
}
