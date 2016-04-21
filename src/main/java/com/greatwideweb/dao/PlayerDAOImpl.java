package com.greatwideweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.xml.stream.XMLStreamException;

import com.greatwideweb.vo.Player;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PlayerDAOImpl implements PlayerDAO {

	public static final String LIST_PLAYERS_SQL = "LIST_PLAYERS_SQL";
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private final String listPlayersSQL;
	
	public PlayerDAOImpl() throws XMLStreamException {
		listPlayersSQL= SQLProvider.getSQL(LIST_PLAYERS_SQL);
	}
	
	public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
	  this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	   
	public List<Player> listAllPlayers() {
		List<Player> players = jdbcTemplateObject.query(listPlayersSQL, new ListPlayersMapper());
		return players;
	}
	
	private class ListPlayersMapper implements RowMapper<Player> {

		public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
			Player p = new Player();
			p.setFirstName(rs.getString("first_name"));
			p.setLastName(rs.getString("last_name"));
			p.setPlayerId(rs.getLong("player_id"));
			p.setPosition(rs.getString("position"));
			return p;
		}
		
	}

}
