package INTERFACE;

public class PaginaAdm extends javax.swing.JFrame {
    
    
    public PaginaAdm() {
        initComponents();
        this.setTitle("PAGINA DO ADMINISTRADOR");
        
        
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastrarAdm = new javax.swing.JButton();
        botaoGerenciarAdm = new javax.swing.JButton();
        botaoGerenciarEstoque = new javax.swing.JButton();
        botaoCadastrarTenis = new javax.swing.JButton();
        botaoGerenciarClientes = new javax.swing.JButton();
        botaoGerenciarPedidos = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        botaoOcelot = new javax.swing.JButton();
        fundoGeral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(null);

        botaoCadastrarAdm.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botaoCadastrarAdm.setText("CADASTRAR UM ADM");
        botaoCadastrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarAdmActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrarAdm);
        botaoCadastrarAdm.setBounds(20, 310, 350, 120);

        botaoGerenciarAdm.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botaoGerenciarAdm.setText("GERENCIAR ADMs");
        botaoGerenciarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarAdmActionPerformed(evt);
            }
        });
        getContentPane().add(botaoGerenciarAdm);
        botaoGerenciarAdm.setBounds(410, 310, 350, 120);

        botaoGerenciarEstoque.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoGerenciarEstoque.setText("GERENCIAR ESTOQUE");
        botaoGerenciarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(botaoGerenciarEstoque);
        botaoGerenciarEstoque.setBounds(800, 310, 360, 120);

        botaoCadastrarTenis.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        botaoCadastrarTenis.setText("CADASTRAR TÊNIS");
        botaoCadastrarTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarTenisActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrarTenis);
        botaoCadastrarTenis.setBounds(20, 450, 350, 120);

        botaoGerenciarClientes.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botaoGerenciarClientes.setText("GERENCIAR CLIENTES");
        botaoGerenciarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoGerenciarClientes);
        botaoGerenciarClientes.setBounds(410, 450, 350, 120);

        botaoGerenciarPedidos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botaoGerenciarPedidos.setText("GERENCIAR PEDIDOS");
        botaoGerenciarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoGerenciarPedidos);
        botaoGerenciarPedidos.setBounds(800, 450, 360, 120);

        labelTitulo.setFont(new java.awt.Font("Arial Black", 1, 65)); // NOI18N
        labelTitulo.setText("ADMINISTRAÇÃO");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(320, 150, 710, 180);

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
        botaoOcelot.setBounds(130, -30, 990, 280);

        fundoGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        fundoGeral.setAlignmentY(0.0F);
        fundoGeral.setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().add(fundoGeral);
        fundoGeral.setBounds(-20, 0, 1950, 1080);

        setSize(new java.awt.Dimension(1216, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void botaoOcelotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOcelotActionPerformed
        PaginaAdm p1 = new PaginaAdm();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoOcelotActionPerformed

    private void botaoCadastrarTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarTenisActionPerformed
        CadastroTenis objCT = new CadastroTenis();
        objCT.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarTenisActionPerformed

    private void botaoGerenciarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarEstoqueActionPerformed
        TabelaTenis tt = new TabelaTenis();
        tt.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_botaoGerenciarEstoqueActionPerformed

    private void botaoCadastrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarAdmActionPerformed
        CadastroAdm objCA = new CadastroAdm();
        objCA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarAdmActionPerformed

    private void botaoGerenciarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarAdmActionPerformed
        TabelaAdm LA = new TabelaAdm();
        LA.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_botaoGerenciarAdmActionPerformed

    private void botaoGerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarClientesActionPerformed
        TabelaCliente tc = new TabelaCliente();
        tc.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_botaoGerenciarClientesActionPerformed

    private void botaoGerenciarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarPedidosActionPerformed
        TabelaPedido tp = new TabelaPedido();
        
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoGerenciarPedidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PaginaAdm janela = new PaginaAdm();
            janela.setDefaultCloseOperation(PaginaAdm.EXIT_ON_CLOSE);
            janela.setSize(1600, 900);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarAdm;
    private javax.swing.JButton botaoCadastrarTenis;
    private javax.swing.JButton botaoGerenciarAdm;
    private javax.swing.JButton botaoGerenciarClientes;
    private javax.swing.JButton botaoGerenciarEstoque;
    private javax.swing.JButton botaoGerenciarPedidos;
    private javax.swing.JButton botaoOcelot;
    private javax.swing.JLabel fundoGeral;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
