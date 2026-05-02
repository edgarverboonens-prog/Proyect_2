<div align="center">

![Logo del Equipo](https://i.pinimg.com/736x/0c/c2/13/0cc2139fe1a3f9a7dc052aeeec9d20e0.jpg)

# 📚 Estructuras de Datos y Algoritmos de Ordenamiento

*Una suite completa de estructuras de datos lineales y algoritmos, implementada en un ecosistema híbrido usando Java y C++.*

<!-- Badges de tecnologías -->
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05032.svg?style=for-the-badge&logo=git&logoColor=white)

</div>

---

## 👨‍💻 Sobre el Proyecto

Este repositorio contiene un ecosistema modularizado diseñado para gestionar tanto tipos de datos primitivos como objetos complejos (TDA). 

Gran parte de las estructuras implementadas siguen una arquitectura de software limpia dividida rigurosamente en **3 archivos principales**, garantizando un bajo acoplamiento:
1. **Interfaz / Header (`.h` / `Interface`):** Define las firmas y el contrato de los métodos.
2. **Clase Abstracta:** Establece el molde general y las reglas de negocio de la estructura.
3. **Clase Concreta / Main:** Implementa la lógica exacta y la interacción directa con el usuario.

---

## 🛠️ Estructuras de Datos Implementadas

### 📦 1. Colas (Queues)
Divididas en diferentes enfoques de implementación según la gestión de memoria y el lenguaje:
* 🌱 **ArregloNuevoDato (Java):** Utiliza el tipo de dato personalizado `Producto.java` aplicando la arquitectura Abstracta/Concreta.
* ⚙️ **ArreglosDatoBasico (Java):** Implementación clásica utilizando tipos de datos primitivos (`int`, `double`, etc.).
* 🔗 **Punteros (C++):** Implementación de colas dinámicas manipulando directamente la memoria mediante aritmética de punteros y nodos.

### 📝 2. Listas (Lists)
Incluyen implementaciones de gestión dinámica de elementos en memoria:
* ☕ **Implementación en Java:** Manejo de listas apoyado en la recolección de basura nativa del lenguaje, abarcando arreglos y uso de librerías.
* ⚙️ **Implementación en C++:** Gestión manual de la memoria utilizando punteros para enlazar los elementos y recorrer la estructura, garantizando una administración eficiente de los recursos.

### 🥞 3. Pilas (Stacks)
Implementaciones basadas en el principio **LIFO** (Last In, First Out) para la gestión de estados:
* ⚙️ **Implementación en C++:** Desarrollo enfocado en el alto rendimiento y manejo de referencias en memoria para apilar y desapilar datos de forma controlada y segura mediante el uso de arreglos, librerías y punteros.

---

## ⚡ Algoritmos de Ordenamiento

Ubicados en la carpeta `Ordenamientos` (Java), se incluyen los tres pilares del ordenamiento algorítmico manejando TDAs (`Persona.java`):

1. 🫧 **Bubble Sort (Burbuja):** Método por comparación adyacente simple.
2. 🔀 **Merge Sort:** Algoritmo eficiente de tipo "Divide y Vencerás" con complejidad matemática de $O(n \log n)$.
3. ⏱️ **Quick Sort:** Ordenamiento por partición, optimizado para alto rendimiento en grandes conjuntos de datos.

---

## 🚀 Guías de Ejecución

### ☕ Para los módulos en Java (IntelliJ IDEA)
Al ser un proyecto nativo de IntelliJ (incluye archivos `.iml`), la configuración es directa:
1. **Importar en el IDE:** Abre IntelliJ, selecciona `File > Open` y elige la carpeta raíz.
2. **Configuración de Módulos:** Asegúrate de que la carpeta `src` de cada submódulo esté marcada como **Sources Root** *(Click derecho en src > Mark Directory as > Sources Root)*.
3. **Correr el programa:** Busca el archivo `main.java` o `Main.java` correspondiente al tema, haz clic derecho y selecciona **Run 'Main.java'**.

### ⚙️ Para los módulos en C++ (Punteros)
Para compilar los ejercicios basados en punteros, necesitas un compilador de C++ (como `g++` / MinGW) o un IDE compatible (como Dev-C++, CLion o VS Code).
1. Abre tu terminal o consola de comandos.
2. Navega hasta la carpeta del proyecto en C++ que deseas ejecutar.
3. Compila los archivos uniendo la implementación y el main:
   ```bash
   g++ main.cpp Estructura.cpp -o programa
   ```
4. Ejecuta el archivo resultante:
   * En Windows: `programa.exe`
   * En Linux/Mac: `./programa`

---

