
package INTERFACE;

import DAO.ConexaoSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class PaginaCliente extends javax.swing.JFrame {
    
    
    public PaginaCliente() {
        initComponents();
        this.setTitle("OCELOT SNKS");
        
        
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSobreNos = new javax.swing.JButton();
        botaoCarrinho = new javax.swing.JButton();
        botaoLogin = new javax.swing.JButton();
        botaoCadastro = new javax.swing.JButton();
        botaoNIKE = new javax.swing.JButton();
        botaoADIDAS = new javax.swing.JButton();
        botaoPUMA = new javax.swing.JButton();
        botaoVANS = new javax.swing.JButton();
        botaoOcelot = new javax.swing.JButton();
        nike2 = new javax.swing.JButton();
        adidas3 = new javax.swing.JButton();
        puma1 = new javax.swing.JButton();
        fundoGeral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        botaoSobreNos.setText("SOBRE NÓS!");
        botaoSobreNos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreNosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSobreNos);
        botaoSobreNos.setBounds(20, 590, 140, 60);

        botaoCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrinho.png"))); // NOI18N
        botaoCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCarrinho);
        botaoCarrinho.setBounds(1070, 40, 90, 70);

        botaoLogin.setText("Login");
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLogin);
        botaoLogin.setBounds(1070, 120, 90, 40);

        botaoCadastro.setText("Cadastro");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastro);
        botaoCadastro.setBounds(1070, 170, 90, 40);

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
        botaoNIKE.setBounds(230, 260, 120, 70);

        botaoADIDAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adidas_Logo.svg.png"))); // NOI18N
        botaoADIDAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoADIDASActionPerformed(evt);
            }
        });
        getContentPane().add(botaoADIDAS);
        botaoADIDAS.setBounds(420, 260, 120, 70);

        botaoPUMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Puma-Logo.png"))); // NOI18N
        botaoPUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPUMAActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPUMA);
        botaoPUMA.setBounds(630, 260, 120, 70);

        botaoVANS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vans-Logo-1966_presente-removebg-preview.png"))); // NOI18N
        botaoVANS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVANSActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVANS);
        botaoVANS.setBounds(840, 260, 120, 70);

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
        botaoOcelot.setBounds(100, 0, 990, 280);

        nike2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nike2.jpeg"))); // NOI18N
        nike2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nike2ActionPerformed(evt);
            }
        });
        getContentPane().add(nike2);
        nike2.setBounds(20, 360, 350, 210);

        adidas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adidas3.jpeg"))); // NOI18N
        adidas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adidas3ActionPerformed(evt);
            }
        });
        getContentPane().add(adidas3);
        adidas3.setBounds(420, 360, 350, 210);

        puma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puma1.jpg"))); // NOI18N
        puma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puma1ActionPerformed(evt);
            }
        });
        getContentPane().add(puma1);
        puma1.setBounds(810, 360, 350, 210);

        fundoGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        fundoGeral.setAlignmentY(0.0F);
        fundoGeral.setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().add(fundoGeral);
        fundoGeral.setBounds(-10, 0, 1920, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        A1Login objLogin = new A1Login();
        objLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void botaoNIKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNIKEActionPerformed
        NIKE NIKE = new NIKE();
        NIKE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoNIKEActionPerformed

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

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void botaoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarrinhoActionPerformed
        Carrinho car = new Carrinho();
        car.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCarrinhoActionPerformed

    private void botaoOcelotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOcelotActionPerformed
        PaginaCliente p1 = new PaginaCliente();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoOcelotActionPerformed

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

    private void botaoSobreNosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreNosActionPerformed
        SobreNos objSN = new SobreNos();
        objSN.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_botaoSobreNosActionPerformed

    private void nike2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nike2ActionPerformed
        NikeJordan1 j = new NikeJordan1();
        j.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nike2ActionPerformed

    private void adidas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adidas3ActionPerformed
        AdidasNMD objNMD = new AdidasNMD();
        objNMD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adidas3ActionPerformed

    private void puma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puma1ActionPerformed
        PumaSuede ps = new PumaSuede();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_puma1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PaginaCliente janela = new PaginaCliente();
            janela.setDefaultCloseOperation(PaginaCliente.EXIT_ON_CLOSE);
            janela.setSize(1600, 900);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adidas3;
    private javax.swing.JButton botaoADIDAS;
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoCarrinho;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoNIKE;
    private javax.swing.JButton botaoOcelot;
    private javax.swing.JButton botaoPUMA;
    private javax.swing.JButton botaoSobreNos;
    private javax.swing.JButton botaoVANS;
    private javax.swing.JLabel fundoGeral;
    private javax.swing.JButton nike2;
    private javax.swing.JButton puma1;
    // End of variables declaration//GEN-END:variables
}
