
package INTERFACE;

import DAO.PedidoDAO;
import DTO.Cliente;
import DTO.Pedido;
import DTO.Tenis;
import javax.swing.JOptionPane;


public class NikeAIR3 extends javax.swing.JFrame {

   
    public NikeAIR3() {
        initComponents();
        this.setTitle("NIKE AIR");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTenis = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelTamanho = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        labelPagamento = new javax.swing.JLabel();
        comboPagamento = new javax.swing.JComboBox<>();
        comboQuantidade = new javax.swing.JComboBox<>();
        comboTamanho = new javax.swing.JComboBox<>();
        labelQuantidade = new javax.swing.JLabel();
        botaoFinalizarCompra = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        labelTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nike3.jpeg"))); // NOI18N
        getContentPane().add(labelTenis);
        labelTenis.setBounds(176, 127, 364, 210);

        labelTitulo.setText("NIKE AIR MASC. MARROM E AZUL");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(176, 42, 205, 40);

        labelTamanho.setText("Tamanho:");
        getContentPane().add(labelTamanho);
        labelTamanho.setBounds(855, 127, 68, 35);
        getContentPane().add(textCpf);
        textCpf.setBounds(940, 260, 130, 30);

        labelCpf.setText("Informe seu CPF:");
        getContentPane().add(labelCpf);
        labelCpf.setBounds(830, 260, 110, 30);

        labelPagamento.setText("Forma de Pagamento:");
        getContentPane().add(labelPagamento);
        labelPagamento.setBounds(810, 320, 117, 50);

        comboPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIX", "Cartão de Crédito", "Cartão de Débito" }));
        getContentPane().add(comboPagamento);
        comboPagamento.setBounds(940, 330, 130, 30);

        comboQuantidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(comboQuantidade);
        comboQuantidade.setBounds(940, 192, 72, 30);

        comboTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "38", "39", "40", "41" }));
        getContentPane().add(comboTamanho);
        comboTamanho.setBounds(941, 133, 72, 22);

        labelQuantidade.setText("Quantidade:");
        getContentPane().add(labelQuantidade);
        labelQuantidade.setBounds(857, 190, 80, 30);

        botaoFinalizarCompra.setText("Finalizar Compra");
        botaoFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoFinalizarCompra);
        botaoFinalizarCompra.setBounds(835, 549, 178, 39);

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar);
        botaoVoltar.setBounds(176, 549, 90, 39);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(0, 0, 1200, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarCompraActionPerformed
        Cliente cli = new Cliente();
        Tenis ten = new Tenis();
        Pedido ped = new Pedido();
        
        cli.setCpf(textCpf.getText());
        ten.setMarca("Nike");
        ten.setModelo("Air");
        ten.setCor("Marrom");
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

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        NIKE n = new NIKE();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NikeAIR3().setVisible(true);
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
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTamanho;
    private javax.swing.JLabel labelTenis;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCpf;
    // End of variables declaration//GEN-END:variables
}
