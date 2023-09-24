<%@ page import="model.Cliente" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Clientes</title>


</head>
<body>
    <h1>Lista de Clientes</h1>

    <table>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Data de Nascimento</th>
                <th>CPF</th>
                <th>Telefone</th>
            </tr>

            <c:forEach var="cliente" items="${clientes}">
                <tr>
                    <td>${cliente.id}</td>
                    <td>${cliente.nome}</td>
                    <td>${cliente.dataNascimento}</td>
                    <td>${cliente.cpf}</td>
                    <td>${cliente.telefone}</td>
                </tr>
            </c:forEach>
        </table>

    <a href="/cadastrarCliente">Cadastrar Novo Cliente</a>
</body>
</html>
