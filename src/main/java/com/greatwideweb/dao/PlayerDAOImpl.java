package com.greatwideweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.greatwideweb.vo.Player;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PlayerDAOImpl implements PlayerDAO {

	private static final String LIST_PLAYERS_SQL = "select player_id, first_name, last_name, position from players";
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	   
	public List<Player> listPlayers() {
		List<Player> players = jdbcTemplateObject.query(LIST_PLAYERS_SQL, new ListPlayersMapper());
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
