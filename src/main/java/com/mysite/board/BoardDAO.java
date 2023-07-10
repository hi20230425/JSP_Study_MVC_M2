package com.mysite.board;

import java.sql.*;

public class BoardDAO {
	
	//DAO : Repository (JPA) , DataBase를 직접 접근 하는 객체 
		// Insert / Update / Delete / Select  <== 쿼리가 저장되어 직접 DB접근 자바 객체 
	
	//사용할 변수 선언 : private 
		// Connection, PreparedStatement, ResultSet  <== java.sql.* 
	private Connection conn = null ; 
	private PreparedStatement pstmt = null; 
	private ResultSet rs = null; 
	
	//SQL 쿼리를 상수로 정의후에 각각 필요한 메소드에서 사용  
	private final String BOARD_INSERT = 
			"insert into board (seq,title,writer,content) values ((select nvl(max(seq),0) + 1 from board), ?,?,?)"; 
	private final String BOARD_UPDATE = ""; 
	private final String BOARD_DELETE = ""; 
	private final String BOARD_GET = ""; 
	private final String BOARD_LIST = ""; 
	
	
	
	
	
	
	
	
	

}
