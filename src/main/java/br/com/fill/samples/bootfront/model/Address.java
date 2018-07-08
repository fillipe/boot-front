package br.com.fill.samples.bootfront.model;

public class Address {

	private Integer idTipoEndereco;
	private String cep;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String pontoReferencia;
	private String bairro;
	private String cidade;
	private String uf;
	private String pais;
	private boolean enderecoCorrespondencia;

	public Integer getIdTipoEndereco() {
		return idTipoEndereco;
	}

	public void setIdTipoEndereco(Integer idTipoEndereco) {
		this.idTipoEndereco = idTipoEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public boolean isEnderecoCorrespondencia() {
		return enderecoCorrespondencia;
	}

	public void setEnderecoCorrespondencia(boolean enderecoCorrespondencia) {
		this.enderecoCorrespondencia = enderecoCorrespondencia;
	}

	@Override
	public String toString() {
		return "Address [idTipoEndereco=" + idTipoEndereco + ", cep=" + cep + ", logradouro=" + logradouro + ", numero="
				+ numero + ", complemento=" + complemento + ", pontoReferencia=" + pontoReferencia + ", bairro="
				+ bairro + ", cidade=" + cidade + ", uf=" + uf + ", pais=" + pais + ", enderecoCorrespondencia="
				+ enderecoCorrespondencia + "]";
	}

}
