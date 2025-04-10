### **Java 8**

O Java 8 trouxe diversas melhorias e novas funcionalidades que revolucionaram a forma como os desenvolvedores escrevem código em Java.

---

### 1. **Lambdas e Expressões Lambda**
As expressões lambda permitem que você escreva funções anônimas de forma mais concisa. Elas são úteis para simplificar o uso de interfaces funcionais (interfaces com apenas um método abstrato).

**Exemplo:**
```java
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bruno", "Carlos");

        // Antes do Java 8
        for (String name : names) {
            System.out.println(name);
        }

        // Com Lambda
        names.forEach(name -> System.out.println(name));
    }
}
```

---

### 2. **Streams API**
A API de Streams permite processar coleções de dados de forma funcional, como mapear, filtrar e reduzir dados.

**Exemplo:**
```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filtrar números pares e imprimir
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
```

---

### 3. **Interface Funcional e Anotação `@FunctionalInterface`**
Uma interface funcional é uma interface com apenas um método abstrato. A anotação `@FunctionalInterface` é usada para garantir que a interface siga essa regra.

**Exemplo:**
```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Resultado: " + addition.calculate(5, 3));
    }
}
```

---

### 4. **Métodos Default em Interfaces**
Agora, as interfaces podem ter métodos com implementação padrão, permitindo adicionar novos métodos sem quebrar o código existente.

**Exemplo:**
```java
interface Vehicle {
    void start();

    // Método default
    default void stop() {
        System.out.println("Veículo parando...");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Carro iniciando...");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
```

---

### 5. **Optional**
A classe `Optional` ajuda a evitar `NullPointerException` ao lidar com valores que podem ser nulos.

**Exemplo:**
```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        // Verificar se o valor está presente
        System.out.println(name.orElse("Valor padrão"));
    }
}
```

---

### 6. **Referências a Métodos**
As referências a métodos permitem reutilizar métodos existentes em vez de criar lambdas.

**Exemplo:**
```java
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Bruno", "Carlos");

        // Usando referência a método
        names.forEach(System.out::println);
    }
}
```

---

### 7. **API de Data e Hora (java.time)**
O Java 8 introduziu uma nova API para lidar com datas e horas, que é mais intuitiva e imutável.

**Exemplo:**
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Data: " + date);
        System.out.println("Hora: " + time);
        System.out.println("Data e Hora: " + dateTime);
    }
}
```

---

### 8. **Mapas com `forEach` e Métodos de Conveniência**
A classe `Map` ganhou novos métodos como `forEach`, `computeIfAbsent`, `computeIfPresent`, entre outros.

**Exemplo:**
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        // Iterar com forEach
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
```
Java 9
---
 
---

### 1. **Sistema de Módulos (Project Jigsaw)**
 Java 9 
**Exemplo:**
```java
// module-info.java
module com.example.myapp {
    requires java.base; // Importa o módulo base do Java
    exports com.example.myapp.utils; // Exporta o pacote para outros módulos
}
```

---

### 2. **Métodos `private` em Interfaces**
Agora, interfaces podem ter métodos `private` para reutilizar código dentro da própria interface.

**Exemplo:**
```java
interface MyInterface {
    default void showMessage() {
        log("Hello from default method!");
    }

    private void log(String message) {
        System.out.println(message);
    }
}
```

---

### 3. **`JShell` (REPL)**
O `JShell` é uma ferramenta interativa para testar trechos de código Java sem precisar criar um arquivo completo.

**Exemplo no terminal:**
```shell
jshell> int x = 10;
jshell> System.out.println(x * 2);

```

---

### 4. **Coleções Imutáveis**
O Java 9 introduziu métodos para criar coleções imutáveis de forma mais simples.

**Exemplo:**
```java
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        Set<String> set = Set.of("X", "Y", "Z");
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
```

---

### 5. **`Stream` API Melhorada**
Novos métodos foram adicionados à API de Streams, como `takeWhile`, `dropWhile` e `ofNullable`.

**Exemplo:**
```java
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

        // takeWhile: Pega elementos enquanto a condição for verdadeira
        stream.takeWhile(n -> n < 4).forEach(System.out::println); // Saída: 1, 2, 3
    }
}
```

---

### 6. **`Optional` Melhorado**
O `Optional` agora tem novos métodos como `ifPresentOrElse` e `stream`.

**Exemplo:**
```java
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        optional.ifPresentOrElse(
            value -> System.out.println("Value: " + value),
            () -> System.out.println("No value present")
        );
    }
}
```

---

