public class MaxNumber {
    public static void main (String[] args){
        int max = 0;
        int x = (int)(Math.random()*10);
        while (x != 0){
            if (max <= x) max = x;
            x = (int)(Math.random()*10);
            System.out.print(x + " ");
        }
        System.out.println("\n" + "Max number is: " + max);
    }
}
