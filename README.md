Como testar:

1. Clique em "Run" no IntelliJ

2. Acesse o H2 Console: http://localhost:8080/h2-console

3. Conecte com as credenciais:
               JDBC URL: jdbc:h2:mem:testdb
               User: sa

4. Faça uma transferência:
    Abra o Postman ou digite no navegador: http://localhost:8080/transferencias/1?novaLoja=Loja+Norte

5. Verifique no banco:
    No H2 Console, execute: SELECT * FROM PRODUTO para ver que a loja do produto foi atualizada
