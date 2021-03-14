public class UnderGraduate extends Student {
    public UnderGraduate(int score){
        super(score);
    }

    public String calculateGrade(){
        int score = getScore();
        if(score >=50) return "PASS";
        else return "FAIL";
    }
}
