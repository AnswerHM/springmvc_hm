/**
 * Mar 9, 2018
 */
package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.ssm.po.Items;

/** 
 * @ClassName: ItemsController1 
 * @Description: 实现controller接口的处理器
 * @author humin 
 * @date Mar 9, 2018 11:19:37 AM 
 *  
 */
public class ItemsController1 implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 调用service查找数据库，查找商品列表，这里使用静态数据模拟
		List<Items> itemsList = new ArrayList<Items>();
		Items items1 = new Items();
		items1.setName("联想笔记本");
		items1.setPrice(6000f);
		items1.setDetail("ThinkPad T430");
		
		Items items2 = new Items();
		items2.setName("苹果手机");
		items2.setPrice(5000f);
		items2.setDetail("iphone6苹果手机！");
		
		itemsList.add(items1);
		itemsList.add(items2);
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当于request的setAttribute 在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList",itemsList);
		
		// 指定视图
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		
		return modelAndView;
	}
	
}
