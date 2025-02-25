package ITA_POO_JAVA.Module2.PointsSystem;

public class BonusCalculator {
    public int dailyBonus = 1;
    public int bonus(User u){
        int scalar = dailyBonus;
        if (u.vip)
            scalar *= 5;

        return scalar;
    }
}
