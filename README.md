# Filtragens de Letras Maiúsculas <img src="https://github.com/user-attachments/assets/4c49b711-158a-48a8-b4a2-6766bb254d80" alt="Imagem do Java" width="50"/>

Este repositório contém três abordagens distintas para filtrar as letras maiúsculas de uma string fornecida. Cada uma das soluções apresentadas utiliza uma técnica diferente: Regex, Loop e Streams. 


## Tecnologias Utilizadas

**Java 19**: A solução foi desenvolvida utilizando a versão 19 do Java, aproveitando as novas funcionalidades e otimizações da linguagem.

**JUnit 5**: Testes unitários foram realizados usando o framework JUnit 5 para garantir a confiabilidade das soluções.


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

## Como Executar o Código

### 1. Compilar o Código Fonte

Para compilar os arquivos Java, você pode usar o `javac`, que é o compilador padrão do Java.

- Navegue até o diretório onde os arquivos `.java` estão localizados.
- Compile os arquivos utilizando o comando `javac`:

```bash
javac main/UppercaseFilterUsingRegex.java
javac main/UppercaseFilterUsingLoop.java
javac main/UppercaseFilterUsingStreams.java
```

### 1.1 Baixar o JUnit 5

Para rodar os testes unitários com **JUnit 5**, é necessário baixar a biblioteca JUnit 5 e adicioná-la ao seu projeto.

Você pode baixar o arquivo JAR standalone do JUnit 5 diretamente do [site oficial do JUnit 5](https://junit.org/junit5/) ou usar o seguinte link direto para a versão mais recente:

- [JUnit 5 - JAR standalone](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.2/junit-platform-console-standalone-1.9.2.jar)

Baixe o arquivo **`junit-platform-console-standalone-x.x.x.jar`**.

### 2. Compilar os Testes com JUnit 5
Para compilar os arquivos de teste, você precisa do JUnit 5 no classpath. Supondo que você tenha os arquivos JAR do JUnit 5, compile os arquivos de teste com o seguinte comando:

```bash
javac -cp ".;path_to_junit/junit-platform-console-standalone-1.x.x.jar" test/UppercaseFilterTest.java
```
Importante: Substitua `path_to_junit/junit-platform-console-standalone-1.x.x.jar` pelo caminho correto para o JUnit 5 na sua máquina.

### 3. Executar os Testes Unitários
Para executar os testes unitários, use o java com o classpath incluindo o JUnit 5. Execute o seguinte comando:

```bash
java -cp ".;path_to_junit/junit-platform-console-standalone-1.x.x.jar" org.junit.platform.console.ConsoleLauncher --scan-classpath
```
Importante: Certifique-se de substituir o `path_to_junit/junit-platform-console-standalone-1.x.x.jar` pelo caminho correto para o JUnit 5 na sua máquina.

Este comando irá procurar todos os testes no classpath e executá-los.

### 4. Verificar a Saída dos Testes
Após executar os testes, você verá a saída indicando se os testes passaram ou falharam. Um exemplo de saída seria:
```bash
3/3 tests passed
```
