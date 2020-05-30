package org.boot.az.util;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Component;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月27日 上午10:22:01 

* 类说明 

*/
@Component
public class URLEncoding {

	 public  String urlEncodeUTF8(String source) {
	        String result = source;
	        try {
	            result = java.net.URLEncoder.encode(source, "utf-8");
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	        return result;
	    }

	
}
