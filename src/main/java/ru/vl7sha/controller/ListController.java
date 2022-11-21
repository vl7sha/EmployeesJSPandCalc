package ru.vl7sha.controller;

import ru.vl7sha.model.Entity;
import ru.vl7sha.service.EntityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/list")
public class ListController extends HttpServlet {
    Entity entity = new Entity();
    EntityService entityService = new EntityService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       if (!req.getParameter("nameSearch").equals("")){
           String name = req.getParameter("nameSearch");
           getByNameEmployees(req,resp,name);
       } else if (!req.getParameter("idSearch").equals("")){
           int id = Integer.parseInt(req.getParameter("idSearch"));
           getByIdEmployee(req,resp,id);
       } else {
           getAllEmployees(req, resp);
       }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       getAllEmployees(req,resp);
    }

    private void getAllEmployees(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Entity> entities = entityService.getAll();
        req.setAttribute("listEntity",entities);
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }

    private void getByIdEmployee(HttpServletRequest req, HttpServletResponse resp, int id)
            throws ServletException, IOException{
        List<Entity> entities = new ArrayList<>();
        entities.add(entityService.getById(id));
        req.setAttribute("listEntity",entities);
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }

    private void getByNameEmployees(HttpServletRequest req, HttpServletResponse resp, String name)
            throws ServletException, IOException{
        List<Entity> entities = new ArrayList<>();
        entities.add(entityService.getByName(name));
        req.setAttribute("listEntity",entities);
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
}
