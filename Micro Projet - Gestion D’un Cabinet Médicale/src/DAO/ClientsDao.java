package DAO;

import java.sql.SQLException;
import java.util.List;

import Classes.Clients;

public interface ClientsDao {
	public List<Clients> ListClients() throws SQLException;

	public void addClient(Clients client);

	public void DeleteClient(int id);
}
