package org.boot.az.pojo;
/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月21日 下午1:20:52 

* 类说明   经销商

*/
public class User {
	

	
	
	
	/**
	 * 微信ID
	 */
	private String openId;
	
	/**
	 * 用户ID
	 */
	private String id;
	
	/**
	 * 用户邮箱
	 */
	private String email;
	
	
	/**
	 * 用户
	 */
	private String nickName;
	
	/**
	 * 是否冻结
	 */
	private String isLocked;
	
	/**
	 * 是否手动扫描
	 */
	private String isManuelPackageScan;

	
	/**
	 * 权限id
	 */
	private String roleId;


	public String getOpenId() {
		return openId;
	}


	public void setOpenId(String openId) {
		this.openId = openId;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getIsLocked() {
		return isLocked;
	}


	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}


	public String getIsManuelPackageScan() {
		return isManuelPackageScan;
	}


	public void setIsManuelPackageScan(String isManuelPackageScan) {
		this.isManuelPackageScan = isManuelPackageScan;
	}


	public String getRoleId() {
		return roleId;
	}


	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


	@Override
	public String toString() {
		return "User [openId=" + openId + ", id=" + id + ", email=" + email + ", nickName=" + nickName + ", isLocked="
				+ isLocked + ", isManuelPackageScan=" + isManuelPackageScan + ", roleId=" + roleId + "]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
