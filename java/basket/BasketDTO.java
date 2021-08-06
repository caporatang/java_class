package basket;
public class BasketDTO {
	String ProductNum;
	String ProductId;
	int basketId;
	int Amount;
	int ProductPrice;
	String ProductName;
	public String getProductNum() {
		return ProductNum;
	}
	public void setProductNum(String productNum) {
		ProductNum = productNum;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	@Override
	public String toString() {
		return "BasketDTO [ProductNum=" + ProductNum + ", ProductId=" + ProductId + ", basketId=" + basketId
				+ ", Amount=" + Amount + ", ProductPrice=" + ProductPrice + ", ProductName=" + ProductName + "]";
	}
}
