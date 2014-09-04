import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: oliver
 * Date: 04.09.14
 * Time: 10:01
 * To change this template use File | Settings | File Templates.
 */
public class MultipleValueFieldFormHandlerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        String[] selectedOptions = request.getParameterValues("options");
        response.setContentType("text/html; charset=UTF-8");
        try
        {
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<p>");
            printWriter.print("Были выбраны следующие опции: ");
            printWriter.println("<br/>");
            if(selectedOptions != null)
            {
                for(String option : selectedOptions)
                {
                    printWriter.println(option);
                    printWriter.print("<br/>");
                }
            }
            else
            {
                printWriter.println("Никаких опций выбрано небыло!");
            }
            printWriter.println("</p>");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}
