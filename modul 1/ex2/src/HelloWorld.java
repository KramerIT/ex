public class HelloWorld {
    public static void main(String[] args){
        int s = 1000000000;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int day =  h / 24;
        int week = day / 7;
        System.out.println(week + " week " + day + " days " + h +" hours " + min + " minutes " + sec + " seconds");
    }
 }
