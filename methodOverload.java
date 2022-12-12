public class methodOverload {
    public static void main(String[] args) {
        int ans=calculateScore("Sameep",200);
        System.out.println(ans);
        calculateScore(200);
        calculateScore();

    }
    public static int calculateScore(String player,int score){
        System.out.println("Player " +player +" score " +score+" points");
        return score*1000;
    }
    public static int calculateScore(int score) {
        System.out.println(score + " points");
        return score * 1000;
    }
    public static void calculateScore() {
        System.out.println("no player");
    }

}
