package kr.co.kiosk.vo;

import java.time.LocalDate;

/**
 * 메뉴의 부모님 Ingredient 클래스
 * 자식클래스: 빵, 패티, 야채, 소스, 사이드메뉴, 음료 
 */
public abstract class Ingredient {

	/**
	   	---Category---
	  	PATTY("패티"),
		VEGETABLE("야채"),
		HAMBURGER("햄버거"),
		SIDEMENU("사이드메뉴"),
		BEVERAGE("음료"),
		BREAD("빵"),
		SOURCE("소스");
	 */

	private int ingredientIdx; //PK;
	private Category category; //재료 카테고리
	private String productName; //상품 이름
	private int calorie; //칼로리
	//private LocalDate expirationDate; //유통기한 
	private String supplier; //공급업체 
	private int purchasePrice; //kg당 발주 구매가 
	//private int retailPrice; //1인분에 해당하는 소매가 -> 소매가 하나로만은 의미 없음(여러가지 값이 복합적으로 사용되어야 유의미)
	private int quantity; //수량
	private boolean available; //사용가능 or 재고소진으로인한 사용완료 값을 가진다. (보관중,사용완료), ('사용완료'는 리스트에 출력하지 않고, 재료 사용내역 통계에서 쓰일수도 있다)
	
	/**
	 * @param ingredientIdx
	 * @param category
	 * @param productName
	 * @param calorie
	 * @param supplier
	 * @param purchasePrice
	 * @param retailPrice
	 * @param quantity
	 * @param available : 메뉴 제작시, available 변수 검증을 통해 사용가능한 재료만 쓸수 있도록 구현해야 한다.
	 * 						0: 사용불가(재고소진), 1: 사용가능
	 */
	
	public Ingredient(int ingredientIdx, Category category, String productName, int calorie,
			String supplier, int purchasePrice, int retailPrice, int quantity, boolean available) {
		super();
		this.ingredientIdx = ingredientIdx;
		this.category = category;
		this.productName = productName;
		this.calorie = calorie;
		this.supplier = supplier;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
		this.available = available;
	}

	public int getIngredientIdx() {
		return ingredientIdx;
	}


	public void setIngredientIdx(int ingredientIdx) {
		this.ingredientIdx = ingredientIdx;
	}


	public String getCategory() {
		return category.getDisplayName();
	}


	public void setCategory(String category) {
		this.category = Enum.valueOf(Category.class, category);
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


	public int getPurchasePrice() {
		return purchasePrice;
	}


	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}



	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}

	
}
