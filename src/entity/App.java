package entity;

import DAO.ProdutosDAO;

public class App {

	public static void main(String[]args) throws Exception {
		
		Produtos u = new Produtos();
		
		u.setId("");
		u.setEstoque("");
		u.setId_fornecedor("");
		u.setMinestoque("");
		u.setNome("");
		u.setPreco("");
		
		new ProdutosDAO().cadastrarProduto(u);
	}
}
