package kr.co.kiosk.userDAO;

import kr.co.kiosk.vo.HamburgerVO;

public class OrderDAO {
	
	StorageDAO storageDAO = new StorageDAO();

	public void orderHambuger(HamburgerVO hamburgerVO) {
		updateIngredient();//햄버거를 만드는데 필요한 재료를 재고에서 감소시킨다.
		//...
	}
	
	/**	제작에 의한
	 * 	재료 감소(모두 소진x: available -> 1 유지, 수량변경)
	 * 	재료 감소(모두 소진O: available -> 0 변경, 수량 0 변경)
	 */
	private void updateIngredient() {
		//메뉴주문에 의한 재료 감소 update쿼리문. 재고에서 사용가능한 재료인지 검증하는 조건문 필요
	}
	
}
