![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Sumativa 2: Organización modular y creación de una librería personalizada.
# 🌲 Sistema de Gestión - Llanquihue Tour

## 👤 Autor del proyecto
- **Nombre completo:** Fabrizio Fernandini
- **Ramo:** Desarrollo Orientado a Objetos I
- **Sección:** 005A
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Virtual

---

## 📝 Descripción del Sistema
Llanquihue Tour es una aplicación de consola desarrollada en Java diseñada para resolver las dificultades administrativas de una agencia de turismo en la Región de Los Lagos. 
El sistema automatiza la lectura de datos desde un archivo externo CSV, cargando la información dinámicamente en colecciones estructuradas (ArrayList) bajo los principios de la Programación Orientada a Objetos (POO).

Para garantizar búsquedas eficientes y evitar errores de coincidencia, el motor de búsqueda implementa limpieza de espacios vacíos mediante `.trim()` y comparaciones que ignoran mayúsculas y minúsculas con `.equalsIgnoreCase()`.

---

## 🧱 Estructura general del proyecto

```plaintext
LlanquihueTourS5/
├── 📁 src/main/java/cl/llanquihuetour/
│   ├── 📁 app/        # Interfaz de usuario y ciclo de vida del menú principal.
│   ├── 📁 model/      # Entidades de dominio, clases base y relaciones de composición.
│   ├── 📁 service/    # Lógica de negocio, procesamiento y persistencia del archivo CSV.
│   └── 📁 util/       # Librería personalizada de validaciones y excepciones propias.
├── 📄 pom.xml         # Archivo de configuración de dependencias de Maven.
└── 📄 tours.csv       # Archivo plano con los registros de los tours.
```


## 🧱 Estructura detallada de paquetes y clases
```plaintext
LlanquihueTourS5/
└── 📁 src/
    └── 📁 main/
        └── 📁 java/
            └── 📁 cl/
                └── 📁 llanquihuetour/
                    ├── 📁 app/
                    │   └── 📄 Main.java
                    ├── 📁 model/
                    │   ├── 📄 Tour.java
                    │   ├── 📄 Guia.java
                    │   ├── 📄 Persona.java
                    │   ├── 📄 Empleado.java
                    │   ├── 📄 Rut.java
                    │   ├── 📄 Direccion.java
                    │   ├── 📄 Cliente.java
                    │   ├── 📄 Operador.java
                    │   └── 📄 Proveedor.java
                    ├── 📁 service/
                    │   └── 📄 GestorDatos.java
                    └── 📁 util/
                        ├── 📄 ValidadorRut.java
                        ├── 📄 ValidadorTextos.java
                        ├── 📄 RutInvalidoException.java
                        └── 📄 TextoVacioException.java
```
---

## 📂 Formato del Archivo de Datos (`tours.csv`)

El archivo debe llamarse estrictamente `tours.csv` y estar ubicado en la raíz del proyecto (al mismo nivel que la carpeta `src`). Cada línea representa un registro completo que consta de **15 campos obligatorios** separados por punto y coma (`;`).

### 🔢 Orden de los campos en el archivo:
* **[0]** Nombre del Tour
* **[1]** Destino / Ciudad del Tour
* **[2]** Precio del Tour (Valor numérico entero)
* **[3]** Nombre del Guía
* **[4]** Apellido del Guía
* **[5]** RUT del Guía (Con puntos y guion)
* **[6]** Teléfono del Guía
* **[7]** Calle de la dirección del Guía
* **[8]** Número de la dirección del Guía
* **[9]** Ciudad de residencia del Guía
* **[10]** Región de residencia del Guía
* **[11]** Correo electrónico del Guía
* **[12]** ID de Empleado del Guía
* **[13]** Cargo específico del Guía
* **[14]** Estado de Certificación (true / false)

### 📄 Ejemplo de línea válida en el CSV (Sin Tildes):
Ruta de los Volcanes;Puerto Varas;35000;Juan;Perez;15.869.017-9;+56977776655;San Pedro;540;Puerto Varas;Los Lagos;juan.perez@llanquihue.cl;GUI-41;Guia de Turismo;true

---

## 💻 Ejemplos de Salida Esperada (Output del Programa)

### 1️⃣ Carga Inicial Automática
Al arrancar la aplicación, el sistema procesa el archivo e informa el estado de la carga:
```plaintext
Carga inicial finalizada del archivo de Tours (tours.csv).
Tours cargados: 10
------------------------
---- Sistema Llanquihue Tour ----
1.- Listar todos los Tours.
2.- Búsqueda Tours por Destino (ciudad).
3.- Salir.
Selecciona una opcion:
```
### 2️⃣ Listar Todos los Tours (Opción 1)
Muestra el catálogo completo en memoria utilizando el formato de los métodos `toString()`:
```plaintext
---- Listado completo de Tours ----
Nombre Tour: Ruta de los Volcanes. Destino: Puerto Varas. Precio: $35000. Guia Asignado: Juan Perez
Nombre Tour: Saltos del Petrohue. Destino: Ensenada. Precio: $28000. Guia Asignado: Maria Parra
```
### 3️⃣ Búsqueda por Destino con Coincidencia Exitosa (Opción 2)
Muestra la efectividad de las búsquedas dinámicas ante variaciones de espacios o mayúsculas:
```plaintext
Ingrese el destino a buscar (ciudad):   puerto varas

---- Listado Filtrado por Destino ----
Nombre Tour: Ruta de los Volcanes. Destino: Puerto Varas. Precio: $35000. Guia Asignado: Juan Perez
```
### 4️⃣ Búsqueda por Destino sin Coincidencias (Opción 2)
Muestra el mensaje controlado del sistema si no hay rutas registradas en la ciudad ingresada:
```plaintext
Ingrese el destino a buscar (ciudad): Valdivia

---- Listado Filtrado por Destino ----
No se encontraron Tours en: Valdivia
```
---

## 🚀 Instrucciones de Ejecución

### 🛠️ Prerrequisitos
* Tener instalado **Java JDK 17, 21 o superior (Desarrollado y testeado en JDK 26)**.
* Un IDE compatible (se recomienda IntelliJ IDEA).

### ⚙️ Pasos para Ejecutar
1. Coloque el archivo `tours.csv` en el directorio raíz de su entorno de trabajo.
2. Abra el proyecto en su IDE, navegue hasta la clase `src/cl/llanquihuetour/app/Main.java` y ejecute el programa.

### 🗂️ Control de Versiones (Clonación del Repositorio)
Para descargar de manera local este proyecto con su historial completo de commits, abra su terminal y ejecute:
```bash
git clone [https://github.com/Capa8cl/poo1-llanquihue-tour-sumativa2.git](https://github.com/Capa8cl/poo1-llanquihue-tour-sumativa2.git)
```
---
© Duoc UC | Escuela de Informática y Telecomunicaciones | Sumativa 2