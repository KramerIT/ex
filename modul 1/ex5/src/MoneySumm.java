public class MoneySumm{
    public static void main(String[] args){
        int a = 211;
        int b = a%10;

        if (a == 11 || a == 12){
            System.out.println(a + " рублей");
        }
        else if (b == 1){
            System.out.println(a + " рубль");
        }
        else if(b == 2 || b == 3 || b == 4) {
            System.out.println(a + " рубля");
        }
        else System.out.println(a + " рублей");
    }
}
