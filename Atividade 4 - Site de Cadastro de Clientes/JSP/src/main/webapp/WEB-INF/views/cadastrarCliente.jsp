<%@ page import="model.Cliente" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Cliente</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css' />">
    <style>

        form{
            display: flex;
            flex-direction: column;
            width: 70%;
            border: 2px;
            border-color: rgb(132,14,201);
        }

        form [type="submit"]{
            height: 50px;
            width: 50%;
            background-color: rgb(132,14,201);
            color: white;
            font-weight: bold;
        }

        form [type="submit"]:hover{
            cursor: pointer;
            background-color: white;
            color: rgb(34,34,34);
            font-weight: bold;
            transition: 0.3s all;
        }

        input{
            margin-top: 20px;
            height: 20px;
            padding: 13px;
            border-radius: 20px;
            border: none;
            font-size: 15px;
        }
    </style>

</head>

<body style="font-family: Arial, sans-serif; background-color: #f0f2f5; color: #333333; text-align: center;">
    <h1 style="font-family: Arial, sans-serif ;font-size: 36px; text-align: center; margin-top: 35px;">Cadastrar Cliente</h1>

    <form style="max-width: 700px; margin-left: auto; margin-right: auto;" method="post" action="/cadastrarCliente">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br>

        <label for="dataNascimento">Data de Nascimento:</label>
        <input type="text" id="dataNascimento" name="dataNascimento" required><br>

        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf" required><br>

        <label for="telefone">Telefone:</label>
        <input type="text" id="telefone" name="telefone" required><br>

        <input style="margin-left: auto; margin-right: auto;" type="submit" value="Cadastrar">
    </form>

    <a style="text-decoration: none; font-size 15px; margin-top: 35px;" href="/listarClientes">Voltar para a Lista de Clientes</a>
</body>
</html>
