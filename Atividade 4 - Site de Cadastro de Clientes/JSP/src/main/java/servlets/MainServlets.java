package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MainServlets extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aba = request.getParameter("aba");

        if ("listarClientes".equals(aba)) {
            response.sendRedirect("/listarClientes");
        } else if ("cadastrarCliente".equals(aba)) {
            response.sendRedirect("/cadastrarCliente");
        } else if ("detalhesCliente".equals(aba)) {
            response.sendRedirect("/detalhesCliente");
        } else {
            response.sendRedirect("/listarClientes"); // Página padrão
        }
    }
}
