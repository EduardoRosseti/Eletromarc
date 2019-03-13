/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//TELA PRONTA
package VISUAL;

import CONTROLE.CFabricante;
import CONTROLE.CTabela;
import CONTROLE.CValidacao;
import CONTROLE.CWebServiceCep;
import MODELO.WebServiceCep;
import static VISUAL.TelaClienteCadastro.tbBusca;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jose
 */
public class TelaFabricanteCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadFabastroProduto
     */
    CTabela cTabela;
    CFabricante cFabricante;
    CValidacao cValidacao;
    private int cod;
    private int lin;
    
    public TelaFabricanteCadastro() {
        initComponents();
        cTabela = new CTabela();
        cFabricante = new CFabricante();
        cValidacao = new CValidacao();
        preencherTabelaa();
    }
    
        public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getLin() {
        return lin;
    }

    public void setLin(int lin) {
        this.lin = lin;
    }
    
    public void preencherTabelaa() {
        String []p = new String[5];
        p[0] = "codigo";p[1]="nome";p[2]="cnpj";p[3]="telefone";p[4]="tbfabricante";
        String[] colunas = new String[]{"Codigo", "Nome", "CNPJ", "Telefone"};
        ArrayList dados = cTabela.preencherFabricante(p);
        //JOptionPane.showMessageDialog(null, "preenche funcao" + dados);
        
        //JOptionPane.showMessageDialog(null, "CONSTRUTOR ");
        tbBusca.setModel(cTabela.tabela.CTabela(dados, colunas));
        //tbBusca.setModel((controletabela.tabela.Tabela(dados, colunas)));
        //JOptionPane.showMessageDialog(null, "MOOODEL" + tbBusca.getModel());
        tbBusca.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbBusca.getColumnModel().getColumn(0).setPreferredWidth(70);
        tbBusca.getColumnModel().getColumn(0).setResizable(false);
        tbBusca.getColumnModel().getColumn(1).setPreferredWidth(325);
        tbBusca.getColumnModel().getColumn(1).setResizable(false);
        tbBusca.getColumnModel().getColumn(2).setPreferredWidth(160);
        tbBusca.getColumnModel().getColumn(2).setResizable(false);
        tbBusca.getColumnModel().getColumn(3).setPreferredWidth(160);
        tbBusca.getColumnModel().getColumn(3).setResizable(false);
        tbBusca.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbBusca.setAutoCreateRowSorter(true);
          }
    
        public void pesquisar(){
        
        boolean result;
        //JOptionPane.showMessageDialog(null,"dentro pesquisar "+cFabricante.fabricante.getCod());
        cFabricante.fabricante.setCod(getCod());
        result = cFabricante.buscar(cFabricante.fabricante);
        //JOptionPane.showMessageDialog(null, result);
        if(result){
            //txtCadFabCod.setText(Integer.toString(cFabricante.fabricante.getCod()));
            txtCadFabNome.setText((cFabricante.fabricante.getNome()));

            txtCadFabTel.setText(cFabricante.fabricante.getTelefone());
            //JOptionPane.showMessageDialog(null,cFabricante.fabricante.getTelefone());
            txtCadFabCel.setText(cFabricante.fabricante.getCelular());
            txtCadFabCnpj.setText(cFabricante.fabricante.getCnpj());
            txtCadFabEma.setText(cFabricante.fabricante.getEmail());
            txtCadFabRua.setText(cFabricante.fabricante.getRua());
            txtCadFabNum.setText(Integer.toString(cFabricante.fabricante.getNumero()));
            txtCadFabCep.setText(cFabricante.fabricante.getCep());
            txtCadFabBai.setText(cFabricante.fabricante.getBairro());
            txtCadFabCid.setText(cFabricante.fabricante.getCidade());
            txtCadFabCom.setText(cFabricante.fabricante.getComplemento());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Fabm Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtCadFabNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCadFabEma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCadFabCnpj = new javax.swing.JFormattedTextField();
        txtCadFabCel = new javax.swing.JFormattedTextField();
        txtCadFabTel = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        txtCadFabRua = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCadFabCid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCadFabBai = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCadFabNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCadFabCom = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        cbCadFabUf = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtCadFabCep = new javax.swing.JFormattedTextField();
        btnCadFor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBusca = new javax.swing.JTable();
        cbPesquisar = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnDadExcluir = new javax.swing.JButton();
        btnCadCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(357, 300));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("Email");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("*CNPJ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("Celular");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("*Nome Fabricante");

        try {
            txtCadFabCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCadFabCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCadFabTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel5.setPreferredSize(new java.awt.Dimension(357, 315));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel12.setText("*Cidade");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel13.setText("Bairro");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel16.setText("*Rua");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel17.setText("*Nº:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel11.setText("Complemento");

        txtCadFabCom.setColumns(20);
        txtCadFabCom.setLineWrap(true);
        txtCadFabCom.setRows(5);
        jScrollPane1.setViewportView(txtCadFabCom);

        jLabel9.setText("UF");

        cbCadFabUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbCadFabUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadFabUfActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel14.setText("*CEP");

        try {
            txtCadFabCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadFabCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadFabCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txtCadFabCep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadFabNum, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCadFabBai, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addComponent(txtCadFabRua)
                        .addComponent(txtCadFabCid))
                    .addComponent(cbCadFabUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCadFabCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtCadFabNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadFabRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadFabBai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadFabCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbCadFabUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCadFabEma)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtCadFabNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCadFabTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtCadFabCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCadFabCel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(161, 161, 161)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadFabNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCadFabCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCadFabTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCadFabCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCadFabEma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnCadFor.setText("Confirmar");
        btnCadFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadForActionPerformed(evt);
            }
        });

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

        cbPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nome", "Cnpj", "Telefone" }));
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

        jButton1.setText("Alterar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnDadExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnCadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDadExcluir)
                    .addComponent(btnCadFor)
                    .addComponent(btnCadCancelar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCancelarActionPerformed

    }//GEN-LAST:event_btnCadCancelarActionPerformed

    private void btnCadForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadForActionPerformed
        // TODO add your handling code here:
        String msg;
        cFabricante.fabricante.setNome(txtCadFabNome.getText());
        cFabricante.fabricante.setTelefone(cFabricante.fabricante.retiraCel(txtCadFabTel.getText()));
        cFabricante.fabricante.setCelular(cFabricante.fabricante.retiraCel(txtCadFabCel.getText()));
        cFabricante.fabricante.setCnpj(cFabricante.fabricante.retira(txtCadFabCnpj.getText()));
        cFabricante.fabricante.setEmail(txtCadFabEma.getText());
        cFabricante.fabricante.setCep(cFabricante.fabricante.retira(txtCadFabCep.getText()));
        cFabricante.fabricante.setRua(txtCadFabRua.getText());
        cFabricante.fabricante.setNumero(Integer.parseInt(txtCadFabNum.getText()));
        cFabricante.fabricante.setBairro(txtCadFabBai.getText());
        cFabricante.fabricante.setCidade(txtCadFabCid.getText());
        cFabricante.fabricante.setComplemento(txtCadFabCom.getText());
        JOptionPane.showMessageDialog(null,cFabricante.fabricante.getCnpj());

        // cFabricante.fabricante.setObservacao(txtCadFabObs.getText());
        if(cValidacao.validaCnpj(cFabricante.fabricante.getCnpj())){
            if(true){
                msg = cFabricante.gravar(cFabricante.fabricante);
            }else{
                msg = "RG invalido";
            }
        }else{
            JOptionPane.showMessageDialog(null, "cpf invalido");
        }
    }//GEN-LAST:event_btnCadForActionPerformed

    private void cbCadFabUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadFabUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCadFabUfActionPerformed

    private void txtCadFabCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadFabCepActionPerformed
        CWebServiceCep cWeb = new CWebServiceCep();
        //A ferramenta de busca ignora qualquer caracter que n?o seja n?mero.
        //caso a busca ocorra bem, imprime os resultados.
        cWeb.webServiceCep = cWeb.webServiceCep.searchCep(txtCadFabCep.getText());
        if (cWeb.webServiceCep.wasSuccessful()) {
            txtCadFabRua.setText(cWeb.webServiceCep.getLogradouroFull());
            txtCadFabCid.setText(cWeb.webServiceCep.getCidade());
            txtCadFabBai.setText(cWeb.webServiceCep.getBairro());
            cbCadFabUf.setSelectedItem(cWeb.webServiceCep.getUf());
            //caso haja problemas imprime as exce??es.
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + cWeb.webServiceCep.getResulCode());

            JOptionPane.showMessageDialog(null, "Descrição do erro: " + cWeb.webServiceCep.getResultText());
        }
    }//GEN-LAST:event_txtCadFabCepActionPerformed

    private void tbBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscaMouseClicked
        // TODO add your handling code here:
        setLin(tbBusca.getSelectedRow());
        //JOptionPane.showMessageDialog(null, getLin());
        int i = Integer.parseInt((tbBusca.getModel()).getValueAt(getLin(), 0).toString());
        JOptionPane.showMessageDialog(null, i);
        setCod(i);
        pesquisar();
    }//GEN-LAST:event_tbBuscaMouseClicked

    private void cbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, txtPesquisar.getText());
        String pr = (String)(txtPesquisar.getText());
        String op = (String)(cbPesquisar.getSelectedItem());
        String tb = "tbfabricante";
        //tbBusca.setModel(DbUtils.resultSetToTableModel(cTabela.pesq(tb,pr,op)));
        tbBusca.getColumnModel().getColumn(0).setPreferredWidth(75);
        tbBusca.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(6).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(7).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(8).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(9).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(10).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(11).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(12).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(13).setPreferredWidth(150);
        tbBusca.getColumnModel().getColumn(14).setPreferredWidth(150);
        tbBusca.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        preencherTabelaa();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDadExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDadExcluirMouseClicked
        // TODO add your handling code here:
        String msg = cFabricante.apagar(cFabricante.fabricante);
        JOptionPane.showMessageDialog(null, msg);
        //abela.tabela.deletarLinha(TelaPrincipal.getCod());
        //JOptionPane.showMessageDialog(null,TelaPrincipal.getLin());
    }//GEN-LAST:event_btnDadExcluirMouseClicked

    private void btnDadExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDadExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCancelar;
    private javax.swing.JButton btnCadFor;
    private javax.swing.JButton btnDadExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbCadFabUf;
    private javax.swing.JComboBox<String> cbPesquisar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txtCadFabBai;
    private javax.swing.JFormattedTextField txtCadFabCel;
    private javax.swing.JFormattedTextField txtCadFabCep;
    private javax.swing.JTextField txtCadFabCid;
    private javax.swing.JFormattedTextField txtCadFabCnpj;
    private javax.swing.JTextArea txtCadFabCom;
    private javax.swing.JTextField txtCadFabEma;
    private javax.swing.JTextField txtCadFabNome;
    private javax.swing.JTextField txtCadFabNum;
    private javax.swing.JTextField txtCadFabRua;
    private javax.swing.JFormattedTextField txtCadFabTel;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}