# language: es
Característica: Operaciones matemáticas avanzadas en la Calculadora

  Escenario: Sumar dos números enteros correctamente
    Dado que tengo una calculadora abierta
    Cuando sumo los números 10 y 15
    Entonces el resultado de la operación debe ser 25

  Esquema del escenario: Multiplicación de varios pares de números
    Dado que tengo una calculadora abierta
    Cuando multiplico el número <num1> y el número <num2>
    Entonces el resultado obtenido debe ser <resultado>

    Ejemplos:
      | num1 | num2 | resultado |
      | 2    | 3    | 6         |
      | 5    | 4    | 20        |
      | 0    | 10   | 0         |