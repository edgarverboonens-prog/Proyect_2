# 📚 Estructuras de Datos y Algoritmos de Ordenamiento (Java)

Este repositorio contiene una suite completa de estructuras de datos lineales y algoritmos de ordenamiento, implementada en **Java** bajo el entorno de **IntelliJ IDEA**. El proyecto destaca por su capacidad de gestionar tanto tipos de datos primitivos como objetos complejos (TDA).

---

## 🛠️ Estructuras de Datos Implementadas

El proyecto está modularizado para demostrar la versatilidad de las estructuras en diferentes contextos de memoria y tipos de datos.

### 1. Colas (Queues)
Se encuentran en el módulo principal y se dividen en dos enfoques de implementación:
*   **ArregloNuevoDato:** Utiliza el tipo de dato personalizado `Producto.java`. 
    *   Implementa una arquitectura de clases (Abstracta/Concreta) para definir el comportamiento de la cola sobre arreglos.
*   **ArreglosDatoBasico:** Implementación clásica utilizando tipos de datos primitivos (int, double, etc.).
*   **Punteros:** Implementación dinámica de colas utilizando nodos enlazados.

### 2. Listas y Pilas
*   **Listas:** Ubicadas en la carpeta `Lista`, incluyen implementaciones de gestión dinámica de elementos.
*   **Pilas:** Implementaciones basadas en el principio LIFO para la gestión de estados y reversión de procesos.

---

## ⚡ Algoritmos de Ordenamiento
Ubicados en la carpeta `Ordenamientos`, se incluyen los tres pilares del ordenamiento algorítmico:

1.  **Bubble Sort (Burbuja):** Método por comparación adyacente simple.
2.  **Merge Sort:** Algoritmo eficiente de tipo "Divide y Vencerás" con complejidad $O(n \log n)$.
3.  **Quick Sort:** Ordenamiento por partición, optimizado para alto rendimiento en grandes conjuntos de datos.

---

## 🚀 Guía de Ejecución en IntelliJ IDEA

Al ser un proyecto nativo de IntelliJ (archivos `.iml`), la configuración es directa:

### Requisitos
*   **JDK 17** o superior.
*   **IntelliJ IDEA** (Community o Ultimate).

### Pasos
1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/edgarverboonens-prog/Proyect_2.git](https://github.com/edgarverboonens-prog/Proyect_2.git)
    ```
2.  **Importar en el IDE:**
    *   Abre IntelliJ y selecciona `File > Open`.
    *   Elige la carpeta raíz `Proyect_2`.
3.  **Configuración de Módulos:**
    *   El IDE detectará automáticamente los archivos `Aplicaciones_Cola.iml` y `Proyect_2.iml`.
    *   Asegúrate de que la carpeta `src` esté marcada como **Sources Root** (Click derecho en src > Mark Directory as > Sources Root).
4.  **Correr el programa:**
    *   Busca el archivo `main.java` dentro de `src/Arreglos/ArregloNuevoDato/`.
    *   Haz clic derecho y selecciona **Run 'main.java'**.

---

## 📂 Jerarquía del Proyecto
```text
├── Cola/Aplicaciones_Cola/
│   ├── src/
│   │   ├── Arreglos/
│   │   │   ├── ArregloNuevoDato/  <-- Lógica con Producto.java
│   │   │   └── ArreglosDatoBasico/
│   │   ├── Libreria/
│   │   └── Punteros/
│   └── Aplicaciones_Cola.iml
├── Lista/                      # Implementaciones de Listas
├── Ordenamientos/              # Quick, Merge y Bubble Sort
├── .gitignore
├── Proyect_2.iml               # Configuración principal
└── README.md


