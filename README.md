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

---

O Java 9 trouxe várias novas funcionalidades e melhorias. Aqui estão as principais features explicadas de forma didática e com exemplos:

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

---
 
