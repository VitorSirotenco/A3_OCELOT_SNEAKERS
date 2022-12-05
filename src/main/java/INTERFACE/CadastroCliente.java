
package INTERFACE;

import DAO.ClienteDAO;
import DTO.Cliente;

public class CadastroCliente extends javax.swing.JFrame {

   
    public CadastroCliente() {
        initComponents();
        this.setTitle("CADASTRO");
        botaoCadastrar.setVisible(false);
        botaoConfirmar.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastrar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        labelNascimento = new javax.swing.JLabel();
        textNascimento = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        labelCpf = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        labelRua = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        textRua = new javax.swing.JTextField();
        textNumero = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        textBairro = new javax.swing.JTextField();
        labelComplemento = new javax.swing.JLabel();
        textComplemento = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoConfirmar = new javax.swing.JTextArea();
        textSenha = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        botaoConfirmar = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar);
        botaoCadastrar.setBounds(1050, 550, 107, 44);

        labelNome.setText("Nome completo:");
        getContentPane().add(labelNome);
        labelNome.setBounds(6, 42, 140, 26);

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        getContentPane().add(textNome);
        textNome.setBounds(132, 34, 281, 30);

        botaoCancelar.setText("CANCELAR");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(20, 550, 107, 47);

        labelNascimento.setText("Data de nascimento:");
        getContentPane().add(labelNascimento);
        labelNascimento.setBounds(6, 88, 150, 26);

        textNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(textNascimento);
        textNascimento.setBounds(132, 80, 280, 30);

