package hu.dt.utils;

public class MaxDiscountElement {
	String link = null;
	int diffPrice = 0;
	
	public MaxDiscountElement(String link, int diffPrice) {
		super();
		this.link = link;
		this.diffPrice = diffPrice;
	}
	public String getElement() {
		return link;
	}
	public void setElement(String link) {
		this.link = link;
	}
	public int getDiffPrice() {
		return diffPrice;
	}
	public void setDiffPrice(int diffPrice) {
		this.diffPrice = diffPrice;
	}
	@Override
	public String toString() {
		return "MaxDiscountElement [link=" + link + ", diffPrice=" + diffPrice + "]";
	}
	
	
}
