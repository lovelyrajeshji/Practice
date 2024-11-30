package snippet;

public class Snippet {
	 public void createTable(Connection con) throws SQLException {
		  String url = "create table Employee(id int,name varchar(30))";
		  Statement s = con.createStatement();
		  s.execute(url);
		  System.out.println("table created");
	  }
}

