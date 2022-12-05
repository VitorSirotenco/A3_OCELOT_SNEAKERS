package INTERFACE;

import DAO.TenisDAO;
import DTO.Tenis;

public class CadastroTenis extends javax.swing.JFrame {

    public CadastroTenis() {
        initComponents();
        botaoCadastrarTenis.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        labelTamanho = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        textModelo = new javax.swing.JTextField();
        textCor = new javax.swing.JTextField();
        textTamanho = new javax.swing.JTextField();
        textQuantidade = new javax.swing.JTextField();
        textPreco = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        botaoCadastrarTenis = new javax.swing.JButton();
        botaoConfirmarTenis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoTenis = new javax.swing.JTextArea();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(650, 580));
        setPreferredSize(new java.awt.Dimension(650, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        labelTitulo.setText("ESTOQUE DE TÊNIS - CADASTRO");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(20, 0, 630, 130);

        labelMarca.setText("Marca:");
        getContentPane().add(labelMarca);
        labelMarca.setBounds(60, 120, 75, 30);

        labelModelo.setText("Modelo:");
        getContentPane().add(labelModelo);
        labelModelo.setBounds(60, 180, 75, 50);

        labelCor.setText("Cor:");
        getContentPane().add(labelCor);
        labelCor.setBounds(420, 100, 75, 60);

        labelTamanho.setText("Tamanho:");
        getContentPane().add(labelTamanho);
        labelTamanho.setBounds(410, 180, 75, 50);

        labelQuantidade.setText("Quantidade:");
        getContentPane().add(labelQuantidade);
        labelQuantidade.setBounds(50, 260, 70, 30);

        labelPreco.setText("Preço:");
        getContentPane().add(labelPreco);
        labelPreco.setBounds(420, 260, 70, 30);
        getContentPane().add(textMarca);
        textMarca.setBounds(130, 120, 97, 30);
        getContentPane().add(textModelo);
        textModelo.setBounds(130, 190, 97, 30);

        textCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorActionPerformed(evt);
            }
        });
        getContentPane().add(textCor);
        textCor.setBounds(480, 120, 80, 30);
        getContentPane().add(textTamanho);
        textTamanho.setBounds(480, 190, 80, 30);
        getContentPane().add(textQuantidade);
        textQuantidade.setBounds(130, 260, 100, 30);
        getContentPane().add(textPreco);
        textPreco.setBounds(480, 260, 80, 30);

        botaoCancelar.setText("CANCELAR");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(40, 330, 110, 50);

        botaoCadastrarTenis.setText("Cadastrar Tenis");
        botaoCadastrarTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarTenisActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrarTenis);
        botaoCadastrarTenis.setBounds(470, 330, 133, 49);

        botaoConfirmarTenis.setText("Confirmar");
        botaoConfirmarTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarTenisActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConfirmarTenis);
        botaoConfirmarTenis.setBounds(260, 330, 120, 49);

        campoTenis.setColumns(20);
        campoTenis.setRows(5);
        jScrollPane1.setViewportView(campoTenis);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 390, 562, 120);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(-10, -14, 670, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorActionPerformed

    private void botaoConfirmarTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarTenisActionPerformed
        botaoCadastrarTenis.setVisible(true);

        String Marca;
        String Modelo;
        String Cor;
        String Tamanho;
        int Quantidade;
        Float Preco;

        Marca = textMarca.getText();
        Modelo = textModelo.getText();
        Cor = textCor.getText();
        Tamanho = textTamanho.getText();
        Quantidade = Integer.parseInt(textQuantidade.getText());
        Preco = Float.valueOf(textPreco.getText());

        campoTenis.selectAll();
        campoTenis.replaceSelection("");

        campoTenis.append("=================================\n");
        campoTenis.append("Marca: " + Marca + "\n");
        campoTenis.append("Modelo: " + Modelo + "\n");
        campoTenis.append("Cor: " + Cor + "\n");
        campoTenis.append("Tamanho: " + Tamanho + "\n");
        campoTenis.append("Quantidade: " + Quantidade + "\n");
        campoTenis.append("Preço: " + Preco + "\n");
        campoTenis.append("================================\n");

        botaoCadastrarTenis.setVisible(true);

    }//GEN-LAST:event_botaoConfirmarTenisActionPerformed

    private void botaoCadastrarTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarTenisActionPerformed
        Tenis ten = new Tenis();
        
        ten.setMarca(textMarca.getText());
        ten.setModelo(textModelo.getText());
        ten.setCor(textCor.getText());
        ten.setTamanho(textTamanho.getText());
        ten.setQuantidade(Integer.parseInt(textQuantidade.getText()));
        ten.setPreco(Float.parseFloat(textPreco.getText()));
        
        TenisDAO TDAO = new TenisDAO();
        
        TDAO.inserir(ten);

        PaginaAdm pAdm = new PaginaAdm();
        pAdm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botaoCadastrarTenisActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        PaginaAdm objPA = new PaginaAdm();
        objPA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTenis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarTenis;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmarTenis;
    private javax.swing.JTextArea campoTenis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTamanho;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCor;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textQuantidade;
    private javax.swing.JTextField textTamanho;
    // End of variables declaration//GEN-END:variables
}
