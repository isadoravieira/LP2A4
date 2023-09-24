package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;
import java.util.Scanner;

public class DetalhesClientesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lógica para exibir os detalhes de um cliente

        String clienteId = request.getParameter("clienteId");
        String cliente = Cliente.buscarClientePorId(clienteId); // Função para buscar cliente por ID

        if (cliente != null) {
            request.setAttribute("cliente", cliente);
            request.getRequestDispatcher("/WEB-INF/views/detalhesCliente.jsp").forward(request, response);
        } else {
            response.sendRedirect("/listarClientes"); // Redirecionar para a lista de clientes se o cliente não for encontrado
        }
    }



}
