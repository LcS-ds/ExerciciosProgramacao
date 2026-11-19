# Exercícios de Programação e Algoritmos

Atividades em Java de Lucas Sena, 1º DS. Os arquivos foram transcritos a partir dos registros das atividades.

| Atividade | Código |
| --- | --- |
| Entrada de dados com `JOptionPane` | [src/entrada](src/entrada) |
| Sobrescrita de métodos com `@Override` | [src/heranca](src/heranca) |
| Criação de objetos | [src/instanciacao](src/instanciacao) |
| Encapsulamento com getters e setters | [src/encapsulamento](src/encapsulamento) |

## Como executar

No Eclipse ou no IntelliJ IDEA, crie um projeto Java, copie os pacotes para a pasta de código-fonte e execute a classe com o método `main`. Também é possível compilar com um JDK pelo terminal.

```sh
javac -encoding UTF-8 -d out src/entrada/*.java src/heranca/*.java src/instanciacao/*.java src/encapsulamento/*.java
java -cp out entrada.EntradaDeDados
java -cp out entrada.EntradaNumero
java -cp out heranca.Main2
java -cp out instanciacao.Main
java -cp out encapsulamento.Main
```

Os dois programas de entrada usam janelas Swing e precisam de um ambiente gráfico. O exemplo de instanciação cria um objeto sem imprimir no console.