### 7. **`Process API` Melhorada**
A API de processos foi aprimorada para facilitar a interação com processos do sistema operacional.

**Exemplo:**
```java
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Process ID: " + currentProcess.pid());
    }
}
```

---

### 8. **Compact Strings**
O Java 9 introduziu uma otimização para armazenar strings de forma mais eficiente, usando menos memória para strings que contêm apenas caracteres Latin-1.

---

### 9. **HTTP/2 Client**
O Java 9 trouxe um cliente HTTP/2 experimental para substituir a antiga API `HttpURLConnection`.

**Exemplo:**
```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://example.com"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
```
Java 10
---

### 1. **Inferência de Tipo com `var`**
O Java 10 introduziu a palavra-chave `var`, que permite a inferência de tipo para variáveis locais. O compilador determina o tipo da variável com base no valor atribuído.

**Exemplo:**
```java
import java.util.List;

public class VarExample {
    public static void main(String[] args) {
        var message = "Olá, Java 10!"; // O tipo é inferido como String
        var numbers = List.of(1, 2, 3, 4, 5); // O tipo é inferido como List<Integer>

        System.out.println(message);
        numbers.forEach(System.out::println);
    }
}
```
**Observação:** O `var` só pode ser usado para variáveis locais, dentro de métodos, inicializadas no momento da declaração.

---

### 2. **Coleta de Lixo Paralela para Memória Heap Completa (Full GC)**
O coletor de lixo G1 foi aprimorado para lidar com a coleta de lixo completa (Full GC) de forma paralela, melhorando o desempenho em cenários de alta carga.

**Impacto:** Essa melhoria é interna e não requer alterações no código. Ela reduz pausas durante a coleta de lixo.

---

### 3. **API de Criação de Coleções Imutáveis**
O Java 10 expandiu a API de coleções para facilitar a cópia de coleções imutáveis.

**Exemplo:**
```java
import java.util.List;

public class CopyOfExample {
    public static void main(String[] args) {
        List<String> originalList = List.of("A", "B", "C");
        List<String> copiedList = List.copyOf(originalList);

        System.out.println(copiedList);
    }
}
```
**Observação:** A coleção retornada por `List.copyOf` é imutável.

---

### 4. **Integração com Docker**
O Java 10 melhorou o suporte para execução em contêineres Docker, permitindo que a JVM reconheça limites de memória e CPU configurados no contêiner.

**Impacto:** Essa melhoria é útil para aplicações que rodam em ambientes de contêiner, como Kubernetes.

---

### 5. **Compact Strings no Garbage Collector**
O Java 10 aprimorou o uso de Compact Strings, otimizando o uso de memória para strings que contêm apenas caracteres Latin-1.

**Impacto:** Essa melhoria é automática e reduz o consumo de memória em aplicações que manipulam muitas strings.

---

### 6. **API de `Optional` Melhorada**
O Java 10 adicionou o método `orElseThrow()` à classe `Optional`, que lança uma exceção se o valor não estiver presente.

**Exemplo:**
```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 10");

        // Lança NoSuchElementException se o valor não estiver presente
        String value = optional.orElseThrow();
        System.out.println(value);
    }
}
```

---

### 7. **Consolidação do JDK**
O Java 10 consolidou o código-fonte do JDK em um único repositório, facilitando a manutenção e o desenvolvimento do JDK.

**Impacto:** Essa mudança é interna e não afeta diretamente o código do desenvolvedor.

---

Essas são as principais features do Java 10. A introdução do `var` e as melhorias na API de coleções e `Optional` são as mais visíveis para os desenvolvedores, enquanto as melhorias no coletor de lixo e no suporte a Docker beneficiam o desempenho e a execução em ambientes modernos.



### **Java 11**
---

### 1. **Strings: Novos Métodos**
O Java 11 adicionou novos métodos úteis à classe `String`.

- **`isBlank()`**: Verifica se a string está vazia ou contém apenas espaços em branco.
- **`lines()`**: Divide a string em linhas.
- **`strip()`**: Remove espaços em branco no início e no final da string (melhor que `trim()`).
- **`repeat(int count)`**: Repete a string o número de vezes especificado.

```java
public class StringFeatures {
    public static void main(String[] args) {
        String str = "  Hello Java 11  ";
        
        // isBlank
        System.out.println("".isBlank()); // true
        System.out.println("   ".isBlank()); // true

        // lines
        String multiline = "Line1\nLine2\nLine3";
        multiline.lines().forEach(System.out::println);

        // strip
        System.out.println(str.strip()); // "Hello Java 11"

        // repeat
        System.out.println("Java".repeat(3)); // "JavaJavaJava"
    }
}
```

