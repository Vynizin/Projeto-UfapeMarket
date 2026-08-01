package br.edu.ufape.poo.UfapeMarket.negocio.basica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String emailInstitucional;
    private String senha;
    private LocalDate dataNascimento;
    private String curso;
    private String fotoPerfil;
    private String biografia;

    // Relacionamentos
    private List<Produto> produtos;
    private List<Notificacao> notificacoes;
    private List<Favorito> favoritos;

    // Construtor vazio
    public Usuario() {
        this.produtos = new ArrayList<>();
        this.notificacoes = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }

    // Construtor completo
    public Usuario(int id, String nome, String emailInstitucional, String senha,
                   LocalDate dataNascimento, String curso,
                   String fotoPerfil, String biografia) {

        this.id = id;
        this.nome = nome;
        this.emailInstitucional = emailInstitucional;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.fotoPerfil = fotoPerfil;
        this.biografia = biografia;

        this.produtos = new ArrayList<>();
        this.notificacoes = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }

    // ==========================
    // Métodos do diagrama
    // ==========================

    public void cadastrarPerfil() {
        System.out.println("Perfil cadastrado com sucesso!");
    }

    public void editarPerfil(String nome, String curso, String biografia, String fotoPerfil) {
        this.nome = nome;
        this.curso = curso;
        this.biografia = biografia;
        this.fotoPerfil = fotoPerfil;

        System.out.println("Perfil atualizado!");
    }

    public boolean fazerLogin(String email, String senha) {
        return this.emailInstitucional.equals(email)
                && this.senha.equals(senha);
    }

    public void favoritarProduto(Produto produto) {
        Favorito favorito = new Favorito();
        favorito.setUsuario(this);
        favorito.setProduto(produto);

        favoritos.add(favorito);

        System.out.println("Produto favoritado!");
    }

    // ==========================
    // Getters e Setters
    // ==========================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", emailInstitucional='" + emailInstitucional + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}