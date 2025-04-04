module com.example.myapp {
    requires java.sql;
    requires java.net.http; // Dependência de outro módulo
    exports br.com.core.rmmapp.features.java9; // Exporta o pacote para outros módulos
}