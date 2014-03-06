public class Mark {
    public static void main(String[] args){
        int mass = 10;
        int position = 1;
        int[] marks = new int[mass];
        for (int i = 0; i < mass; i++){
            marks[i] = (int)(Math.random()*10+1);
        }
        int max = marks[0];
        for (int i = 0; i < mass; i++){
            System.out.print(marks[i] + " ");
            if (max < marks[i]){
                max = marks[i];
                position = i + 1;
            }
        }
        System.out.println();
        System.out.println("Max mark is: " + max);
        System.out.println("Max mark is on position: " + position);
    }
}