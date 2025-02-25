package ITA_POO_JAVA.Module2.PointsSystem;

public class PointsRegister {

    private BonusCalculator bonusFactor;

    public PointsRegister(BonusCalculator bc){
        bonusFactor = bc;
    }
    public void makeComment(User u){
        u.points += 3 * bonusFactor.bonus(u);
    }
    public void createTopic(User u){
        u.points += 5 * bonusFactor.bonus(u);
    }
    public void toLike(User u){
        u.points += 1 * bonusFactor.bonus(u);
    }
}
