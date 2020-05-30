package org.boot.az.util;

import javax.annotation.Resource;

import org.boot.az.bean.AccessToken;
import org.boot.az.bean.FinalUrl;
import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月25日 上午8:07:48
 * 
 *          类说明
 * 
 */

@Component
public class AccessTokenUtil {

	@Resource
	private WeiXinRequestUtil weiXinRequestUtil;

	// 用于存储token;
	private static AccessToken at;

	/**
	 *  获取token
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: AZ-PC
	 * @date: 2019年1月25日 上午8:24:01
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------* 2019年1月25日
	 *        AZ-PC v1.0.0 修改原因
	 */
	private void getToken() {
		String url = FinalUrl.ACCESS_TOKEN_URL.replace("APPID", FinalUrl.APPID).replace("APPSECRET", FinalUrl.APPSECRET);
		JSONObject jsonObject = weiXinRequestUtil.doGetstr(url);
		String access_token = jsonObject.getString("access_token");
		int expires_in = jsonObject.getInt("expires_in");
		// token对象，并存起来
		at = new AccessToken(access_token, expires_in);

	}

	/**
	 * 获取token
	 */
	public String getAccessToken() {
		if (at == null || at.isExpires() ) {
			getToken();
		}
		return at.getAccess_token();

	}


}
