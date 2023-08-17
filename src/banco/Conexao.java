package banco;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
	public static Connection getConexao() {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String user = prop.getProperty("banco.user");
			final String password = prop.getProperty("banco.password");
		
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/configProperties/conexao.properties";

		prop.load(Conexao.class.getResourceAsStream(caminho));
		
		return prop;
	}
}
