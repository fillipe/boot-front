package br.com.fill.samples.bootfront.model;

import java.util.Date;

public class CartaoEmbossingResponse {

	private Integer flagVirtual;
	private Integer idConta;
	private Integer idPessoa;
	private Integer idCartao;
	private Integer idBandeira;
	private Integer idTipoCartao;
	private Date dataGeracao;
	private Date dataValidade;
	private String nomeOrigemComercial;
	private String cpf;

	public Integer getFlagVirtual() {
		return flagVirtual;
	}

	public void setFlagVirtual(Integer flagVirtual) {
		this.flagVirtual = flagVirtual;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Integer getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(Integer idCartao) {
		this.idCartao = idCartao;
	}

	public Integer getIdBandeira() {
		return idBandeira;
	}

	public void setIdBandeira(Integer idBandeira) {
		this.idBandeira = idBandeira;
	}

	public Integer getIdTipoCartao() {
		return idTipoCartao;
	}

	public void setIdTipoCartao(Integer idTipoCartao) {
		this.idTipoCartao = idTipoCartao;
	}

	public Date getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getNomeOrigemComercial() {
		return nomeOrigemComercial;
	}

	public void setNomeOrigemComercial(String nomeOrigemComercial) {
		this.nomeOrigemComercial = nomeOrigemComercial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "CartaoEmbossingResponse [flagVirtual=" + flagVirtual + ", idConta=" + idConta + ", idPessoa=" + idPessoa
				+ ", idCartao=" + idCartao + ", idBandeira=" + idBandeira + ", idTipoCartao=" + idTipoCartao
				+ ", dataGeracao=" + dataGeracao + ", dataValidade=" + dataValidade + ", nomeOrigemComercial="
				+ nomeOrigemComercial + ", cpf=" + cpf + "]";
	}

}
