package kr.co.kiosk.vo;

/**
 * 카테고리 클래스는 Enum으로 
 */
public enum Category {

	HAMBURGER("햄버거"),
	BREAD("빵"),
	PATTY("패티"),
	VEGETABLE("야채"),
	SOURCE("소스"),
	SIDEMENU("사이드메뉴"),
	BEVERAGE("음료");
	
	private final String displayName;
	
	private Category(String displayName) {
		this.displayName = displayName;
	}
	
    public String getDisplayName() {
        return displayName;
    }
	
	
	
}
