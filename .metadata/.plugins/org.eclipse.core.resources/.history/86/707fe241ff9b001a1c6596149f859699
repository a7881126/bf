package org.boot.az.controller;
/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年1月19日 下午4:31:57 

* 类说明 

*/

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.boot.az.service.IMessageService;
import org.boot.az.util.MessageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WXServiceController {
	
	@Resource
	private IMessageService iMessageService;
	
	@PostMapping(value = "wx.do")
	@ResponseBody
	public String handlMessage(HttpServletRequest request) {
		// 将微信请求xml转为map格式，获取所需的参数
		Map<String, String> map = MessageUtil.xmlToMap(request);
		System.out.println("解析出来"+map);
		String message = iMessageService.differentiateMessage(map);
		System.out.println("返回给微信"+message);
		return message;
	}

}
