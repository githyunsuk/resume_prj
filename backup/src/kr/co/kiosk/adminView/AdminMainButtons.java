package kr.co.kiosk.adminView;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminMainButtons extends JPanel {
	
	private JButton btnLogout;
	private JButton btnShutdown;
	
	private JButton btnOrder;
	private JButton btnMenu;
	private JButton btnFinancial;
	private JButton btnStock;
	private JButton btnMember;
	
	public AdminMainButtons() {
		
		setLayout(new GridLayout(2, 5));
		
		btnLogout = new JButton("로그아웃");
		btnShutdown = new JButton("운영 종료");
		
		btnOrder = new JButton("주문 관리");
		btnMenu = new  JButton("메뉴관리");
		btnFinancial = new  JButton("정산관리");
		btnStock = new  JButton("재고관리");
		btnMember = new  JButton("회원관리");
		
		//버튼 색, 크기 설정
		btnOrder.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnMenu.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnFinancial.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnStock.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnMember.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		add(btnLogout);
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(new JLabel(" "));
		add(btnShutdown);
		
		add(btnOrder);
		add(btnMenu);
		add(btnFinancial);
		add(btnStock);
		add(btnMember);
		
		
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}

	public JButton getBtnShutdown() {
		return btnShutdown;
	}

	public JButton getBtnOrder() {
		return btnOrder;
	}

	public JButton getBtnMenu() {
		return btnMenu;
	}

	public JButton getBtnFinancial() {
		return btnFinancial;
	}

	public JButton getBtnStock() {
		return btnStock;
	}

	public JButton getBtnMember() {
		return btnMember;
	}
	

}
