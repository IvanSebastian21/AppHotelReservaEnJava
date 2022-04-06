package presentacion;

import datos.vhabitacion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logica.fhabitacion;


public class frmhabitacion extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    private fhabitacion fhabitacion;

    public frmhabitacion() {
        this.setContentPane(fondo);
        initComponents(); 
        setSize(1100, 660);
        setTitle("Módulo Administración");
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        reservahotel.setBackground(new Color(0, 0, 0, 150));
        listahabitaciones.setBackground(new Color(0, 0, 0, 150));
        mostrar("");
        inhabilitar();
        

    }

    private String accion ="guardar";
    
    void ocultarColumnas(){
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);        
    }
    
    public void inhabilitar(){
        txtidhabitacion.setVisible(false);
        cbopiso.setEnabled(false);
        txtnumero.setEnabled(false);
        txtdescripcion.setEnabled(false);
        txtcaracteristica.setEnabled(false);
        txtprecio.setEnabled(false);
        cbcestadoHabitacion.setEnabled(false);
        cbctipoHabitacion.setEnabled(false);
        
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        txtidhabitacion.setText("");
        txtprecio.setText("");
        txtdescripcion.setText("");
    }
    
    public void habilitar(){
        txtidhabitacion.setVisible(false);
        cbopiso.setEnabled(true);
        txtnumero.setEnabled(true);
        txtdescripcion.setEnabled(true);
        txtcaracteristica.setEnabled(true);
        txtprecio.setEnabled(true);
        cbcestadoHabitacion.setEnabled(true);
        cbctipoHabitacion.setEnabled(true);
        
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        txtidhabitacion.setText("");
        txtprecio.setText("");
        txtdescripcion.setText("");
    }
    
    public void mostrar(String buscar){
        try {
            DefaultTableModel modelo;
            fhabitacion function = new fhabitacion();
            modelo = function.mostrar(buscar);
            tablalistado.setModel(modelo);
            ocultarColumnas();
            lbltotalregistro.setText("Registro total: " + Integer.toString(function.totalregistro));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        reservahotel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcaracteristica = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbcestadoHabitacion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbctipoHabitacion = new javax.swing.JComboBox<>();
        cbopiso = new javax.swing.JComboBox<>();
        txtprecio = new javax.swing.JTextField();
        txtidhabitacion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        btnguardar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        listahabitaciones = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotalregistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 231, 232));
        jLabel1.setText(" Aplicación de  Reserva");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 384, 35));

        reservahotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Piso:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("id: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Caracteristicas:");

        txtcaracteristica.setBackground(new java.awt.Color(230, 226, 225));
        txtcaracteristica.setColumns(20);
        txtcaracteristica.setRows(5);
        txtcaracteristica.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane2.setViewportView(txtcaracteristica);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio:");

        txtnumero.setBackground(new java.awt.Color(230, 226, 225));
        txtnumero.setSelectionColor(new java.awt.Color(0, 153, 153));
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" ");

        cbcestadoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No disponible", "En Mantenimiento" }));
        cbcestadoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcestadoHabitacionActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(230, 226, 225));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Habitación:");

        cbctipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Matrimonial", "Familiar", "Suite" }));
        cbctipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbctipoHabitacionActionPerformed(evt);
            }
        });

        cbopiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cbopiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopisoActionPerformed(evt);
            }
        });

        txtprecio.setBackground(new java.awt.Color(230, 226, 225));
        txtprecio.setSelectionColor(new java.awt.Color(0, 153, 153));
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        txtidhabitacion.setBackground(new java.awt.Color(230, 226, 225));
        txtidhabitacion.setSelectionColor(new java.awt.Color(0, 153, 153));
        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        txtdescripcion.setBackground(new java.awt.Color(230, 226, 225));
        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        txtdescripcion.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(txtdescripcion);

        btnguardar.setText("Editar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");

        javax.swing.GroupLayout reservahotelLayout = new javax.swing.GroupLayout(reservahotel);
        reservahotel.setLayout(reservahotelLayout);
        reservahotelLayout.setHorizontalGroup(
            reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservahotelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservahotelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbopiso, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(reservahotelLayout.createSequentialGroup()
                        .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(reservahotelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(reservahotelLayout.createSequentialGroup()
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addComponent(cbcestadoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbctipoHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtprecio)
                            .addComponent(jScrollPane2))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        reservahotelLayout.setVerticalGroup(
            reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservahotelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbopiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcestadoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbctipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(reservahotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        bg.add(reservahotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 440, 530));

        listahabitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Buscar:");

        txtbuscar.setBackground(new java.awt.Color(230, 226, 225));
        txtbuscar.setSelectionColor(new java.awt.Color(0, 153, 153));
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Num º Habitación", "Piso", "Descripción", "Caracteristicas", "Precio", "Estado", "Tipo Habitación"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablalistado);

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lbltotalregistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltotalregistro.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalregistro.setText("Registros:");

        javax.swing.GroupLayout listahabitacionesLayout = new javax.swing.GroupLayout(listahabitaciones);
        listahabitaciones.setLayout(listahabitacionesLayout);
        listahabitacionesLayout.setHorizontalGroup(
            listahabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listahabitacionesLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(listahabitacionesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(listahabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltotalregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(listahabitacionesLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        listahabitacionesLayout.setVerticalGroup(
            listahabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listahabitacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(listahabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(listahabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltotalregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bg.add(listahabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 600, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        txtnumero.transferFocus();
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        txtprecio.transferFocus();
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if(txtnumero.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Ingrese un número de habitación");
            txtnumero.requestFocus();
            return;
        }
        if(txtdescripcion.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Ingrese una descripción de habitación");
            txtdescripcion.requestFocus();
            return;
        }  
        if(txtprecio.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Ingrese un precio de habitación");
            txtprecio.requestFocus();
            return;
        }
        if(txtcaracteristica.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Ingrese una caracteristica de habitación");
            txtcaracteristica.requestFocus();
            return;
        }      
        
        vhabitacion dts = new vhabitacion();
        fhabitacion function = new fhabitacion();
        
        dts.setNum_habitacion(txtnumero.getText());
        int seleccionado = cbopiso.getSelectedIndex();
        dts.setPiso_habitacion((String)cbopiso.getItemAt(seleccionado));
        
        dts.setDescripcion(txtdescripcion.getText());
        dts.setCaracteristas(txtcaracteristica.getText());
        dts.setPrecio_diario(Double.parseDouble(txtprecio.getText()));

        seleccionado = cbcestadoHabitacion.getSelectedIndex();
        dts.setEstado((String)cbcestadoHabitacion.getItemAt(seleccionado));
        
        seleccionado = cbctipoHabitacion.getSelectedIndex();
        dts.setTipo_Habitacion((String)cbctipoHabitacion.getItemAt(seleccionado));
        
        if(accion.equals("guardar")){
            if (function.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La habitación se registro correctamente");
                mostrar("");
                inhabilitar();
            }
        } else if(accion.equals("editar")){
            dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
            if (function.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La habitación se edito correctamente");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (!txtidhabitacion.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de ELIMINAR la habitación", "Confirmar", 2);
            if (confirmacion == 0) {
                fhabitacion function = new fhabitacion();
                vhabitacion dts = new vhabitacion();
                
                dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                function.eliminar(dts);
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void cbopisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopisoActionPerformed
        cbopiso.transferFocus();
    }//GEN-LAST:event_cbopisoActionPerformed

    private void cbcestadoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcestadoHabitacionActionPerformed
        cbcestadoHabitacion.transferFocus();
    }//GEN-LAST:event_cbcestadoHabitacionActionPerformed

    private void cbctipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbctipoHabitacionActionPerformed
        cbctipoHabitacion.transferFocus();
    }//GEN-LAST:event_cbctipoHabitacionActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion="editar";
        
        int fila = tablalistado.rowAtPoint(evt.getPoint());
        
        txtidhabitacion.setText(tablalistado.getValueAt(fila, 0).toString());
        txtnumero.setText(tablalistado.getValueAt(fila, 1).toString());
        cbopiso.setSelectedItem(tablalistado.getValueAt(fila, 2).toString());
        txtdescripcion.setText(tablalistado.getValueAt(fila, 3).toString());
        txtcaracteristica.setText(tablalistado.getValueAt(fila, 4).toString());
        txtprecio.setText(tablalistado.getValueAt(fila, 5).toString());
        cbcestadoHabitacion.setSelectedItem(tablalistado.getValueAt(fila, 6).toString());
        cbctipoHabitacion.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmhabitacion().setVisible(true);
            }
        });
    }
    
    class FondoPanel extends JPanel {

        private Image image;

        @Override
        public void paint(Graphics g) {
            image = new ImageIcon(getClass().getResource("/files/llave-del-hotel.jpg")).getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            
            super.paint(g);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cbcestadoHabitacion;
    private javax.swing.JComboBox<String> cbctipoHabitacion;
    private javax.swing.JComboBox<String> cbopiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistro;
    private javax.swing.JPanel listahabitaciones;
    private javax.swing.JPanel reservahotel;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextArea txtcaracteristica;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
