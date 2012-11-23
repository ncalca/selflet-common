package it.polimi.elet.selflet.schema;

import javax.xml.validation.Schema;

import org.junit.Test;

import static junit.framework.Assert.*;

public class SchemaLoaderTest {

	@Test
	public void testSchemaLoad() {
		Schema schema = SchemaLoader.getSchema(XSDParserEnum.SelfLet);
		assertNotNull(schema);
	}
}
