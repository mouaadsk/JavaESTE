package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import DBConnection.*;
import Classes.Clients;

public class ClientsDaoImpl implements ClientsDao {

	@Override
	public List<Clients> ListClients() throws SQLException {
		Connection conn = (Connection) ConnectionBd.GetConnecttion();
		List<Clients> clients = new ArrayList<>();

		String query = "SELECT *  FROM clients";
		PreparedStatement prs = (PreparedStatement) conn.prepareStatement(query);
		ResultSet rs = prs.executeQuery();

		while (rs.next()) {
			Clients client = new Clients();
			client.setId(rs.getInt("id"));
			client.setVersion(rs.getInt("version"));
			client.setTitre(rs.getString("titre"));
			client.setNom(rs.getString("nom"));
			client.setPrenom(rs.getString("prenom"));
			clients.add(client);
		}
		prs.close();
		return clients;
	}
	@Override
	public void addClient(Clients client) {
		Connection conn = (Connection) ConnectionBd.GetConnecttion();
		String query = "INSERT INTO Clients (id,version,titre,nom,prenom) VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pr = (PreparedStatement) conn.prepareStatement(query);
			pr.setInt(1, client.getId());
			pr.setInt(2, client.getVersion());
			pr.setString(3, client.getTitre());
			pr.setString(4, client.getNom());
			pr.setString(5, client.getPrenom());

			pr.executeUpdate();
			pr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Succefully added client !");
	}

	@Override
	public void DeleteClient(int id) {
		Connection conn = (Connection) ConnectionBd.GetConnecttion();
		String query = "delete from Clients where id=" + id;
		try {
			PreparedStatement pr = (PreparedStatement) conn.prepareStatement(query);
			pr.executeUpdate();
			pr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Client supprimer avec succ�s");
	}

}