        labelEmail.setText("E-mail:");
        getContentPane().add(labelEmail);
        labelEmail.setBounds(6, 263, 120, 20);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textEmail);
        textEmail.setBounds(132, 253, 280, 30);

        labelTelefone.setText("Telefone:");
        getContentPane().add(labelTelefone);
        labelTelefone.setBounds(6, 182, 120, 16);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(textTelefone);
        textTelefone.setBounds(132, 169, 281, 30);

        labelGenero.setText("Gênero:");
        getContentPane().add(labelGenero);
        labelGenero.setBounds(6, 221, 130, 20);

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros", "Prefiro não informar" }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(comboGenero);
        comboGenero.setBounds(132, 221, 141, 22);

        labelCpf.setText("CPF:");
        getContentPane().add(labelCpf);
        labelCpf.setBounds(6, 140, 110, 16);
        getContentPane().add(textCpf);
        textCpf.setBounds(132, 127, 281, 30);

        labelEndereco.setText("ENDEREÇO");
        getContentPane().add(labelEndereco);
        labelEndereco.setBounds(444, 6, 202, 16);

        labelRua.setText("Rua:");
        getContentPane().add(labelRua);
        labelRua.setBounds(444, 43, 110, 20);

        labelNumero.setText("Número:");
        getContentPane().add(labelNumero);
        labelNumero.setBounds(915, 45, 60, 16);
        getContentPane().add(textRua);
        textRua.setBounds(528, 40, 371, 30);

        textNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(textNumero);
        textNumero.setBounds(970, 40, 50, 20);

        labelBairro.setText("Bairro:");
        getContentPane().add(labelBairro);
        labelBairro.setBounds(444, 79, 110, 30);

        textBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBairroActionPerformed(evt);
            }
        });
        getContentPane().add(textBairro);
        textBairro.setBounds(529, 80, 370, 30);

        labelComplemento.setText("Complemento:");
        getContentPane().add(labelComplemento);
        labelComplemento.setBounds(444, 140, 110, 16);

        textComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(textComplemento);
        textComplemento.setBounds(529, 127, 370, 30);

        labelCidade.setText("Cidade:");
        getContentPane().add(labelCidade);
        labelCidade.setBounds(444, 182, 80, 16);

        textCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(textCidade);
        textCidade.setBounds(528, 169, 370, 30);

        labelEstado.setText("Estado:");
        getContentPane().add(labelEstado);
        labelEstado.setBounds(444, 221, 80, 16);

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        getContentPane().add(comboEstado);
        comboEstado.setBounds(529, 211, 370, 30);

        labelTitulo.setText("INFORMAÇÕES PESSOAIS");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(6, 6, 197, 16);

        campoConfirmar.setColumns(20);
        campoConfirmar.setRows(5);
        campoConfirmar.setText("CONFIRMAÇÃO DE DADOS:\n");
        jScrollPane1.setViewportView(campoConfirmar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 1150, 210);

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(textSenha);
        textSenha.setBounds(132, 293, 280, 30);

        labelSenha.setText("Senha:");
        getContentPane().add(labelSenha);
        labelSenha.setBounds(6, 306, 120, 16);

        botaoConfirmar.setText("CONFIRMAR");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoConfirmar);
        botaoConfirmar.setBounds(930, 550, 107, 44);

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Fullscreen.PNG"))); // NOI18N
        labelFundo.setText("jLabel3");
        getContentPane().add(labelFundo);
        labelFundo.setBounds(0, -4, 1240, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Cliente cli = new Cliente(); 
        
        
       
        cli.setNome( textNome.getText()); 
        cli.setNascimento(textNascimento.getText());
        cli.setCpf(textCpf.getText())  ;
        cli.setGenero(comboGenero.getSelectedItem().toString());
        cli.setTelefone(textTelefone.getText());
        cli.setRua (textRua.getText());
        cli.setNumero (textNumero.getText());
        cli.setBairro(textBairro.getText());
        cli.setComplemento(textComplemento.getText());
        cli.setCidade(textCidade.getText());
        cli.setEstado(comboEstado.getSelectedItem().toString());
        cli.setEmail(textEmail.getText());
        cli.setSenha(textSenha.getText());
        
        ClienteDAO CDAO = new ClienteDAO();
        
        CDAO.inserir(cli);
        
        A1Login pLogin = new A1Login ();
        pLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void textNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNascimentoActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        A1Login objLogin = new A1Login();
        objLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumeroActionPerformed

    private void textComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textComplementoActionPerformed

    private void textCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCidadeActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGeneroActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        botaoCadastrar.setVisible(true);
        
        String Nome;
        String Nascimento;
        String Cpf;
        String Email;
        String Telefone;
        String Genero;
        String Rua;
        String Numero;
        String Bairro;
        String Complemento;
        String Cidade;
        String Estado;
        String Senha;
       
        Nome = textNome.getText();
        Nascimento = textNascimento.getText();
        Cpf = textCpf.getText();
        Email = textEmail.getText();
        Telefone = textTelefone.getText();
        Rua = textRua.getText();
        Numero = textNumero.getText();
        Bairro = labelBairro.getText();
        Complemento = textComplemento.getText();
        Cidade = textCidade.getText();
        Senha = textSenha.getText();
        
        
        Genero = comboGenero.getSelectedItem().toString();
        Estado = comboEstado.getSelectedItem().toString();
        

        
        campoConfirmar.selectAll();
        campoConfirmar.replaceSelection("");
        
        campoConfirmar.append("=================================\n");
        campoConfirmar.append("Nome: "+ Nome + "\n");
        campoConfirmar.append("Data de nascimento: " + Nascimento + "\n" );
        campoConfirmar.append("CPF: "+ Cpf + "\n");
        campoConfirmar.append("Telefone: " + Telefone + "\n");
        campoConfirmar.append("Gênero: "+ Genero + "\n");
        campoConfirmar.append("Rua: " + Rua);
        campoConfirmar.append("    Número: "+ Numero + "\n");
        campoConfirmar.append("Bairro: "+ Bairro + "\n");
        campoConfirmar.append("Complemento: "+ Complemento + "\n");
        campoConfirmar.append("Cidade: " + Cidade + "\n");
        campoConfirmar.append("Estado: " + Estado + "\n");
        campoConfirmar.append("E-mail: " + Email + "\n");
        campoConfirmar.append("Senha: " + Senha + "\n" );
        campoConfirmar.append("================================\n");
        
        botaoCadastrar.setVisible(true);
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void textBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBairroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JTextArea campoConfirmar;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textBairro;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textComplemento;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNascimento;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textRua;
    private javax.swing.JTextField textSenha;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
