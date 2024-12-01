Teste de Caixa Branca - Etapa 3
Este documento descreve as atividades realizadas na Etapa 3, incluindo o grafo de fluxo do código, o cálculo da complexidade ciclomática e os caminhos independentes identificados.

Grafo de Fluxo
![grafo](https://github.com/user-attachments/assets/5c968c5f-ca78-4936-af31-ec10d43e3aba)



Descrição dos Nodos
Início do método: Inicializa o método principal (verificarUsuario).
Conectar ao banco de dados: Estabelece a conexão com o banco usando o método conectarBD().
Construir query SQL: Monta a instrução SQL.
Executar query: Realiza a execução da query SQL.
Condição: Usuário existe? Verifica se a consulta retornou algum resultado (if(rs.next())).
Caminho verdadeiro: O nome do usuário é retornado.
Caminho falso: Retorna uma falha indicando que o usuário não foi encontrado.
Tratamento de exceção: Executa o bloco catch em caso de erro.
Saída final: Retorna o resultado final do método (true ou false).
Complexidade Ciclomática
A complexidade ciclomática foi calculada com base no grafo de fluxo.

Fórmula: 
𝑀
=
𝐸
−
𝑁
+
2
M=E−N+2
E (Arestas): 10
N (Nodos): 9
Cálculo:
𝑀
=
10
−
9
+
2
=
3
M=10−9+2=3
Resultado:
A complexidade ciclomática do código é 3.

Base de Caminhos
Com base na complexidade ciclomática, foram identificados 3 caminhos independentes no grafo:

Caminho 1:
1 → 2 → 3 → 4 → 5 → 6 → 9

Fluxo principal onde o usuário é encontrado, e o nome é retornado.
Caminho 2:
1 → 2 → 3 → 4 → 5 → 7 → 9

Fluxo onde o usuário não é encontrado, e uma falha é retornada.
Caminho 3:
1 → 2 → 8 → 9

Fluxo de exceção, onde ocorre um erro na conexão ou execução.
