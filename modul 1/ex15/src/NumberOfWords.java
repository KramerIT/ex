public class NumberOfWords {
        public static void main(String[] argv){
            String s = " , Тестовая, сторока , содержащая   супер - пупер; и другие знаки ! ? препинания  . Да!!!  123 ";
            int n = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i ++){
                if ((chars[i] == ',') || (chars[i] == '.')
                        || (chars[i] == '-') || (chars[i] == ';')
                        || (chars[i] == '!') || (chars[i] == '?'))
                    chars[i] = ' ';
            }
            for (int i = 0; i < chars.length; i ++){
                int temp = 0;
                if (chars[i] == ' '){
                  continue;
                }
                else
                    while (chars[i] != ' '){
                        temp ++;
                        i ++;
                    }
                if (temp > 0 ){
                    n ++;
                }
            }
            System.out.println("Текст содержит " + n + " слов.");
        }
    }



