package DAO;

import DTO.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Admin> lista = new ArrayList<>();

    public void inserir(Admin adm) {
        //1: Definir o comando SQL
        String sql = "INSERT INTO tb_adm(nome, nascimento, cpf, telefone, email, senha) VALUES (?, ?, ?, ?, ?, ?)";
        //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getNascimento());
            ps.setString(3, adm.getCpf());
            ps.setString(4, adm.getTelefone());
            ps.setString(5, adm.getEmail());
            ps.setString(6, adm.getSenha());
//5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public ResultSet autenticacaoAdmin(Admin objA) {
        conn = new ConexaoSQL().obtemConexao();

        try {
            String sql = "Select * from tb_adm where cpf = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objA.getCpf());
            pstm.setString(2, objA.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AutenticacaoAdmin: " + erro);
            return null;
        }
    }

    public ArrayList<Admin> ListarAdm() {
        String sql = "select * from tb_adm";

        conn = new ConexaoSQL().obtemConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Admin adm = new Admin();

                adm.setCodigo(rs.getInt("codigo"));
                adm.setNome(rs.getString("nome"));
                adm.setNascimento(rs.getString("nascimento"));
                adm.setCpf(rs.getString("cpf"));
                adm.setTelefone(rs.getString("telefone"));
                adm.setEmail(rs.getString("email"));
                adm.setSenha(rs.getString("senha"));

                lista.add(adm);
            }

        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "AdminDAO ListarAdm: " + erro);
        }
        return lista;
    }

    public void alterarAdm(Admin adm) {
        String sql = "update tb_adm set nome = ?, nascimento = ?, cpf = ?, telefone = ?, email = ?, senha = ? where codigo = ?";

        //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, adm.getNome());
            ps.setString(2, adm.getNascimento());
            ps.setString(3, adm.getCpf());
            ps.setString(4, adm.getTelefone());
            ps.setString(5, adm.getEmail());
            ps.setString(6, adm.getSenha());
            ps.setInt(7, adm.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarAdm" + erro);
        }

    }
    
    public void excluirAdm(Admin adm) {
        String sql = "delete from tb_adm where codigo = ?";
        
         //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes            
            ps.setInt(1, adm.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "excluirAdm: " + erro);
        }
    }
}
