package by.htp.run;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://db4free.net:3306/mydatabasevic?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
				"victoria", "vica110493")) {

			System.out.println(connection);
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(
					"SELECT * FROM book INNER JOIN publisher\r\n" + "ON book.id_publisher = publisher.id_publisher");
			while (resultSet.next()) {
				int x = resultSet.getInt("id_book");
				String s = resultSet.getString("title");
				int f = resultSet.getInt("id_publisher");
				String s2 = resultSet.getString("publisher.title");
				String adr = resultSet.getString("adress");
				System.out.println(x + " " + s + " " + f + " " + s2 + " " + adr);
				System.out.println();
			}

			PreparedStatement ps = connection.prepareStatement("select title from publisher where phone = ?");
			ps.setString(1, "123");
			ResultSet resultSet2 = ps.executeQuery();
			while (resultSet2.next()) {

				String s = resultSet2.getString("title");

				System.out.println("title: " + s);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
