package ITA_POO_JAVA.Modules.Module5.Contest.Project;

public class Participant implements Comparable<Participant>{

    private int score;
    private boolean quota;
    private int age;

    public Participant(int score, boolean quota, int age) {
        this.score = score;
        this.quota = quota;
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public boolean isQuota() {
        return quota;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Participant _participant) {
        if (score == _participant.getScore()){

            if (quota == _participant.isQuota()){

                return age - _participant.getAge();

            }else if(quota) {

                return 1;

            }else{
                    return -1;
                }

        }else {
            return score - _participant.getScore();
        }

    }

    @Override
    public String toString() {
        return score+" ; "+quota+" ; "+age;
    }
}
