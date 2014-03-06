import java.util.ArrayList;
import java.util.Iterator;

public class StudentsList2 {
    public static void main(String[] args){
        ArrayList<Integer> theList = new ArrayList();
        for(int i = 0; i < 10; i++){
            theList.add( (int)(Math.random() * 10 +1) );
        }
        System.out.println(theList);

        Iterator<Integer> iter = theList.iterator();
        int i = 1;
        while (iter.hasNext()){
            int temp = iter.next();
            if( i < temp ){
                i = temp;
            }
        }
        System.out.println("Max mark is: " + i);
    }
}
