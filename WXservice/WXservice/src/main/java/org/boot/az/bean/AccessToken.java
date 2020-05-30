package org.boot.az.bean;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 下午1:38:49
 * 
 *          类说明
 * 
 */
public class AccessToken  {

	private String access_token;// 获取到的凭证

	private long expires_time;// 到期时间

	public AccessToken() {

	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public long getExpires_time() {
		return expires_time;
	}

	public void setExpires_time(long expires_time) {
		this.expires_time = expires_time;
	}

	public AccessToken(String access_token, int expires_in) {
		super();
		this.access_token = access_token;
		this.expires_time = System.currentTimeMillis() + expires_in * 1000;
	}

	
	/**
	 * 
	* @Title: isExpires
	* @Description: 判断token是否过时
	* @param @return    参数
	* @return boolean    返回类型
	* @throws
	 */
	public boolean isExpires() {
		return System.currentTimeMillis() > this.expires_time;
	}

}
