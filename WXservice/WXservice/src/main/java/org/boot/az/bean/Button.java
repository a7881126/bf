package org.boot.az.bean;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 下午6:00:06
 * 
 *          类说明
 * 
 */

public class Button {

	private String name;// 菜单标题

	private String type;// 菜单的响应动作类型

	private Button[] sub_button;

	
	
	
	public Button(String name,Button[] sub_button) {
		super();
		this.name = name;
		this.type = "click";
		this.sub_button = sub_button;
	}


	public Button() {
		this.type = "click";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}

}
