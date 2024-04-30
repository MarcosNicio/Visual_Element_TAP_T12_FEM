# FILTRADOR DE BUSQUEDA DE ARCHIVOS

## Descripción

Este componente visual permite filtrar diferentes columnas en un archivo CSV, tales como el ID de la tabla, el nombre de los elementos, entre otros.

### Usos

- **Aplicación a distintos contextos:** El componente puede ser integrado en un sistema de filtrado, por ejemplo, en una biblioteca, filtrando por nombre del libro, editorial, edición del libro, etc.

## Características

- Filtrador para documentos CSV.

## API

### FiltroPanel

| Componente              | Descripción                                                                 |
|-------------------------|-----------------------------------------------------------------------------|
| `txtBuscar`             | Campo de texto para ingresar los criterios de búsqueda.                     |
| `btnBuscar`             | Botón para iniciar la búsqueda basada en los filtros aplicados y el texto ingresado. |
| `resultArea`            | Área de texto donde se muestran los resultados de la búsqueda.              |
| `comboFiltro`           | Menú desplegable para seleccionar el criterio de filtrado (ID, Nombre, Fecha, etc.). |
| `btnPersonalizar`       | Botón que abre la ventana de personalización de la interfaz.                |
| `btnSalir`              | Botón que cierra la aplicación.                                             |
| `btnAgregarElemento`    | Botón para agregar un nuevo elemento a la base de datos.                    |
| `btnCargar`             | Botón para cargar datos desde un archivo CSV.                               |
| `btnCSVActionPerformed` | Botón para exportar los elementos a un archivo CSV.                         |


### ElementoDialog

| Componente       | Descripción                                                                               |
|------------------|-------------------------------------------------------------------------------------------|
| `comboElemento`  | Menú desplegable para seleccionar el tipo de elemento en contextos específicos.           |
| `btnAceptar`     | Botón para confirmar la selección del tipo de elemento y cerrar el diálogo.               |
| `btnCancelar`    | Botón para cancelar la selección y cerrar el diálogo sin guardar cambios.                 |


### ConfigDialog

|   |   |
|---|---|
|**Componente**|**Descripción**|
|comboBoxFonts|Menú desplegable para seleccionar la fuente de texto de la interfaz.|
|SliderSize|Control deslizante para ajustar el tamaño de la fuente de la interfaz.|
|btnColor|Botón para cambiar el color de fondo de la interfaz principal.|
|btnAplicar|Botón para aplicar los cambios de personalización y cerrar el diálogo.|
|btnRegresar|Botón para cerrar la ventana de configuración sin guardar los cambios.|

### DialogoFecha

| Componente           | Descripción                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| `txtDia, txtMes, txtAnio` | Campos de texto para ingresar el día, mes y año, respectivamente.         |
| `btnAceptar`         | Botón para confirmar la fecha ingresada y cerrar el diálogo.                |
| `btnCancelar`        | Botón para cancelar la entrada de fecha y cerrar el diálogo sin guardar.    |


### Elemento

| Método                             | Descripción                                                                                       |
|------------------------------------|---------------------------------------------------------------------------------------------------|
| `public String getId()`            | Retornamos el valor tipo String asignado de la ID.                                                |
| `public void setId(String id)`     | Le asignamos un valor al ID de tipo String.                                                       |
| `public String getNombre()`        | Retornamos el valor tipo String asignado del Nombre.                                              |
| `public void setNombre(String nombre)` | Asignamos un valor de tipo String al nombre.                                                     |
| `public String getFecha()`         | Retornamos el valor de tipo String de la Fecha.                                                   |
| `public void setFecha(String fecha)` | Asigna un valor de tipo String a la Fecha.                                                       |
| `public String getTipo()`          | Retornamos el tipo de elemento que se esté usando.                                                |
| `public void setTipo(String tipo)` | Asignamos un valor String para el tipo del elemento que se vaya a utilizar en el programa.        |
| `public String getDireccion()`     | Retornamos el valor de tipo String asignado a la Dirección.                                       |
| `public void setDireccion(String direccion)` | Asignamos un Valor de tipo String a la Dirección.                                             |
| `public boolean isElegible()`      | Retorna el valor booleano para saber si el elemento utilizado sirve o no para la situación requerida. |
| `public void setElegible(boolean elegible)` | Asigna un valor booleano para saber si el elemento nos sirve para la situación.                |


### Métodos del FiltroPanel

