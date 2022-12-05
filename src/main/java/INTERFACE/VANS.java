/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFACE;

import DAO.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class VANS extends javax.swing.JFrame {

    /**
     * Creates new form telaMarca
     */
    public VANS() {
        initComponents();
        this.setTitle("VANS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vans3 = new javax.swing.JButton();
        vans2 = new javax.swing.JButton();
        vans1 = new javax.swing.JButton();
        botaoVANS = new javax.swing.JButton();
        botaoPUMA = new javax.swing.JButton();
        botaoADIDAS = new javax.swing.JButton();
        botaoCadastro = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        botaoCarrinho = new javax.swing.JButton();
        botaoNIKE = new javax.swing.JButton();
        botaoOcelot = new javax.swing.JButton();
        fundoMarca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setName("telaMarca"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        vans3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vans3.jpeg"))); // NOI18N
        vans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vans3ActionPerformed(evt);
            }
        });
        getContentPane().add(vans3);
        vans3.setBounds(810, 300, 350, 210);

        vans2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vans2.jpeg"))); // NOI18N
        vans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vans2ActionPerformed(evt);
            }
        });
        getContentPane().add(vans2);
        vans2.setBounds(420, 300, 350, 210);

        vans1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vans1.jpeg"))); // NOI18N
        vans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vans1ActionPerformed(evt);
            }
        });
        getContentPane().add(vans1);
        vans1.setBounds(30, 300, 350, 210);

        botaoVANS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PaginaVans.png"))); // NOI18N
        botaoVANS.setContentAreaFilled(false);
        botaoVANS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVANSActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVANS);
        botaoVANS.setBounds(790, 120, 370, 180);

        botaoPUMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puma-Logo.png"))); // NOI18N
        botaoPUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPUMAActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPUMA);
        botaoPUMA.setBounds(230, 20, 130, 70);

        botaoADIDAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adidas_Logo.svg.png"))); // NOI18N
        botaoADIDAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoADIDASActionPerformed(evt);
            }
        });
        getContentPane().add(botaoADIDAS);
        botaoADIDAS.setBounds(30, 20, 120, 70);

        botaoCadastro.setText("Cadastro");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastro);
        botaoCadastro.setBounds(1060, 570, 90, 40);

        botaoEntrar.setText("Login");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar);
        botaoEntrar.setBounds(1060, 520, 90, 40);

        botaoCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrinho.png"))); // NOI18N
        botaoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCarrinho);
        botaoCarrinho.setBounds(950, 530, 90, 70);

        botaoNIKE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Nike-Logo.png"))); // NOI18N
        botaoNIKE.setAutoscrolls(true);
        botaoNIKE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoNIKE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoNIKE.setMaximumSize(new java.awt.Dimension(100, 56));
        botaoNIKE.setMinimumSize(new java.awt.Dimension(100, 56));
        botaoNIKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNIKEActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNIKE);
        botaoNIKE.setBounds(440, 20, 130, 70);

        botaoOcelot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OFICIAL.jpeg"))); // NOI18N
        botaoOcelot.setBorder(null);
        botaoOcelot.setBorderPainted(false);
        botaoOcelot.setContentAreaFilled(false);
        botaoOcelot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOcelotActionPerformed(evt);
            }
        });
        getContentPane().add(botaoOcelot);
        botaoOcelot.setBounds(-100, 60, 990, 280);

        fundoMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        getContentPane().add(fundoMarca);
        fundoMarca.setBounds(0, -60, 1960, 1200);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoOcelotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOcelotActionPerformed
        PaginaCliente p1 = new PaginaCliente();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoOcelotActionPerformed

    private void botaoNIKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNIKEActionPerformed
        NIKE NIKE = new NIKE();
        NIKE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoNIKEActionPerformed

    private void botaoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarrinhoActionPerformed
        Carrinho car = new Carrinho();
        car.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCarrinhoActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        A1Login pEntrar = new A1Login();
        pEntrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        CadastroCliente pCadastro = new CadastroCliente();
        pCadastro.setVisible(true);
        this.dispose();

        }

        public void atualizar(){
            String nome;
            String nomenovo;

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome atual do usuario: ");
            nome = sc.nextLine();
            System.out.println("Digite o novo nome do usuario: ");
            nomenovo = sc.nextLine();

            //1: Definir o comando SQL
            String sql = "UPDATE tb_cadastro SET nomecompleto = ? WHERE nomecompleto = ?";

            //2: Abrir uma conexão
            ConexaoSQL SQL = new ConexaoSQL();
            try (Connection c = SQL.obtemConexao()){

                //3: Pré compila o comando
                PreparedStatement ps = c.prepareStatement(sql);

                //4: Preenche os dados faltantes
                ps.setString(1, nomenovo);
                ps.setString(2, nome);

                //5: Executa o comando
                ps.execute();
            }

            catch (Exception e){
                e.printStackTrace();
            }

        }

        public void listar(){
            String nome;
            String email;
            String senha;
            String Nascimento;
            String cpf;
            String telefone;
            String genero;
            String rua;
            String bairro;
            String complemento;
            String cidade;
            String estado;

            //1: Definir o comando SQL
            String sql = "SELECT * FROM tb_cadastro";

            //2: Abrir uma conexão
            ConexaoSQL SQL = new ConexaoSQL();

            try (Connection c = SQL.obtemConexao()){
                //3: Pré compila o comando
                PreparedStatement ps = c.prepareStatement(sql);

                //4: Executa o comando e guarda
                //o resultado em um ResultSet
                ResultSet rs = ps.executeQuery();

                //5: itera sobre o resultado
                while (rs.next()){
                    nome = rs.getString("nome");
                    email = rs.getString("email");
                    senha = rs.getString("senha");
                    Nascimento = rs.getString("Nascimento");
                    cpf = rs.getString("cpf");
                    telefone = rs.getString("telefone");
                    genero = rs.getString("genero");
                    rua = rs.getString("rua");
                    bairro = rs.getString("bairro");
                    complemento = rs.getString("complemento");
                    cidade = rs.getString("cidade");
                    estado = rs.getString("estado");

                    System.out.println("===========================");
                    System.out.println("Nome: " + nome);
                    System.out.println("Email: " + email);
                    System.out.println("Senha: " + senha);
                    System.out.println("Nascimento:"  + Nascimento);
                    System.out.println("cpf: " + cpf);
                    System.out.println("telefone: " + telefone);
                    System.out.println("genero: " + genero);
                    System.out.println("rua: " + rua);
                    System.out.println("bairro: " + bairro);
                    System.out.println("complemento: " + complemento);
                    System.out.println("Cidade: " + cidade);
                    System.out.println("estado: " + estado);
                    System.out.println("===========================");
                }
            }

            catch (Exception e){
                e.printStackTrace();
            }

        }

        public void apagar (){
            String nomecompleto;

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do usuario: ");
            nomecompleto = sc.nextLine();

            //1: Definir o comando SQL
            String sql = "DELETE FROM tb_cadastro WHERE nomecompleto = ?";

            //2: Abrir uma conexão
            ConexaoSQL SQL = new ConexaoSQL();

            try (Connection c = SQL.obtemConexao()){
                //3: Pré compila o comando
                PreparedStatement ps = c.prepareStatement(sql);

                //4: Preenche os dados faltantes
                ps.setString(1, nomecompleto);

                //5: Executa o comando
                ps.execute();
            }

            catch (Exception e){
                e.printStackTrace();
            }

            CadastroCliente pCadastro = new CadastroCliente();
            pCadastro.setVisible(true);
            this.dispose();

            A1Login pEntrar = new A1Login();
            pEntrar.setVisible(false);
            this.dispose();

    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoADIDASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoADIDASActionPerformed
        ADIDAS ADI = new ADIDAS ();
        ADI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoADIDASActionPerformed

    private void botaoPUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPUMAActionPerformed
        PUMA PUMA = new PUMA ();
        PUMA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoPUMAActionPerformed

    private void botaoVANSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVANSActionPerformed
        VANS VANS = new VANS();
        VANS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVANSActionPerformed

    private void vans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vans1ActionPerformed
        VansOldOnca voo = new VansOldOnca();
        voo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vans1ActionPerformed

    private void vans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vans2ActionPerformed
        VansOldFogo vof = new VansOldFogo();
        vof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vans2ActionPerformed

    private void vans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vans3ActionPerformed
        VansOldPreto vop = new VansOldPreto();
        vop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vans3ActionPerformed

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
            java.util.logging.Logger.getLogger(VANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VANS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VANS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoADIDAS;
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoCarrinho;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoNIKE;
    private javax.swing.JButton botaoOcelot;
    private javax.swing.JButton botaoPUMA;
    private javax.swing.JButton botaoVANS;
    private javax.swing.JLabel fundoMarca;
    private javax.swing.JButton vans1;
    private javax.swing.JButton vans2;
    private javax.swing.JButton vans3;
    // End of variables declaration//GEN-END:variables
}