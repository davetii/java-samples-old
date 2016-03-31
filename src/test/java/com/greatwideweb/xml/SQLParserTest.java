package com.greatwideweb.xml;

import java.util.Map;

import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Test;

import com.greatwideweb.dao.PlayerDAOImpl;

public class SQLParserTest {
	
	@Test
	public void ensureSQLParserIsCorrect() throws XMLStreamException {
		
		SQLParser parser = new SQLParser("test.xml");
		Map<String, String> m = parser.getSQLs();
		Assert.assertNotNull(m);
		Assert.assertEquals(4, m.keySet().size());
		Assert.assertEquals("Entry0", m.get("SQL_0"));
	}
	
	@Test
	public void ensureSQLParserIsCorrect2() throws XMLStreamException {
		
		SQLParser parser = new SQLParser("db-sql.xml");
		Map<String, String> m = parser.getSQLs();
		Assert.assertNotNull(m);
		Assert.assertEquals(1, m.keySet().size());
	}

}
