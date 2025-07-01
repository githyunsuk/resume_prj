package kr.co.kiosk.vo;

import java.time.LocalDateTime;

/**
 *	발주 상태 VO
 */
public class PurchaseOrderVO {

	private int pOrderIdx; //발주 신청내역index PK
	private int supplyIdx; //공급index FK;
	private int quantity; //주문 수량
	private LocalDateTime pOrderTime; //발주 신청일
	private String status; //대기중(취소가능), 접수완료, 발송됨, 도착완료(storageService에서 추가메서드 실행 ) 
	
	public PurchaseOrderVO(int pOrderIdx, int supplyIdx, int quantity, LocalDateTime pOrderTime, String status) {
		super();
		this.pOrderIdx = pOrderIdx;
		this.supplyIdx = supplyIdx;
		this.quantity = quantity;
		this.pOrderTime = pOrderTime;
		this.status = status;
	}

	public int getpOrderIdx() {
		return pOrderIdx;
	}

	public void setpOrderIdx(int pOrderIdx) {
		this.pOrderIdx = pOrderIdx;
	}

	public int getSupplyIdx() {
		return supplyIdx;
	}

	public void setSupplyIdx(int supplyIdx) {
		this.supplyIdx = supplyIdx;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getpOrderTime() {
		return pOrderTime;
	}

	public void setpOrderTime(LocalDateTime pOrderTime) {
		this.pOrderTime = pOrderTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PurchaseOrderVO [pOrderIdx=" + pOrderIdx + ", supplyIdx=" + supplyIdx + ", quantity=" + quantity
				+ ", pOrderTime=" + pOrderTime + ", status=" + status + "]";
	}
	
}
