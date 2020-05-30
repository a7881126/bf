package org.boot.az.util;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.boot.az.bean.FinalUrl;
import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年1月26日 上午11:20:24 

* 类说明  用户信息 

*/
@Component
public class UserInfoUtil {

	@Resource
	private AccessTokenUtil accessTokenUtil;
	
	@Resource
	private WeiXinRequestUtil weiXinRequestUtil;
	
	private static final String MODIFIED_PATH = FinalUrl.WEBPAGE_ACCESS_TOKEN_URL.replace("APPID",FinalUrl.APPID).replace("SECRET",FinalUrl.APPSECRET);
	
	
	/**
	 * 
	* @Title: codeToOpenId
	* @Description: code换取 access_token和openid
	* @param @param code
	* @param @return    参数
	* @return Map<String,String>    返回类型
	* @throws
	 */
	public  Map<String,String> getOpenIdByCode(String code) {
		Map<String,String>map =  new HashMap<String,String>();
		String url = MODIFIED_PATH.replace("CODE",code);
		JSONObject jsonObject =  weiXinRequestUtil.doGetstr(url);
		map.put("access_token",jsonObject.getString("access_token"));
		map.put("openid",jsonObject.getString("openid"));
		return map;
	}
	
	/**
	 * 
	* @Title: openIdToInfo
	* @Description: openId和access_token拉取用户信息
	* @param @param map
	* @param @return    参数
	* @return JSONObject    返回类型
	* @throws
	 */
	public JSONObject getUserInfoByOpenId(Map<String,String> map) {
		String url = FinalUrl.WEBPAGE_GET_USER_INFORMATION.replace("ACCESS_TOKEN",map.get("at")).replace("OPENID",map.get("oi"));
		JSONObject jsonObject =  weiXinRequestUtil.doGetstr(url);
		return jsonObject;
		
	}
	
	
	/**
	 * 
	* @Title: openIdToInfo
	* @Description: 通过OpenId获取用户信息,关注公众号的
	* @param @param map
	* @param @return    参数
	* @return JSONObject    返回类型
	* @throws
	 */
	public  String getUserInfoByOpenId(String openid) {
		String url = FinalUrl.GET_USER_INFORMATION.replace("ACCESS_TOKEN", accessTokenUtil.getAccessToken()).replace("OPENID", openid);
		JSONObject json = weiXinRequestUtil.doGetstr(url);
		System.out.println("用户信息"+json);
		return json.toString();
		
	}
}
