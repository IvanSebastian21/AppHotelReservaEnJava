package logica;

import datos.vhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fhabitacion {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistro;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"idhabitacion", "num_habitacion", "piso_habitacion", "descripcion", "caracteristicas", "precio_diario", "estado", "tipo_habitacion"};
        String[] registro = new String[8];
        totalregistro = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from habitacion where num_habitacion like '%" + buscar + "%' order by idhabitacion";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idhabitacion");
                registro[1] = rs.getString("num_habitacion");
                registro[2] = rs.getString("piso_habitacion");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("caracteristicas");
                registro[5] = rs.getString("precio_diario");
                registro[6] = rs.getString("estado");
                registro[7] = rs.getString("tipo_habitacion");

                totalregistro += 1;

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(vhabitacion dts) {
        sSQL = "insert into habitacion (num_habitacion, piso_habitacion, descripcion, caracteristicas, precio_diario, estado, tipo_habitacion)"
                + "value(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNum_habitacion());
            pst.setString(2, dts.getPiso_habitacion());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_Habitacion());

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(vhabitacion dts) {
        sSQL = "update habitacion set num_habitacion = ?, piso_habitacion = ?, descripcion = ?, caracteristicas = ?, precio_diario = ? ,estado = ?, tipo_habitacion = ?"
                + " where idhabitacion = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNum_habitacion());
            pst.setString(2, dts.getPiso_habitacion());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristas());
            pst.setDouble(5, dts.getPrecio_diario());
            pst.setString(6, dts.getEstado());
            pst.setString(7, dts.getTipo_Habitacion());
            pst.setInt(8, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(vhabitacion dts) {
        sSQL = "delete from habitacion where idhabitacion = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();
            return (n != 0);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}