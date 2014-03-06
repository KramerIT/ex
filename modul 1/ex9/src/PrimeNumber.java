public class PrimeNumber {
    public static void main(String[] args){
        int x = 123;
        boolean prime = true;
        if (x == 2){
            prime = true;
        }
        else if ((x == 1) || (x % 2 == 0)){
            prime = false;
        }

        for (int i = 3; i * i <= x; i += 2){
            if (x % i == 0){
                prime = false;
            }
        }
        if (prime) {
            System.out.println(x + " is prime number.");
        }
        else System.out.println(x + " is not prime number.");


    }

    }

