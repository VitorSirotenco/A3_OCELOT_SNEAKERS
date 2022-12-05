package INTERFACE;

import DTO.Cliente;
import DAO.ClienteDAO;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class A1Login extends javax.swing.JFrame {


    public A1Login() {
        initComponents();
        this.setTitle("LOGIN");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastrar = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        botaoSouAdm = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        labelCpf = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        textSenha = new javax.swing.JPasswordField();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoCadastrar.setText("Cadastrar-se");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar);
        botaoCadastrar.setBounds(320, 410, 120, 40);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginLogo.png"))); // NOI18N
        getContentPane().add(labelLogo);
        labelLogo.setBounds(210, 20, 400, 140);

        labelLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelLogin.setText("FAÇA SEU LOGIN!");
        getContentPane().add(labelLogin);
        labelLogin.setBounds(280, 140, 220, 80);

        botaoSouAdm.setText("Sou Administrador");
        botaoSouAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSouAdmActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSouAdm);
        botaoSouAdm.setBounds(300, 490, 160, 23);

        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar);
        botaoEntrar.setBounds(320, 330, 120, 50);

        labelCpf.setText("CPF:");
        getContentPane().add(labelCpf);
        labelCpf.setBounds(210, 210, 90, 40);

        labelSenha.setText("Senha:");
        getContentPane().add(labelSenha);
        labelSenha.setBounds(210, 260, 90, 50);

        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });
        getContentPane().add(textCpf);
        textCpf.setBounds(290, 220, 191, 30);
        getContentPane().add(textSenha);
        textSenha.setBounds(290, 272, 190, 30);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Propaganda (1).PNG"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(-10, -8, 770, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        Logar();

    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed


    }//GEN-LAST:event_textCpfActionPerformed

    private void botaoSouAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSouAdmActionPerformed
        LoginAdm objLoginAdm = new LoginAdm();
        objLoginAdm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_botaoSouAdmActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        CadastroCliente pCadastro = new CadastroCliente();
        pCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(A1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A1Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new A1Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoSouAdm;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JTextField textCpf;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables

    private void Logar() {
        try {
            String cpf, senha;

            cpf = textCpf.getText();
            senha = textSenha.getText();

            Cliente objC = new Cliente();
            objC.setCpf(cpf);
            objC.setSenha(senha);

            ClienteDAO objCDAO = new ClienteDAO();
            ResultSet rsCDAO = objCDAO.autenticacaoCliente(objC);

            if (rsCDAO.next()) {
                //chamar tela que eu quero abrir
                PaginaCliente p1 = new PaginaCliente();
                p1.setVisible(true);

                dispose();
            } else {
                //enviar mensagem dizendo incorreto
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PaginaLoginCliente" + erro);

        }
    }
}
