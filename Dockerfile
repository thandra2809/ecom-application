# Stage 1: Build
FROM eclipse-temurin:25-jdk AS builder

WORKDIR /app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw package -DskipTests

# Stage 2: Run (smaller image)
FROM eclipse-temurin:25-jre

WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 9090
CMD ["java", "-jar", "app.jar"]