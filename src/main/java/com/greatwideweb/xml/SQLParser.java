package com.greatwideweb.xml;

import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class SQLParser {

	private HashMap<String, String> sqls = new HashMap<String, String>();
	public SQLParser(String xmlFileOnClassPath) throws XMLStreamException {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		factory.setProperty("javax.xml.stream.isCoalescing", true); 
		XMLStreamReader reader = factory.createXMLStreamReader(ClassLoader.getSystemResourceAsStream(xmlFileOnClassPath), "UTF8");
		String tagContent=null;
		String keyName=null;
		
		
		while(reader.hasNext()){
			int event = reader.next();
			switch (event) {
			case XMLStreamConstants.START_DOCUMENT: {
				break;
			}
				case XMLStreamConstants.START_ELEMENT: {
					if(reader.getLocalName().equals("entry"))  {
						keyName = reader.getAttributeValue(null, "name");
						tagContent = reader.getElementText().trim();
						sqls.put(keyName, tagContent);
					}
					break;
				}
			}
		}
	}

	public Map getSQLs() {
		return sqls;
	}

}
