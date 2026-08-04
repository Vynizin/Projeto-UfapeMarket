package br.edu.ufape.poo.UfapeMarket.negocio.basica;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Produto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
    private String nome;
    private String descricaoProduto;
    private String fotoProduto;
    private double preco;
    private boolean disponivel;
    private int quantidadeDisponivel;
    private String turnoDisponibilidade;
    private String formasPagamento;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
	
    
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private Usuario vendedor;
		
	@ManyToMany(mappedBy = "produto")
    private List<Venda> vendas;

	public Produto(long id, String nome, String descricaoProduto, String fotoProduto, double preco, boolean disponivel,
			int quantidadeDisponivel, String turnoDisponibilidade, String formasPagamento, Categoria categoria,
			Usuario vendedor, Venda venda) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricaoProduto = descricaoProduto;
		this.fotoProduto = fotoProduto;
		this.preco = preco;
		this.disponivel = disponivel;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.turnoDisponibilidade = turnoDisponibilidade;
		this.formasPagamento = formasPagamento;
		this.categoria = categoria;
		this.vendedor = vendedor;
		this.vendas = (List<Venda>) venda;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getFotoProduto() {
		return fotoProduto;
	}

	public void setFotoProduto(String fotoProduto) {
		this.fotoProduto = fotoProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public String getTurnoDisponibilidade() {
		return turnoDisponibilidade;
	}

	public void setTurnoDisponibilidade(String turnoDisponibilidade) {
		this.turnoDisponibilidade = turnoDisponibilidade;
	}

	public String getFormasPagamento() {
		return formasPagamento;
	}

	public void setFormasPagamento(String formasPagamento) {
		this.formasPagamento = formasPagamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	
}
