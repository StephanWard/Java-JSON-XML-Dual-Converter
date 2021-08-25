package org.StephanWard.util.xml.tool;

import java.util.ArrayList;

/**
 * Used to store data when converting from JSON to XML
 */

class Node {

	class Attribute {
		String mKey;
		String mValue;
		Attribute(String key, String value) {
			mKey = key;
			mValue = value;
		}
	}
	
	private String mName;
	private String mPath;
	private String mContent;
	private ArrayList<Attribute> mAttributes = new ArrayList<Attribute>();
	private ArrayList<Node> mChildren = new ArrayList<Node>();

	Node(String name, String path) {
		mName = name;
		mPath = path;
	}

	void addAttribute(String key, String value) {
		mAttributes.add(new Attribute(key, value));
	}

	void setContent(String content) {
		mContent = content;
	}

	void setName(String name) {
		mName = name;
	}

	void addChild(Node child) {
		mChildren.add(child);
	}

	ArrayList<Attribute> getAttributes() {
		return mAttributes;
	}

	String getContent() {
		return mContent;
	}

	ArrayList<Node> getChildren() {
		return mChildren;
	}

	String getPath() {
		return mPath;
	}

	String getName() {
		return mName;
	}
	
}
