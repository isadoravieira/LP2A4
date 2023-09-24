package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListarClientesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Cliente> listaClientes = Cliente.listarClientes(); // Obtém a lista de clientes

        request.setAttribute("clientes", listaClientes); // Configura como atributo de solicitação
        request.getRequestDispatcher("/WEB-INF/views/listarClientes.jsp").forward(request, response);
    }
}
