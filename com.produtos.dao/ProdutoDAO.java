public interface ProdutoDAO{
	public int insert(Produto produto);
	public int delete(int id);
	public int update(Produto produto);
	public Produto findById(int id);
	public List<Produto> getProdutos();
}