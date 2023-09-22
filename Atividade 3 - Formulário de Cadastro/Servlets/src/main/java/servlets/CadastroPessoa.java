package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroPessoa", urlPatterns = {"/pessoa", "/usuario", "/pessoaServlet"})
public class CadastroPessoa extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Cadastro realzado com sucesso!<h1>");

        String nome = req.getParameter("nome");
        String rg = req.getParameter("rg");
        String cpf = req.getParameter("cpf");
        String data = req.getParameter("data");
        String telefone = req.getParameter("telefone");
        String email = req.getParameter("email");

        writer.println("<ul>");
        writer.println("<liNome: >" + nome + "</li>");
        writer.println("<liRG: >" + rg + "</li>");
        writer.println("<liCPF: >" + cpf + "</li>");
        writer.println("<liData: >" + data + "</li>");
        writer.println("</ul>");
    }

}
