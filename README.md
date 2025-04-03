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

Essas são as principais features do Java 8. Elas tornam o código mais conciso, legível e funcional, além de introduzir melhorias significativas na API de coleções e no tratamento de datas e horas.

