package kr.co.kiosk.userEvt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class InputPhonenumberEvt extends WindowAdapter implements ActionListener {
	private InputPhonenumberView ipv;

	public InputPhonenumberEvt(InputPhonenumberView ipv) {
		this.ipv = ipv;
	}// InputPhonenumberEvt

	@Override
	public void windowClosing(WindowEvent e) {
		ipv.dispose();
	}// windowClosing

	public void openStampView() {

	}// openStampView

	public void openUsePiontView() {

	}// openUsePointView

	public boolean chkLength(String result) {
		if (result.length() > 11) {
			JOptionPane.showMessageDialog(null, "전화번호는 11자입니다");
			return false;
		}
		return true;
	}

	public boolean chk010(String result) {
		if (result.length() == 3 && !result.equals("010")) {
			JOptionPane.showMessageDialog(null, "전화번호는 010으로 시작해야 합니다");
			ipv.getJtfPhoneNumber().setText("");
			return false;
		}
		return true;
	}

	public void inputNumber(int number) {
		String result = ipv.getJtfPhoneNumber().getText();
		if (result.equals("휴대폰 번호를 입력해주세요")) {
			result = "";
		} // end if

		if (!(chkLength(result))) return;
		if(!(chk010(result))) return;

		ipv.getJtfPhoneNumber().setText(result + number);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {
			if (e.getSource() == ipv.getArrNumpad()[i]) {
				inputNumber(i);
				break;
			}
		}
	}

}
