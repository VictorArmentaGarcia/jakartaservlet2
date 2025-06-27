package org.curso.jakarta.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/post_servlet")
public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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
        out.println("<h3>Datos de post</h3>");
        out.println("Hola Mundo lance un servlet </br>");
        out.println("</br> nombre: " + nombre);
        out.println("</br> apellido: " + apellido);
        try {
            Integer edad = Integer.valueOf(req.getParameter("edad"));
            out.println("</br> edad: " + edad);
        } catch (NumberFormatException ex){
            out.println(" edad: El dato no se ha informado");
        }

        out.println("");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
