# 🐧 Juego de Pingüinos en Java
## Este es un proyecto personal para aprender más sobre Java.

Este es un pequeño juego por consola escrito en Java en el que te enfrentas a pingüinos enemigos generados aleatoriamente. El jugador debe tomar decisiones estratégicas como luchar o huir, teniendo en cuenta su inventario de pescado y las restricciones de movimiento.

---

## 📁 Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- **`Main.java`**: Punto de entrada del programa.
- **`Juego.java`**: Controla el flujo principal del juego.
- **`Jugador.java`**: Define al jugador, su inventario de pescados y las decisiones que toma.
- **`Pinguino.java`**: Genera pingüinos enemigos con distintos tamaños y formas visuales.

Todos los archivos `.java` deben estar en el mismo directorio.

---

## 🎮 Funcionamiento del juego

- En cada ronda aparecerá un pingüino de forma aleatoria.
- Se te perguntará si quieres: **luchar (1)** o **huir (2)**.
- Si decides huir, se consumirá **1 pescado**. Empiezarás con **3**.
- No puedes huir si no tienes pescado.
- No puedes retroceder por el mismo camino del que vienes.
- Si luchas y pierdes, el juego termina.
- Si ganas todos los enfrentamientos, ¡has ganado!

---
