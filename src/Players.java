import java.util.Scanner;

public class Players {
    private String nickname = "";
    private int score = 0;
    public Players(String nickname) {
        this.nickname = nickname;
        this.score = 0;
    }



    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }
    public void resetScore(int score){
        this.score = score;
    }

    @Override
    public String toString() {
        return "Players{" +
                "nickname='" + nickname + '\'' +
                ", score=" + score +
                '}';
    }
}
