package datos;

public class vhabitacion {
    private int idhabitacion;
    private String num_habitacion;
    private String piso_habitacion;
    private String descripcion;
    private String caracteristas;
    private double precio_diario;
    private String estado;
    private String tipo_Habitacion;

    public vhabitacion(int idhabitacion, String num_habitacion, String piso_habitacion, String descripcion, String caracteristas, double precio_diario, String estado, String tipo_Habitacion) {
        this.idhabitacion = idhabitacion;
        this.num_habitacion = num_habitacion;
        this.piso_habitacion = piso_habitacion;
        this.descripcion = descripcion;
        this.caracteristas = caracteristas;
        this.precio_diario = precio_diario;
        this.estado = estado;
        this.tipo_Habitacion = tipo_Habitacion;
    }

    public vhabitacion() {
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(String num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public String getPiso_habitacion() {
        return piso_habitacion;
    }

    public void setPiso_habitacion(String piso_habitacion) {
        this.piso_habitacion = piso_habitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristas() {
        return caracteristas;
    }

    public void setCaracteristas(String caracteristas) {
        this.caracteristas = caracteristas;
    }

    public double getPrecio_diario() {
        return precio_diario;
    }

    public void setPrecio_diario(double precio_diario) {
        this.precio_diario = precio_diario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_Habitacion() {
        return tipo_Habitacion;
    }

    public void setTipo_Habitacion(String tipo_Habitacion) {
        this.tipo_Habitacion = tipo_Habitacion;
    }


    
    
}
