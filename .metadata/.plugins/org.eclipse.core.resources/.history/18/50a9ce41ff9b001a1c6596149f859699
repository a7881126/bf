package org.boot.az.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.baidu.aip.ocr.AipOcr;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月25日 下午4:01:17
 * 
 *          类说明  智能AI图片识别转换文字
 * 
 */
public class OCRUtil {

	// 设置APPID/AK/SK
	public static final String APP_ID = "15382246";
	public static final String API_KEY = "LeMMzboaXmmkX1zuxGanihYC";
	public static final String SECRET_KEY = "Gq2H7y0jt4oGuXNhefTXZQrSP5HuUK5G";

	public static String ORCResult(Map<String, String> map) {

		// 初始化一个AipOcr
		AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

		// 可选：设置网络连接参数
		client.setConnectionTimeoutInMillis(2000);
		client.setSocketTimeoutInMillis(60000);

		// 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

		// 可选：设置log4j日志输出格式，若不设置，则使用默认配置
		// 也可以直接通过jvm启动参数设置此环境变量
//        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

		// 调用接口

		// 远程的
		org.json.JSONObject res = client.generalUrl(map.get("PicUrl"), new HashMap<String, String>());
		// 只能本地
//		org.json.JSONObject res = client.basicGeneral("C:\\Users\\AZ-PC\\Desktop\\1.png", new HashMap<String, String>());
		JSONObject jsonObject = JSONObject.fromObject(res.toString());
		JSONArray jsonArray = jsonObject.getJSONArray("words_result");
		Iterator<JSONObject> it = jsonArray.iterator();
		StringBuilder sb = new StringBuilder();
		while (it.hasNext()) {
			JSONObject net = it.next();
			sb.append(net.getString("words"));
		}
		return new TextMessageUtil().initMessage(map, sb.toString());

	}
}
