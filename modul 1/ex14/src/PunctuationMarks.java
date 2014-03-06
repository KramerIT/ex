public class PunctuationMarks {
    public static void main(String[] argv){
        String s = " , Тестовая, сторока , содержащая   супер - пупер; и другие знаки ! ? препинания   . Да!!!  ";
        int n = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i ++){
            if ((chars[i] == ',') || (chars[i] == '.')
                    || (chars[i] == '-') || (chars[i] == ';')
                    || (chars[i] == '!') || (chars[i] == '?'))
            n ++;
        }
        System.out.println("В строке есть " + n + " знаков препинания.");
    }

}
