public class Array {
    public static void main(String[] args){
        int mass = 11;
        int[] array = new int[mass];
        for (int i = 0; i < mass; i++){
            array[i] = (int)(Math.random()*10+1);
        }

        for (int i = 0; i < mass; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < mass / 2; i++){
            int temp = array[i];
            array[i] = array[mass - 1 - i];
            array[mass - 1 - i] = temp;
        }

        for (int i = 0; i < mass; i++){
            System.out.print(array[i] + " ");
        }
    }
}