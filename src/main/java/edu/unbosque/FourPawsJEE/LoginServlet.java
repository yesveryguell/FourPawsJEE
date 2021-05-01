package edu.unbosque.FourPawsJEE;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Inicio", value = "/inicio")
public class LoginServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String nombre = request.getParameter("Nombre");

        try {
            PrintWriter out = response.getWriter();
            out.println("Hello" + nombre);

            Cookie cNombre = new Cookie("Nombre", nombre);

            response.addCookie(cNombre);

            out.close();

        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void destroy() {
    }
}