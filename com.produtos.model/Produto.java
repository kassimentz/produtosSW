public class Produto{
	
	private Integer id;
	private String nome;
	private Double preco;
	private byte[] imagem;
	
	public Produto(){
		
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Double getPreco(){
		return preco;
	}
	
	public void setPreco(Double preco){
		this.preco = preco;
	}
	
	public byte[] getImagem(){
		return imagem;
	}
	
	public void setImagem(byte[] imagem){
		this.imagem = imagem;
	}
}