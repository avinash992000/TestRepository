package day14;

public class Basket {
	private long manufactureNo;
	private int quantity;
	
	Basket(){
		
	}
	public Basket(long manufactureNo,int quantity) {
		this.manufactureNo = manufactureNo;
		this.quantity = quantity;
	}
	public long getManufactureNo() {
		return manufactureNo;
	}
	public void setManufactureNo(long manufactureNo) {
		this.manufactureNo = manufactureNo;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Basket [manufactureNo=" + manufactureNo + ", quantity=" + quantity + "]";
	}
	

}
