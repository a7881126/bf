package org.boot.az.util;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年1月26日 上午9:40:07 

* 类说明   获取二维码
* 

*/
@Component
public class QRCodeUtil {

	@Resource
	private AccessTokenUtil accessTokenUtil;
	
	@Resource
	private WeiXinRequestUtil weiXinRequestUtil;
	
	public  String ORCodeTicket() {
		String url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+accessTokenUtil.getAccessToken();
		String data = "{\"expire_seconds\": 600, \"action_name\": \"QR_STR_SCENE\", \"action_info\": {\"scene\": {\"scene_str\": \"阿铮真帅\"}}}";
		JSONObject json = weiXinRequestUtil.doPoststr(url, data);
		System.out.println(json);
		String result = json.getString("ticket");
		String u = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+result;
		
		return u;
	}
}
