package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;

public class CadastrarClienteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Exibir página de cadastro de clientes
        request.getRequestDispatcher("/WEB-INF/views/cadastrarCliente.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Lógica para cadastrar um cliente
        String id = request.getParameter("id");
        String nome = request.getParameter("nome");
        String dataNascimento = request.getParameter("dataNascimento");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        Cliente cliente = new Cliente(id,nome,dataNascimento,cpf,telefone);

        // Salvar o cliente na lista de clientes

        response.sendRedirect("/listarClientes"); // Redirecionar para a lista de clientes após o cadastro
    }
}
