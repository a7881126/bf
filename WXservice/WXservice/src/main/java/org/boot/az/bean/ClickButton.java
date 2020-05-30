package org.boot.az.bean;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 下午6:01:28
 * 
 *          类说明
 * 
 */
public class ClickButton extends Button {

	private String key;// 菜单KEY值
	
	public ClickButton() {
		super();
		this.setType("click");
	}
	

	public ClickButton(String key) {
		super();
		this.key = key;
		this.setType("click");
	}
	
	public ClickButton(String name,String key) {
		super();
		this.key = key;
		this.setName(name);
		this.setType("click");
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
