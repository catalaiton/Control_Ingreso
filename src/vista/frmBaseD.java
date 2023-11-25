/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author catal
 */
public class frmBaseD extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmBaseD
     */
    public frmBaseD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBD = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnDocentes = new javax.swing.JButton();
        BtnAdministrativos = new javax.swing.JButton();
        BtnTrabajadores = new javax.swing.JButton();
        BtnVisitantes = new javax.swing.JButton();
        BtnEstudiantes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        tblBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Email", "Destino", "Valor pasaje", "Peso maleta", "Cantidad pasajes"
            }
        ));
        jScrollPane1.setViewportView(tblBD);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Consulta Base De Datos");

        btnConsultar.setText("Todos");

        jLabel3.setText("Filtrar por:");

        BtnDocentes.setText("Docentes");

        BtnAdministrativos.setText("Administrativos");

        BtnTrabajadores.setText("Trabajadores");
        BtnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTrabajadoresActionPerformed(evt);
            }
        });

        BtnVisitantes.setText("Visitantes");

        BtnEstudiantes.setText("Estudiantes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnEstudiantes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnDocentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnAdministrativos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnTrabajadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnVisitantes)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BtnDocentes)
                    .addComponent(BtnAdministrativos)
                    .addComponent(BtnTrabajadores)
                    .addComponent(BtnVisitantes)
                    .addComponent(BtnEstudiantes)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTrabajadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTrabajadoresActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdministrativos;
    private javax.swing.JButton BtnDocentes;
    private javax.swing.JButton BtnEstudiantes;
    private javax.swing.JButton BtnTrabajadores;
    private javax.swing.JButton BtnVisitantes;
    private javax.swing.ButtonGroup GrupoBD;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBD;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAdministrativos() {
        return BtnAdministrativos;
    }

    public void setBtnAdministrativos(JButton BtnAdministrativos) {
        this.BtnAdministrativos = BtnAdministrativos;
    }

    public JButton getBtnDocentes() {
        return BtnDocentes;
    }

    public void setBtnDocentes(JButton BtnDocentes) {
        this.BtnDocentes = BtnDocentes;
    }

    public JButton getBtnEstudiantes() {
        return BtnEstudiantes;
    }

    public void setBtnEstudiantes(JButton BtnEstudiantes) {
        this.BtnEstudiantes = BtnEstudiantes;
    }

    public JButton getBtnTrabajadores() {
        return BtnTrabajadores;
    }

    public void setBtnTrabajadores(JButton BtnTrabajadores) {
        this.BtnTrabajadores = BtnTrabajadores;
    }

    public JButton getBtnVisitantes() {
        return BtnVisitantes;
    }

    public void setBtnVisitantes(JButton BtnVisitantes) {
        this.BtnVisitantes = BtnVisitantes;
    }

    public ButtonGroup getGrupoBD() {
        return GrupoBD;
    }

    public void setGrupoBD(ButtonGroup GrupoBD) {
        this.GrupoBD = GrupoBD;
    }


    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public void setBtnConsultar(JButton btnConsultar) {
        this.btnConsultar = btnConsultar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }


    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }


    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTblBD() {
        return tblBD;
    }

    public void setTblBD(JTable tblBD) {
        this.tblBD = tblBD;
    }

    
}