---

### 2. **`var` em Expressões Lambda**
Agora é possível usar `var` para declarar parâmetros em expressões lambda.

```java
import java.util.function.BiFunction;

public class LambdaVar {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (var a, var b) -> a + b;
        System.out.println(sum.apply(5, 10)); // 15
    }
}
```

---

### 3. **HTTP Client**
O Java 11 introduziu um novo **HTTP Client API** para realizar requisições HTTP de forma mais simples e moderna.

```java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class HttpClientExample {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
```

---

### 4. **`Files` - Ler e Escrever Strings**
A classe `Files` agora permite ler e escrever arquivos diretamente como strings.

```java
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("example.txt");

        // Escrever em um arquivo
        Files.writeString(filePath, "Hello, Java 11!");

        // Ler de um arquivo
        String content = Files.readString(filePath);
        System.out.println(content); // "Hello, Java 11!"
    }
}
```

---

### 5. **Remoção de APIs e Ferramentas Antigas**
Algumas APIs e ferramentas foram removidas no Java 11, como:
- **Java EE e CORBA**: APIs como `javax.xml.bind` (JAXB) foram removidas.
- **JavaFX**: Não faz mais parte do JDK.

---

### 6. **Executar Código Java sem Compilação**
Agora é possível executar arquivos `.java` diretamente sem compilar manualmente.

```bash
# Exemplo
$ echo 'public class Hello { public static void main(String[] args) { System.out.println("Hello, Java 11!"); } }' > Hello.java
$ java Hello.java
Hello, Java 11!
```

---

### 7. **ZGC (Garbage Collector Experimental)**
O **Z Garbage Collector (ZGC)** foi introduzido como um coletor de lixo de baixa latência. Ele é ideal para aplicações que precisam de tempos de pausa curtos.

---

### 8. **Novos Métodos em `Optional`**
A classe `Optional` recebeu novos métodos, como `isEmpty()`.

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);

        // isEmpty
        System.out.println(optional.isEmpty()); // true
    }
}
```
Java 12
---

---

### 1. **Switch Expressions (Preview)**
O Java 12 introduziu uma nova forma de usar o `switch`, tornando-o mais expressivo e funcional. Agora, ele pode ser usado como uma expressão que retorna um valor.

```java
public class SwitchExpressions {
    public static void main(String[] args) {
        int day = 3;
        String dayType = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println(dayType); // Output: Weekday
    }
}
```

---

### 2. **JVM Constants API**
O Java 12 introduziu a API `java.lang.invoke.constant` para trabalhar com constantes de forma mais eficiente. Essa API é útil para frameworks e ferramentas que precisam manipular bytecode.

```java
import java.lang.invoke.MethodHandles;
import java.lang.invoke.constant.ClassDesc;

public class JVMConstantsAPI {
    public static void main(String[] args) {
        ClassDesc classDesc = MethodHandles.lookup().lookupClass().describeConstable().orElseThrow();
        System.out.println(classDesc.displayName()); // Output: JVMConstantsAPI
    }
}
```

---

### 3. **Compact Number Formatting**
O Java 12 adicionou suporte para formatação de números compactos, como "1K" para 1.000 ou "1M" para 1.000.000, usando a classe `NumberFormat`.

```java
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatting {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(formatter.format(1_000)); // Output: 1K
        System.out.println(formatter.format(1_000_000)); // Output: 1M
    }
}
```

---

### 4. **Garbage Collector Improvements**
- **G1 Garbage Collector**: Melhorias no G1 para reduzir pausas e melhorar o desempenho.
- **Shenandoah GC (Experimental)**: Um novo coletor de lixo de baixa latência foi introduzido.

---

### 5. **Default CDS Archives**
O **Class Data Sharing (CDS)** agora é habilitado por padrão, o que melhora o tempo de inicialização da JVM ao compartilhar metadados de classes entre processos.

---

### 6. **Teardown de Threads de JVM**
O Java 12 introduziu melhorias no processo de encerramento de threads da JVM, tornando-o mais eficiente.

---

### 7. **String Enhancements**
O método `indent(int n)` foi adicionado à classe `String`, permitindo adicionar ou remover espaços em branco no início de cada linha.

```java
public class StringIndent {
    public static void main(String[] args) {
        String text = "Hello\nJava 12";
        System.out.println(text.indent(4)); // Adiciona 4 espaços no início de cada linha
    }
}
```

---
 

 
