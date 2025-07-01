package kr.co.kiosk.userEvt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.kiosk.adminView.AdminMainView;
import kr.co.kiosk.dao.MenuDAO;
import kr.co.kiosk.userView.MainPageView;
import kr.co.kiosk.userView.UserMainView;
import kr.co.kiosk.vo.MenuVO;

public class MainPageEvt extends WindowAdapter implements ActionListener {

	private MainPageView mpv;
	private boolean isHall; //매장식사인지 포장주문인지 판단하는 flag 변수

	public MainPageEvt(MainPageView mpv) {
		this.mpv = mpv;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		mpv.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == mpv.getBtnAdminView()) { // 관리자모드 버튼 클릭시
			mpv.dispose();
			new AdminMainView().setVisible(true);
		}

		if (e.getSource() == mpv.getBtnHall()) { // 매장식사 버튼 클릭시
			isHall = true;
			new UserMainView(isHall);
			mpv.dispose();
		}

		if (e.getSource() == mpv.getBtnTakeout()) { // 포장주문 버튼 클릭시
			isHall = false;
			new UserMainView(isHall);
			mpv.dispose();
		}
	}

	public boolean isHall() {
		return isHall;
	}

}
