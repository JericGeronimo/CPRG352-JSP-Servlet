package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // this will display the requested JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("input_age");
        // set the attribute for the JSP
        request.setAttribute("age", age);

        if (age == null || age.equals("")) {
            // Displays an error message to indicate improper input
            request.setAttribute("message", "You must give your current age.");
            // Display the JSP 
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        try {
            // alters stored value from parameter to an integer data type
            int converted_age = Integer.parseInt(age) + 1;
            String submit_message = "Your age next birthday will be " + converted_age;
            // set the attribute for the JSP
            request.setAttribute("message", submit_message);
            // Display the JSP 
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            // Displays an error message to indicate improper input
            request.setAttribute("message", "You must enter a number.");
            // Display the JSP 
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }

    }

}
