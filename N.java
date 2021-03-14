class N {
    N(){
        
        System.out.println("N: Constructure");

    }

    {
        System.out.println("N Instance initital block");
    }

    static{
        System.out.println("N: Static Block");
    }

    public static void main(String [] a){
        N x = new N();
    }
}
