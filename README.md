# Reserva de habitación para Hotel: Proyecto aún NO concluido.
## Aplicacion MVC realizada en Java con una arquitectura de 3 capas:  
Sistema de reserva de habitación empleando el modelo Data Base Management System. La comunicación entre la aplicación y el DBMS se hace a través del lenguaje estandar Structured Query Language (SQL).

Link directo al video: [_Click Aqui_](https://www.linkedin.com/feed/update/urn:li:activity:6917244981048950785/)
## ¿En que consiste la Aplicación?
### Permite a los usuarios las siguientes tareas: 

1) Registrar habitaciones disponibles para un Hotel.
2) Permite introducir datos concernientes a la habitación, tales como; precio, disponibilidad, tipo de habitación, etc.
3) Consultar a la base de datos la información de la habitación referenciada en la interfaz gráfica de usuario.  
4) Permite realizar inserción, actualización y eliminación datos.
  
## Características generales

1) La aplicación se levanta en el puerto 3306
2) Se puede probar cambiando la referencia a la base de datos

```JavaScript
public class conexion {
    public String db = "bd_hotelreserva";
    public String url = "jdbc:mysql://127.0.0.1/" + db;
    public String user = "root";
    public String pass = "";

    public conexion() {
    }
    
    public Connection conectar(){
        Connection link = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");//carpeta de la libreria mysql-connector-java 
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }

```

## Project Screens

### Interfaz de usuario 

![Home](https://github.com/IvanSebastian21/AppHotelReservaEnJava/blob/main/img/Screen.png)

### Diagrama Módulo administrador
![Home](https://github.com/IvanSebastian21/AppHotelReservaEnJava/blob/main/img/Diagrama%20habitacion.png)

### Diagrama base de datos
![Home](https://github.com/IvanSebastian21/AppHotelReservaEnJava/blob/main/img/Diagrama%20base%20de%20datos.png)

### Screen DB
![Home](https://github.com/IvanSebastian21/AppHotelReservaEnJava/blob/main/img/DataBase.png)



