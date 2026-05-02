# 📋 Sistema de Cadastro de Pessoas (POO)

Este projeto é uma aplicação de console desenvolvida em **Java** para consolidar conhecimentos em **Backend**, focando em Programação Orientada a Objetos, manipulação dinâmica de dados e boas práticas de arquitetura.

---

## 🏛️ Arquitetura e Funções do Sistema

O projeto foi estruturado seguindo o princípio de separação de responsabilidades, garantindo que cada classe tenha uma função clara dentro do ecossistema da aplicação:

### 1️⃣ Classe `Pessoa`: O Modelo de Dados (Model)
Esta classe representa a **entidade** fundamental do sistema.
*   **Função**: Atua como o "molde" para a criação de objetos, armazenando os atributos básicos `nome` e `idade`.
*   **Comportamento**: Contém o método `mostrar()`, que utiliza o formatador `%-20s` para garantir que os dados sejam exibidos em colunas organizadas no console.
*   **Estado**: É responsável por manter a integridade dos dados individuais de cada registro.

### 2️⃣ Classe `Cadastro`: O Gerenciador de Lógica (Service)
Esta é a "inteligência" do programa, funcionando como um banco de dados em memória.
*   **Função**: Gerencia o `ArrayList<Pessoa>`, ditando as regras para inserção, listagem, busca e remoção de registros.
*   **Processamento**: Implementa lógica de ordenação avançada via `Comparator.comparing` com `.toLowerCase()`, além de filtros de busca com `equalsIgnoreCase` para maior flexibilidade.
*   **Abstração**: Centraliza a manipulação da coleção de dados, separando a lógica de negócio da interface de usuário.

### 3️⃣ Classe `CadastroPOO`: A Interface e Fluxo (Main/View)
Esta classe funciona como o **maestro** da aplicação.
*   **Função**: Gerencia o ponto de entrada (`main`) e a interação direta com o usuário através de menus interativos.
*   **Orquestração**: Recebe as entradas via `Scanner`, trata possíveis erros de digitação com blocos `try-catch` e aciona os métodos da classe `Cadastro`.
*   **UX (User Experience)**: Controla o fluxo de navegação e utiliza a limpeza de buffer (`sc.nextLine()`) para garantir uma experiência de uso fluida e sem interrupções.

---

## 🛠️ Tecnologias e Conceitos Aplicados
*   **Linguagem:** Java ☕ 
*   **IDE utilizada:** NetBeans.
*   **Conceitos de POO:** Classes, Objetos, Construtores e Encapsulamento.
*   **Estrutura de Dados:** Collections (`ArrayList`).
*   **Tratamento de Erros:** Exceções (`Try-Catch`).

---

## 👨‍💻 Autor
**Raphael Benevenuto Silva**
*   Aspiring Backend Developer | Java.
*   Cursando Análise e Desenvolvimento de Sistemas (UNIMETROCAMP Wyden).
*   Focado em construir bases sólidas em lógica e Orientação a Objetos.
