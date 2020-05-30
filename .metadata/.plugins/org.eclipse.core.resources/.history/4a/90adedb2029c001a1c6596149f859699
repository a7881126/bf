package org.boot.az.util;

import javax.annotation.Resource;

import org.boot.az.bean.Button;
import org.boot.az.bean.FinalUrl;
import org.boot.az.bean.Menu;
import org.boot.az.bean.ViewButton;
import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 下午6:03:58
 * 
 *          类说明
 * 
 */
@Component
public class MenuUtil {
	
	@Resource
	private WeiXinRequestUtil weiXinRequestUtil;
	
	@Resource
	private URLEncoding uRLEncoding;
	
	/**
	 * 创建菜单
	 * 
	 * @param accessToken
	 * @param Menu        菜单json格式字符串
	 * @return
	 */
	public  String createMenu(String accessToken, String Menu) {
		String url = FinalUrl.CTRATE_MENU_URL.replace("ACCESS_TOKEN", accessToken);
		JSONObject json = weiXinRequestUtil.doPoststr(url, Menu);
		if (json != null && json.getInt("errcode") == 0) {
			return "菜单创建成功";
		}
		return "菜单创建失败";
	}

	public  String initMenu() {
		String checkOrderUrl = uRLEncoding.urlEncodeUTF8("http://ishare.ihomeo2o.com/WXservice/check_order_list.do");
		String orderInquiryUrl = uRLEncoding.urlEncodeUTF8("http://ishare.ihomeo2o.com/WXservice/order_inquiry.do");
		String salesInquireUrl = uRLEncoding.urlEncodeUTF8("http://ishare.ihomeo2o.com/WXservice/sales_inquire.do");
		String billingDetailsUrl = uRLEncoding.urlEncodeUTF8("http://ishare.ihomeo2o.com/WXservice/billing_details.do");
		String storeInformationUrl = uRLEncoding.urlEncodeUTF8("http://ishare.ihomeo2o.com/WXservice/store_information.do");
		String url = FinalUrl.RETURN_CODE_URL.replace("APPID", FinalUrl.APPID).replace("SCOPE",FinalUrl.SCOPE);
		Menu menu = new Menu();
		menu.setButton(new Button[] 
				{
						new ViewButton("查看订单", url.replace("REDIRECT_URI", checkOrderUrl)),
						new ViewButton("订单查询", url.replace("REDIRECT_URI", orderInquiryUrl)),
						new Button("代理商",
								new Button[] { 
										new ViewButton("销量查询",url.replace("REDIRECT_URI", salesInquireUrl)), 
										//new ViewButton("账户信息",url.replace("REDIRECT_URI", billingDetailsUrl)),
										new ViewButton("店面信息",url.replace("REDIRECT_URI", storeInformationUrl))
									
										}
								) 
				}
					);
		return JSONObject.fromObject(menu).toString();
	}

}
