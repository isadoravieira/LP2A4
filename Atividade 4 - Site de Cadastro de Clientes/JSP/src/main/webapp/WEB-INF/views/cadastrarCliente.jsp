<%@ page import="model.Cliente" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Cliente</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css' />">


</head>
<body>
    <h1>Cadastrar Cliente</h1>

    <form method="post" action="/cadastrarCliente">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br>

        <label for="dataNascimento">Data de Nascimento:</label>
        <input type="text" id="dataNascimento" name="dataNascimento" required><br>

        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf" required><br>

        <label for="telefone">Telefone:</label>
        <input type="text" id="telefone" name="telefone" required><br>

        <input type="submit" value="Cadastrar">
    </form>

    <a href="/listarClientes">Voltar para a Lista de Clientes</a>
</body>
</html>
