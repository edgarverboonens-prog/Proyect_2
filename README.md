# 📚 Estructuras de Datos y Algoritmos de Ordenamiento

Este repositorio contiene la implementación técnica de estructuras de datos lineales y algoritmos de ordenamiento fundamentales en **C++**, diseñados para trabajar tanto con tipos de datos básicos como con estructuras personalizadas.

---

## 🛠️ Estructuras de Datos Implementadas

Cada estructura está diseñada para ser genérica, permitiendo almacenar desde un `int` simple hasta un TDA (Tipo de Dato Abstracto) complejo.

### 1. Pilas (Stacks)
*   **Principio:** LIFO (Last In, First Out).
*   **Operaciones:** `push` (insertar), `pop` (eliminar), `peek` (ver tope).
*   **Dato Nuevo:** Soporte para objetos complejos (ej. Estructura `Nodo` con múltiples atributos).

### 2. Colas (Queues)
*   **Principio:** FIFO (First In, First Out).
*   **Operaciones:** `enqueue` (insertar), `dequeue` (eliminar), `front` (ver frente).

### 3. Listas Enlazadas (Linked Lists)
*   **Tipo:** Dinámica.
*   **Ventaja:** Gestión eficiente de memoria sin necesidad de definir un tamaño fijo inicial.

---

## ⚡ Algoritmos de Ordenamiento

Implementación de algoritmos clásicos para la organización de datos:

1.  **Bubble Sort (Burbuja):** Ideal para propósitos educativos y listas pequeñas ($O(n^2)$).
2.  **Merge Sort (Mezcla):** Algoritmo de divide y vencerás, altamente eficiente y estable ($O(n \log n)$).
3.  **Quick Sort (Rápido):** Algoritmo de particionamiento, generalmente el más veloz en ejecución real ($O(n \log n)$).

---

## 🚀 Guía de Ejecución

El proyecto está configurado para ser utilizado en **IntelliJ IDEA** o mediante **terminal**.

### Opción A: IntelliJ IDEA / CLion
1.  **Abrir Proyecto:** Inicia IntelliJ IDEA y selecciona `File > Open`. Elige la carpeta raíz de este repositorio.
2.  **Plugin de C++:** Asegúrate de tener instalado el plugin "C/C++" o estar usando **CLion**.
3.  **Configuración de CMake:** El IDE detectará el archivo `CMakeLists.txt` automáticamente. Haz clic en "Load CMake Project".
4.  **Ejecutar:** Haz clic en el botón **Run** (triángulo verde 🟢) en la parte superior derecha.

### Opción B: Consola (G++)
Si prefieres compilar manualmente desde la terminal:

1.  **Compilación:**
    ```bash
    g++ -o programa_estructuras main.cpp
    ```
    *(Nota: Asegúrate de incluir todos los archivos .cpp adicionales si la lógica está separada).*

2.  **Ejecución:**
    *   **Windows:** `programa_estructuras.exe`
    *   **Linux/Mac:** `./programa_estructuras`

---

## 📂 Estructura del Código
```text
├── .idea/              # Configuración de IntelliJ
├── main.cpp            # Menú principal y pruebas
├── Estructuras/        # Implementación de Pilas, Colas y Listas
├── Ordenamientos/      # Código de Quick, Merge y Bubble Sort
└── CMakeLists.txt      # Configuración de compilación
