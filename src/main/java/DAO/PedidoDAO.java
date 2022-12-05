package DAO;

import DTO.Cliente;
import DTO.Pedido;
import DTO.Tenis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Pedido> lista = new ArrayList<>();
    
    public void inserir(Cliente cli, Tenis ten, Pedido ped) {
        
        String sql = "INSERT INTO tb_pedido(codigo, cpf, marca, modelo, cor, tamanho, quantidade, preco, pagamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        ConexaoSQL factory = new ConexaoSQL();
        
        try ( Connection c = factory.obtemConexao()) {
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, ped.getCodigo());
            ps.setString(2, cli.getCpf());
            ps.setString(3, ten.getMarca());
            ps.setString(4, ten.getModelo());
            ps.setString(5, ten.getCor());
            ps.setString(6, ten.getTamanho());
            ps.setInt(7, ped.getQuantidade());
            ps.setFloat(8, ten.getPreco());
            ps.setString(9, ped.getPagamento());

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    public ArrayList<Pedido> listarPedido(){
        String sql = "select * from tb_pedido";
        
        conn = new ConexaoSQL().obtemConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Pedido ped = new Pedido();
                
                ped.setCodigo(rs.getInt("codigo"));
                ped.setCpf(rs.getString("cpf"));
                ped.setMarca(rs.getString("marca"));
                ped.setModelo(rs.getString("modelo"));
                ped.setCor(rs.getString("cor"));
                ped.setTamanho(rs.getString("tamanho"));
                ped.setQuantidade(rs.getInt("quantidade"));
                ped.setPreco(rs.getFloat("preco"));
                ped.setPagamento(rs.getString("pagamento"));
                
                
                lista.add(ped);
            }
            
            } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null,"ListarPedido: " + erro);
        }
        return lista;
    }
    
    public void alterarPedido(Pedido ped) {
        String sql = "update tb_pedido set cpf = ?, marca = ?, modelo = ?, cor = ?, tamanho = ?, quantidade = ?, preco = ?, pagamento = ? where codigo = ?";

        //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, ped.getCpf());
            ps.setString(2, ped.getMarca());
            ps.setString(3, ped.getModelo());
            ps.setString(4, ped.getCor());
            ps.setString(5, ped.getTamanho());
            ps.setInt(6, ped.getQuantidade());
            ps.setFloat(7, ped.getPreco());
            ps.setString(8, ped.getPagamento());
            ps.setInt(9, ped.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarPedido: " + erro);
        }

    }
    
    public void excluirPedido(Pedido ped) {
        String sql = "delete from tb_pedido where codigo = ?";
        
         //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes            
            ps.setInt(1, ped.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "excluirPedido: " + erro);
        }
    }
    
}
