public class Time {
    public static void main(String[] args){
        class DeltaTime{
            int allSec;
            int sec;
            int min;
            int hour;
            DeltaTime(){
                allSec = sec = min = hour = 0;
            }
            DeltaTime(int a){
                allSec = a;
                sec = allSec%60;
                min = ((allSec - sec)/60)%60;
                hour = allSec/3600;
            }
            DeltaTime(int a, int b, int c){
                allSec = c * 3600 + b * 60 + a;
                sec = a;
                min = b;
                hour = c;
            }
            public int getSec(){
                return allSec;
            }
            public void getTime(){
                System.out.println(sec + " seconds " + min + " minutes " + hour + " hours");
            }
            public int timeCompare(DeltaTime deltaTime){
                if (this.sec == deltaTime.sec){
                    return 0;
                  }
                else if (this.sec > deltaTime.sec){
                    return 1;
                }
                else return -1;
            }
        }

        DeltaTime D1 = new DeltaTime(0);
        DeltaTime D2 = new DeltaTime(12345);
        DeltaTime D3 = new DeltaTime(45, 25, 3);
        System.out.println(D1.getSec());
        System.out.println(D2.getSec());
        System.out.println(D3.getSec());
        D1.getTime();
        D2.getTime();
        D3.getTime();
        System.out.println(D2.timeCompare(D2));
    }
}