| Método                                               | Descripción                                                                                                        |
|------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|
| `private void setModelItem()`                        | Sirve para identificar las columnas del filtro cuando se inicia el código.                                          |
| `private void loadElementos()`                       | Lo ocupamos para recargar los datos.                                                                               |
| `private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt)` | Busca el elemento ingresado en el cuadro de texto en base al criterio.                                           |
| `private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt)` | Lo ocupamos como criterio para filtrar la búsqueda.                                                               |
| `private void btnPersonalizarActionPerformed(java.awt.event.ActionEvent evt)` | Abre una ventana la cual nos permite personalizar nuestra interfaz.                                               |
| `private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)` | Cierra el programa al momento de ser pulsado.                                                                     |
| `private void btnAgregarElementoActionPerformed(java.awt.event.ActionEvent evt)` | Nos abre unas ventanas que nos solicitan los datos para el elemento a agregar.                                    |
| `private void btnCargarActionPerformed(java.awt.event.ActionEvent evt)` | Nos abre un JFileChooser para elegir nuestro archivo .CSV que queramos que lea el programa.                      |
| `private void actualizarFiltrado(String criterio, String valor)` | Dependiendo del criterio de búsqueda muestra una ventana con un mensaje el cual nos muestra en base a que se ha filtrado, y también muestra los elementos en el resultArea que hayan coincidido. |
| `public void setPanelFont(String fontName, int fontSize)` | Cambia la fuente del panel dependiendo de cual se elija.                                                           |
| `public void setPanelFontSize(int fontSize)`         | Cambia el tamaño de la fuente dependiendo de donde se ubique el cursor.                                            |
| `public void setComponentsColor(Color color)`        | En base al color que se elija va a cambiar el color del fondo o de los elementos.                                   |
| `public Color getComponentsColor()`                  | Retorna el color elegido.                                                                                          |
| `private void leerDatos(String rutaArchivo)`         | Leemos el archivo .csv separado por comas, para poder utilizar los datos de este en el programa.                   |
| `private String formatElemento(Elemento elemento)`   | Retorna la información de un elemento.                                                                             |
| `private void btnCSVActionPerformed(java.awt.event.ActionEvent evt)` | Guardamos el archivo .csv en una carpeta que queramos y le asignamos un nombre.                                   |


### Instrucciones

#### Agregar un nuevo elemento

1. Haz clic en el botón "Agregar elemento" en la interfaz principal.
2. Completa los campos en el formulario emergente, incluyendo ID, nombre, fecha de última donación, tipo de sangre, dirección y elegibilidad.


#### Buscar y Filtrar Datos

1. Introduce el criterio de búsqueda en la barra de texto txtBuscar.
2. Selecciona el tipo de filtro que deseas aplicar desde el menú desplegable comboFiltro.
3. Haz clic en "Buscar" para procesar la búsqueda y ver los resultados en el área resultArea.


#### Personalización de la Interfaz

1. Selecciona "Personalizar" en la interfaz principal para abrir la ventana de configuración.
2. Ajusta el color de fondo, el tipo y tamaño de fuente según tus preferencias.
3. Haz clic en "Aplicar cambios" para guardar los ajustes o en "Regresar" para cancelar sin guardar los cambios.


#### Cargar datos desde Archivo CSV

1. Haz clic en "Cargar datos" en la interfaz principal.
3. Navega y selecciona el archivo CSV desde el diálogo de archivos que aparece.
5. Confirma la selección y espera mientras la aplicación carga los datos del archivo al sistema.






### Uso

- **Agregación del .jar al documento:** Creamos un proyecto y añadimos nuestro elemento visual arrastrándolo.
  ![Captura de pantalla 2024-04-27 210142](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/3cd79671-c3c3-4ef0-ad69-6a7b40e4b276)
  ![Captura de pantalla 2024-04-27 212224](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/2bfc4084-988f-4d2e-a800-4d1cf6d55e83)
  ![Captura de pantalla 2024-04-27 212305](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/f44a828c-da05-434f-988f-a42a81f38044)

  **NOTA: EL ARCHIVO .jar SE ENCUENTRA EN LA CARPETA DIST DEL PROYECTO
  
- **Lectura del archivo CSV:** Ejecutamos y probamos con un archivo CSV seleccionando los filtros que queremos ocupar (ID, Nombre y Elegible).
  ![Captura de pantalla 2024-04-27 213655](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/a1c06f4f-2734-45ec-b1a1-c6240026ba7b)
  ![Captura de pantalla 2024-04-27 213655](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/a1c06f4f-2734-45ec-b1a1-c6240026ba7b)
  ![Captura de pantalla 2024-04-27 213707](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/9309357e-e60d-4d8c-b0a0-138f90a77bc0)
  
- **Exportación de los elementos a CSV:** Presionamos el botón "Guardar CSV" y seleccionamos dónde queremos guardar el archivo y el nombre que deseamos.
  
  ![Captura de pantalla 2024-04-27 214813](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/3d737975-c410-4b9a-bda6-7d5f8ab9f52d)
  ![Captura de pantalla 2024-04-27 215029](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/e20a6cec-671d-4a19-8407-4209c2fbe312)
  ![Captura de pantalla 2024-04-27 215122](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/854da10f-d603-404e-b6cf-adf11c686e88)
  ![Captura de pantalla 2024-04-27 215344](https://github.com/MarcosNicio/Visual_Element_TAP_T12_FEM/assets/168311933/f52cd550-b626-4b6c-8fcf-cd05022db588)

### Muestra de Funcionamiento

Si deseas ver cómo funciona el elemento visual puedes dar clic al siguiente enlace y ver un video: [FUNCIONAMIENTO FILTRADOR DE BUSQUEDA](https://www.youtube.com/watch?v=yoLcGOOFy0s)

### Nota

El documento debe contener máximo 6 columnas, las cuales corresponden a los atributos de la clase Elemento. Cada una de estas columnas debe contener un fragmento de estos caracteres para identificar los atributos: ID, NOMBRE, FECHA, DIRECCI y ELEGIBLE. No se deben repetir para lograr un buen funcionamiento, también cabe destacar que para identificar las columnas con los caracteres antes mencionados, no necesitan estar en un orden específico.
