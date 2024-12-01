"# Teste Caixa Branca" 

## Erros Encontrados

1. **SQL Injection:** O código utiliza concatenação direta de strings na query SQL, tornando-o vulnerável a ataques de injeção de SQL.
2. **Recursos Não Fechados:** O `ResultSet` e o `Statement` não são fechados corretamente, o que pode causar vazamentos de memória.
3. **Exposição de Credenciais:** As credenciais do banco de dados (usuário e senha) estão diretamente no código, representando um risco de segurança.