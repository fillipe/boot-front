package br.com.fill.samples.bootfront.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class ClientPF {

	private String nome;
	private String nomeMae;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataNascimento;
	
	private String sexo;
	private String cpf;
	private String numeroIdentidade;
	private String orgaoExpedidorIdentidade;
	private String unidadeFederativaIdentidade;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataEmissaoIdentidade;
	
	private Integer idEstadoCivil;
	private String idProfissao;
	private Integer idNaturezaOcupacao;
	private Integer idNacionalidade;
	private Integer idOrigemComercial;
	private Integer idProduto;
	private Integer numeroAgencia;
	private String numeroContaCorrente;
	private String email;
	private Integer diaVencimento;
	private String nomeImpresso;
	private String nomeEmpresa;
	private String canalEntrada;
	private Integer valorPontuacao;
	
	@NumberFormat(pattern = "#,###,###,###.##")
	private BigDecimal valorRenda;
	
	@NumberFormat(pattern = "#,###,###,###.##")
	private BigDecimal limiteGlobal;
	
	@NumberFormat(pattern = "#,###,###,###.##")
	private BigDecimal limiteMaximo;
	
	@NumberFormat(pattern = "#,###,###,###.##")
	private BigDecimal limiteParcelas;
	
	@NumberFormat(pattern = "#,###,###,###.##")
	private BigDecimal limiteConsignado;
	
	private List<Phone> telefones = new ArrayList<>();

	private List<Address> enderecos = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroIdentidade() {
		return numeroIdentidade;
	}

	public void setNumeroIdentidade(String numeroIdentidade) {
		this.numeroIdentidade = numeroIdentidade;
	}

	public String getOrgaoExpedidorIdentidade() {
		return orgaoExpedidorIdentidade;
	}

	public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
		this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
	}

	public String getUnidadeFederativaIdentidade() {
		return unidadeFederativaIdentidade;
	}

	public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
		this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
	}

	public LocalDate getDataEmissaoIdentidade() {
		return dataEmissaoIdentidade;
	}

	public void setDataEmissaoIdentidade(LocalDate dataEmissaoIdentidade) {
		this.dataEmissaoIdentidade = dataEmissaoIdentidade;
	}

	public Integer getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(Integer idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(String idProfissao) {
		this.idProfissao = idProfissao;
	}

	public Integer getIdNaturezaOcupacao() {
		return idNaturezaOcupacao;
	}

	public void setIdNaturezaOcupacao(Integer idNaturezaOcupacao) {
		this.idNaturezaOcupacao = idNaturezaOcupacao;
	}

	public Integer getIdNacionalidade() {
		return idNacionalidade;
	}

	public void setIdNacionalidade(Integer idNacionalidade) {
		this.idNacionalidade = idNacionalidade;
	}

	public Integer getIdOrigemComercial() {
		return idOrigemComercial;
	}

	public void setIdOrigemComercial(Integer idOrigemComercial) {
		this.idOrigemComercial = idOrigemComercial;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(Integer diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public String getNomeImpresso() {
		return nomeImpresso;
	}

	public void setNomeImpresso(String nomeImpresso) {
		this.nomeImpresso = nomeImpresso;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public BigDecimal getValorRenda() {
		return valorRenda;
	}

	public void setValorRenda(BigDecimal valorRenda) {
		this.valorRenda = valorRenda;
	}

	public String getCanalEntrada() {
		return canalEntrada;
	}

	public void setCanalEntrada(String canalEntrada) {
		this.canalEntrada = canalEntrada;
	}

	public Integer getValorPontuacao() {
		return valorPontuacao;
	}

	public void setValorPontuacao(Integer valorPontuacao) {
		this.valorPontuacao = valorPontuacao;
	}

	public List<Phone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Phone> telefones) {
		this.telefones = telefones;
	}

	public List<Address> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Address> enderecos) {
		this.enderecos = enderecos;
	}

	public BigDecimal getLimiteGlobal() {
		return limiteGlobal;
	}

	public void setLimiteGlobal(BigDecimal limiteGlobal) {
		this.limiteGlobal = limiteGlobal;
	}

	public BigDecimal getLimiteMaximo() {
		return limiteMaximo;
	}

	public void setLimiteMaximo(BigDecimal limiteMaximo) {
		this.limiteMaximo = limiteMaximo;
	}

	public BigDecimal getLimiteParcelas() {
		return limiteParcelas;
	}

	public void setLimiteParcelas(BigDecimal limiteParcelas) {
		this.limiteParcelas = limiteParcelas;
	}

	public BigDecimal getLimiteConsignado() {
		return limiteConsignado;
	}

	public void setLimiteConsignado(BigDecimal limiteConsignado) {
		this.limiteConsignado = limiteConsignado;
	}

	@Override
	public String toString() {
		return "ClientPF [nome=" + nome + ", nomeMae=" + nomeMae + ", dataNascimento=" + dataNascimento + ", sexo="
				+ sexo + ", cpf=" + cpf + ", numeroIdentidade=" + numeroIdentidade + ", orgaoExpedidorIdentidade="
				+ orgaoExpedidorIdentidade + ", unidadeFederativaIdentidade=" + unidadeFederativaIdentidade
				+ ", dataEmissaoIdentidade=" + dataEmissaoIdentidade + ", idEstadoCivil=" + idEstadoCivil
				+ ", idProfissao=" + idProfissao + ", idNaturezaOcupacao=" + idNaturezaOcupacao + ", idNacionalidade="
				+ idNacionalidade + ", idOrigemComercial=" + idOrigemComercial + ", idProduto=" + idProduto
				+ ", numeroAgencia=" + numeroAgencia + ", numeroContaCorrente=" + numeroContaCorrente + ", email="
				+ email + ", diaVencimento=" + diaVencimento + ", nomeImpresso=" + nomeImpresso + ", nomeEmpresa="
				+ nomeEmpresa + ", valorRenda=" + valorRenda + ", canalEntrada=" + canalEntrada + ", valorPontuacao="
				+ valorPontuacao + ", telefones=" + telefones + ", enderecos=" + enderecos + ", limiteGlobal="
				+ limiteGlobal + ", limiteMaximo=" + limiteMaximo + ", limiteParcelas=" + limiteParcelas
				+ ", limiteConsignado=" + limiteConsignado + "]";
	}

}
