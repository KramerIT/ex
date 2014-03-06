import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        int count = 0;

        try{
            RandomAccessFile file = new RandomAccessFile("count.dat", "r");
            count = file.readInt();
            file.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }

        try{
            RandomAccessFile file = new RandomAccessFile("count.dat","rw");
            file.writeInt(++count);
            file.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }

        PrintWriter pw = resp.getWriter();
        pw.print("<b>Counter: </b>" + "<b>" + count +"</b>");

    }
}