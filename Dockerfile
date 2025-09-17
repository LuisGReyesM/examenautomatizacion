# Imagen base con Java 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio de la app
WORKDIR /app

# Copiar archivos de la aplicación
COPY target/ExamenAutomatizacion-0.0.1-SNAPSHOT.jar app.jar

# Exponer puertos
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
