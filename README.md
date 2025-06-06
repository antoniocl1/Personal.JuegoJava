# 🐧 Juego de Pingüinos en Java
## Este es un proyecto personal para aprender más sobre Java.

> Este es un pequeño juego por consola escrito en Java en el que te enfrentas a pingüinos enemigos generados aleatoriamente. El jugador debe tomar decisiones estratégicas como luchar o huir, teniendo en cuenta su inventario de pescado y las restricciones de movimiento.

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

## 🧠 Lógica del Juego

1. Se genera un pingüino aleatorio (tamaños XS, S, M, L, XL).
2. El jugador ve el dibujo ASCII correspondiente.
3. El jugador elige entre:
   - **1 - Luchar**
   - **2 - Huir**
4. Si elige huir:
   - Se revisa si tiene pescado.
   - Se reduce el pescado y se avanza.
5. Si elige luchar:
   - Se determina aleatoriamente si gana o pierde (puedes modificar la lógica según dificultad).
6. Si pierde, fin del juego.
7. Si gana o huye exitosamente, continúa el juego.

---

## 💻 Requisitos

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/)
- Consola de comandos o terminal
- Editor de texto para ver/editar el código fuente (opcional)

---
## ⚙️ Instrucciones de Compilación y Ejecución

```bash
# 1. Abre la terminal en la carpeta donde están los archivos .java

# 2. Compila los archivos con:
javac Main.java Juego.java Jugador.java Pinguino.java

# 3. Ejecuta el programa con:
java Main
```

---

🧪 Ejemplo de Ejecución

```java
Tamaño aleatorio: L  
PINGUINO L  
         __  
       <(o )___  
        (    )  
        (    )  
        (    )  
        ^^--^^  

¿Quieres luchar (1) o huir (2)? → 2  
¡Has huido! Te quedan 2 pescados.  

Tamaño aleatorio: XS  
PINGUINO XS  
       __  
     <(o )___  
      ^^--^^  

¿Quieres luchar (1) o huir (2)? → 1  
¡Has ganado el combate!  

Tamaño aleatorio: XL  
PINGUINO XL  
       __  
     <(o )___  
      (    )  
      (    )  
      (    )  
      (    )  
      (    )  
      ^^--^^  

¿Quieres luchar (1) o huir (2)? → 1  
¡Has perdido! El juego ha terminado.
```

---

🧠 Decisiones de Diseño  
- **División en clases:** he separado la lógica en varias clases (`Juego`, `Jugador`, `Pinguino`) para tener un diseño limpio y facilitar futura edición del código.  
- **Tamaños visuales:** los pingüinos se ven diferentes según su tamaño, considero que añade un toque divertido al juego.  
- **Dirección y lógica de huida:** evito que el jugador pueda huir dos veces por la misma dirección, lo que añade dificultad estratégica.  
- **Aleatoriedad:** tanto los tamaños de los pingüinos como los resultados de combate son aleatorios, haciendo cada partida distinta.  
- **Gestión de recursos:** el jugador debe usar cuidadosamente sus pescados, ya que son limitados y se gastan al huir.  

👨‍💻 **Autor**  
Proyecto desarrollado por [antoniocl1](https://www.linkedin.com/in/antonio-jes%C3%BAs-cort%C3%A9s-l%C3%B3pez-502189348/) como ejercicio práctico de programación Java en consola, reforzando conceptos de orientación a objetos, estructuras de control y diseño por clases.
