package formulariomenu;
import javax.swing.SpinnerNumberModel;
/**
 *
 * @author AdrixnP1nt
 */
public class FormulariodeSliders extends javax.swing.JFrame {
    public FormulariodeSliders() {
        initComponents();
        ConfigText.setEditable(false);
        VolumText.setEditable(false);
        ExtraText.setEditable(false);
        DificultadText.setEditable(false);
        txtResultado.setEditable(false);
        spiJugadores.setModel(new SpinnerNumberModel(1, 1, 4, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDificultad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        sldVolumen = new javax.swing.JSlider();
        ConfigText = new javax.swing.JTextField();
        VolumText = new javax.swing.JTextField();
        ConfigText1 = new javax.swing.JTextField();
        spiJugadores = new javax.swing.JSpinner();
        chkMusica = new javax.swing.JCheckBox();
        chkSombras = new javax.swing.JCheckBox();
        chkHD = new javax.swing.JCheckBox();
        ExtraText = new javax.swing.JTextField();
        DificultadText = new javax.swing.JTextField();
        optFacil = new javax.swing.JRadioButton();
        optMedio = new javax.swing.JRadioButton();
        optDificil = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(46, 204, 113));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        sldVolumen.setBackground(new java.awt.Color(223, 223, 223));
        sldVolumen.setMajorTickSpacing(10);
        sldVolumen.setMinorTickSpacing(5);
        sldVolumen.setPaintLabels(true);

        ConfigText.setText("Configuracion del juego");
        ConfigText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigTextActionPerformed(evt);
            }
        });

        VolumText.setText("Volumen");
        VolumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumTextActionPerformed(evt);
            }
        });

        ConfigText1.setText("Cantidad de vidas");
        ConfigText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigText1ActionPerformed(evt);
            }
        });

        spiJugadores.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        spiJugadores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiJugadoresStateChanged(evt);
            }
        });

        chkMusica.setText("Musica");

        chkSombras.setText("Sombras");

        chkHD.setText("Modo HD");

        ExtraText.setText("Extras");
        ExtraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraTextActionPerformed(evt);
            }
        });

        DificultadText.setText("Dificultad");
        DificultadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificultadTextActionPerformed(evt);
            }
        });

        grupoDificultad.add(optFacil);
        optFacil.setText("Facil (5 intentos)");

        grupoDificultad.add(optMedio);
        optMedio.setText("Intermedio (3 intentos)");

        grupoDificultad.add(optDificil);
        optDificil.setText("Dificil (2 intentos)");

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VolumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optDificil))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sldVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfigText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spiJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMusica)
                    .addComponent(chkSombras)
                    .addComponent(chkHD)
                    .addComponent(ExtraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DificultadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optFacil)
                    .addComponent(optMedio))
                .addGap(131, 131, 131)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(ConfigText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ConfigText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(VolumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sldVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConfigText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(spiJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(ExtraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkMusica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSombras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkHD))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DificultadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optFacil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optMedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optDificil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void VolumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumTextActionPerformed
    }//GEN-LAST:event_VolumTextActionPerformed
    private void ConfigTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigTextActionPerformed
    }//GEN-LAST:event_ConfigTextActionPerformed
    private void ConfigText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigText1ActionPerformed
    }//GEN-LAST:event_ConfigText1ActionPerformed
    private void spiJugadoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiJugadoresStateChanged
    }//GEN-LAST:event_spiJugadoresStateChanged
    private void ExtraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraTextActionPerformed
    }//GEN-LAST:event_ExtraTextActionPerformed
    private void DificultadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificultadTextActionPerformed
    }//GEN-LAST:event_DificultadTextActionPerformed
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String extras = "";
        String dificultad = "";
        if (chkMusica.isSelected()) {
            extras += "Musica ";
        }
        if (chkSombras.isSelected()) {
            extras += "Sombras ";
        }
        if (chkHD.isSelected()) {
            extras += "Modo HD ";
        }
        if (optFacil.isSelected()) {
            dificultad = "Facil";
        }
        if (optMedio.isSelected()) {
            dificultad = "Medio";
        }
        if (optDificil.isSelected()) {
            dificultad = "Dificil";
        }
        txtResultado.setText(
                "Volumen: " + sldVolumen.getValue()
                + "\nJugadores: " + spiJugadores.getValue()
                + "\nExtras: " + extras
                + "\nDificultad: " + dificultad
        );
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        sldVolumen.setValue(50);

        spiJugadores.setValue(1);

        chkMusica.setSelected(false);
        chkSombras.setSelected(false);
        chkHD.setSelected(false);

        grupoDificultad.clearSelection();

        txtResultado.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulariodeSliders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfigText;
    private javax.swing.JTextField ConfigText1;
    private javax.swing.JTextField DificultadText;
    private javax.swing.JTextField ExtraText;
    private javax.swing.JTextField VolumText;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkHD;
    private javax.swing.JCheckBox chkMusica;
    private javax.swing.JCheckBox chkSombras;
    private javax.swing.ButtonGroup grupoDificultad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optDificil;
    private javax.swing.JRadioButton optFacil;
    private javax.swing.JRadioButton optMedio;
    private javax.swing.JSlider sldVolumen;
    private javax.swing.JSpinner spiJugadores;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
