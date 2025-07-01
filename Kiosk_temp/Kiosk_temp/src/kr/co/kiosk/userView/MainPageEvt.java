package kr.co.kiosk.userView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import kr.co.kiosk.adminView.AdminMainView;

public class MainPageEvt extends WindowAdapter implements ActionListener {

	private MainPageView mpv;
	
	public MainPageEvt(MainPageView mpv) {
		this.mpv = mpv;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == mpv.getBtnAdminView()) {
			System.out.println("관리자모드 버튼 클릭 : AdminMainView 실행");
			mpv.dispose(); //기존창 종료
			new AdminMainView().setVisible(true); //AdminMainView 실행 
		}
		
	}

}
