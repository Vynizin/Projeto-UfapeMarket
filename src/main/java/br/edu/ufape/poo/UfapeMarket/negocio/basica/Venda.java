package br.edu.ufape.poo.UfapeMarket.negocio.basica;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity 

public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate dataVenda;
	private int quantidadeVendida;
	
	@ManyToMany
    @JoinTable(
        name = "venda_produto",
        joinColumns = @JoinColumn(name = "venda_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produto;

	public Venda(long id, LocalDate dataVenda, int quantidadeVendida, Produto produto) {
		super();
		this.id = id;
		this.dataVenda = dataVenda;
		this.quantidadeVendida = quantidadeVendida;
		this.produto = (List<Produto>) produto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	

}
