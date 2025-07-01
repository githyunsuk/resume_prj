package kr.co.kiosk.vo;

import java.util.List;

/**
 * 햄버거 VO
 */
public class HamburgerVO {
	
	//private int idx; //햄버거 index, PK -> 필요없을거 같은데, 재료처럼 구분해서 리스트할 필요가 없으니까. 생성해서 주문idx에 합칠거잖아.   
	private Category category; //카테고리 (HAMBURGER("햄버거"))
	private int hamburgerIdx; //햄버거 제품별 고유번호 (이름과 목적이 겹치지만 )
	private String name; //햄버거 이름
	private String photo; //사진 
	private double weight; //중량 
	private int cal; //칼로리 (재료들 칼로리 모두 합하기)
	private int price; //가격 (재료들 가격+ @)
	private String description; //햄버거 설명 
	
	//private BreadVO breadVO; //빵 
//	private List<PattyVO> pattyList; //들어가는 패티 리스트
//	private List<VegetableVO> vegetableList; //들어가는 야채 리스트
	//private List<SourceVO> sourceList; //들어가는 소스 리스트 
	
	
}
