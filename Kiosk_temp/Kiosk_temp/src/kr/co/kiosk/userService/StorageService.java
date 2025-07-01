package kr.co.kiosk.userService;

import kr.co.kiosk.userDAO.StorageDAO;

/**
 * 재료 리스트조회: 재고현황 클릭시
 * 재료 단일 품목 선택 조회: 검색으로 특정 품목의 재고현황 조회  
 * 재료 새로운 품목 생성: 관리자가 생성
 * 재료 업데이트: 유통기한에 따른 폐기 처리(Ingredient클래스의 available == false값 주기)  
 * 재료 소비: 메뉴 제작시(유통기한 WHERE문으로 검증해서 사용)  
 * 
 */
public class StorageService {
 
	StorageDAO storageDAO = new StorageDAO();
	/**
	private Map<String, Integer> ingredients;
	
	public StorageService() {
		this.ingredients = new HashMap<>();
	}
	 */
//메서드 생성
	
	//재료 입력(생성) : DB에 박아넣을까? 관리자가 넣을까?
	
	//재료 리스트 조회
	public void getIngredientList() {
		
	}
	 
	//카테고리 선택에 따른 품목 리스트 조회 
	public void getCategoryIngredientList() {
		
	}
	
	/**
	 * 재료이름 검색을 통해 해당 품목 리스트 조회
	 */
	//재료 단일 품목 상세조회
	public void getTheIngredientList() {
		
	}
	
	/**
	 * 관리자가 새로운 재료를 추가 
	 */
	public void createNewIngredient() {
		
	}
	
	/**
	 * 발주완료로 추가된 것 ()
	 */
	//재료 입고
	public void addIngredient() {
		
	}
	
	
}
