/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUICuentas;

import Clases.Canton;
import Clases.Cliente;
import Clases.Direccion;
import Clases.Provincia;
import LNCuentas.ManejadorCliente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.TokenType;


public class frmCliente extends javax.swing.JFrame {
    private String Operacion;
    private String Cedula;

    public frmCliente() {
        initComponents();
        CargarProvincias();
        EstadoComponentes(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbProvinciaR = new javax.swing.JComboBox<>();
        cmbCantonR = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCalleR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbProvinciaT = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbCantonT = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCalleT = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Cédula");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Nombres");

        jLabel4.setText("Fecha de nacimiento");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de residencia"));
        jPanel2.setToolTipText("");

        jLabel5.setText("Provincia");

        cmbProvinciaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbProvinciaRMouseClicked(evt);
            }
        });
        cmbProvinciaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinciaRActionPerformed(evt);
            }
        });

        jLabel6.setText("Calle");

        jLabel7.setText("Cantón");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCalleR)
                    .addComponent(cmbProvinciaR, 0, 236, Short.MAX_VALUE)
                    .addComponent(cmbCantonR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbProvinciaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCantonR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCalleR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de trabajo"));
        jPanel3.setPreferredSize(new java.awt.Dimension(373, 0));

        jLabel8.setText("Provincia");

        cmbProvinciaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinciaTActionPerformed(evt);
            }
        });

        jLabel9.setText("Cantón");

        jLabel10.setText("Calle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbProvinciaT, 0, 236, Short.MAX_VALUE)
                    .addComponent(cmbCantonT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCalleT))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbProvinciaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbCantonT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCalleT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnSalir.setText("Salir");

        txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel11.setText("aaaa-mm-dd");

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(89, 89, 89)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtApellidos)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                                    .addGap(41, 41, 41))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                            .addGap(78, 78, 78)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnNuevo))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        this.Operacion = "Buscar";
        ManejadorCliente objClienteCed = new ManejadorCliente();
        Cliente objCliente = new Cliente();
        try {
            objCliente = objClienteCed.ObtenerClienteCed(txtCedula.getText());
            this.Cedula = objCliente.getCedula();
            txtApellidos.setText(objCliente.getApellidos());
            txtNombres.setText(objCliente.getNombres());
            String d = new SimpleDateFormat("yyyy-MM-dd").format(objCliente.getFechaNacimiento());
            txtFechaNacimiento.setText(d);
            txtCalleR.setText(objCliente.getLugarResidencia().getCalle());
            txtCalleT.setText(objCliente.getLugarTrabajo().getCalle());

            //ubicar provincia residencia
            ComboBoxModel cbm = cmbProvinciaR.getModel();
            int j = -1;
            for (int i=0; i<cbm.getSize(); i++) {
                Provincia np = (Provincia)cbm.getElementAt(i);
                if (np.getNombre().equals(objCliente.getLugarResidencia().getProvincia()))
                    j=i;
            }
            cmbProvinciaR.setSelectedIndex(j);
            
            // ubicar provincia de trabajo
            ComboBoxModel cbmT = cmbProvinciaT.getModel();
            j = -1;
            for (int i=0; i<cbmT.getSize(); i++) {
                Provincia np = (Provincia)cbmT.getElementAt(i);
                if (np.getNombre().equals(objCliente.getLugarTrabajo().getProvincia()))
                    j=i;
            }
            cmbProvinciaT.setSelectedIndex(j);
            
            // cargar y ubicar cantón de residencia
            CargarCanton((Provincia)cmbProvinciaR.getSelectedItem());            
            j = -1;
            ComboBoxModel cbmCR = cmbCantonR.getModel();
            for (int i=0; i<cbmCR.getSize(); i++) {
                Canton cr = (Canton)cbmCR.getElementAt(i);
                if (cr.getCanton().equals(objCliente.getLugarResidencia().getCanton()))
                    j=i;
            }
            cmbCantonR.setSelectedIndex(j);
            
            // cargar y ubicar cantón de trabajo
            CargarCantonT((Provincia)cmbProvinciaT.getSelectedItem());
            j = -1;
            ComboBoxModel cbmCT = cmbCantonT.getModel();
            for (int i=0; i<cbmCT.getSize(); i++) {
                Canton cr = (Canton)cbmCT.getElementAt(i);
                if (cr.getCanton().equals(objCliente.getLugarTrabajo().getCanton()))
                    j=i;
            }
            cmbCantonT.setSelectedIndex(j);
            
            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
        } catch (Exception e) {
            lblMensaje.setText("Cliente no registrado...");
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        this.Operacion = "Nuevo";
        EstadoComponentes(true);
        LimpiarComponentes();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void cmbProvinciaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProvinciaRMouseClicked
        CargarCanton((Provincia)cmbProvinciaR.getSelectedItem());
    }//GEN-LAST:event_cmbProvinciaRMouseClicked

    private void cmbProvinciaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaRActionPerformed
        CargarCanton((Provincia)cmbProvinciaR.getSelectedItem());
    }//GEN-LAST:event_cmbProvinciaRActionPerformed

    private void cmbProvinciaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaTActionPerformed
        CargarCantonT((Provincia)cmbProvinciaT.getSelectedItem());
    }//GEN-LAST:event_cmbProvinciaTActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (Validarcampos()) {
            Cliente objCliente = new Cliente();
            objCliente.setCedula(txtCedula.getText());
            objCliente.setApellidos(txtApellidos.getText());
            objCliente.setNombres(txtNombres.getText());
            objCliente.setFechaNacimiento(java.sql.Date.valueOf(txtFechaNacimiento.getText()));
            objCliente.setLugarResidencia(new Direccion("","", txtCalleR.getText()));
            objCliente.setLugarTrabajo(new Direccion("", "", txtCalleT.getText()));
            int IdProR = ((Provincia)cmbProvinciaR.getSelectedItem()).getId_Provincia();
            int IdCanR = ((Canton)cmbCantonR.getSelectedItem()).getIdCanton();
            int IdProT = ((Provincia)cmbProvinciaT.getSelectedItem()).getId_Provincia();
            int IdCanT = ((Canton)cmbCantonT.getSelectedItem()).getIdCanton();
            ManejadorCliente mnjCliente = new ManejadorCliente();
            try {
                if (this.Operacion.equals("Nuevo")) {
                    boolean estado = mnjCliente.NuevoCliente(objCliente, IdProR, IdCanR, IdProT, IdCanT);
                    JOptionPane.showMessageDialog(null, "Registro adicionado");
                } else {
                    boolean estado = mnjCliente.ModificarCliente(objCliente, IdProR, IdCanR, IdProT, IdCanT, this.Cedula);
                    JOptionPane.showMessageDialog(null, "Registro Modificado");
                }
                    
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (this.Operacion.equals("Buscar")) {
            this.Operacion = "Modificar";
            EstadoComponentes(true);
            btnGuardar.setEnabled(true);
        } else
            JOptionPane.showMessageDialog(null, "No se puede moficiar");
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (this.Operacion.equals("Buscar")) {
            ManejadorCliente mnjCliente = new ManejadorCliente();
            try {
                boolean estado = mnjCliente.EliminarCliente(Cedula);
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
            btnEliminar.setEnabled(false);
            LimpiarComponentes();
            EstadoComponentes(false);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    public void CargarProvincias() {
        ManejadorCliente mnjCliente= new ManejadorCliente();
        ArrayList<Provincia> listProvincia = new ArrayList<>();
        try {
            listProvincia = mnjCliente.ObtenerProvincia();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        Provincia objP = new Provincia(-1, "Seleccione...");
        DefaultComboBoxModel dlmN = new DefaultComboBoxModel();
        dlmN.addElement(objP);
        for (Provincia p: listProvincia)
            dlmN.addElement(p);
        cmbProvinciaR.setModel(dlmN);
        
        DefaultComboBoxModel dlmR = new DefaultComboBoxModel();
        for (Provincia p: listProvincia)
            dlmR.addElement(p);
        cmbProvinciaT.setModel(dlmR);
    }
    
    public void CargarCanton(Provincia objProv) {
        ArrayList<Canton> listCanton = new ArrayList<>();
        ManejadorCliente mnjCliente = new ManejadorCliente();
        try {
            listCanton = mnjCliente.ObtenerCanton(objProv.getId_Provincia());
        } catch (Exception e) {
        }
        
        DefaultComboBoxModel dlmCR = new DefaultComboBoxModel();
        for(Canton c:listCanton) {
            dlmCR.addElement(c);
        }
        cmbCantonR.setModel(dlmCR);
    }
    
    public void CargarCantonT(Provincia objProv) {
         ArrayList<Canton> listCanton = new ArrayList<>();
        ManejadorCliente mnjCliente = new ManejadorCliente();
        try {
            listCanton = mnjCliente.ObtenerCanton(objProv.getId_Provincia());
        } catch (Exception e) {
        }
        DefaultComboBoxModel dlcCT = new DefaultComboBoxModel();
        for (Canton c:listCanton)
            dlcCT.addElement(c);
        cmbCantonT.setModel(dlcCT);
    }
    
    public void EstadoComponentes(boolean estado) {
        txtApellidos.setEnabled(estado);
        txtNombres.setEnabled(estado);
        txtFechaNacimiento.setEnabled(estado);
        txtCalleR.setEnabled(estado);
        txtCalleT.setEnabled(estado);
        cmbProvinciaR.setEnabled(estado);
        cmbCantonR.setEnabled(estado);
        cmbProvinciaT.setEnabled(estado);
        cmbCantonT.setEnabled(estado);
    }
    
    public void LimpiarComponentes() {
        txtCedula.setText(null);
        txtApellidos.setText(null);
        txtNombres.setText(null);
        txtFechaNacimiento.setText(null);
        txtCalleR.setText(null);
        txtCalleT.setText(null);
        cmbCantonR.removeAllItems();
        cmbCantonT.removeAllItems();
    }

    public boolean Validarcampos() {
        boolean valido = true;
        if (txtCedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la cédula");
            valido = false;
        } else
        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Apellidos");
            valido = false;
        } else
        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Nombres");
            valido = false;
        } else
        if (txtFechaNacimiento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese Fecha");
            valido = false;
        } else
        if (cmbProvinciaR.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Elija provincia res");
            valido = false;
        }
            
        return valido;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCantonR;
    private javax.swing.JComboBox<String> cmbCantonT;
    private javax.swing.JComboBox<String> cmbProvinciaR;
    private javax.swing.JComboBox<String> cmbProvinciaT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCalleR;
    private javax.swing.JTextField txtCalleT;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
