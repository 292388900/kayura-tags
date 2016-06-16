/**
 * Copyright 2015-2016 the original author or authors.
 * HomePage: http://www.kayura.org
 */
package org.kayura.tags.easyui.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 支持 EasyUI.Tree 的 TreeNode 数据结构.
 *
 * @author liangxia@live.com
 */
public class TreeNode {

	public static final String STATE_OPEN = "open";
	public static final String STATE_CLOSED = "closed";

	private String id;
	private String text;
	private String iconCls;
	private Boolean checked;
	private String state;
	private List<TreeNode> children;
	private Map<String, Object> attributes;

	public TreeNode() {
		this.children = new ArrayList<TreeNode>();
		this.attributes = new HashMap<String, Object>();
	}

	public TreeNode(String id, String text) {
		this();
		this.id = id;
		this.text = text;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public Boolean isChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void addNodes(List<TreeNode> nodes) {

		if (nodes != null) {
			for (TreeNode n : nodes) {
				addNode(n);
			}
		}
	}

	public void addNode(TreeNode node) {
		if (this.children == null) {
			this.children = new ArrayList<TreeNode>();
		}
		this.children.add(node);
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void addAttr(String key, Object value) {
		if (this.attributes == null) {
			this.attributes = new HashMap<String, Object>();
		}
		this.attributes.put(key, value);
	}
}
