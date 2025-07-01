package kr.co.kiosk.vo;

/**
 * 발주 신청시, 공급업체 가데이터 리스트를 뽑기위해 임의로 만든 공급업체VO 
 * 발주와 재고관리에서만 연관지어 사용되는 클래스  
 */
public class SupplierVO {

	private int supplyIdx; //공급index PK;
	private Category category; //재료 카테고리
	private String productName; //상품 이름
	private int calorie; //칼로리
	private String supplier; //공급업체 
	private int price; //kg당 판매가 
	
	//Join안쓰고 재료 데이터 통합관리 -> null 허용, 해당 여부에 따라 상품이름이 달라짐 
	//패티
	private boolean isVegan; //비건인지 여부 
	//음료
	private boolean isSugar; //제로슈가 여부
	//야채
	private boolean isOrganic; //유기농이니?
	//...
	
	public SupplierVO(int supplyIdx, Category category, String productName, int calorie, String supplier, int price,
			boolean isVegan, boolean isSugar, boolean isOrganic) {
		super();
		this.supplyIdx = supplyIdx;
		this.category = category;
		this.productName = productName;
		this.calorie = calorie;
		this.supplyIdx = supplyIdx;
		this.price = price;
		this.isVegan = isVegan;
		this.isSugar = isSugar;
		this.isOrganic = isOrganic;
	}
	public int getSupplyIdx() {
		return supplyIdx;
	}
	public void setSupplyIdx(int supplyIdx) {
		this.supplyIdx = supplyIdx;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isVegan() {
		return isVegan;
	}
	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
	public boolean isSugar() {
		return isSugar;
	}
	public void setSugar(boolean isSugar) {
		this.isSugar = isSugar;
	}
	public boolean isOrganic() {
		return isOrganic;
	}
	public void setOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}
	
	@Override
	public String toString() {
		return "SupplierVO [supplyIdx=" + supplyIdx + ", category=" + category + ", productName=" + productName
				+ ", calorie=" + calorie + ", supplier=" + supplier + ", price=" + price + ", isVegan=" + isVegan
				+ ", isSugar=" + isSugar + ", isOrganic=" + isOrganic + "]";
	}
	
}
