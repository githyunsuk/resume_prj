package kr.co.kiosk.vo;

import java.time.LocalDate;

/**
 * 빵VO
 */
public class BreadVO extends Ingredient {

	public BreadVO(int ingredientIdx, Category category, String productName, int calorie,
			String supplier, int purchasePrice, int retailPrice, int quantity, boolean available) {
		super(ingredientIdx, category, productName, calorie, supplier, purchasePrice, retailPrice, quantity, available);
	}


}
