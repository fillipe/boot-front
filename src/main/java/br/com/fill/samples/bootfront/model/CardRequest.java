package br.com.fill.samples.bootfront.model;

public class CardRequest {

	private Long id;
	private CartaoEmbossingRequest cartaoEmbossingRequest;

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

	@Override
	public String toString() {
		return "CardRequest [id=" + id + ", cartaoEmbossingRequest=" + cartaoEmbossingRequest + "]";
	}

}
