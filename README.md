# Filtragens de Letras Maiúsculas <img src="https://github.com/user-attachments/assets/4c49b711-158a-48a8-b4a2-6766bb254d80" alt="Imagem do Java" width="50"/>

Este repositório contém três abordagens distintas para filtrar as letras maiúsculas de uma string fornecida. Cada uma das soluções apresentadas utiliza uma técnica diferente: Regex, Loop e Streams. 

### 1. Regex (Fácil):
   Esta solução utiliza expressões regulares para filtrar apenas as letras maiúsculas. A expressão regular usada é [^A-Z], onde:
[^A-Z] corresponde a qualquer caractere que não seja uma letra maiúscula (de A a Z).

O método replaceAll é utilizado para substituir todos os caracteres não desejados por uma string vazia, efetivamente removendo-os.

    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingRegex(input));
    }

### 2. Loop (Fácil):
   A abordagem com loop percorre a string caractere por caractere e, utilizando o método Character.isUpperCase(c), verifica se o caractere é uma letra maiúscula. Se for, ele é adicionado a um StringBuilder, que é utilizado para construir a nova string com apenas as letras maiúsculas.


    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingLoop(input));
    }

### 3. Streams (Avançada):
   Esta solução usa o conceito de Streams em Java, uma forma mais funcional de manipulação de dados. A ideia é transformar a string em um stream de caracteres, filtrar aqueles que são maiúsculos, convertê-los de volta para caracteres e finalmente concatená-los em uma nova string usando Collectors.joining().


    public static void main(String[] args) {
        String input = "VbAcMdfrOerSffDooEhhToooUawedRlloMwwAppIhhhTfffAsfdU!";
        System.out.println("Letras maiúsculas: " + filterUppercaseUsingStream(input));
    }

Cada uma dessas soluções apresenta uma maneira de resolver o problema de filtrar as letras maiúsculas de uma string. A escolha entre elas depende de vários fatores, como simplicidade, legibilidade, desempenho e familiaridade com os conceitos utilizados.

## Tecnologias Utilizadas

**Java 19**: A solução foi desenvolvida utilizando a versão 19 do Java, aproveitando as novas funcionalidades e otimizações da linguagem.

**JUnit 5**: Testes unitários foram realizados usando o framework JUnit 5 para garantir a confiabilidade das soluções.

## Como utilizar:

### 1. Clonar o projeto
````Bash
git clone https://github.com/Rafyy2102/DesafioFiltragensLetras.git
````

### 2 . Abra um terminal no projeto
Por exemplo o GitBash

### 3. Compilar o Código Fonte com `javac`:

Para compilar os arquivos Java, você pode usar o `javac`, que é o compilador padrão do Java.

- Navegue até o diretório onde os arquivos `.java` estão localizados.

```bash
javac src/main/UppercaseFilterUsingRegex.java
javac src/main/UppercaseFilterUsingLoop.java
javac src/main/UppercaseFilterUsingStreams.java
```

### 3. Executa o Código Fonte com `java`:
  
```bash
java src/main/UppercaseFilterUsingRegex.java
java src/main/UppercaseFilterUsingLoop.java
java src/main/UppercaseFilterUsingStreams.java
```

## Testes Unitários <img src="https://github.com/user-attachments/assets/a9dcff74-1e5e-455e-a01c-6dbcaa6f9065" alt="Imagem do Java" width="20"/>

Para rodar os testes unitários com **JUnit 5**, é necessário baixar a biblioteca JUnit 5 e adicioná-la ao seu projeto.

### 1.  Executar os Testes Unitários
Para executar os testes unitários, use o java com o classpath incluindo o JUnit 5. Execute o seguinte comando:

```bash
 java -cp ".;junit-platform-console-standalone-1.9.2.jar" org.junit.platform.console.ConsoleLauncher --scan-classpath
```

Este comando irá procurar todos os testes no classpath e executá-los.

### 2. Verificar a Saída dos Testes
Após executar os testes, você verá a saída indicando se os testes passaram ou falharam. Um exemplo de saída seria:
```bash
3/3 tests passed
```
