package org.StephanWard.util.xml;

import org.StephanWard.util.xml.tool.JsonToXml;
import org.json.JSONObject;
import org.StephanWard.util.xml.tool.XmlToJson;

/**
 * XML parsing tools:<br>
 * 1. Convert XML string to JSON string<br>
 * 2. Convert XML string to formatted JSON string<br>
 * 3. Convert XML string to JSONObject(org.json) object<br>
 * 4. Convert JSON string to XML string<br>
 * 5. JSON string is converted to formatted XML string<br>
 * 6. JSONObject(org.json) object is converted into XML string<br>
 * @author Stephan Ward
 */
public class XmlParserUtils {
	
	/**
	 * @Description: XML string is converted to JSON string
	 * @methods: xmlStrToJsonStr
	 * @param xmlStr XML string
	 * @return String
	 * @author Stephan Ward
	 */
	public static String xmlStrToJsonStr(String xmlStr){
		if (xmlStr == null || "".equals(xmlStr)) {
			return "";
		}
		XmlToJson xmlToJson = new XmlToJson.Builder(xmlStr).build();
		return xmlToJson.toString();
	}
	
	
	/**
	 * @Description: XML string is converted to formatted JSON string
	 * @methods: xmlStrToFormattedJsonStr
	 * @param xmlStr XML string
	 * @param indentationStr Interval string: generally set to: "", or "\t", if set to null, the default is 3 spaces
	 * @return String
	 * @author Stephan Ward
	 */
	public static String xmlStrToFormattedJsonStr(String xmlStr, String indentationStr){
		if (xmlStr == null || "".equals(xmlStr)) {
			return "";
		}
		XmlToJson xmlToJson = new XmlToJson.Builder(xmlStr).build();
		return xmlToJson.toFormattedString(indentationStr);
	}
	
	
	/**
	 * @Description: XML string is converted to JSONObject(org.json) object
	 * @methods: xmlStrToJSONObject
	 * @param xmlStr
	 * @return JSONObject(org.json)
	 * @author Stephan Ward
	 */
	public static JSONObject xmlStrToJSONObject(String xmlStr){
		if (xmlStr == null || "".equals(xmlStr)) {
			return null;
		}
		XmlToJson xmlToJson = new XmlToJson.Builder(xmlStr).build();
		return xmlToJson.toJson();
	}
	
	
	/**
	 * @Description: JSON string is converted to XML string
	 * @methods: jsonStrToXmlStr
	 * @param jsonStr
	 * @return String
	 * @author Stephan Ward
	 */
	public static String jsonStrToXmlStr(String jsonStr){
		if (jsonStr == null || "".equals(jsonStr)) {
			return "";
		}
		JSONObject jsonObject = new JSONObject(jsonStr);
		JsonToXml jsonToXml = new JsonToXml.Builder(jsonObject).build();
		return jsonToXml.toString();
	}
	
	
	/**
	 * @Description: JSON string is converted to formatted XML string
	 * @methods: jsonStrToFormattedXmlStr
	 * @param jsonStr
	 * @param indentationSize Indentation character interval, the default is 3
	 * @return String
	 * @author Stephan Ward
	 */
	public static String jsonStrToFormattedXmlStr(String jsonStr, Integer indentationSize){
		if (jsonStr == null || "".equals(jsonStr)) {
			return "";
		}
		JSONObject jsonObject = new JSONObject(jsonStr);
		JsonToXml jsonToXml = new JsonToXml.Builder(jsonObject).build();
		return jsonToXml.toFormattedString(indentationSize);
	}
	
	
	/**
	 * @Description: JSONObject(org.json) object is converted to XML string
	 * @methods: JSONObjectToXmlStr
	 * @param jsonObject
	 * @param indentationSize
	 * @return String
	 * @date: 08/25/2021
	 * @author Stephan Ward
	 */
	public static String JSONObjectToXmlStr(JSONObject jsonObject, Integer indentationSize){
		if(jsonObject ==null || !(jsonObject instanceof JSONObject)){
			return "";
		}
		JsonToXml jsonToXml = new JsonToXml.Builder(jsonObject).build();
		return jsonToXml.toFormattedString(indentationSize);
	}
	
}
