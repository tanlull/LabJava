class M extends N{
    M(){
        super();
        System.out.println("M : Constructure");
    }

    {
        System.out.println("M Instance initital block");
    }

    static{
        System.out.println("M Static Block 1");
    }

    static{
        System.out.println("M Static Block 2");
    }

    public static void main(String [] a){
        N x = new N();
    }
}
