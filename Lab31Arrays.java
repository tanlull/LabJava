public class Lab31Arrays {
    public static void main(String[] args) {
        int[] score = new int[] { 0, 10, 20, 30, 40 };
        int sum = 0;
        double f = 12.245465;
        for (int i = 0; i < 5; i++) {
            sum = sum + score[i];
            //System.out.printf("Score ["+i+"] = "+score[i]+" : Sum = "+sum+"\n");
            //System.out.printf("Score[%d] = %d : Sum = %d\n", i, score[i], sum);
        }
        System.out.format("Final sum : %.2f" , f);
    }
}