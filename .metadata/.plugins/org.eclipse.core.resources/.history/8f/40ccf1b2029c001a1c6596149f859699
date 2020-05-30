package org.boot.az.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.boot.az.bean.AccessToken;
import org.boot.az.bean.FinalUrl;
import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;
import redis.clients.jedis.Jedis;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 下午4:37:41
 * 
 *          类说明  微信的请求
 * 
 */
@Component
public class WeiXinRequestUtil {


	/**
	 * 处理doget请求
	 * 
	 * @param url
	 * @return
	 */
	public JSONObject doGetstr(String url) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		JSONObject jsonObject = null;
		try {
			CloseableHttpResponse response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				jsonObject = JSONObject.fromObject(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonObject;

	}

	/**
	 * 处理post请求
	 * 
	 * @param url
	 * @return
	 */
	public JSONObject doPoststr(String url, String outStr) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		JSONObject jsonObject = null;
		try {
			httpPost.setEntity(new StringEntity(outStr, FinalUrl.CHARACTER));
			CloseableHttpResponse response = httpclient.execute(httpPost);
			String result = EntityUtils.toString(response.getEntity(), FinalUrl.CHARACTER);
			jsonObject = JSONObject.fromObject(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
	
	

//	public static AccessToken getAccessToken() {
//		System.out.println("从接口中获取");
//		Jedis jedis = RedisUtil.getJedis();
//		AccessToken token = new AccessToken();
//		String url = FinalUrl.ACCESS_TOKEN_URL.replace("APPID", FinalUrl.APPID).replace("APPSECRET", FinalUrl.APPSECRET);
//		JSONObject json = doGetstr(url);
//		if (json != null) {
//			token.setAccess_token(json.getString("access_token"));
//			token.setExpires_time(json.getInt("expires_in"));
//			jedis.set("access_token", json.getString("access_token"));
//			jedis.expire("access_token", 60 * 60 * 2);
//		}
//		RedisUtil.returnResource(jedis);
//		return token;
//	}
//
//	/**
//	 * 获取凭证
//	 * 
//	 * @return
//	 */
//	public static String getAccess_Token() {
//		System.out.println("从缓存中读取");
//		Jedis jedis = RedisUtil.getJedis();
//		System.out.println("获取实例");
//		String access_token = jedis.get("access_token");
//		System.out.println(access_token);
//		if (access_token == null) {
//			AccessToken token = getAccessToken();
//			access_token = token.getAccess_token();
//		}
//		RedisUtil.returnResource(jedis);
//		return access_token;
//	}

}
