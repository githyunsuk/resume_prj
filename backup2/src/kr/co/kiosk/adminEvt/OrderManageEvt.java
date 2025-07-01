package kr.co.kiosk.adminEvt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import kr.co.kiosk.adminService.OrderManageService;
import kr.co.kiosk.adminView.OrderDetailView;
import kr.co.kiosk.adminView.OrderManageView;
import kr.co.kiosk.vo.TotalOrderVO;

public class OrderManageEvt extends WindowAdapter implements ActionListener, MouseListener {

	private OrderManageView omv;
	
	private OrderManageService oms;
	
	private OrderDetailView odv;
	
	public OrderManageEvt(OrderManageView omv) {
		this.omv = omv;
		this.oms = new OrderManageService();
		this.odv = omv.getOdv();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int selectedRowNum = omv.getJtblOrderStatus().getSelectedRow(); //첫번째=0
		
		if(selectedRowNum != -1) { //선택을 했을때만 
			String orderId = omv.getJtblOrderStatus().getValueAt(selectedRowNum, 0).toString();
			TotalOrderVO vo = new TotalOrderVO();
			vo = oms.getOrderVO(Integer.parseInt(orderId));
			
			omv.getOdv().getJtfOrderId().setText(String.valueOf(vo.getOrderId())); 
			omv.getOdv().getJtfOrderWaitingNum().setText(String.valueOf(vo.getOrderWaitingNumber()));
			omv.getOdv().getJtfOrderDate().setText(String.valueOf(vo.getOrderDateTime()));
			omv.getOdv().getJtfTakeOut().setText(String.valueOf(vo.getOrderType()));
			//omv.getOdv().getJtfMemberID().setText(String.valueOf(vo.getMemberId()));
			if(vo.getMemberId() != 0) {
				omv.getOdv().getJtfMemberID().setText(String.valueOf(vo.getMemberId()));
			} else {
				omv.getOdv().getJtfMemberID().setText("0(비회원)");
			}
			omv.getOdv().getJtfTotalPrice().setText(String.valueOf(vo.getPrice())); //총가격
			if (vo.getOrderStatus().equals("조리중"))  {		
				omv.getOdv().getBgMakingDone().clearSelection();
				omv.getOdv().getJrbMaking().setSelected(true);
			} if (vo.getOrderStatus().equals("조리완료")) {
				omv.getOdv().getBgMakingDone().clearSelection();
				omv.getOdv().getJrbDone().setSelected(true);
			}
			
			
			//상세메뉴 조회출력
			List<String[]> menuList = new ArrayList<String[]>();
			menuList = oms.nameNprice(Integer.parseInt(orderId));
			omv.getOdv().updateTable(menuList);
			
			
			
		} else {
			System.out.println("잘모된 index값 ");
		}
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == odv.getJbtnModify()) {
			
		}
		if(e.getSource() == odv.getJbtnDelete()) {
			
		}
		if(e.getSource() == odv.getJbtnNewList()) {
			System.out.println("새로고침 클릭 ");
			//List<TotalOrderVO> voList = oms.totalOrderVOList();
			//omv.updateTable(voList);
		}
		if(e.getSource() == odv.getJbtnGuitar()) {
			System.out.println("기타 클릭 ");
			JOptionPane.showMessageDialog(omv, "미구현 기능입니다.");
		}
		
	}

}
