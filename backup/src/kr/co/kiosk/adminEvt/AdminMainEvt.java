package kr.co.kiosk.adminEvt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.kiosk.adminView.AdminCenterPanel;
import kr.co.kiosk.adminView.AdminMainView;
import kr.co.kiosk.userView.MainPageView;

public class AdminMainEvt extends WindowAdapter implements ActionListener {
	
	private AdminCenterPanel acp;
	private AdminMainView amv;
	
	public AdminMainEvt(AdminMainView amv) {
		this.amv = amv;
		this.acp = new AdminCenterPanel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == amv.getAdminMainButtons().getBtnLogout()) {
			System.out.println("로그아웃 버튼 클릭");
			amv.dispose(); //해당창 종료 	
			new MainPageView().setVisible(true); //초기화면 이동 
		}
		
		if(e.getSource() == amv.getAdminMainButtons().getBtnShutdown()) {
			System.out.println("키오스크 종료");
			amv.dispose(); //JVM에는 아직 살아있는데, System.exit(0)을 쓸까 고민중 
		}
		
		if(e.getSource() == amv.getAdminMainButtons().getBtnOrder()) {
			System.out.println("주문관리 버튼 클릭");
			acp.showPanel("ORDER");
		}
		if(e.getSource() == amv.getAdminMainButtons().getBtnMenu()) {
			System.out.println("메뉴관리 버튼 클릭");
			acp.showPanel("MENU");
		}
		if(e.getSource() == amv.getAdminMainButtons().getBtnFinancial()) {
			System.out.println("정산관리 버튼 클릭");
			acp.showPanel("FINANCIAL");
		}
		if(e.getSource() == amv.getAdminMainButtons().getBtnStock()) {
			System.out.println("재고관리 버튼 클릭");
			acp.showPanel("STOCK");
		}
		
		

	}

}
