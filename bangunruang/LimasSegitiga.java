
package bangunruang;


public class LimasSegitiga extends BangunRuang {
    double a;
    double tS;
    double tL;
    
    @Override
    double volume(){
        double volume = (double) ( 1/6 * (1/2 * a * tS) * tL);
        System.out.println("volume LimasSegitiga: " + volume);
        return volume;
    }
    @Override
    double luaspermukaan(){
        double luaspermukaan = (double) (1/2 * a * t + (3 * (1/2 * a * t)));
        System.out.println("luaspermukaan LimasSegitiga: " + luaspermukaan);
                return luaspermukaan;
    }
    
}
