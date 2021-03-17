public class Graduate extends Student{

    public Graduate(int score) {
        super(score);
    }
    
    // 
    public String calculateGrade(){
        if(getScore()>70) return"A";
        else return "B";
    }
}
