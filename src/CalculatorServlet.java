import calculator.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns="/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float firstOperand= Float.parseFloat(request.getParameter("first-operand"));
        Float secondOperand=Float.parseFloat(request.getParameter("second-operand"));
        Character operand= request.getParameter("operator").charAt(0);

        PrintWriter writer=response.getWriter();

        writer.println("<html>");
        writer.println("<h1> Result </h1>");

        Float result= Calculator.calculate(firstOperand, secondOperand, operand);
        writer.println(firstOperand +" "+ operand +" "+ secondOperand + " = "+ result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
