/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISUAL;

import CONTROLE.CCliente;
import CONTROLE.CTabela;
import MODELO.GarantiaFornecedor;
import MODELO.Tabela;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import javax.swing.JDesktopPane;
import javax.swing.JTable;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    CTabela controletabela;
    public static int cod;
    private static int lin;

    public TelaPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastro = new javax.swing.JMenu();
        cadCliente = new javax.swing.JMenuItem();
        cadFabricante = new javax.swing.JMenuItem();
        cadFornecedor = new javax.swing.JMenuItem();
        cadFun = new javax.swing.JMenuItem();
        cadOrc = new javax.swing.JMenuItem();
        cadUsu = new javax.swing.JMenuItem();
        cadVal = new javax.swing.JMenuItem();
        cadMer = new javax.swing.JMenuItem();
        cadGar = new javax.swing.JMenuItem();
        CadCon = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Seja-Bem Vindo ao Sistema");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        filler3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        desktop.setPreferredSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );

        jMenu1.setText("Sistema");
        jMenuBar1.add(jMenu1);

        cadastro.setText("CADASTRO");
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        cadCliente.setText("Cliente");
        cadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClienteActionPerformed(evt);
            }
        });
        cadastro.add(cadCliente);

        cadFabricante.setText("Fabricante");
        cadFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFabricanteActionPerformed(evt);
            }
        });
        cadastro.add(cadFabricante);

        cadFornecedor.setText("Fornecedor");
        cadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFornecedorActionPerformed(evt);
            }
        });
        cadastro.add(cadFornecedor);

        cadFun.setText("Funcionario");
        cadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFunActionPerformed(evt);
            }
        });
        cadastro.add(cadFun);

        cadOrc.setText("Orçamento");
        cadOrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadOrcActionPerformed(evt);
            }
        });
        cadastro.add(cadOrc);

        cadUsu.setText("Usuario");
        cadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUsuActionPerformed(evt);
            }
        });
        cadastro.add(cadUsu);

        cadVal.setText("Valores serviços");
        cadVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadValActionPerformed(evt);
            }
        });
        cadastro.add(cadVal);

        cadMer.setText("Mercadorias");
        cadMer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadMerActionPerformed(evt);
            }
        });
        cadastro.add(cadMer);

        cadGar.setText("Garantia de fornecedores");
        cadGar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadGarActionPerformed(evt);
            }
        });
        cadastro.add(cadGar);

        CadCon.setText("Controle de mercadoria");
        CadCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadConMouseClicked(evt);
            }
        });
        CadCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadConActionPerformed(evt);
            }
        });
        cadastro.add(CadCon);

        jMenuBar1.add(cadastro);

        jMenu6.setText("jMenu6");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(829, 829, 829)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(275, Short.MAX_VALUE))
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(508, 508, 508))
        );

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClienteActionPerformed
        // TODO add your handling code here:
        TelaClienteCadastro dados = new TelaClienteCadastro();
        desktop.add(dados);
        dados.setVisible(true);


    }//GEN-LAST:event_cadClienteActionPerformed

    private void cadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFornecedorActionPerformed
        // TODO add your handling code here:
        TelaFornecedorCadastro dados = new TelaFornecedorCadastro();
        desktop.add(dados);
        dados.setVisible(true);
    }//GEN-LAST:event_cadFornecedorActionPerformed

    private void cadFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFabricanteActionPerformed
        // TODO add your handling code here:
        TelaFabricanteCadastro dados = new TelaFabricanteCadastro();
        desktop.add(dados);
        dados.setVisible(true);
    }//GEN-LAST:event_cadFabricanteActionPerformed

    private void cadValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadValActionPerformed
        // TODO add your handling code here:
       TelaValoresServicosCadastro busca = new TelaValoresServicosCadastro();
       busca.setVisible(true);
    }//GEN-LAST:event_cadValActionPerformed

    private void cadMerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadMerActionPerformed
        // TODO add your handling code here:
        TelaMercadoriaCadastro mer = new TelaMercadoriaCadastro();
        desktop.add(mer);
        mer.setVisible(true);
    }//GEN-LAST:event_cadMerActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroActionPerformed

    private void cadOrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadOrcActionPerformed
        // TODO add your handling code here:
        TelaGerarOrcamentoCadastro orc = new TelaGerarOrcamentoCadastro();
        desktop.add(orc);
        orc.setVisible(true);
    }//GEN-LAST:event_cadOrcActionPerformed

    private void cadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFunActionPerformed
        // TODO add your handling code here:
        TelaFuncionarioCadastro fun = new TelaFuncionarioCadastro();
        desktop.add(fun);
        fun.setVisible(true);
    }//GEN-LAST:event_cadFunActionPerformed

    private void cadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUsuActionPerformed
        // TODO add your handling code here:
        TelaUsuarioCadastro usu = new TelaUsuarioCadastro();
        usu.add(usu);
        usu.setVisible(true);
    }//GEN-LAST:event_cadUsuActionPerformed

    private void cadGarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadGarActionPerformed
        // TODO add your handling code here:
        TelaGarantiaFornecedorCadastro gan = new TelaGarantiaFornecedorCadastro();
        desktop.add(gan);
        gan.setVisible(true);
    }//GEN-LAST:event_cadGarActionPerformed

    private void CadConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadConActionPerformed
        // TODO add your handling code here:
        TelaControleMercadoria con = new TelaControleMercadoria();
        desktop.add(con);
        con.setVisible(true);
        
    }//GEN-LAST:event_CadConActionPerformed

    private void CadConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadConMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CadConMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCon;
    private javax.swing.JMenuItem cadCliente;
    private javax.swing.JMenuItem cadFabricante;
    private javax.swing.JMenuItem cadFornecedor;
    private javax.swing.JMenuItem cadFun;
    private javax.swing.JMenuItem cadGar;
    private javax.swing.JMenuItem cadMer;
    private javax.swing.JMenuItem cadOrc;
    private javax.swing.JMenuItem cadUsu;
    private javax.swing.JMenuItem cadVal;
    private javax.swing.JMenu cadastro;
    private java.awt.Canvas canvas1;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables

   
}
