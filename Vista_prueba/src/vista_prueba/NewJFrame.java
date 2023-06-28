package vista_prueba;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
    
    CRUDEspecialista EspecialistaForm = new CRUDEspecialista();    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public NewJFrame() {
     
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVista = new javax.swing.JTable();
        btnGuardarVista = new javax.swing.JButton();
        btnNuevoVista = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        txtSubtotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNPresupuesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTiempoEntrega = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOferta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEspecialistaVista = new javax.swing.JComboBox<>();
        txtPago = new javax.swing.JTextField();
        txtClienteVista = new javax.swing.JComboBox<>();
        btnAtencion = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnEspecialista = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtAtencionVista = new javax.swing.JComboBox<>();
        btnBuscarVista = new javax.swing.JButton();
        txtBuscadorVista = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnInsertarFila = new javax.swing.JButton();
        btnEliminarFila = new javax.swing.JButton();
        btnIngresarServicio = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Descripción", "I.Unitario", "Cant.", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaVista);
        if (TablaVista.getColumnModel().getColumnCount() > 0) {
            TablaVista.getColumnModel().getColumn(0).setResizable(false);
            TablaVista.getColumnModel().getColumn(0).setPreferredWidth(100);
            TablaVista.getColumnModel().getColumn(1).setResizable(false);
            TablaVista.getColumnModel().getColumn(1).setPreferredWidth(700);
            TablaVista.getColumnModel().getColumn(2).setResizable(false);
            TablaVista.getColumnModel().getColumn(2).setPreferredWidth(125);
            TablaVista.getColumnModel().getColumn(3).setResizable(false);
            TablaVista.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablaVista.getColumnModel().getColumn(4).setResizable(false);
            TablaVista.getColumnModel().getColumn(4).setPreferredWidth(195);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 429, 964, 250));

        btnGuardarVista.setText("GUARDAR");
        btnGuardarVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVistaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 693, 151, -1));

        btnNuevoVista.setText("NUEVO");
        getContentPane().add(btnNuevoVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 723, 151, -1));

        btnPdf.setText("PDF");
        getContentPane().add(btnPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 693, 151, -1));

        btnExcel.setText("EXCEL");
        getContentPane().add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 723, 151, -1));

        btnEjecutar.setText("EJECUTAR");
        getContentPane().add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 693, 151, 50));

        txtSubtotal.setEnabled(false);
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 680, 150, -1));

        jLabel11.setText("SUBTOTAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 685, -1, -1));

        txtIgv.setEnabled(false);
        getContentPane().add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 710, 150, -1));

        jLabel12.setText("IGV 18%");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 715, -1, -1));

        jLabel13.setText("TOTAL");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 745, -1, -1));

        txtTotal.setEnabled(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 150, -1));

        jPanel1.setBackground(new java.awt.Color(16, 152, 204));

        jLabel3.setText("Atención:");

        jLabel5.setText("Fecha:");

        jLabel8.setText("N° Presupuesto:");

        jLabel1.setText("Cliente:");

        jLabel2.setText("Especialista:");

        jLabel4.setText("Forma de pago:");

        jLabel6.setText("Tiempo de entrega:");

        jLabel7.setText("Validez de oferta:");

        jLabel9.setText("REF:");

        txtEspecialistaVista.setEditable(true);

        txtClienteVista.setEditable(true);
        txtClienteVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        txtClienteVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtClienteVistaMouseClicked(evt);
            }
        });

        btnAtencion.setText("Tabla Atención");

        btnClientes.setText("Tabla Clientes");

        btnEspecialista.setText("Tabla Especialistas");
        btnEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialistaActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagen.png"))); // NOI18N

        txtAtencionVista.setEditable(true);

        btnBuscarVista.setBackground(new java.awt.Color(16, 152, 204));
        btnBuscarVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnEspecialista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNPresupuesto)
                                            .addComponent(txtAtencionVista, 0, 272, Short.MAX_VALUE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBuscarVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEspecialistaVista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtOferta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtClienteVista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPago)
                            .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtClienteVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEspecialistaVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtTiempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnAtencion)
                                .addGap(19, 19, 19)
                                .addComponent(btnClientes)
                                .addGap(17, 17, 17)
                                .addComponent(btnEspecialista)
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAtencionVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscarVista, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtBuscadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        btnInsertarFila.setText("INSERTAR FILA");
        btnInsertarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFilaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 398, 140, 25));

        btnEliminarFila.setText("ELIMINAR FILA");
        btnEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFilaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 398, 140, 25));

        btnIngresarServicio.setText("INGRESAR SERVICIO");
        btnIngresarServicio.setPreferredSize(new java.awt.Dimension(135, 22));
        btnIngresarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarServicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 398, 172, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVistaActionPerformed
        
    }//GEN-LAST:event_btnGuardarVistaActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void btnInsertarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFilaActionPerformed
        int NumeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de filas"));
        int respuesta = NumeroFilas + 1;
        JOptionPane.showInputDialog(null,respuesta);
        
        DefaultTableModel miTableModel = (DefaultTableModel) TablaVista.getModel();
        
     
        //miTableModel.addRow(ob);
        
        /*
        count++;
        String numero = String.valueOf(count);
        
        DefaultTableModel miTableModel = (DefaultTableModel) TablaVista.getModel();
        Object nuevaFila[]= {numero,"","",""};
        miTableModel.addRow(nuevaFila);*/
    }//GEN-LAST:event_btnInsertarFilaActionPerformed

    private void btnEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilaActionPerformed
        DefaultTableModel miTableModel = (DefaultTableModel) TablaVista.getModel();
        int indFil = TablaVista.getSelectedRow();
        if (indFil >= 0)
            miTableModel.removeRow(indFil);
    }//GEN-LAST:event_btnEliminarFilaActionPerformed

    private void txtClienteVistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClienteVistaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteVistaMouseClicked

    private void btnIngresarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarServicioActionPerformed
        // TODO add your handling code here:
        String NombreServicio;
        NombreServicio = JOptionPane.showInputDialog("Escriba el nombre del Servicio").toUpperCase();
          
    }//GEN-LAST:event_btnIngresarServicioActionPerformed

    private void btnEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialistaActionPerformed
        // TODO add your handling code here:    
        EspecialistaForm.setVisible(true);
    }//GEN-LAST:event_btnEspecialistaActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVista;
    private javax.swing.JButton btnAtencion;
    private javax.swing.JButton btnBuscarVista;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnEliminarFila;
    private javax.swing.JButton btnEspecialista;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnGuardarVista;
    private javax.swing.JButton btnIngresarServicio;
    private javax.swing.JButton btnInsertarFila;
    private javax.swing.JButton btnNuevoVista;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtAtencionVista;
    private javax.swing.JTextField txtBuscadorVista;
    private javax.swing.JComboBox<String> txtClienteVista;
    private javax.swing.JComboBox<String> txtEspecialistaVista;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtNPresupuesto;
    private javax.swing.JTextField txtOferta;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTiempoEntrega;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
