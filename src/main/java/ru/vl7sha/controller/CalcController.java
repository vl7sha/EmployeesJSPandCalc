package ru.vl7sha.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalcController extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            double firstNumber;
            double secondNumber;


            double result = 0;
            req.setAttribute("result", result);

            firstNumber = Double.parseDouble(req.getParameter("firstNumber"));
            secondNumber = Double.parseDouble(req.getParameter("secondNumber"));
            if (req.getParameter("sum") != null){
                req.setAttribute("result", firstNumber + secondNumber);
            } else if (req.getParameter("minus") != null){
                req.setAttribute("result", firstNumber - secondNumber);
            } else if (req.getParameter("multiplication") != null){
                req.setAttribute("result", firstNumber * secondNumber);
            } else {
                req.setAttribute("result", firstNumber / secondNumber);
            }

            req.setAttribute("firstNumber",firstNumber);
            req.setAttribute("secondNumber",secondNumber);
            req.getRequestDispatcher("calc.jsp").forward(req,resp);
        } catch (Exception e)
        {
            req.setAttribute("errorMessage", e);
            req.getRequestDispatcher("/WEB-INF/Error.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("calc.jsp").forward(req,resp);
    }
}
