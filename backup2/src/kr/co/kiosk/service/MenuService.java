package kr.co.kiosk.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import kr.co.kiosk.dao.MenuDAO;
import kr.co.kiosk.vo.MenuVO;

public class MenuService {

	public MenuService() {
		
	}//MenuService
	
	public boolean addMenu(MenuVO mVO) {
		boolean flag = false;
		MenuDAO mDAO = MenuDAO.getInstance();
		
		try {
			mDAO.insertMenu(mVO);
			
			System.out.println("---------mVO.getMenuId()------- "+mVO.getMenuId());
			
			flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}//addMenu
	
	public boolean modifyMenu(MenuVO mVO) {
		boolean flag = false;
		
		MenuDAO mDAO = MenuDAO.getInstance();
		try {
			flag = mDAO.updateMenu(mVO) == 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}//modifyMenu
	
	public boolean removeMenu(int menuId) {
		boolean flag = false;
		
		MenuDAO mDAO = MenuDAO.getInstance();
		try {
			flag = mDAO.deleteMenu(menuId) == 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}//removeMenu
	
	public List<MenuVO> searchAllMenu(){
		List<MenuVO> list = null;
		
		MenuDAO mDAO = MenuDAO.getInstance();
		try {
			list = mDAO.selectAllMenu();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}//searchAllMenu
	
	public MenuVO searchMenu(int menuId) {
		MenuVO mVO = null;
		
		MenuDAO mDAO = MenuDAO.getInstance();
		try {
			mVO = mDAO.selectMenu(menuId);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mVO;
	}//searchMenu
	
	public MenuVO searchMenuWithName(String menuName) {
		MenuVO mVO = null;
		MenuDAO mDAO = MenuDAO.getInstance();
		try {
			mVO = mDAO.selectMenuWithName(menuName);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mVO;
				
	}//searchMenuWithName
	
}//class
