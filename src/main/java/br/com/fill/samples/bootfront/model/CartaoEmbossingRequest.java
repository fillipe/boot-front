package br.com.fill.samples.bootfront.model;

public class CartaoEmbossingRequest {

	private Integer id_pessoa;
	private Integer id_tipo_plastico;

	public Integer getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Integer id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public Integer getId_tipo_plastico() {
		return id_tipo_plastico;
	}

	public void setId_tipo_plastico(Integer id_tipo_plastico) {
		this.id_tipo_plastico = id_tipo_plastico;
	}

	@Override
	public String toString() {
		return "CartaoEmbossingRequest [id_pessoa=" + id_pessoa + ", id_tipo_plastico=" + id_tipo_plastico + "]";
	}

}
