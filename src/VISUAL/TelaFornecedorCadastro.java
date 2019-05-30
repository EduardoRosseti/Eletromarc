/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISUAL;

import CONTROLE.CFornecedor;
import CONTROLE.CTabela;
import CONTROLE.CValidacao;
import CONTROLE.CWebServiceCep;
import MODELO.Validacao;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
//atualizado
/**
 *
 * @author jose
 */
public class TelaFornecedorCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroProduto
     */
    CFornecedor cFornecedor;
    CValidacao cValidacao;
    CTabela cTabela;

    public TelaFornecedorCadastro() {
        initComponents();
        cFornecedor = new CFornecedor();
        cValidacao = new CValidacao();
        cTabela = new CTabela();
        if ("Administrativo".equals(TelaLogin.tipoUsuario)) {

        } else if ("Comum".equals(TelaLogin.tipoUsuario)) {
            btnAlterar.setEnabled(false);
            btnDadExcluir.setEnabled(false);
        } else {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtCadForNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCadForEma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCadForCnpj = new javax.swing.JFormattedTextField();
        txtCadForCel = new javax.swing.JFormattedTextField();
        txtCadForTel = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        txtCadForRua = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCadForCid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCadForBai = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCadForNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCadForCom = new javax.swing.JTextArea();
        txtCadForCep = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbCadForUf = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBusca = new javax.swing.JTable();
        cbPesquisar = new javax.swing.JComboBox<String>();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnCadFor = new javax.swing.JButton();
        btnDadExcluir = new javax.swing.JButton();
        btnCadCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(357, 300));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("*CNPJ:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("*Nome:");

        try {
            txtCadForCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCadForCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCadForTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCadForNome, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtCadForCel, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtCadForTel)
                    .addComponent(txtCadForCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadForEma))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCadForNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCadForTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCadForCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCadForCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCadForEma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel5.setPreferredSize(new java.awt.Dimension(357, 315));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setText("*Cidade:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel13.setText("*Bairro:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("*Rua:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel17.setText("Nº");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setText("Complemento:");

        txtCadForCom.setColumns(20);
        txtCadForCom.setLineWrap(true);
        txtCadForCom.setRows(5);
        jScrollPane1.setViewportView(txtCadForCom);

        try {
            txtCadForCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadForCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadForCepActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel14.setText("*CEP:");

        jLabel9.setText("*UF:");

        cbCadForUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbCadForUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadForUfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(cbCadForUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCadForCid)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCadForCep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCadForNum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 56, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCadForRua))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCadForBai)))
                .addGap(16, 16, 16))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadForCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(txtCadForNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadForRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadForBai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadForCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbCadForUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        tbBusca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Data", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBusca.setEditingColumn(0);
        tbBusca.setEditingRow(0);
        tbBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBuscaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbBusca);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
        );

        cbPesquisar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COD_FORNECEDOR\t", "NOME" }));
        cbPesquisar.setToolTipText("");
        cbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnCadFor.setText("Cadastrar");
        btnCadFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadForActionPerformed(evt);
            }
        });

        btnDadExcluir.setText("Excluir");
        btnDadExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDadExcluirMouseClicked(evt);
            }
        });
        btnDadExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadExcluirActionPerformed(evt);
            }
        });

        btnCadCancelar.setText("Cancelar");
        btnCadCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCancelarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnCadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnDadExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCancelar)
                    .addComponent(btnAlterar)
                    .addComponent(btnCadFor)
                    .addComponent(btnDadExcluir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCadCancelarActionPerformed

    private void btnCadForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadForActionPerformed

        cFornecedor.fornecedor.setNome(txtCadForNome.getText());
        cFornecedor.fornecedor.setTelefone(cFornecedor.fornecedor.retiraCel(txtCadForTel.getText()));
        cFornecedor.fornecedor.setCelular(cFornecedor.fornecedor.retiraCel(txtCadForCel.getText()));
        cFornecedor.fornecedor.setCnpj(cFornecedor.fornecedor.retira(txtCadForCnpj.getText()));
        cFornecedor.fornecedor.setEmail(txtCadForEma.getText());
        cFornecedor.fornecedor.setCep(cFornecedor.fornecedor.retira(txtCadForCep.getText()));
        cFornecedor.fornecedor.setRua(txtCadForRua.getText());
        cFornecedor.fornecedor.setNumero(Integer.parseInt(txtCadForNum.getText()));
        cFornecedor.fornecedor.setBairro(txtCadForBai.getText());
        cFornecedor.fornecedor.setCidade(txtCadForCid.getText());
        cFornecedor.fornecedor.setComplemento(txtCadForCom.getText());
        cFornecedor.fornecedor.setEstado(cbCadForUf.getItemAt(cbCadForUf.getSelectedIndex()));
        // cFornecedor.fornecedor.setObservacao(txtCadObs.getText());
        if (cValidacao.validaCnpj(cFornecedor.fornecedor.getCnpj())) {
            if(Validacao.validarEmail(cFornecedor.fornecedor.getEmail()) > 0){
                JOptionPane.showMessageDialog(null, cFornecedor.gravar(cFornecedor.fornecedor));
            }else{
                JOptionPane.showMessageDialog(null, "Email não valido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "CNPJ não valido");
        }
    }//GEN-LAST:event_btnCadForActionPerformed

    private void txtCadForCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadForCepActionPerformed
        CWebServiceCep cWeb = new CWebServiceCep();
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.
        //caso a busca ocorra bem, imprime os resultados.
        cWeb.webServiceCep = cWeb.webServiceCep.searchCep(txtCadForCep.getText());
        if (cWeb.webServiceCep.wasSuccessful()) {
            txtCadForRua.setText(cWeb.webServiceCep.getLogradouroFull());
            txtCadForCid.setText(cWeb.webServiceCep.getCidade());
            txtCadForBai.setText(cWeb.webServiceCep.getBairro());
            cbCadForUf.setSelectedItem(cWeb.webServiceCep.getUf());
            //caso haja problemas imprime as exce??es.
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + cWeb.webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descrição do erro: " + cWeb.webServiceCep.getResultText());
        }
    }//GEN-LAST:event_txtCadForCepActionPerformed

    private void cbCadForUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadForUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCadForUfActionPerformed

    private void tbBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscaMouseClicked
        // TODO add your handling code here:
        cTabela.tabela.setLin(tbBusca.getSelectedRow());
        int i = Integer.parseInt((tbBusca.getModel()).getValueAt(cTabela.tabela.getLin(), 0).toString());
        cTabela.tabela.setCod(i);
        boolean result;
        cFornecedor.fornecedor.setCod(cTabela.tabela.getCod());
        result = cFornecedor.buscar(cFornecedor.fornecedor);
        //JOptionPane.showMessageDialog(null, result);
        if (result) {
            txtCadForNome.setText(cFornecedor.fornecedor.getNome());
            txtCadForTel.setText(cFornecedor.fornecedor.getTelefone());
            txtCadForCnpj.setText(cFornecedor.fornecedor.getCnpj());
            txtCadForCel.setText(cFornecedor.fornecedor.getCelular());
            txtCadForTel.setText(cFornecedor.fornecedor.getTelefone());
            txtCadForEma.setText(cFornecedor.fornecedor.getEmail());
            txtCadForCep.setText(cFornecedor.fornecedor.getCep());
            txtCadForNum.setText(Integer.toString(cFornecedor.fornecedor.getNumero()));
            txtCadForRua.setText(cFornecedor.fornecedor.getRua());
            txtCadForBai.setText(cFornecedor.fornecedor.getBairro());
            txtCadForCid.setText(cFornecedor.fornecedor.getCidade());
            txtCadForCom.setText(cFornecedor.fornecedor.getComplemento());
            cbCadForUf.getModel().setSelectedItem(cFornecedor.fornecedor.getEstado());
        }

    }//GEN-LAST:event_tbBuscaMouseClicked

    private void cbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // TODO add your handling code here:
        tbBusca.setModel(DbUtils.resultSetToTableModel(cTabela.pesq("tbfornecedor", txtPesquisar.getText(), cbPesquisar.getItemAt(cbPesquisar.getSelectedIndex()))));
        tbBusca.getColumnModel().getColumn(0).setPreferredWidth(75);
        tbBusca.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(6).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(7).setPreferredWidth(150);
        tbBusca.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDadExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDadExcluirMouseClicked

    }//GEN-LAST:event_btnDadExcluirMouseClicked

    private void btnDadExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadExcluirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, cFornecedor.apagar(cFornecedor.fornecedor));
    }//GEN-LAST:event_btnDadExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

        cFornecedor.fornecedor.setNome(txtCadForNome.getText());
        cFornecedor.fornecedor.setTelefone(cFornecedor.fornecedor.retiraCel(txtCadForTel.getText()));
        cFornecedor.fornecedor.setCelular(cFornecedor.fornecedor.retiraCel(txtCadForCel.getText()));
        cFornecedor.fornecedor.setCnpj(cFornecedor.fornecedor.retira(txtCadForCnpj.getText()));
        cFornecedor.fornecedor.setEmail(txtCadForEma.getText());
        cFornecedor.fornecedor.setCep(cFornecedor.fornecedor.retira(txtCadForCep.getText()));
        cFornecedor.fornecedor.setRua(txtCadForRua.getText());
        cFornecedor.fornecedor.setNumero(Integer.parseInt(txtCadForNum.getText()));
        cFornecedor.fornecedor.setBairro(txtCadForBai.getText());
        cFornecedor.fornecedor.setCidade(txtCadForCid.getText());
        cFornecedor.fornecedor.setComplemento(txtCadForCom.getText());
        cFornecedor.fornecedor.setEstado(cbCadForUf.getItemAt(cbCadForUf.getSelectedIndex()));
        // cFornecedor.fornecedor.setObservacao(txtCadObs.getText());
        if (cValidacao.validaCnpj(cFornecedor.fornecedor.getCnpj())) {
            if(Validacao.validarEmail(cFornecedor.fornecedor.getEmail()) > 0){
                JOptionPane.showMessageDialog(null, cFornecedor.alterar(cFornecedor.fornecedor));
            }else{
                JOptionPane.showMessageDialog(null, "Email não valido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "CNPJ não valido");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadCancelar;
    private javax.swing.JButton btnCadFor;
    private javax.swing.JButton btnDadExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbCadForUf;
    private javax.swing.JComboBox<String> cbPesquisar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tbBusca;
    private javax.swing.JTextField txtCadForBai;
    private javax.swing.JFormattedTextField txtCadForCel;
    private javax.swing.JFormattedTextField txtCadForCep;
    private javax.swing.JTextField txtCadForCid;
    private javax.swing.JFormattedTextField txtCadForCnpj;
    private javax.swing.JTextArea txtCadForCom;
    private javax.swing.JTextField txtCadForEma;
    private javax.swing.JTextField txtCadForNome;
    private javax.swing.JTextField txtCadForNum;
    private javax.swing.JTextField txtCadForRua;
    private javax.swing.JFormattedTextField txtCadForTel;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
