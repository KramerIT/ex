import java.util.ArrayList;
import java.util.Iterator;

public class StudentsList {
    public static void main(String[] args){
        ArrayList<Integer> theList = new ArrayList();
        for(int i = 0; i < 20; i++){
            theList.add( (int)(Math.random() * 10 +1) );
        }
        System.out.println(theList);

        Iterator<Integer> iter = theList.iterator();
        while (iter.hasNext()){
            int i = iter.next();
            if(i <= 3){
                iter.remove();
            }
        }
        System.out.println(theList);
    }
}
