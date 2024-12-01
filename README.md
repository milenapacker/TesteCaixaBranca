Teste de Caixa Branca
Descrição Geral
Este projeto tem como objetivo implementar e analisar um sistema de login utilizando métodos de Caixa Branca para testar o código. O sistema se conecta a um banco de dados, verifica credenciais de login e retorna os resultados esperados.

As etapas do projeto foram divididas em diferentes tarefas para análise, correção, e documentação do código, utilizando as melhores práticas de desenvolvimento e testes.

Estrutura do Repositório
Código Base: Contém a implementação do sistema de login.
Etapa 1: Identificação de possíveis erros no código e criação inicial do repositório.
Etapa 2: Preenchimento do formulário de Teste Estático (arquivo PLANO_DE_TESTE.xlsx).
Etapa 3: Análise do fluxo de controle com criação de grafo de fluxo, cálculo da complexidade ciclomática e base de caminhos.
Etapa 4: Documentação completa do código utilizando o padrão Javadoc e geração da documentação em HTML.
Tecnologias Utilizadas
Java: Linguagem principal do projeto.
MySQL: Banco de dados utilizado para verificar credenciais.
Javadoc: Para geração de documentação em HTML.
Git/GitHub: Para controle de versão e gerenciamento do repositório.
Como Rodar o Projeto
Clone o Repositório

bash
Copiar código
git clone <URL_DO_REPOSITORIO>
Compile o Código

bash
Copiar código
javac -d bin -sourcepath src login/User.java
Execute o Programa

bash
Copiar código
java -cp bin login.User
Sobre as Etapas
Etapa 1
Identificação de erros no código base.
Criação do repositório remoto e documentação inicial.
Etapa 2
Preenchimento do formulário de Teste Estático (arquivo XLS anexado ao repositório).
Envio do arquivo preenchido para o repositório remoto.
Etapa 3
Criação do grafo de fluxo para representar o controle do código.
Cálculo da complexidade ciclomática.
Identificação dos caminhos independentes no código.
Etapa 4
Adição de comentários no código usando o padrão Javadoc.
Geração da documentação em HTML no diretório docs.
