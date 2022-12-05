/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACE;

import DAO.AdminDAO;
import DTO.Admin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class TabelaAdm extends javax.swing.JFrame {

    /**
     * Creates new form ListaAdm
     */
    public TabelaAdm() {
        initComponents();
        consultarTabelaAdm();
        this.setTitle("TABELA DE ADMINISTRADORES");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTelefone = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelNascimento = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textNome = new javax.swing.JTextField();
        textNascimento = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        textCpf = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textSenha = new javax.swing.JTextField();
        botaoPreencher = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAdm = new javax.swing.JTable();
        botaoCancelar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        labelTelefone.setText("Telefone:");
        getContentPane().add(labelTelefone);
        labelTelefone.setBounds(830, 100, 90, 50);

        labelCpf.setText("CPF:");
        getContentPane().add(labelCpf);
        labelCpf.setBounds(50, 250, 70, 50);

        labelCodigo.setText("Código:");
        getContentPane().add(labelCodigo);
        labelCodigo.setBounds(60, 70, 70, 40);

        labelNome.setText("Nome:");
        getContentPane().add(labelNome);
        labelNome.setBounds(60, 130, 70, 40);

        labelNascimento.setText("Data de nascimento:");
        getContentPane().add(labelNascimento);
        labelNascimento.setBounds(10, 190, 120, 50);

        labelEmail.setText("Email:");
        getContentPane().add(labelEmail);
        labelEmail.setBounds(850, 160, 70, 50);

        labelSenha.setText("Senha:");
        getContentPane().add(labelSenha);
        labelSenha.setBounds(850, 230, 70, 40);
        getContentPane().add(textCodigo);
        textCodigo.setBounds(120, 80, 50, 30);
        getContentPane().add(textNome);
        textNome.setBounds(120, 140, 170, 30);

        textNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(textNascimento);
        textNascimento.setBounds(120, 200, 170, 30);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(textTelefone);
        textTelefone.setBounds(920, 110, 170, 30);
        getContentPane().add(textCpf);
        textCpf.setBounds(120, 260, 170, 30);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textEmail);
        textEmail.setBounds(920, 170, 120, 30);

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(textSenha);
        textSenha.setBounds(920, 240, 120, 30);

        botaoPreencher.setText("Preencher");
        botaoPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPreencherActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPreencher);
        botaoPreencher.setBounds(180, 360, 120, 50);

        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(1030, 360, 120, 50);

        botaoAlterar.setText("ALTERAR");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterar);
        botaoAlterar.setBounds(880, 360, 120, 50);

        tabelaAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "codigo", "nome", "nascimento", "cpf", "telefone", "email", "senha"
            }
        ));
        tabelaAdm.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tabelaAdmVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAdm);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 420, 1120, 240);

        botaoCancelar.setText("VOLTAR");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(30, 360, 120, 50);

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        labelTitulo.setText("LISTA DE ADMINISTRADORES");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(200, -130, 830, 350);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        getContentPane().add(labelFundo);
        labelFundo.setBounds(-10, -60, 1910, 870);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        PaginaAdm objPA = new PaginaAdm();
        objPA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void tabelaAdmVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tabelaAdmVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaAdmVetoableChange

    private void textNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNascimentoActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    private void botaoPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPreencherActionPerformed
        preencherCampos();
    }//GEN-LAST:event_botaoPreencherActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        alterarAdm();
        consultarTabelaAdm();
        limparCampos();
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        preencherCampos();
        excluirAdm();
        consultarTabelaAdm();
        limparCampos();
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPreencher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tabelaAdm;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNascimento;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textSenha;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables

    private void consultarTabelaAdm() {
        try {
            AdminDAO ADAO = new AdminDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaAdm.getModel();
            model.setNumRows(0);

            ArrayList<Admin> lista = ADAO.ListarAdm();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCodigo(),
                    lista.get(num).getNome(),
                    lista.get(num).getNascimento(),
                    lista.get(num).getCpf(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getEmail(),
                    lista.get(num).getSenha()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showConfirmDialog(null, "ListarAdm: " + erro);
        }
    }

    private void preencherCampos() {
        int setar = tabelaAdm.getSelectedRow();

        textCodigo.setText(tabelaAdm.getModel().getValueAt(setar, 0).toString());
        textNome.setText(tabelaAdm.getModel().getValueAt(setar, 1).toString());
        textNascimento.setText(tabelaAdm.getModel().getValueAt(setar, 2).toString());
        textCpf.setText(tabelaAdm.getModel().getValueAt(setar, 3).toString());
        textTelefone.setText(tabelaAdm.getModel().getValueAt(setar, 4).toString());
        textEmail.setText(tabelaAdm.getModel().getValueAt(setar, 5).toString());
        textSenha.setText(tabelaAdm.getModel().getValueAt(setar, 6).toString());

    }

    private void alterarAdm() {
        int codigo;
        String nome;
        String nascimento;
        String cpf;
        String telefone;
        String email;
        String senha;
        
        codigo = Integer.parseInt(textCodigo.getText());
        nome = textNome.getText();
        nascimento = textNascimento.getText();
        cpf = textCpf.getText();
        telefone = textTelefone.getText();
        email = textEmail.getText();
        senha = textSenha.getText();
        
        Admin adm = new Admin();
        
        adm.setCodigo(codigo);
        adm.setNome(nome);
        adm.setNascimento(nascimento);
        adm.setCpf(cpf);
        adm.setTelefone(telefone);
        adm.setEmail(email);
        adm.setSenha(senha);
        
        AdminDAO ADAO = new AdminDAO();
        ADAO.alterarAdm(adm);
    }
    
    private void excluirAdm(){
        int codigo;
        
        codigo = Integer.parseInt(textCodigo.getText());
        
        Admin adm = new Admin();
        adm.setCodigo(codigo);
        
        AdminDAO ADAO = new AdminDAO();
        
        ADAO.excluirAdm(adm);
    }
    
    private void limparCampos(){
        textCodigo.setText("");
        textNome.setText("");
        textNascimento.setText("");
        textCpf.setText("");
        textTelefone.setText("");
        textEmail.setText("");
        textSenha.setText("");
    }

}
