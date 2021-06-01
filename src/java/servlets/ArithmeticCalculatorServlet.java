package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 855474
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        // this will display the requested JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first_input = request.getParameter("arithmetic_first");
        String second_input = request.getParameter("arithmetic_second");

        // set the attribute for the JSP
        request.setAttribute("first_input", first_input);
        request.setAttribute("second_input", second_input);

        if (first_input == null || first_input.equals("") || second_input == null || second_input.equals("")) {
            // Displays an error message to indicate improper input
            request.setAttribute("message", "invalid");
            // Display the JSP 
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        try {
            // alters stored value from parameter to an integer data type
            int first_input_converted = Integer.parseInt(first_input);
            int second_input_converted = Integer.parseInt(second_input);
            int result_total = 0;
            if(request.getParameter("addition") != null){
                result_total = first_input_converted + second_input_converted;
            }else if(request.getParameter("subtraction") != null){
                result_total = first_input_converted - second_input_converted;
            }else if(request.getParameter("multiplication") != null){
                result_total = first_input_converted * second_input_converted;
            }else if(request.getParameter("modulus") != null){
                result_total = first_input_converted % second_input_converted;
            }
            String result_message = Integer.toString(result_total);
            request.setAttribute("message", result_message);
            // Display the JSP 
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            // Displays an error message to indicate improper input
            request.setAttribute("message", "invalid");
            // Display the JSP 
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

    }

}
