package ITA_POO_JAVA.Module5.Contest.Project;

import java.util.ArrayList;
import java.util.Collections;

public class Contest {
    public static void main(String[] args) {
        ArrayList<Participant> list = new ArrayList<>();


        Participant youngParticipant = new Participant(100, false, 30);
        Participant oldParticipant = new Participant(80, false, 40);
        Participant youngCripple = new Participant(20, true, 30);
        Participant oldCripple = new Participant(100, true, 63);

        list.add(youngCripple);
        list.add(oldCripple);
        list.add(oldParticipant);
        list.add(youngParticipant);

        Collections.sort(list);

        for (Participant p : list) {
            System.out.println(p);
        }
    }
}
