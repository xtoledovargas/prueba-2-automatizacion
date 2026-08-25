
# Taller : Automatización de Pruebas e Integración Continua

## 1. Objetivos del Proyecto

* Implementar un flujo de integración continua (CI) con GitHub Actions.
* Diseñar pruebas unitarias atómicas e independientes utilizando JUnit 5 y Maven.
* Aplicar buenas prácticas de gestión de versiones con Git.

## 2. Estructura del Proyecto

prueba-2-automatizacion/
├── .github/
│   └── workflows/
│       └── ci.yml
├── src/
│   ├── main/java/com/evaluacion/
│   │   └── Calculadora.java
│   └── test/java/com/evaluacion/
│       └── CalculadoraTest.java
├── .gitignore
├── pom.xml
└── README.md


## 3. Comandos Utilizados
* **Ejecutar pruebas unitarias localmente:**
  ```bash
  mvn test

  Comandos de Git para flujo de trabajo:

  git checkout -b feature/test-unitarios
git add .
git commit -m "mensaje explicativo"
git push origin feature/test-unitarios

Descripción del Pipeline CI
El pipeline configurado en .github/workflows/ci.yml realiza las siguientes acciones de forma automática en cada push o pull_request:

Descarga el código fuente del repositorio (actions/checkout@v4).

Configura el entorno de ejecución con Java JDK 17 (actions/setup-java@v4).

Compila y ejecuta las pruebas unitarias con Maven (mvn test).

Genera y publica el reporte de pruebas Surefire como un artefacto navegable (actions/upload-artifact@v4).

