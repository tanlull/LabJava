public class Lab32Arrays {
    public static void main(String[] args) {
        double[] score = new double[] { 80.2, 67.5, 70.0, 68.5, 82.7, 55.5, 78.8 };
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
            //System.out.printf("Score ["+i+"] = "+score[i]+" : Sum = "+sum+"\n");
            System.out.format("Score[%d] = %.2f : Sum = %.2f\n", i, score[i], sum);
        }
        System.out.format("Final sum : %.2f" , sum/score.length);
    }
}