public class Factorial {
    public static void main(String[] args){
        int a = 9;
        int i = a;
        int f = 1;
        while (i > 1){
            f = f * i;
            i--;
        }
        System.out.println("Factorial " + a + ": " + f);
    }
}
