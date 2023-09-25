<%@ page import="model.Cliente" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Clientes</title>

    <style>

        body{
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            color: #333333;
            text-align: center;
        }
        h1{
            font-family: Arial, sans-serif ;
            font-size: 36px;
            text-align: center;
            margin-top: 35px;
        }
        table {
            max-width: 730px%;
            margin-left: auto;
            margin-right: auto;
            border-collapse: collapse;
            border: 1px;
        }
        th, td {
            width: 146px;
            height: 50px;
            border-radius: 10px;
            background-color: white;
            padding: 10px;
            text-align: center;
            border: 1px;
            border-color: rgb(132,14,201);
        }

        a{
            text-decoration: none;
            font-size 15px;
            margin-top: 35px;
            padding: 20px;
        }

    </style>

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
