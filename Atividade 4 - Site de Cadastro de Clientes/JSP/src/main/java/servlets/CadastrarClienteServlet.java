package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;

@WebServlet(urlPatterns = "cadastrar")
public class CadastrarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("./cadastrar.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getRequestId());
        String nome = req.getParameter("nome");
        String data = req.getParameter("data");
        long cpf = Long.parseLong(req.getParameter("cpf"));
        long telefone = Long.parseLong(req.getParameter("telefone"));

        Cliente cliente = new Cliente(id,nome,data,cpf,telefone);

        resp.sendRedirect("/listar.jps");
    }
}
