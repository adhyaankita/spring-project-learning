package com.sample.spring.basics.springin5steps.xml;

public class XMLPersonDAO {

	XMLJdbcConnection xmljdbcConnection;

	public XMLJdbcConnection getXMLJdbcConnection() {
		return xmljdbcConnection;
	}

	public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
		this.xmljdbcConnection = jdbcConnection;
	}
}
