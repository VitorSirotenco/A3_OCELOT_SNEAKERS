/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACE;

import DAO.ClienteDAO;
import DAO.TenisDAO;
import DTO.Cliente;
import DTO.Tenis;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TabelaTenis extends javax.swing.JFrame {

    /**
     * Creates new form ListaAdm
     */
    public TabelaTenis() {
        initComponents();
        consultarTabelaTenis();
        this.setTitle("TABELA TENIS");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTenis = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JToggleButton();
        botaoCancelar = new javax.swing.JButton();
        labelMarca = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        textModelo = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        textQuantidade = new javax.swing.JTextField();
        labelCor = new javax.swing.JLabel();
        labelTamanho = new javax.swing.JLabel();
        textCor = new javax.swing.JTextField();
        textTamanho = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        labelPreco = new javax.swing.JLabel();
        textPreco = new javax.swing.JTextField();
        botaoAlterar = new javax.swing.JToggleButton();
        botaoPreencher = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        tabelaTenis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "codigo", "marca", "modelo", "cor", "tamanho", "quantidade", "preco"
            }
        ));
        jScrollPane1.setViewportView(tabelaTenis);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 380, 1120, 220);

        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(1030, 610, 120, 50);

        botaoCancelar.setText("VOLTAR");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(30, 610, 120, 50);

        labelMarca.setText("Marca:");
        getContentPane().add(labelMarca);
        labelMarca.setBounds(250, 190, 75, 30);
        getContentPane().add(textMarca);
        textMarca.setBounds(320, 190, 97, 30);

        labelModelo.setText("Modelo:");
        getContentPane().add(labelModelo);
        labelModelo.setBounds(250, 250, 75, 50);
        getContentPane().add(textModelo);
        textModelo.setBounds(320, 260, 97, 30);

        labelQuantidade.setText("Quantidade:");
        getContentPane().add(labelQuantidade);
        labelQuantidade.setBounds(730, 260, 70, 30);
        getContentPane().add(textQuantidade);
        textQuantidade.setBounds(810, 260, 40, 30);

        labelCor.setText("Cor:");
        getContentPane().add(labelCor);
        labelCor.setBounds(750, 120, 75, 50);

        labelTamanho.setText("Tamanho:");
        getContentPane().add(labelTamanho);
        labelTamanho.setBounds(735, 180, 80, 40);

        textCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorActionPerformed(evt);
            }
        });
        getContentPane().add(textCor);
        textCor.setBounds(810, 130, 83, 30);
        getContentPane().add(textTamanho);
        textTamanho.setBounds(810, 190, 83, 30);

        labelCodigo.setText("Código :");
        getContentPane().add(labelCodigo);
        labelCodigo.setBounds(240, 120, 70, 40);
        getContentPane().add(textCodigo);
        textCodigo.setBounds(320, 130, 40, 30);

        labelPreco.setText("Preço: ");
        getContentPane().add(labelPreco);
        labelPreco.setBounds(530, 310, 50, 30);

        textPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(textPreco);
        textPreco.setBounds(580, 310, 71, 30);

        botaoAlterar.setText("ALTERAR");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterar);
        botaoAlterar.setBounds(1031, 320, 120, 50);

        botaoPreencher.setText("Preencher");
        botaoPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPreencherActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPreencher);
        botaoPreencher.setBounds(30, 320, 120, 50);

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        labelTitulo.setText("ESTOQUE");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(450, -130, 560, 350);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(-8, -10, 1910, 860);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        PaginaAdm objPA = new PaginaAdm();
        objPA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void textCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorActionPerformed

    private void botaoPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPreencherActionPerformed
        preencherCampos();
    }//GEN-LAST:event_botaoPreencherActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        alterarTenis();
        consultarTabelaTenis();
        limparCampos();
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        preencherCampos();
        excluirTenis();
        consultarTabelaTenis();
        limparCampos();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void textPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaTenis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JToggleButton botaoExcluir;
    private javax.swing.JButton botaoPreencher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTamanho;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tabelaTenis;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCor;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textQuantidade;
    private javax.swing.JTextField textTamanho;
    // End of variables declaration//GEN-END:variables

    private void consultarTabelaTenis() {
        try {
            TenisDAO TDAO = new TenisDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaTenis.getModel();
            model.setNumRows(0);

            ArrayList<Tenis> lista = TDAO.ListarTenis();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCodigo(),
                    lista.get(num).getMarca(),
                    lista.get(num).getModelo(),
                    lista.get(num).getCor(),
                    lista.get(num).getTamanho(),
                    lista.get(num).getQuantidade(),
                    lista.get(num).getPreco(),});
                    
            }

        } catch (Exception erro) {
            JOptionPane.showConfirmDialog(null, "ListarAdm: " + erro);
        }
    }

    private void preencherCampos() {
        int setar = tabelaTenis.getSelectedRow();

        textCodigo.setText(tabelaTenis.getModel().getValueAt(setar, 0).toString());
        textMarca.setText(tabelaTenis.getModel().getValueAt(setar, 1).toString());
        textModelo.setText(tabelaTenis.getModel().getValueAt(setar, 2).toString());
        textCor.setText(tabelaTenis.getModel().getValueAt(setar, 3).toString());
        textTamanho.setText(tabelaTenis.getModel().getValueAt(setar, 4).toString());
        textQuantidade.setText(tabelaTenis.getModel().getValueAt(setar, 5).toString());
        textPreco.setText(tabelaTenis.getModel().getValueAt(setar,6).toString());

    }

    private void alterarTenis() {
        int codigo;
        String marca;
        String modelo;
        String cor;
        String tamanho;
        int quantidade;
        float preco;

        codigo = Integer.parseInt(textCodigo.getText());
        marca = textMarca.getText();
        modelo = textModelo.getText();
        cor = textCor.getText();
        tamanho = textTamanho.getText();        
        quantidade = Integer.parseInt(textQuantidade.getText());
        preco = Float.parseFloat(textPreco.getText());
        

        Tenis ten = new Tenis();

        ten.setCodigo(codigo);
        ten.setMarca(marca);
        ten.setModelo(modelo);
        ten.setCor(cor);
        ten.setTamanho(tamanho);
        ten.setQuantidade(quantidade);
        ten.setPreco(preco);
        

        TenisDAO TDAO = new TenisDAO();
        TDAO.alterarTenis(ten);
    }
    
    private void excluirTenis(){
        int codigo;
        
        codigo = Integer.parseInt(textCodigo.getText());
        
        Tenis ten = new Tenis();
        ten.setCodigo(codigo);
        
        TenisDAO TDAO = new TenisDAO();
        
        TDAO.excluirTenis(ten);
    }
    
    public void limparCampos() {
        textCodigo.setText("");
        textMarca.setText("");
        textModelo.setText("");
        textCor.setText("");
        textTamanho.setText("");
        textQuantidade.setText("");
        textPreco.setText("");
        
        
    }

}
