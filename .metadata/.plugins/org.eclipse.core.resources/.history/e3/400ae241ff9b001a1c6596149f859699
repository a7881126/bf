package org.boot.az.controller;

import org.boot.az.util.CheckUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月19日 下午4:24:05
 * 
 *          类说明
 * 
 */
@RestController
public class LoginVerifyController {

	/**
	 * 
	 * @Description: 与微信对接登陆验证
	 *
	 * @param:与微信对接登陆验证
	 * @return：验证返回
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: AZ-PC
	 * @date: 2019年1月18日 上午10:42:04
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------* 2019年1月18日
	 *        AZ-PC v1.0.0 修改原因
	 */
	// @RequestMapping(value = "wx",method=RequestMethod.GET)
	@GetMapping(value = "wx.do")
	public String login(String signature, String timestamp, String nonce, String echostr) {
		System.out.println("开始验证");
		if (timestamp != null && nonce != null && echostr != null && CheckUtil.checkSignature(signature, timestamp, nonce)) {
			System.out.println("验证成功");
			return echostr;
		}
		System.out.println("不是微信服务器");
		return "不对外开放服务器";

	}
}
