/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACE;

import DAO.PedidoDAO;
import DTO.Cliente;
import DTO.Pedido;
import DTO.Tenis;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AdidasBoost extends javax.swing.JFrame {

    /**
     * Creates new form AdidasBoost
     */
    public AdidasBoost() {
        initComponents();
        this.setTitle("ADIDAS ULTRA BOOST");
        labelInformeCpf.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTenis = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelTamanho = new javax.swing.JLabel();
        comboTamanho = new javax.swing.JComboBox<>();
        botaoVoltar = new javax.swing.JButton();
        labelQuantidade = new javax.swing.JLabel();
        comboQuantidade = new javax.swing.JComboBox<>();
        labelCpf = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        labelInformeCpf = new javax.swing.JLabel();
        labelPagamento = new javax.swing.JLabel();
        comboPagamento = new javax.swing.JComboBox<>();
        botaoFinalizarCompra = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        labelTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adidas2.jpeg"))); // NOI18N
        getContentPane().add(labelTenis);
        labelTenis.setBounds(186, 154, 360, 218);

        labelTitulo.setText("ADIDAS ULTRA BOOST. BRANCO");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(186, 53, 204, 36);

        labelTamanho.setText("Tamanho:");
        getContentPane().add(labelTamanho);
        labelTamanho.setBounds(855, 127, 68, 35);

        comboTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "38", "39", "40", "41" }));
        getContentPane().add(comboTamanho);
        comboTamanho.setBounds(941, 133, 72, 22);

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar);
        botaoVoltar.setBounds(186, 487, 89, 49);

        labelQuantidade.setText("Quantidade:");
        getContentPane().add(labelQuantidade);
        labelQuantidade.setBounds(857, 190, 80, 30);

        comboQuantidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(comboQuantidade);
        comboQuantidade.setBounds(940, 192, 72, 30);

        labelCpf.setText("Informe seu CPF:");
        getContentPane().add(labelCpf);
        labelCpf.setBounds(830, 260, 110, 30);

        textCpf.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textCpfComponentAdded(evt);
            }
        });
        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });
        getContentPane().add(textCpf);
        textCpf.setBounds(940, 260, 130, 30);

        labelInformeCpf.setForeground(new java.awt.Color(255, 0, 0));
        labelInformeCpf.setText("INFORME SEU CPF!");
        getContentPane().add(labelInformeCpf);
        labelInformeCpf.setBounds(950, 290, 120, 30);

        labelPagamento.setText("Forma de Pagamento:");
        getContentPane().add(labelPagamento);
        labelPagamento.setBounds(810, 320, 117, 50);

        comboPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIX", "Cart??o de Cr??dito", "Cart??o de D??bito" }));
        getContentPane().add(comboPagamento);
        comboPagamento.setBounds(940, 330, 130, 30);

        botaoFinalizarCompra.setText("Finalizar Compra");
        botaoFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoFinalizarCompra);
        botaoFinalizarCompra.setBounds(890, 490, 178, 39);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(0, 0, 1200, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        ADIDAS a = new ADIDAS();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarCompraActionPerformed
        Cliente cli = new Cliente();
        Tenis ten = new Tenis();
        Pedido ped = new Pedido();

        cli.setCpf(textCpf.getText());
        ten.setMarca("Adidas");
        ten.setModelo("Boost");
        ten.setCor("Branco");
        ten.setTamanho(comboTamanho.getSelectedItem().toString());
        ped.setQuantidade(Integer.parseInt(comboQuantidade.getSelectedItem().toString()));
        ten.setPreco((float) 200.50);
        ped.setPagamento(comboPagamento.getSelectedItem().toString());

        PedidoDAO PDAO = new PedidoDAO();

        PDAO.inserir(cli, ten, ped);
        
        JOptionPane.showMessageDialog(null, "OBRIGADO POR COMPRAR NA NOSSA LOJA!");
        
        PaginaCliente pc = new PaginaCliente();
        
        pc.setVisible(true);
        
        this.dispose();

        
    }//GEN-LAST:event_botaoFinalizarCompraActionPerformed

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void textCpfComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textCpfComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfComponentAdded

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
            java.util.logging.Logger.getLogger(AdidasBoost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdidasBoost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdidasBoost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdidasBoost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdidasBoost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizarCompra;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> comboPagamento;
    private javax.swing.JComboBox<String> comboQuantidade;
    private javax.swing.JComboBox<String> comboTamanho;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelInformeCpf;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTamanho;
    private javax.swing.JLabel labelTenis;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCpf;
    // End of variables declaration//GEN-END:variables
}
