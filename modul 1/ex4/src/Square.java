public class Square {
    public static void main(String[] args){
        int a = 10, b = 20;
        int r = 10;
        double c = Math.sqrt(a * a + b * b);
        if(c / 2 < r){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
