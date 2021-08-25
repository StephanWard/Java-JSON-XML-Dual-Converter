package org.StephanWard.util.xml.tool;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

/**
 * Solve the runtime exception: "javax.xml.transform.TransformerException: org.xml.sax.SAXParseException;".
 * Solve the problem that the XML element name (tag) and attribute name parsed by SAXParse have special characters.
 * Solution: Replace special characters with UUID strings before parsing, and then replace them after parsing. You can add replacement characters as needed.
 * @author Stephan Ward
 * @date: 20190201
 */
public class SpecialCharacterHandler {

	private static Map<String, String> specialCharacterReplaceMap = new HashMap<String, String>();
	
	static {
		specialCharacterReplaceMap.put(":", UUID.randomUUID().toString());
		/*
		specialCharacterReplaceMap.put("&", UUID.randomUUID().toString());
		specialCharacterReplaceMap.put("#", UUID.randomUUID().toString());
		specialCharacterReplaceMap.put("$", UUID.randomUUID().toString());
		specialCharacterReplaceMap.put("@", UUID.randomUUID().toString());
		specialCharacterReplaceMap.put("%", UUID.randomUUID().toString());
		*/
	}
	
	public static String doReplace(String srcStr){
		String returnStr = null;
		Set<Entry<String, String>> entries = specialCharacterReplaceMap.entrySet();
		for (Entry<String, String> entry : entries) {
			returnStr = srcStr.replaceAll(entry.getKey(), entry.getValue());
		}
		return returnStr;
	}
	
	public static String doRestore(String srcStr){
		String returnStr = null;
		Set<Entry<String, String>> entries = specialCharacterReplaceMap.entrySet();
		for (Entry<String, String> entry : entries) {
			returnStr = srcStr.replaceAll(entry.getValue(), entry.getKey());
		}
		return returnStr;
	}
	
}
