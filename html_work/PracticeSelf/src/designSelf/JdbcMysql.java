package designSelf;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcMysql {
	public static void main(String[] args) {
		// �ڹ� ���α׷��� �ۼ��ϴµ�  mysql ���� ����� �ʿ��� ���
		// mysql �� java ���̺귯�� �� �˻��ؼ� �ٿ�޴´�.
		
		// mysql ����
		// mysql ȸ�翡�� �������� Ŭ������ ���� ����� ���� 
		// �����Ѵ�. 
		// java������ �������� class ������ .jar���Ϸ� �����ؼ� 
		// ����� �� �ֵ��� �����Ѵ�.
		//"oracle.jdbc.driver.OracleDriver";
		//"jdbc:oracle:thin:@211.183.0.199:1522:ORA9I";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test";
		Connection con = null;
		try{
			Class.forName(driver); // ����̹� �ε�
			con = DriverManager.getConnection(url, "root", "st00");
		}catch(Exception e){
			System.out.println(e.getMessage());			
		}
		
	}

}