public interface ProdutoDAO{
	public void insert(Produto produto);
	public void delete(Produto produto);
	public void update(Produto produto);
	public Produto getProduto();
	public List<Produto> getProdutos();
}