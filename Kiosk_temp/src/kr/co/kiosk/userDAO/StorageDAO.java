package kr.co.kiosk.userDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kr.co.kiosk.vo.Ingredient;

public class StorageDAO {
	
	//재고현황 List조회 (available 값이 2(재료소진)인 데이터는 제외)
	public List<Ingredient> selectAllIngredientList() throws SQLException {
		List<Ingredient> list = new ArrayList<Ingredient>();
		
		//DB연결
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection conn=null;//DBMS와 연결 유지, auto commit 설정, 쿼리문 생성객체 얻기.
		Statement stmt=null;//쿼리문을 실행하는
		ResultSet rs=null;//cursor의 제어권을 받기, DBMS 데이터형을 Java의 데이터형으로 변환
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id="scott";
		String pass="tiger";
		
		try {
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			
			StringBuilder selectList = new StringBuilder();
			selectList
			.append("SELECT ?,?,? ... ")
			.append("FROM ???");
			
			/**
			 * ResultSet 객체는 JDBC(Java Database Connectivity)에서 
			 * 쿼리 실행 결과를 가져오는 데 사용되며, 
			 * getInt(), getString() 같은 메서드를 통해 
			 * 열(column)의 데이터를 가져올 수 있습니다.
			 */
			rs = stmt.executeQuery(selectList.toString());
			
			//Ingredient ingredient; -> 바꾸자 
			while (rs.next()) {
//				ingredient = new Ingredient();
//				ingredient.setCategory(rs.getString("category"));
//				ingredient.setProductName(rs.getString("productName"));
//				ingredient.setCalorie(rs.getInt("calorie"));
//				ingredient.setExpirationDate(LocalDate.parse(rs.getString("expirationDate")));
//				ingredient.setSupplier(rs.getString("supplier"));
//				ingredient.setPurchasePrice(rs.getInt("purchasePrice"));
//				ingredient.setRetailPrice(rs.getInt("retailPrice"));
//				ingredient.setQuantity(rs.getInt("quantity"));
//				
//				list.add(ingredient);
			}
			
		} finally {
			if(rs !=null) {rs.close();}
			if(stmt !=null) {stmt.close();}
			if(conn !=null) {conn.close();}
		}
		return list;
	}
	
	//재료 단일품목 조회(available 값이 2(재료소진)인 데이터는 제외)
	public void selectOneIngredient() {
		
	}
	

	//재료 입고(발주완료) : insert(유통기한때문에 기존재료에 update하는건 안됨) (available -> 0)
	public void stockUpIngredient() {
		 
	}
	
	//재료 감소(유통기한 지남 : available -> 0)
	public void discardIngredient() {
		
	}

	/**
	 * 아래 두개쿼리는 OrderDAO로 이동 
	 
	//재료 감소(제작에 의한 : available -> 1 유지, 수량변경)
	public void updateIngredient() {
		
	}
	
	//재료 감소, 모두 소진(available -> 0, 수량 0)
	public void exhaustIngredient() {
		
	}
	*/
	
	
}
