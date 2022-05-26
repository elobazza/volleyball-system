package view;

import controller.ControllerPartida;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Equipe;

/**
 * @author Eloísa Bazzanella
 * @since  maio, 2022
 */
public class ViewPartida extends javax.swing.JFrame {

    private ControllerPartida controller;
    
    public ViewPartida() {
        this.controller = ControllerPartida.getInstance();
        
        
        initComponents();
        
        this.getContentPane().setBackground(Color.white);
        this.lbHorario.setText(controller.getPartida().getHorario());
        this.lbNomeEquipeA.setText(controller.getPartida().getEquipeA().getNome());
        this.lbNomeEquipeB.setText(controller.getPartida().getEquipeB().getNome());
        
        this.tfPontosEquipeA.setEnabled(false);
        this.tfPontosEquipeB.setEnabled(false);
        
        this.tfPontosEquipeA.setText("0");
        this.tfPontosEquipeB.setText("0");
        
    }
    
    private void atualizaPontuacao(Equipe e) {
        int novaPontuacao = controller.getPartida().getEquipeA().getPontuacao();
        this.tfPontosEquipeA.setText(Integer.toString(novaPontuacao));
        
        int novaPontuacaoB = controller.getPartida().getEquipeB().getPontuacao();
        this.tfPontosEquipeB.setText(Integer.toString(novaPontuacaoB));
        
        if(e != null) {
            JOptionPane.showMessageDialog(rootPane, "O vencedor foi: " + e.getNome());
            this.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        tfPontosEquipeA = new javax.swing.JTextField();
        tfPontosEquipeB = new javax.swing.JTextField();
        lbNomeEquipeA = new javax.swing.JLabel();
        lbNomeEquipeB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbSetsEquipeA = new javax.swing.JLabel();
        lbSetsEquipeB = new javax.swing.JLabel();
        btPontuarEquipeA = new javax.swing.JButton();
        btPontuarEquipeB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setText("PARTIDA");

        lbHorario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbHorario.setText("Horário");

        lbNomeEquipeA.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNomeEquipeA.setText("Nome Equipe A");

        lbNomeEquipeB.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNomeEquipeB.setText("Nome Equipe B");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Sets ganhos:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Sets ganhos:");

        lbSetsEquipeA.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbSetsEquipeA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSetsEquipeA.setText("0");

        lbSetsEquipeB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbSetsEquipeB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSetsEquipeB.setText("0");

        btPontuarEquipeA.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btPontuarEquipeA.setText("Pontuar");
        btPontuarEquipeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPontuarEquipeAActionPerformed(evt);
            }
        });

        btPontuarEquipeB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btPontuarEquipeB.setText("Pontuar");
        btPontuarEquipeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPontuarEquipeBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 60)); // NOI18N
        jLabel4.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(lbHorario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPontuarEquipeA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNomeEquipeA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfPontosEquipeA)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSetsEquipeA, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)))
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPontosEquipeB)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNomeEquipeB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSetsEquipeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btPontuarEquipeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHorario)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeEquipeA)
                            .addComponent(lbNomeEquipeB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPontosEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPontosEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lbSetsEquipeA)
                    .addComponent(lbSetsEquipeB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPontuarEquipeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPontuarEquipeA, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPontuarEquipeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPontuarEquipeAActionPerformed
        Equipe e = this.controller.pontuar(controller.getPartida().getEquipeA().getNome());
        int novaPontuacaoSet = controller.getPartida().getEquipeA().getSetsGanhos();
        this.lbSetsEquipeA.setText(Integer.toString(novaPontuacaoSet));
        
        this.atualizaPontuacao(e);
        
    }//GEN-LAST:event_btPontuarEquipeAActionPerformed

    private void btPontuarEquipeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPontuarEquipeBActionPerformed
        Equipe e = this.controller.pontuar(controller.getPartida().getEquipeB().getNome());
        
        int novaPontuacaoSet = controller.getPartida().getEquipeB().getSetsGanhos();
        this.lbSetsEquipeB.setText(Integer.toString(novaPontuacaoSet));
        
        this.atualizaPontuacao(e);
    }//GEN-LAST:event_btPontuarEquipeBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPontuarEquipeA;
    private javax.swing.JButton btPontuarEquipeB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbNomeEquipeA;
    private javax.swing.JLabel lbNomeEquipeB;
    private javax.swing.JLabel lbSetsEquipeA;
    private javax.swing.JLabel lbSetsEquipeB;
    private javax.swing.JTextField tfPontosEquipeA;
    private javax.swing.JTextField tfPontosEquipeB;
    // End of variables declaration//GEN-END:variables
}
