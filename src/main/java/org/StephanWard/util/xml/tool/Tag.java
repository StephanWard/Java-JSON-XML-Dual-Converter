package org.StephanWard.util.xml.tool;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class used to store XML hierarchy
 *
 */
public class Tag {

    private String mPath;
    private String mName;
    private ArrayList<Tag> mChildren = new ArrayList<Tag>();
    private String mContent;

    Tag(String path, String name) {
        mPath = path;
        mName = name;
    }

    void addChild(Tag tag) {
        mChildren.add(tag);
    }

    void setContent(String content) {
    	/*
    	 * checks that there is a relevant content (not only spaces or \n)
    	 * Add "\t"
    	 * @author Stephan Ward
    	 * @date 08/25/2021
    	 */
        boolean hasContent = false;
        if (content != null) {
			for (int i = 0; i < content.length(); ++i) {
				char c = content.charAt(i);
				if ((c != ' ') && (c != '\n') && (c != '\t')) {
					hasContent = true;
					break;
				}
            }
        }
        if (hasContent) {
            mContent = content;
        }
    }

    String getName() {
        return mName;
    }

    String getContent() {
        return mContent;
    }

    ArrayList<Tag> getChildren() {
        return mChildren;
    }

    boolean hasChildren() {
        return (mChildren.size() > 0);
    }

    int getChildrenCount() {
        return mChildren.size();
    }

    Tag getChild(int index) {
        if ((index >= 0) && (index < mChildren.size())) {
            return mChildren.get(index);
        }
        return null;
    }

    HashMap<String, ArrayList<Tag>> getGroupedElements() {
        HashMap<String, ArrayList<Tag>> groups = new HashMap<String, ArrayList<Tag>>();
        for(Tag child : mChildren) {
            String key = child.getName();
            ArrayList<Tag> group = groups.get(key);
            if (group == null) {
                group = new ArrayList<Tag>();
                groups.put(key, group);
            }
            group.add(child);
        }
        return groups;
    }

    String getPath() {
        return mPath;
    }

    @Override
    public String toString() {
        return "Tag: " + mName + ", " + mChildren.size() + " children, Content: " + mContent;
    }
}
