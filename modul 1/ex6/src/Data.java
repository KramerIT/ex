public class Data {
    public static void main(String[] args){
        int day = 28, month = 2, year = 2014;
        int dayNex, monthNex = month, yearNex = year;
        boolean monthFlag = false;
        boolean yearFlag = false;

        if ( ( ( (year % 4) == 0 ) && ( (year % 100) != 0 ) ) || ( ( (year % 400) == 0) ) )  {
            yearFlag = true;
        }
        if ( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) ){
            monthFlag = true;
        }

        if ( ( day == 31) && ( month == 12 ) ){
            dayNex = 1;
            monthNex = 1;
            yearNex = year +1;
        }
        else
            if ( ( ( day == 28 ) && ( month == 2 ) && (yearFlag) ) ){
                dayNex = day + 1;
        }
        else
            if ( ( ( day == 28 ) || ( day == 29) ) && ( month == 2 ) ){
                dayNex = 1;
                monthNex = 3;
            }
        else
            if ( (day < 30) && (monthFlag == false) || ( (day < 31) && (monthFlag == true) ) ){
                dayNex = day + 1;
            }
        else {
            dayNex = 1;
            monthNex = month + 1;
        }

        System.out.println( dayNex + "/" + monthNex + "/" + yearNex);

    }

}
