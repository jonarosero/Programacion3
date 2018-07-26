package u11_extra;

import Controller.ClienteJpaController;
import Controller.CuentaclienteJpaController;
import Controller.CuentasJpaController;
import Controller.StateJpaController;
import Controller.TypeJpaController;
import Model.*;
import java.sql.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */

public class GUI extends javax.swing.JFrame {

    //////Controllers//////
    private final TypeJpaController typeController = new TypeJpaController();
    private final StateJpaController stateController = new StateJpaController();
    private final CuentaclienteJpaController cuentaClienteController = new CuentaclienteJpaController();
    private final ClienteJpaController clienteController = new ClienteJpaController();
    private final CuentasJpaController cuentasController = new CuentasJpaController();

    /**
     * Creates new form GUI
     */
    
    public GUI() {
        initComponents();
        // Load data from db
        loadTypes();
        /*loadStates();*/
        updateTable(-1);
        // set state of gui
        lockUnlock(false);
        this.btnAnadir.setEnabled(false);
    }

    private void lockUnlock(boolean b) {
        this.btnGuardar.setEnabled(b);
        this.combTipo.setEnabled(b);
        this.combEstado.setEnabled(b);
        this.inputFecha.setEnabled(b);
        this.inputSaldo.setEnabled(b);
        this.btnEliminar.setEnabled(b);
        this.inputCedula.setEnabled(b);
        this.btnBuscarTitular.setEnabled(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputSaldo = new javax.swing.JTextField();
        combTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inputFecha = new javax.swing.JTextField();
        btnBuscarCuenta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        combEstado = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTitulares = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        inputCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscarTitular = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();
        textApellido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manejador Cuenta Cliente");

        jLabel2.setText("Numero");

        jLabel3.setText("Tipo");

        jLabel4.setText("Saldo");

        jLabel5.setText("Fecha Apertura");

        btnBuscarCuenta.setText("Buscar");
        btnBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCuentaActionPerformed(evt);
            }
        });

        jLabel12.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(combEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(combEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(inputSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Titulares");

        tablaTitulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTitulares);

        jLabel7.setText("Cedula");

        jLabel8.setText("Nombres");

        jLabel9.setText("Apellidos");

        btnBuscarTitular.setText("Buscar");
        btnBuscarTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTitularActionPerformed(evt);
            }
        });

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        textNombre.setText("<<Nombre>>");

        textApellido.setText("<<Apellido>>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(inputCedula)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarTitular))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAnadir))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(textNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(46, 46, 46))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(textApellido)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(inputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarTitular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(textNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(textApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnadir)
                            .addComponent(btnEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // End app
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // if all fieds are valid proced
        /*if (!validFieds()) {
            JOptionPane.showMessageDialog(null, "Los campos son Invalidos");
            return;
        }
        // create obj
        Cuentas c = new Cuentas();
        c.setBalance(Integer.valueOf(this.inputSaldo.getText()));
        c.setNumber(Integer.valueOf(this.inputNumero.getText()));
        c.setDate(Date.valueOf(this.inputFecha.getText()));
        c.setTypeID(((Model.Type) this.combTipo.getSelectedItem()).getId());
        c.setStateID(((Model.State) this.combEstado.getSelectedItem()).getId());

        // account if exist
        Cuentas cuentas = this.cuentasController.findCuentasByNumber(c.getNumber());
        try {
            if (cuentas == null) {
                // create new account
                this.cuentasController.create(c);
                System.out.println("Created new account");
            } else {
                // update cuenta
                System.out.println("updating account");
                c.setId(cuentas.getId());
                this.cuentasController.edit(c);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos");
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCuentaActionPerformed
        // validate number field
       /* if (this.inputNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero de cuenta");
            return;
        }
        // search account
        Cuentas c = cuentasController.findCuentasByNumber(Integer.parseInt(this.inputNumero.getText()));
        // set state of app 
        if (c == null) {
            JOptionPane.showMessageDialog(null, "No se encontro la cuenta");
            return;
        }
        // set value from db
        this.inputFecha.setText(c.getDate().toString());
        this.inputNumero.setText(String.valueOf(c.getNumber()));
        this.inputSaldo.setText(String.valueOf(c.getBalance()));
        this.combTipo.setSelectedIndex(c.getTypeID());
        this.combEstado.setSelectedIndex(c.getStateID());
        // set state of gui
        lockUnlock(true);
        updateTable(c.getId());*/
    }//GEN-LAST:event_btnBuscarCuentaActionPerformed

    private void btnBuscarTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTitularActionPerformed
        if (this.inputCedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero de cedula");
            return;
        }
        // search account
        Cliente c = clienteController.findClienteByCId(Integer.parseInt(this.inputCedula.getText()));
        // set state of app
        if (c == null) {
            JOptionPane.showMessageDialog(null, "No se encontro la cuenta");
            // set state of add button
            this.btnAnadir.setEnabled(false);
            return;
        }
        this.textNombre.setText(c.getNombres());
        this.textApellido.setText(c.getApellidos());
        this.btnAnadir.setEnabled(true);
    }//GEN-LAST:event_btnBuscarTitularActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        // validate account number and client id
       /* if (this.inputCedula.getText().equals("") || this.inputNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llenar los capos requeridos");
            return;
        }
        // get both elements
        Cuentas cuenta = cuentasController.findCuentasByNumber(Integer.parseInt(this.inputNumero.getText()));
        Cliente cliente = clienteController.findClienteByCId(Integer.parseInt(this.inputCedula.getText()));
        if (cuenta == null || cliente == null) {
            JOptionPane.showMessageDialog(null, "No se encontro uno de los elementos");
            return;
        }
        // validate if user is already in db
        Cuentacliente cc = this.cuentaClienteController.findCuentaclienteByCIDID(cuenta.getId(), cliente.getIdCliente());
        if (cc == null) {
            System.out.println("creating new client - account");
            // create this account
            cc = new Cuentacliente();
            cc.setAccountID(cuenta.getId());
            cc.setHolderID(cliente.getIdCliente());
            this.cuentaClienteController.create(cc);
            // update table
            updateTable(cc.getAccountID());
        }
        // account is already in db, dont do anything
        // set state of gui
        this.inputCedula.setText("");
        this.textNombre.setText("<<Nombre>>");
        this.textApellido.setText("<<Apellido>>");
        this.btnAnadir.setEnabled(false);*/
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*// validate account is selected
        if (this.inputNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llenar el numero de cuenta");
            return;
        }
        // get account
        Cuentas cuenta = cuentasController.findCuentasByNumber(Integer.parseInt(this.inputNumero.getText()));
        if (cuenta == null) {
            JOptionPane.showMessageDialog(null, "El numero de cuenta es invalido");
            return;
        }
        // validate selected item
        int row = this.tablaTitulares.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
            return;
        }
        // get selected item
        // remove from db;
        this.cuentaClienteController.destroyByAttributes(cuenta.getId(), (Integer) this.tablaTitulares.getValueAt(row, 0));
        // update table gui
        updateTable(cuenta.getId());*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
