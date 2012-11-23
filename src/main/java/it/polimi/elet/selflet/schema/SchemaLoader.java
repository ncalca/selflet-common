package it.polimi.elet.selflet.schema;

import java.io.InputStream;

import it.polimi.elet.selflet.SelfLetConstants;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * This class loads xsd schemas from <code>SelfLetCommon</code> project
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class SchemaLoader {

	// schema factory
	private static SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

	public static Schema getSchema(XSDParserEnum schemaType) {
		switch (schemaType) {

		case SelfLet:
			return getSchema(SelfLetConstants.SELFLET_MAIN_FILE_XSD);

		case Service:
			return getSchema(SelfLetConstants.SELFLET_SERVICE_FILE_XSD);

		default:
			throw new IllegalArgumentException("Wrong enumeration type for " + schemaType.name());
		}
	}

	private static Schema getSchema(String schemaFile) {
		try {
			return schemaFactory.newSchema(getXsdFileContent(schemaFile));
		} catch (SAXException e) {
			return null;
		}
	}

	private static Source getXsdFileContent(String schemaFile) {
		InputStream stream = SchemaLoader.class.getResourceAsStream(schemaFile);
		return new SAXSource(new InputSource(stream));
	}

}
