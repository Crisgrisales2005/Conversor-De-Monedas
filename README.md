# Conversor-De-Monedas
Este proyecto es un **Conversor de Monedas** desarrollado en Java. Utiliza la biblioteca `Gson` para trabajar con datos en formato JSON y permite convertir valores entre diferentes monedas utilizando tasas de conversión.

## Características

- Conversión entre las siguientes monedas:
  - Dólar estadounidense (USD)
  - Peso colombiano (COP)
  - Peso argentino (ARS)
  - Peso mexicano (MXN)
- Interfaz fácil de entender y utilizar.
- Integración con JSON para manejar datos de tasas de cambio dinámicamente.

## Estructura del Proyecto

El proyecto se organiza de la siguiente manera:

```
Conversor-De-Monedas/
├── Conversor-Monedas/
│   ├── src/
│   │   ├── Principal/
│   │   │   ├── Conversor.java
│   │   │   ├── Moneda.java
│   │   └── Main.java
├── README.md
```

### Archivos principales

- `Conversor.java`: Contiene la lógica para realizar la conversión de monedas.
- `Moneda.java`: Define el modelo de datos para manejar tasas de conversión.
- `Main.java`: Clase principal que ejecuta el programa.

## Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java JDK** 8 o superior
- **Maven** (opcional, si usas un entorno que soporta Maven)

## Configuración e Instalación

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/Crisgrisales2005/Conversor-De-Monedas.git
   ```

2. Navega al directorio del proyecto:

   ```bash
   cd Conversor-De-Monedas/Conversor-Monedas
   ```

3. Si utilizas Maven, ejecuta:

   ```bash
   mvn clean install
   ```

4. Abre el proyecto en tu IDE preferido (como IntelliJ IDEA o Eclipse).

## Ejecución

1. Compila y ejecuta el archivo `Main.java` desde tu IDE.
2. Sigue las instrucciones que aparecen en consola para realizar conversiones.

## Ejemplo de Uso

Supongamos que quieres convertir **100 USD a COP**:

1. Ingresa el monto: `100`.
2. Selecciona la moneda de origen: `USD`.
3. Selecciona la moneda de destino: `COP`.
4. El programa te mostrará el resultado basado en las tasas de conversión actuales.

## Futuras Mejoras

- Integrar una API externa para obtener tasas de cambio en tiempo real.
- Agregar una interfaz gráfica.
- Implementar pruebas unitarias para validar las funcionalidades.
- Ampliar la compatibilidad para manejar más monedas internacionales.

## Contribuciones

¡Las contribuciones son bienvenidas! Si tienes sugerencias o mejoras, crea un fork del repositorio y envía un pull request.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](./LICENSE) para más detalles.

---

**Desarrollado por [Crisgrisales2005](https://github.com/Crisgrisales2005)**
