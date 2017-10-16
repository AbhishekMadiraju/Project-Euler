class MultiplesOf3And5{

    public static void main(String[] args){

        System.out.println(sum1(1000, 3) + sum1(1000, 5) - sum1(1000, 15));
    
    }

    static int sum1(int target, int n){

        int div = target/n;

        return n*(div*(div + 1)/2);

    }

}