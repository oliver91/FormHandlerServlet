import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: oliver
 * Date: 03.09.14
 * Time: 19:39
 * To change this template use File | Settings | File Templates.
 */
public class FormHandlerServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        String enteredValue = request.getParameter("enteredValue");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter;
        try
        {
            printWriter = response.getWriter();
            printWriter.println("<p>");
            printWriter.print("your choice: ");
            printWriter.print(enteredValue);
            printWriter.print("</p>");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}
