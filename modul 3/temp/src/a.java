import java.io.RandomAccessFile;
import java.io.IOException;

public class a {

    public static void main(String args[]) throws IOException{

        int count = 0;

        try{
            RandomAccessFile file = new RandomAccessFile("count.dat", "r");
            count = file.readInt();
            file.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }

        System.out.println("Count: " + count);

        try{
            RandomAccessFile raf = new RandomAccessFile("count.dat","rw");
            raf.writeInt(++count);
            raf.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}