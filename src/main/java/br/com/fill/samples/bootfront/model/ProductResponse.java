package br.com.fill.samples.bootfront.model;

import java.util.List;

public class ProductResponse {

	private Integer number;
	private Integer size;
	private Integer totalPages;
	private Integer numberOfElements;
	private Integer totalElements;
	private Boolean firstPage;
	private Boolean hasPreviousPage;
	private Boolean hasNextPage;
	private Boolean hasContent;
	private Boolean first;
	private Boolean last;
	private Integer nextPage;
	private Integer previousPage;

	private List<Product> content;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Boolean getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(Boolean firstPage) {
		this.firstPage = firstPage;
	}

	public Boolean getHasPreviousPage() {
		return hasPreviousPage;
	}

	public void setHasPreviousPage(Boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public Boolean getHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public Boolean getHasContent() {
		return hasContent;
	}

	public void setHasContent(Boolean hasContent) {
		this.hasContent = hasContent;
	}

	public Boolean getFirst() {
		return first;
	}

	public void setFirst(Boolean first) {
		this.first = first;
	}

	public Boolean getLast() {
		return last;
	}

	public void setLast(Boolean last) {
		this.last = last;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(Integer previousPage) {
		this.previousPage = previousPage;
	}

	public List<Product> getContent() {
		return content;
	}

	public void setContent(List<Product> content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ProductResponse [number=" + number + ", size=" + size + ", totalPages=" + totalPages
				+ ", numberOfElements=" + numberOfElements + ", totalElements=" + totalElements + ", firstPage="
				+ firstPage + ", hasPreviousPage=" + hasPreviousPage + ", hasNextPage=" + hasNextPage + ", hasContent="
				+ hasContent + ", first=" + first + ", last=" + last + ", nextPage=" + nextPage + ", previousPage="
				+ previousPage + ", content=" + content + "]";
	}

}
