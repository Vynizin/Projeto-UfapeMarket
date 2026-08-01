package br.edu.ufape.poo.UfapeMarket.negocio.basica;

import jakarta.persistence.*;

@Entity
public class Produto {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private Usuario vendedor;
}