// clean fieds
        this.inputCedula.setText("");
        this.inputFecha.setText("");
        this.inputNumero.setText("");
        this.inputSaldo.setText("");
        this.combTipo.setSelectedIndex(0);
        this.combEstado.setSelectedIndex(0);
        // set state of gui
        lockUnlock(true);
        updateTable(-1);
    }//GEN-LAST:event_btnNuevoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBuscarCuenta;
    private javax.swing.JButton btnBuscarTitular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> combEstado;
    private javax.swing.JComboBox<String> combTipo;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputFecha;
    private javax.swing.JTextField inputNumero;
    private javax.swing.JTextField inputSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTitulares;
    private javax.swing.JLabel textApellido;
    private javax.swing.JLabel textNombre;
    // End of variables declaration//GEN-END:variables

    // load types for combobox
    private void loadTypes() {
        // load from db
        try{
        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        List<Model.Type> types = typeController.findTypeEntities();
        // load to comboBox
        comboBox.addElement("Seleccione...");
        for (Model.Type t : types) {
            comboBox.addElement(t);
        }
        // set to gui comb
        this.combTipo.setModel(comboBox);
        }catch(Exception e){
            
        }
    }

    // load table data
    private void updateTable(int id) {
        // get new model
       /* Object tblCol[] = {"ID", "Cedula", "Apellidos", "Nombres"};
        DefaultTableModel tableModel = new DefaultTableModel(null, tblCol);
        this.tablaTitulares.setModel(tableModel);
        // no params were provided
        if (id == -1) {
            return;
        }
        // get cuenta cliente with account id
        List<Cuentacliente> cc = this.cuentaClienteController.findCuentaclienteEntitiesByAccountID(id);
        for (int i = 0; i < cc.size(); i++) {
            // get account
            Cliente c = this.clienteController.findClienteById(cc.get(i).getHolderID());
            if (c == null) {
                continue;
            }
            Object[] obj = null;
            tableModel.addRow(obj);
            tableModel.setValueAt(c.getIdCliente(), i, 0);
            tableModel.setValueAt(c.getCedula(), i, 1);
            tableModel.setValueAt(c.getApellidos(), i, 2);
            tableModel.setValueAt(c.getNombres(), i, 3);
        }
    }

    private boolean validFieds() {
        if (this.inputFecha.getText().equals("")) {
            return false;
        }
        if (this.inputNumero.getText().equals("")) {
            return false;
        }
        if (this.inputSaldo.getText().equals("")) {
            return false;
        }
        if (this.combTipo.getSelectedIndex() <= 0) {
            return false;
        }
        if (this.combEstado.getSelectedIndex() <= 0) {
            return false;
        }
        return true;
    }*/

    /**
     * Load states for comboBox
     */
    /*private void loadStates() {
        // load from db
        DefaultComboBoxModel comboBox = new DefaultComboBoxModel();
        List<Model.State> states = this.stateController.findStateEntities();
        // load to comboBox
        comboBox.addElement("Seleccione...");
        for (Model.State s : states) {
            comboBox.addElement(s);
        }
        // set to gui comb
        this.combEstado.setModel(comboBox);*/
    }
}
