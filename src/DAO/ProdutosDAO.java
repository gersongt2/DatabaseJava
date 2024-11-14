package DAO;
import entity.Produtos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Conexao.Conexao;



public class ProdutosDAO {
		
	public void cadastrarProduto(Produtos produtos) {
		
			String sql= "insert into produtos (id, nome,preco,estoque,minestoque,id_fornecedor) values(?,?,?,?,?,?)";
			
			PreparedStatement ps = null;
			
			try {
				
				ps = Conexao.getConexao().prepareStatement(sql);
				ps.setString(1, produtos.getId());
				ps.setString(2, produtos.getNome());
				ps.setString(3, produtos.getPreco());
				ps.setString(4, produtos.getMinestoque());
				ps.setString(5, produtos.getEstoque());
				ps.setString(6, produtos.getId_fornecedor());
				
				
				ps.execute();
				ps.close();

			}catch (SQLException e){
				
				e.printStackTrace();
				
			}
	}
}
