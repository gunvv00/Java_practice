package designSelf;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcMysql {
	public static void main(String[] args) {
		// 자바 프로그램을 작성하는데  mysql 접속 기능이 필요할 경우
		// mysql 의 java 라이브러리 를 검색해서 다운받는다.
		
		// mysql 접속
		// mysql 회사에서 여러개의 클래스로 접속 기능을 만들어서 
		// 제공한다. 
		// java에서는 여러개의 class 파일을 .jar파일로 압축해서 
		// 사용할 수 있도록 배포한다.
		//"oracle.jdbc.driver.OracleDriver";
		//"jdbc:oracle:thin:@211.183.0.199:1522:ORA9I";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		Connection con = null;
		try{
			Class.forName(driver); // 드라이버 로딩
			con = DriverManager.getConnection(url, "root", "st00");
		}catch(Exception e){
			System.out.println(e.getMessage());			
		}
		
	}

}
