package com.greatwideweb.dao;

import java.util.Map;

import javax.xml.stream.XMLStreamException;

import com.greatwideweb.xml.SQLParser;

public class SQLProvider {
	
	private static SQLProvider instance =null;
	private static Map<String, String> sqls;
	private SQLProvider() {}
	
	public static String getSQL(String keyField) throws XMLStreamException {
		if(instance == null) {
			SQLParser parser  = new SQLParser("db-sql.xml");
			sqls = parser.getSQLs();
		}
		return sqls.get(keyField);
	}
	
	

}
