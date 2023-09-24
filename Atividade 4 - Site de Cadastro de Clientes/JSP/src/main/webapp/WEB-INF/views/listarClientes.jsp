<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Clientes</title>
</head>
<body>
    <h1>Lista de Clientes</h1>

    <table>
        <thead>
            <tr>
                <th>Nome</th>
                <th>Data de Nascimento</th>
                <th>CPF</th>
                <th>Telefone</th>
                <th>Detalhes</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${clientes}" var="cliente">
                <tr>
                    <td>${cliente.nome}</td>
                    <td>${cliente.dataNascimento}</td>
                    <td>${cliente.cpf}</td>
                    <td>${cliente.telefone}</td>
                    <td><a href="/detalhesCliente?clienteId=${cliente.id}">Detalhes</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <a href="/cadastrarCliente">Cadastrar Novo Cliente</a>
</body>
</html>