## 📂 Jerarquía General del Proyecto
```text
Proyect_2/
├── .gitignore
├── Proyect_2.iml
├── README.md
├── Reporte2doParcial.pdf
│
├── Cola/
│   └── Aplicaciones_Cola/
│       ├── .idea/
│       │   └── workspace.xml
│       ├── Aplicaciones_Cola.iml
│       └── src/
│           ├── Arreglos/
│           │   ├── ArregloNuevoDato/
│           │   │   ├── ColaArregloND_Abstracta.java
│           │   │   ├── ColaArregloND_Concreta.java
│           │   │   ├── Producto.java
│           │   │   └── main.java
│           │   └── ArreglosDatoBasico/
│           │       ├── ColaArregloDB_Abstracta.java
│           │       ├── ColaArregloDB_Concreta.java
│           │       └── main.java
│           ├── Libreria/
│           │   ├── LibreriaDB/
│           │   │   ├── ColaLibreriaDB_Abstracta.java
│           │   │   ├── ColaLibreriaDB_Concreta.java
│           │   │   └── main.java
│           │   └── LibreriaNuevoDato/
│           │       ├── ColaLibreriaND_Abstracta.java
│           │       ├── ColaLibreriaND_Concreta.java
│           │       ├── Producto.java
│           │       └── main.java
│           └── Punteros/
│               ├── DatoDB/
│               │   ├── Cola.h
│               │   ├── ColaPuntero_DB.dev
│               │   ├── ColaPuntero_DB.exe
│               │   ├── ColaPuntero_DB.layout
│               │   ├── Estructura.h
│               │   ├── Makefile.win
│               │   ├── main.cpp
│               │   └── main.o
│               └── NuevoTipoDato/
│                   ├── Cola.h
│                   ├── ColaPuntero_NuevoDato.dev
│                   ├── ColaPuntero_NuevoDato.exe
│                   ├── ColaPuntero_NuevoDato.layout
│                   ├── Estructura.h
│                   ├── Makefile.win
│                   ├── main.cpp
│                   └── main.o
│
├── Lista/
│   ├── .idea/
│   │   ├── .gitignore
│   │   ├── Nueva carpeta.iml
│   │   ├── misc.xml
│   │   └── modules.xml
│   ├── Array/
│   │   ├── ARRAY-DB/
│   │   │   ├── ARRAY-DB.iml
│   │   │   └── src/
│   │   │       ├── ADTArrayDB.java
│   │   │       ├── ListaArrayBasica.java
│   │   │       └── main.java
│   │   └── ARRAY-NuevoTipoDato/
│   │       ├── ARRAY-NuevoTipoDato.iml
│   │       └── src/
│   │           ├── ADTListNTD.java
│   │           ├── ListaArray.java
│   │           ├── Persona.java
│   │           └── main.java
│   ├── Librerias/
│   │   ├── DB-Listas/
│   │   │   ├── DB-Listas.iml
│   │   │   └── src/
│   │   │       ├── ADTLibDB.java
│   │   │       ├── ListaLibreriaBasica.java
│   │   │       └── Main.java
│   │   └── NuevoTipoDato-Listas/
│   │       ├── NuevoTipoDato-Listas.iml
│   │       └── src/
│   │           ├── ADTLibNTD.java
│   │           ├── ListaLibreria.java
│   │           ├── Main.java
│   │           └── Persona.java
│   └── Puntero/
│       ├── Dato Basico/
│       │   ├── LISTAS-DB.dev
│       │   ├── LISTAS-DB.exe
│       │   ├── LISTAS-DB.layout
│       │   ├── ListaDinamica.cpp
│       │   ├── ListaDinamica.h
│       │   ├── ListaDinamica.o
│       │   ├── Makefile.win
│       │   ├── main.cpp
│       │   ├── main.o
│       │   ├── main2.cpp
│       │   └── main2.o
│       └── Nuevo Tipo De Dato/
│           ├── ListaPersonas.cpp
│           ├── ListaPersonas.h
│           ├── ListaPersonas.o
│           ├── Listas-TipoDeDato.dev
│           ├── Listas-TipoDeDato.exe
│           ├── Listas-TipoDeDato.layout
│           ├── Makefile.win
│           ├── main.cpp
│           └── main.o
│
├── Ordenamientos/
│   ├── .idea/
│   │   ├── .gitignore
│   │   ├── Ordenamientos.iml
│   │   ├── libraries/
│   │   │   ├── Codigo16Burbuja.xml
│   │   │   └── Codigo17Merge.xml
│   │   ├── misc.xml
│   │   └── modules.xml
│   ├── Burbuja sort/
│   │   ├── Burbuja Sort.iml
│   │   └── src/
│   │       ├── ADTOrdenadorNTD.java
│   │       ├── Main.java
│   │       ├── OrdenadorBurbuja.java
│   │       └── Persona.java
│   ├── Merge Sort/
│   │   ├── Merge Sort.iml
│   │   └── src/
│   │       ├── ADTOrdenadorNTD.java
│   │       ├── Main.java
│   │       ├── OrdenadorMerge.java
│   │       └── Persona.java
│   └── Quick sort/
│       ├── .gitignore
│       ├── .idea/
│       │   ├── .gitignore
│       │   ├── misc.xml
│       │   └── modules.xml
│       ├── OrdenamientoQuick.iml
│       ├── Quick sort.iml
│       └── src/
│           ├── ADTOrdenadorNTD.java
│           ├── Main.java
│           ├── OrdenadorQuick.java
│           └── Persona.java
│
└── Pila/
    ├── Array/
    │   ├── PILA.cpp
    │   ├── PILA.dev
    │   ├── PILA.h
    │   └── main.cpp
    ├── Libreria/
    │   ├── PilaLibreria.dev
    │   ├── Pilalibreria.cpp
    │   ├── Pilalibreria.h
    │   └── mainlibreria.cpp
    └── Punteros/
        ├── PilaPunteros.dev
        ├── Punteros.cpp
        ├── Punteros.h
        └── mainpunteros.cpp
```
