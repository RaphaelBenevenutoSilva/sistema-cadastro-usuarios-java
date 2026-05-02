# 📋 Sistema de Cadastro de Pessoas (POO)

Este projeto é uma aplicação de console desenvolvida em **Java** para exercitar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, manipulação de coleções e tratamento de exceções.

---

## 🚀 Estrutura Técnica do Projeto

### 1️⃣ A Classe Pessoa (O Objeto de Dados)
Esta é a base do sistema, definindo a entidade principal.
*   **Atributos**: Nome e idade para armazenamento de informações básicas.
*   **Construtor**: Implementação de `public Pessoa(String nome, int idade)` para inicialização de objetos.
*   **Método mostrar()**: Utiliza `System.out.printf` com o formatador `%-20s`, que reserva 20 espaços para o nome e o alinha à esquerda, garantindo uma visualização organizada em colunas.

### 2️⃣ A Classe Cadastro (Lógica de Gerenciamento)
Funciona como o "banco de dados" em memória da aplicação.
*   **Armazenamento**: Utiliza um `ArrayList<Pessoa>` para gerenciar os dados.
*   **Ordenação Avançada**: O método `listar` implementa `Comparator.comparing` com `.toLowerCase()`, garantindo que a lista seja exibida em ordem alfabética real, ignorando a diferença entre maiúsculas e minúsculas.
*   **Busca e Remoção**: Implementação de loops *for-each* combinados com `equalsIgnoreCase`, permitindo que o usuário localize registros de forma flexível (ex: pesquisar "ana" para encontrar "Ana").

### 3️⃣ A Classe CadastroPOO (Interface e Menu)
Onde reside o fluxo principal (`main`) e a interação com o usuário.
*   **Robustez (Try-Catch)**: Tratamento de exceções na leitura do menu para evitar que o programa trave caso o usuário digite letras em vez de números.
*   **Gestão de Buffer**: Uso estratégico de `sc.nextLine()` após leituras numéricas para limpar o buffer do teclado e evitar erros em capturas de texto posteriores.
*   **UX - Recursividade Visual**: Uso de estruturas `while` nos módulos de busca e remoção, permitindo que o usuário repita a ação ou saia para o menu anterior sem interrupções bruscas.

---

## 🛠️ Tecnologias e Ferramentas
*   **Linguagem:** Java ☕
*   **IDE:** NetBeans / IntelliJ IDEA
*   **Versionamento:** Git & GitHub

---

## 👨‍💻 Autor
**Raphael Benevenuto Silva**
*   Desenvolvedor Backend em formação.
*   Cursando Análise e Desenvolvimento de Sistemas (UNIMETROCAMP Wyden).
