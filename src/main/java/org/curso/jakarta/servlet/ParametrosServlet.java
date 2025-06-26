package org.curso.jakarta.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametro_servlet")
public class ParametrosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");

        out.println("<!DOCTYPE HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta>");
        out.println("");
        out.println("</head>");
        out.println("<body>");
        out.println("Hola Mundo lance un servlet ");
        out.println(" nombre: " + nombre);
        out.println(" apellido: " + apellido);
        try {
            Integer edad = Integer.valueOf(req.getParameter("edad"));
            out.println(" edad: " + edad);
        } catch (NumberFormatException ex){
            out.println(" edad: El dato no se ha informado");
        }

        out.println("");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
