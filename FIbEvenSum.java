class FibEvenSum{

    public static void main(String[] args){

        System.out.println(optimizedFib(4000000));

    }

    static int fib(int n){

        int a = 0;
        int b = 1;
        int c = a + b;
        int sum = 0;

        while(c < n) {

            if(c%2 == 0) {

                sum = sum + c;

            }

            a = b;
            b = c;
            c = a + b;

        }

        return sum;

    }

    static int optimizedFib(int n) {

        int a = 1;
        int b = 1;
        int c = a + b;
        int sum = 0;

        while(c < n) {
            
            sum = sum + c;
            a = b + c;
            b = c + a;
            c = a + b;

        }

        return sum;

    }

}