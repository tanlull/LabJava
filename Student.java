public abstract class Student {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public abstract String calculateGrade();
}
