/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vicente;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author vicen
 */
@WebServlet (urlPatterns = "/ContactoServlet")
public class ContactoServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        String nombre = req.getParameter("nombre");
          String emailId = req.getParameter("emailId");
           String telefono = req.getParameter("telefono");
           String descripcion = req.getParameter("descripcion");
           
           
           resp.setContentType("text/html");
         PrintWriter printWriter = resp.getWriter();
         printWriter.print("<html>");
         printWriter.print("<body>");
         printWriter.print("<h1> Datos de Registro de contacto </h1>");
         printWriter.print("<p>Nombre: " + nombre +"</p>");
                  printWriter.print("<p>Email: " + emailId +"</p>");
                   printWriter.print("<p>Telefono: " + telefono +"</p>");
                   printWriter.print("<p>Descripcion: " + descripcion +"</p>");
                    printWriter.print("</body>");
                    printWriter.print("</html >");
                    printWriter.close();
                   
           
                
    }
            
}
