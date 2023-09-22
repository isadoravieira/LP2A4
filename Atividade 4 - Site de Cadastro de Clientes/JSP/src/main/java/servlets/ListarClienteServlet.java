package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "listar")
public class ListarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        req.setAttribute("clientes", clientes);
        req.getRequestDispatcher("./cadastrar.jsp").forward(req, resp);
    }
}
