public class Produto{
	
	private String nome;
	private Double preco;
	private byte[] imagem;
	
	public Produto(){
		
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