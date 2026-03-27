## Proyecto-D-D

Partiendo del proyecto de recuperación del examen práctico UD4, vamos a aprender a usar git correctamente.

## Descripción

Este proyecto consiste en la simulación de un sistema de gestión de personajes para un videojuego utilizando **programación orientada a objetos en Java, herencias y usando git para su subida**.

## Estructura del proyecto

El sistema está compuesto por las siguientes clases:

- `Personaje` (clase base)
- `Guerrero` (hereda de Personaje)
- `Mago` (hereda de Personaje)
- `App` (clase ejecutable)

---

## Clase Personaje

### Atributos:

- `nombre`
- `nivel`
- `energia`

### Funcionalidades:

- Entrenar → aumenta el nivel
- Descansar → recupera energía
- Gastar energía → reduce energía
- Mostrar información

## Clase Guerrero

Hereda de `Personaje`.

### Atributo adicional:

- `arma`

### Métodos:

- `ataquePesado()` → reduce 15 de energía
- Sobrescribe `mostrarInfo()`

## Clase Mago

Hereda de `Personaje`.

### Atributo adicional:

- `elemento`

### Métodos:

- `ataqueElemental()` → reduce 25 de energía
- Sobrescribe `mostrarInfo()`

## Ejecución del programa

La clase `App`realiza las siguientes acciones:

1. Crea un personaje llamado **Eldrin**
2. Lo entrena y gasta energía
3. Muestra su información
4. Crea un guerrero llamado **Thorak**
5. Ejecuta ataque pesado y descanso
6. Muestra su información
7. Crea un mago llamado **Lyra**
8. Ejecuta ataque elemental y entrenamiento
9. Muestra su información
10. Guarda todos los personajes en un array
11. Recorre el array mostrando la información

## Conclusión

Este proyecto demuestra cómo modelar un sistema de personajes usando herencia y reutilización de código, permitiendo extender fácilmente nuevas clases (como arquero, healer, etc.).

(Nota, parte de este Readme fue creado con IA, pero fue revisado por el creador para que muestre todo)
