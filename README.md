# Teste de Caixa Branca

**Descrição Geral** 

Este projeto tem como objetivo implementar e analisar um sistema de login utilizando métodos de Caixa Branca para testar o código. O sistema se conecta a um banco de dados, verifica credenciais de login e retorna os resultados esperados.

As etapas do projeto foram divididas em diferentes tarefas para análise, correção e documentação do código, utilizando as melhores práticas de desenvolvimento e testes.

**Estrutura do Repositório**
Código Base: Contém a implementação do sistema de login.

**Etapa 1:** Identificação de possíveis erros no código e criação inicial do repositório.

**Etapa 2:** Preenchimento do formulário de Teste Estático (arquivo PLANO_DE_TESTE.xlsx).

**Etapa 3:** Análise do fluxo de controle com criação de grafo de fluxo (arquivo grafo.png), cálculo da complexidade ciclomática e base de caminhos.

**Etapa 4:** Documentação completa do código utilizando o padrão Javadoc.


# Erros Identificados no Código

## 1. O Código Está Vulnerável a SQL Injection
**Descrição:** O código usa a concatenação de strings para construir instruções SQL.
Isso permite que um usuário mal-intencionado injete comandos SQL maliciosos nos campos de entrada (login e senha), comprometendo a segurança do banco de dados.

## 2. Mau Uso do Class.forName
**Descrição:** O método Class.forName é utilizado para carregar o driver JDBC, mas a linha seguinte tenta criar uma nova instância usando .newInstance(), o que não é necessário.
Além disso, desde o JDBC 4.0, o carregamento explícito do driver não é mais necessário.

## 3. Tratamento Inadequado de Exceções
**Descrição:** O código captura exceções genéricas (Exception) sem tratá-las adequadamente ou informar o que aconteceu. Isso pode ocultar problemas reais e dificultar a depuração.
Além disso, a conexão ao banco de dados não é fechada em caso de erro, o que pode causar vazamento de recursos.

## 4. Instruções SQL Não Seguem Boas Práticas
**Descrição:** A instrução SQL construída concatena valores diretamente, o que viola boas práticas de segurança e legibilidade.
Não há validação ou sanitização dos campos login e senha antes de usá-los na consulta.
