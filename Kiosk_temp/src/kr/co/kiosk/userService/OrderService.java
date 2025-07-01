package kr.co.kiosk.userService;

import kr.co.kiosk.userDAO.OrderDAO;
import kr.co.kiosk.vo.HamburgerVO;

/**
 * 주문서비스 클래스
 * 주문에 의한 해당 메뉴의 재료소비 DAO도 함께 호출해야함에 주의
 */
public class OrderService {
	
	OrderDAO orderDAO = new OrderDAO();
	
	//햄버거 주문
	public void orderHambuger(HamburgerVO hamburgerVO) {
		orderDAO.orderHambuger(hamburgerVO);
	} 
	
	//사이드메뉴 주문	
	
	//음료주문
	
	//세트메뉴(햄버거+사이드메뉴+음료)
	
	
}
