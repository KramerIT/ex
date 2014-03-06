import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader stringText;
        int punctuation = 0;
        int word = 0;
        try {
            stringText =  new BufferedReader(new InputStreamReader(new FileInputStream("file.txt"), "windows-1251"));


            String string = stringText.readLine();
            while (string != null){
                System.out.println(string);
                char[] chars = string.toCharArray();

                // Подсчет знаков препинания
                for (int i = 0; i < chars.length; i ++){
                    if ((chars[i] == ',') || (chars[i] == '.')
                            || (chars[i] == '-') || (chars[i] == ';')
                            || (chars[i] == '!') || (chars[i] == '?'))
                        punctuation ++;
                }

                // Удаление знаков препинания и подсчет слов относительно пробелов
                for (int i = 0; i < chars.length; i ++){
                    if ((chars[i] == ',') || (chars[i] == '.')
                            || (chars[i] == '—') || (chars[i] == ';')
                            || (chars[i] == '!') || (chars[i] == '?')
                            || (chars[i] == '(') || (chars[i] == ')') || (chars[i] == ':'))
                        chars[i] = ' ';
                }
                for (int i = 0; i < chars.length; i ++){
                    int temp = 0;
                    if (chars[i] == ' '){
                        continue;
                    }
                    else
                        while ( (i < chars.length) && (chars[i] != ' ') ){
                            temp ++;
                            i ++;
                        }
                    if (temp > 0 ){
                        word ++;
                    }
                }
                string = stringText.readLine();
            }
            stringText.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        System.out.println("\nВ тексте " + punctuation + " знаков препинания и " + word + " слов.");
    }
}
