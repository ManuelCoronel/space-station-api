# Runtime

#Imagen básica: el almacén es java y la etiqueta es 17-jdk
FROM eclipse-temurin:17-jdk-focal

# Variable JAR_FILE para almacenar la ruta del archivo JAR
COPY docs/libs/*.jar app.jar

# Comandos que deben ejecutarse después de que se inicia el contenedor
ENTRYPOINT ["java","-jar","/app.jar"]

# El contenedor expone el puerto 8091
EXPOSE 8091
