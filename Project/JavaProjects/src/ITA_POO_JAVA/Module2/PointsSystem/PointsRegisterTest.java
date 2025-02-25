package ITA_POO_JAVA.Module2.PointsSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointsRegisterTest {

    @org.junit.jupiter.api.Test
    void makeCommentPoints() {

        User u = new User();
        u.name = "Guerra";
        BonusCalculator cb = new BonusCalculator();
        PointsRegister rp = new PointsRegister(cb);

        rp.makeComment(u);
        assertEquals(3, u.points);
    }
    @org.junit.jupiter.api.Test
    void makeCommentPointsVIP() {

        User u = new User();
        u.name = "Guerra";
        u.vip = true;
        BonusCalculator cb = new BonusCalculator();
        PointsRegister rp = new PointsRegister(cb);

        rp.makeComment(u);
        assertEquals(15, u.points);
    }

    @org.junit.jupiter.api.Test
    void makeCommentPointsDailyBonus() {

        User u = new User();
        u.name = "Guerra";
        BonusCalculator cb = new BonusCalculator();
        cb.dailyBonus = 3;
        PointsRegister rp = new PointsRegister(cb);

        rp.makeComment(u);
        assertEquals(9, u.points);
    }

    @org.junit.jupiter.api.Test
    void makeCommentPointsDailyBonusVIP() {

        User u = new User();
        u.name = "Guerra";
        u.vip = true;
        BonusCalculator cb = new BonusCalculator();
        cb.dailyBonus = 3;
        PointsRegister rp = new PointsRegister(cb);

        rp.makeComment(u);
        assertEquals(45, u.points);
    }

    @org.junit.jupiter.api.Test
    void createTopicPoints() {

        User us = new User();
        us.name = "Guerra";
        BonusCalculator cb = new BonusCalculator();
        PointsRegister rp = new PointsRegister(cb);

        rp.createTopic(us);
        assertEquals(5, us.points);
    }
    @org.junit.jupiter.api.Test
    void createTopicPointsVIP() {

        User us = new User();
        us.name = "Guerra";
        us.vip = true;
        BonusCalculator cb = new BonusCalculator();
        PointsRegister rp = new PointsRegister(cb);

        rp.createTopic(us);
        assertEquals(25, us.points);
    }

    @org.junit.jupiter.api.Test
    void createTopicPointsDailyBonus() {

        User us = new User();
        us.name = "Guerra";
        BonusCalculator cb = new BonusCalculator();
        cb.dailyBonus = 3;
        PointsRegister rp = new PointsRegister(cb);

        rp.createTopic(us);
        assertEquals(15, us.points);
    }

    @org.junit.jupiter.api.Test
    void createTopicPointsDailyBonusVIP() {

        User us = new User();
        us.name = "Guerra";
        us.vip = true;
        BonusCalculator cb = new BonusCalculator();
        cb.dailyBonus = 3;
        PointsRegister rp = new PointsRegister(cb);

        rp.createTopic(us);
        assertEquals(75, us.points);
    }@org.junit.jupiter.api.Test
    void toLikePoints() {

        User us = new User();
        us.name = "Guerra";
        BonusCalculator cb = new BonusCalculator();
        PointsRegister rp = new PointsRegister(cb);

        rp.toLike(us);
        assertEquals(1, us.points);
    }
    @org.junit.jupiter.api.Test
    void toLikeicPointsVIP() {

        User us = new User();
        us.name = "Guerra";
        us.vip = true;
        BonusCalculator cb = new BonusCalculator();
        PointsRegister rp = new PointsRegister(cb);

        rp.toLike(us);
        assertEquals(5, us.points);
    }

    @org.junit.jupiter.api.Test
    void toLikeicPointsDailyBonus() {

        User us = new User();
        us.name = "Guerra";
        BonusCalculator cb = new BonusCalculator();
        cb.dailyBonus = 3;
        PointsRegister rp = new PointsRegister(cb);

        rp.toLike(us);
        assertEquals(3, us.points);
    }

    @org.junit.jupiter.api.Test
    void toLikePointsDailyBonusVIP() {

        User us = new User();
        us.name = "Guerra";
        us.vip = true;
        BonusCalculator cb = new BonusCalculator();
        cb.dailyBonus = 3;
        PointsRegister rp = new PointsRegister(cb);

        rp.toLike(us);
        assertEquals(15, us.points);
    }

}