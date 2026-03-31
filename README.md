# Aplicación Android - Navegación, Actividades y ProgressBar
## Descripción
Este proyecto es una aplicación desarrollada en **Kotlin** en Android Studio como parte del laboratorio de Tecnologías Móviles.
El objetivo principal es comprender el uso de **Activities**, **Intents**, **Navigation Drawer** y **ProgressBar** para la navegación entre pantallas.

## Funcionalidades

### 1. Navegación entre actividades

La aplicación cuenta con varias pantallas:
* **MainActivity** → pantalla principal
* **SegundaActivity** → segunda vista de prueba
* **ConversionActivity** → conversión de monedas (Soles a Dólares)

### 2. Navigation Drawer (Menú lateral)

Se implementó un menú lateral que permite navegar entre las diferentes pantallas de la aplicación.

Características:
* Se abre deslizando o con el botón ☰
* Contiene opciones:
  * Inicio
  * Segunda actividad
  * Conversión de monedas

### 3. ProgressBar (Carga entre actividades)

Se agregó una actividad intermedia llamada **LoadingActivity** que simula un proceso de carga.

Funcionamiento:
1. El usuario selecciona una opción del menú.
2. Se muestra una barra de progreso.
3. Aparece el mensaje **“Carga completa”**.
4. Se redirige a la actividad correspondiente.

### 4. Conversión de monedas

Se implementó una funcionalidad básica para convertir:

* Soles (PEN) → Dólares (USD)

## Conclusión

Este proyecto permite entender cómo funciona la navegación en Android mediante múltiples actividades, mejorando la experiencia del usuario con el uso de menús y barras de carga.

## Autor
KIMBERLY BARRA QUISPE
Proyecto realizado para fines académicos.
