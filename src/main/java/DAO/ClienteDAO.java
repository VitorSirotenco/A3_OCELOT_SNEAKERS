package DAO;

import DTO.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList<>();
    
    public void inserir (Cliente cli){
//1: Definir o comando SQL
    String sql = "INSERT INTO tb_cliente(nome, nascimento, cpf, genero, telefone, rua, numero, bairro, complemento,cidade, estado, email, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//2: Abrir uma conexão
    ConexaoSQL factory = new ConexaoSQL();
        
    try (Connection c = factory.obtemConexao()){
//3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
//4: Preenche os dados faltantes
        ps.setString(1, cli.getNome());
        ps.setString(2, cli.getNascimento());
        ps.setString(3, cli.getCpf());
        ps.setString(4, cli.getGenero());
        ps.setString(5, cli.getTelefone());
        ps.setString(6, cli.getRua());
        ps.setString(7, cli.getNumero());
        ps.setString(8, cli.getBairro());
        ps.setString(9, cli.getComplemento());
        ps.setString(10, cli.getCidade());
        ps.setString(11, cli.getEstado());
        ps.setString(12, cli.getEmail());
        ps.setString(13, cli.getSenha());
//5: Executa o comando
        ps.execute();
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
    
    
    public ResultSet autenticacaoCliente(Cliente objC){
        conn = new ConexaoSQL().obtemConexao();
        
        try {
            String sql = "Select * from tb_cliente where cpf = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objC.getCpf());
            pstm.setString(2, objC.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ClienteDAO autenticacaoCliente: " + erro);
            return null;
        }
    }
    
    public ArrayList<Cliente> ListarCliente(){
        String sql = "select * from tb_cliente";
        
        conn = new ConexaoSQL().obtemConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Cliente cli = new Cliente();
                
                cli.setCodigo(rs.getInt("codigo"));
                cli.setNome(rs.getString("nome"));
                cli.setNascimento(rs.getString("nascimento"));
                cli.setCpf(rs.getString("cpf"));
                cli.setGenero(rs.getString("genero"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setRua(rs.getString("rua"));
                cli.setNumero(rs.getString("numero"));
                cli.setBairro(rs.getString("bairro"));
                cli.setComplemento(rs.getString("complemento"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEstado(rs.getString("estado"));
                cli.setEmail(rs.getString("email"));
                cli.setSenha(rs.getString("senha"));
                
                lista.add(cli);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null,"ClienteDAO ListarCliente: " + erro);
        }
        return lista;
    }
    
    public void alterarCliente(Cliente cli) {
        String sql = "update tb_cliente set nome = ?, nascimento = ?, cpf = ?, genero = ?, telefone = ?, rua = ?, numero = ?, bairro = ?, complemento = ?, cidade = ?, estado = ?, email = ?, senha = ? where codigo = ?";

        //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, cli.getNome());
            ps.setString(2, cli.getNascimento());
            ps.setString(3, cli.getCpf());
            ps.setString(4, cli.getGenero());
            ps.setString(5, cli.getTelefone());
            ps.setString(6, cli.getRua());
            ps.setString(7, cli.getNumero());
            ps.setString(8, cli.getBairro());
            ps.setString(9, cli.getComplemento());
            ps.setString(10, cli.getCidade());
            ps.setString(11, cli.getEstado());
            ps.setString(12, cli.getEmail());
            ps.setString(13, cli.getSenha());
            ps.setInt(14, cli.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarCliente" + erro);
        }

    }
    
    public void excluirCliente(Cliente cli) {
        String sql = "delete from tb_cliente where codigo = ?";
        
         //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes            
            ps.setInt(1, cli.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "excluirCliente: " + erro);
        }
    }
}
