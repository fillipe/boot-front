package br.com.fill.samples.bootfront.bean;

public class Product {

	private Long id;
	private String nome;
	private Integer status;
	private Integer idFantasiaBasica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIdFantasiaBasica() {
		return idFantasiaBasica;
	}

	public void setIdFantasiaBasica(Integer idFantasiaBasica) {
		this.idFantasiaBasica = idFantasiaBasica;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nome=" + nome + ", status=" + status + ", idFantasiaBasica=" + idFantasiaBasica
				+ "]";
	}

}
