package br.com.fill.samples.bootfront.model;

public class Phone {

	private Integer idTipoTelefone;
	private String ddd;
	private String telefone;
	private String ramal;

	public Integer getIdTipoTelefone() {
		return idTipoTelefone;
	}

	public void setIdTipoTelefone(Integer idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		return "Phone [idTipoTelefone=" + idTipoTelefone + ", ddd=" + ddd + ", telefone=" + telefone + ", ramal="
				+ ramal + "]";
	}

}
