package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB implements DAO<Stuffy>{
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/stuffy";
		String uname = "stuffy_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbURL,uname,pwd);
		return conn;
	}

	@Override
	public Stuffy get(int i) {
		Stuffy s = null;
		String sql = "SELECT * from Stuffy WHERE ID = ?";
		try (Connection connection = getConnection();
			 PreparedStatement ps = connection.prepareStatement(sql);
			 ) {
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				s = getStuffyFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			s = null;
		}
			 
		return s;

	}

	private Stuffy getStuffyFromResultSet(ResultSet rs) throws SQLException {
		Stuffy s;
		int id = rs.getInt(1);
		String type = rs.getString(2);
		String color = rs.getString(3);
		String size = rs.getString(4);
		int limbs = rs.getInt(5);
		s = new Stuffy(id, type, color, size, limbs);
		return s;
	}

	@Override
	public List<Stuffy> getAll() {
		List<Stuffy> stuffies = new ArrayList<>();
		String sql = "SELECT * from Stuffy";
		try (Connection connection = getConnection();
			 PreparedStatement ps = connection.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Stuffy s = getStuffyFromResultSet(rs);
				stuffies.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			stuffies = null;
		}
			 
		return stuffies;
	}

	@Override
	public boolean add(Stuffy s) {
		boolean success = false;
		String sql = "INSERT INTO Stuffy values (?, ?, ?, ?, ?)";
		try (Connection connection = getConnection();
			 PreparedStatement ps = connection.prepareStatement(sql);) {
			ps.setInt(1, s.getId());
			ps.setString(2, s.getType());
			ps.setString(3, s.getColor());
			ps.setString(4, s.getSize());			
			ps.setInt(5, s.getLimbs());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			success = false;
		}
		
		return success;
	}

	@Override
	public boolean update(Stuffy t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Stuffy t) {
		// TODO Auto-generated method stub
		return false;
	}

}
