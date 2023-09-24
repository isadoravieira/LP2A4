<%@ page import="model.Cliente" %>
<!DOCTYPE html>
<html>
<head>
    <title>Detalhes do Cliente</title>
</head>
<body>
    <h1>Detalhes do Cliente</h1>

    <p><strong>Nome:</strong> ${cliente.nome}</p>
    <p><strong>Data de Nascimento:</strong> ${cliente.dataNascimento}</p>
    <p><strong>CPF:</strong> ${cliente.cpf}</p>
    <p><strong>Telefone:</strong> ${cliente.telefone}</p>

    <a href="/listarClientes">Voltar para a Lista de Clientes</a>
</body>
</html>
