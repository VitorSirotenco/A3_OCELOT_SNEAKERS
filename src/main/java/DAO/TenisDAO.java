package DAO;

import DTO.Tenis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TenisDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Tenis> lista = new ArrayList<>();

    public void inserir(Tenis ten) {
//1: Definir o comando SQL
        String sql = "INSERT INTO tb_tenis(codigo, marca, modelo, cor, tamanho, quantidade, preco) VALUES (?, ?, ?, ?, ?, ?, ?)";
//2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();

        try ( Connection c = factory.obtemConexao()) {
//3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
//4: Preenche os dados faltantes
            ps.setInt(1, ten.getCodigo());
            ps.setString(2, ten.getMarca());
            ps.setString(3, ten.getModelo());
            ps.setString(4, ten.getCor());
            ps.setString(5, ten.getTamanho());
            ps.setInt(6, ten.getQuantidade());
            ps.setFloat(7, ten.getPreco());
//5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Tenis> ListarTenis(){
        String sql = "select * from tb_tenis";
        
        conn = new ConexaoSQL().obtemConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Tenis ten = new Tenis();
                
                ten.setCodigo(rs.getInt("codigo"));
                ten.setMarca(rs.getString("marca"));
                ten.setModelo(rs.getString("modelo"));
                ten.setCor(rs.getString("cor"));
                ten.setTamanho(rs.getString("tamanho"));
                ten.setQuantidade(rs.getInt("quantidade"));
                ten.setPreco(rs.getFloat("preco"));
                
                
                lista.add(ten);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null,"AdminDAO ListarAdm: " + erro);
        }
        return lista;
    }
    
    public void alterarTenis(Tenis ten) {
        String sql = "update tb_tenis set marca = ?, modelo = ?, cor = ?, tamanho = ?, quantidade = ?, preco = ? where codigo = ?";

        //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes
            ps.setString(1, ten.getMarca());
            ps.setString(2, ten.getModelo());
            ps.setString(3, ten.getCor());
            ps.setString(4, ten.getTamanho());
            ps.setInt(5, ten.getQuantidade());
            ps.setFloat(6, ten.getPreco());
            ps.setInt(7, ten.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarTenis: " + erro);
        }

    }
    
    public void excluirTenis(Tenis ten) {
        String sql = "delete from tb_tenis where codigo = ?";
        
         //2: Abrir uma conexão
        ConexaoSQL factory = new ConexaoSQL();
        try ( Connection c = factory.obtemConexao()) {
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            //4: Preenche os dados faltantes            
            ps.setInt(1, ten.getCodigo());
            //5: Executa o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "excluirTenis: " + erro);
        }
    }
    
    
    }
    

