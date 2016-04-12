package com.greatwideweb.vo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Team {
	
	private int teamId;
	private String location;
	private String name;
	
	public Team(int teamId, String location, String name) {
		this.teamId=teamId;
		this.location=location;
		this.name=name;
	}
	
	@Id
	@Column(name = "TEAM_ID", unique = true, nullable = false, precision = 5, scale = 0)
	public int getTeamId() {
		return this.teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	@Column(name = "LOCATION", nullable = false, length=50)
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name = "NAME", nullable = false, length=50)
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
