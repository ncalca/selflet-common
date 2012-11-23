package it.polimi.elet.selflet.utilities;

import it.polimi.elet.selflet.exceptions.ParserException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParserUtilities {

	private ParserUtilities() {
		// private constructor
	}

	/**
	 * Returns a Document object representing the filePath passed as input
	 * */
	public static Document getDocument(String filePath) throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();

		// docBuilderFactory.setIgnoringElementContentWhitespace(true);
		docBuilderFactory.setIgnoringComments(true);

		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

		File sourceFile = new File(filePath);
		return docBuilder.parse(sourceFile);
	}

	/**
	 * Given a node list removes children with name "#text#.
	 * 
	 * @param nodeList
	 *            The nodelist to clean
	 * @return the cleaned nodelist
	 * @throws ParserException
	 * 
	 * */
	public static Node removeTextChilds(Node node) throws ParserException {

		if (node == null) {
			throw new ParserException("Examining a null node");
		}
		NodeList children = node.getChildNodes();

		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i).getNodeName().equals("#text")) {
				node.removeChild(children.item(i));
			}
		}

		return node;

	}

	/**
	 * Returns the value of an attribute.
	 * 
	 * @param node
	 *            The node used for the search.
	 * @param attributeName
	 *            The name of the attribute.
	 * 
	 * @return The value of the searched attribute, null if the attribute does
	 *         not exists.
	 * 
	 * */
	public static String getValueOfAttribute(Node node, String attributeName) {

		if (node == null || attributeName == null) {
			return null;
		}
		NamedNodeMap attributes = node.getAttributes();

		if (attributes == null) {
			return null;
		}
		for (int i = 0; i < attributes.getLength(); i++) {

			Node attribute = attributes.item(i);

			if (attribute.getNodeName().equals(attributeName)) {
				return attribute.getNodeValue();
			}
		}
		return null;
	}

	public static boolean validateEXTFile(String file, String ext) {

		file = file.trim();
		String[] parts = file.split("\\.");

		if (!parts[0].trim().equalsIgnoreCase("") && parts[parts.length - 1].equalsIgnoreCase(ext)) {
			return true;
		}

		return false;
	}

}
