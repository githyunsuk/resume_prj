package kr.co.kiosk.vo;

import java.time.LocalDate;

/**
 * 음료VO
 */
public class BeverageVO extends Ingredient{
	
	private int ingredientIdx; //Ingredient 테이블의 IngredientIdx와 FK관계 
	private int beverageIdx; //음료 제품별 고유번호
	private boolean isSugar; //제로슈가 여부
	private String photo;
	
	public BeverageVO(int ingredientIdx, Category category, String productName, int calorie,
			String supplier, int purchasePrice, int retailPrice, int quantity, boolean available, int beverageIdx, boolean isSugar, String photo) {
		super(ingredientIdx, category, productName, calorie, supplier, purchasePrice, retailPrice,
				quantity, available);
		this.beverageIdx = beverageIdx;
		this.isSugar = isSugar;
		this.photo = photo;
	}

	public int getIngredientIdx() {
		return ingredientIdx;
	}

	public void setIngredientIdx(int ingredientIdx) {
		this.ingredientIdx = ingredientIdx;
	}

	public int getBeverageIdx() {
		return beverageIdx;
	}

	public void setBeverageIdx(int beverageIdx) {
		this.beverageIdx = beverageIdx;
	}

	public boolean isSugar() {
		return isSugar;
	}

	public void setSugar(boolean isSugar) {
		this.isSugar = isSugar;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
