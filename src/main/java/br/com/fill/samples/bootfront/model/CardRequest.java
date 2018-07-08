package br.com.fill.samples.bootfront.model;

public class CardRequest {

	private Long id;
	private CartaoEmbossingRequest cartaoEmbossingRequest;

	private String password;
	private String confirmPassword;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CartaoEmbossingRequest getCartaoEmbossingRequest() {
		return cartaoEmbossingRequest;
	}

	public void setCartaoEmbossingRequest(CartaoEmbossingRequest cartaoEmbossingRequest) {
		this.cartaoEmbossingRequest = cartaoEmbossingRequest;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "CardRequest [id=" + id + ", cartaoEmbossingRequest=" + cartaoEmbossingRequest + "]";
	}

}
