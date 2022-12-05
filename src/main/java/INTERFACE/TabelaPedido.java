/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACE;

import DAO.ClienteDAO;
import DAO.PedidoDAO;
import DAO.TenisDAO;
import DTO.Cliente;
import DTO.Pedido;
import DTO.Tenis;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TabelaPedido extends javax.swing.JFrame {

    /**
     * Creates new form ListaAdm
     */
    public TabelaPedido() {
        initComponents();
        consultarTabelaPedido();
        this.setTitle("TABELA TENIS");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPedido = new javax.swing.JTable();
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
        labelCpf = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        labelPagamento = new javax.swing.JLabel();
        textPagamento = new javax.swing.JTextField();
        botaoAlterar = new javax.swing.JToggleButton();
        botaoPreencher = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        tabelaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "codigo", "cpf", "marca", "modelo", "cor", "tamanho", "quantidade", "preço", "pagamento"
            }
        ));
        jScrollPane1.setViewportView(tabelaPedido);

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
        labelMarca.setBounds(210, 190, 75, 30);
        getContentPane().add(textMarca);
        textMarca.setBounds(300, 190, 97, 30);

        labelModelo.setText("Modelo:");
        getContentPane().add(labelModelo);
        labelModelo.setBounds(210, 240, 75, 50);
        getContentPane().add(textModelo);
        textModelo.setBounds(300, 250, 97, 30);

        labelQuantidade.setText("Quantidade:");
        getContentPane().add(labelQuantidade);
        labelQuantidade.setBounds(650, 250, 70, 30);
        getContentPane().add(textQuantidade);
        textQuantidade.setBounds(760, 250, 40, 30);

        labelCor.setText("Cor:");
        getContentPane().add(labelCor);
        labelCor.setBounds(670, 110, 75, 50);

        labelTamanho.setText("Tamanho:");
        getContentPane().add(labelTamanho);
        labelTamanho.setBounds(660, 180, 80, 40);

        textCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorActionPerformed(evt);
            }
        });
        getContentPane().add(textCor);
        textCor.setBounds(760, 120, 100, 30);
        getContentPane().add(textTamanho);
        textTamanho.setBounds(760, 190, 100, 30);

        labelCodigo.setText("Código :");
        getContentPane().add(labelCodigo);
        labelCodigo.setBounds(220, 70, 90, 40);
        getContentPane().add(textCodigo);
        textCodigo.setBounds(300, 80, 40, 30);

        labelPreco.setText("Preço: ");
        getContentPane().add(labelPreco);
        labelPreco.setBounds(210, 310, 50, 30);

        textPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(textPreco);
        textPreco.setBounds(300, 310, 100, 30);

        labelCpf.setText("CPF do Cliente:");
        getContentPane().add(labelCpf);
        labelCpf.setBounds(200, 126, 100, 40);
        getContentPane().add(textCpf);
        textCpf.setBounds(300, 130, 100, 30);

        labelPagamento.setText("Forma de Pagamento :");
        getContentPane().add(labelPagamento);
        labelPagamento.setBounds(627, 306, 140, 40);
        getContentPane().add(textPagamento);
        textPagamento.setBounds(760, 312, 110, 30);

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
        labelTitulo.setText("PEDIDOS");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(450, -130, 270, 350);

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
        alterarPedido();
        consultarTabelaPedido();
        limparCampos();
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        preencherCampos();
        excluirPedido();
        consultarTabelaPedido();
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
            java.util.logging.Logger.getLogger(TabelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TabelaPedido().setVisible(true);
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
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTamanho;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tabelaPedido;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCor;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textPagamento;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textQuantidade;
    private javax.swing.JTextField textTamanho;
    // End of variables declaration//GEN-END:variables

    private void consultarTabelaPedido() {        
        
        try {
            PedidoDAO PDAO = new PedidoDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaPedido.getModel();
            model.setNumRows(0);

            ArrayList<Pedido> lista = PDAO.listarPedido();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCodigo(),
                    lista.get(num).getCpf(),
                    lista.get(num).getMarca(),
                    lista.get(num).getModelo(),
                    lista.get(num).getCor(),
                    lista.get(num).getTamanho(),
                    lista.get(num).getQuantidade(),
                    lista.get(num).getPreco(),
                    lista.get(num).getPagamento(),});
                    
            }

        } catch (Exception erro) {
            JOptionPane.showConfirmDialog(null, "ListarPedido: " + erro);
        }
    }

    private void preencherCampos() {
        int setar = tabelaPedido.getSelectedRow();

        textCodigo.setText(tabelaPedido.getModel().getValueAt(setar, 0).toString());
        textCpf.setText(tabelaPedido.getModel().getValueAt(setar, 1).toString());
        textMarca.setText(tabelaPedido.getModel().getValueAt(setar, 2).toString());
        textModelo.setText(tabelaPedido.getModel().getValueAt(setar, 3).toString());
        textCor.setText(tabelaPedido.getModel().getValueAt(setar, 4).toString());
        textTamanho.setText(tabelaPedido.getModel().getValueAt(setar, 5).toString());
        textQuantidade.setText(tabelaPedido.getModel().getValueAt(setar, 6).toString());
        textPreco.setText(tabelaPedido.getModel().getValueAt(setar,7).toString());
        textPagamento.setText(tabelaPedido.getModel().getValueAt(setar,8).toString());

    }

    private void alterarPedido() {
        int codigo;
        String cpf;
        String marca;
        String modelo;
        String cor;
        String tamanho;
        int quantidade;
        float preco;
        String pagamento;

        codigo = Integer.parseInt(textCodigo.getText());
        cpf = (textCpf.getText());
        marca = textMarca.getText();
        modelo = textModelo.getText();
        cor = textCor.getText();
        tamanho = textTamanho.getText();        
        quantidade = Integer.parseInt(textQuantidade.getText());
        preco = Float.parseFloat(textPreco.getText());
        pagamento = (textPagamento.getText());
        

        Pedido ped = new Pedido();

        ped.setCodigo(codigo);
        ped.setCpf(cpf);
        ped.setMarca(marca);
        ped.setModelo(modelo);
        ped.setCor(cor);
        ped.setTamanho(tamanho);
        ped.setQuantidade(quantidade);
        ped.setPreco(preco);
        ped.setPagamento(pagamento);
        

        PedidoDAO PDAO = new PedidoDAO();
        PDAO.alterarPedido(ped);
    }
    
    private void excluirPedido(){
        int codigo;
        
        codigo = Integer.parseInt(textCodigo.getText());
        
        Pedido ped = new Pedido();
        ped.setCodigo(codigo);
        
        PedidoDAO PDAO = new PedidoDAO();
        
        PDAO.excluirPedido(ped);
    }
    
    public void limparCampos() {
        textCodigo.setText("");
        textCpf.setText("");
        textMarca.setText("");
        textModelo.setText("");
        textCor.setText("");
        textTamanho.setText("");
        textQuantidade.setText("");
        textPreco.setText("");
        textPagamento.setText("");
        
        
    }

}
