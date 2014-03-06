public class ButterflyArray {

        public static void main(String[] args){
            int length = 7;
            int [][] array = new int[length][length];
            for (int i = 0; i < length; i ++ ){
                for (int j = 0; j < length; j ++){
                    array[i][j] = 1;
                }
            }

            int halfLength;
            if (length % 2 == 0){
                halfLength = length / 2;
            }
            else halfLength = length / 2 + 1;

            for (int i = 1; i <length; i ++ ){
                int j;
                for ( j = 0; j < i; j ++){
                    array[i][j] = 0;
                }
                if (j == halfLength - 1) break;
            }

            for (int i = 1; i < length; i ++ ){
                for (int j = 0; j < length; j ++){
                    if (array[i][j] != array[i][length - j - 1]) array[i][j] = 0;
                }
            }

            for (int i = 1; i < length; i ++ ){
                for (int j = 0; j < length; j ++){
                    if (array[i][j] != array[length - i - 1][j]) array[length - i - 1][j] = 0;
                }
            }

            for (int i = 0; i < array.length; i ++ ){
                for (int j = 0; j < array[i].length; j ++){
                    System.out.print(array[i][j] + "  ");
                }
                System.out.println();
            }
        }
}


