/**
 * Mar 9, 2018
 */
package cn.itcast.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

/** 
 * @ClassName: ItemsController2 
 * @Description: 实现HttpRequestHandler接口的处理器
 * @author humin 
 * @date Mar 9, 2018 11:19:37 AM 
 *  
 */
public class ItemsController2 implements HttpRequestHandler {

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		// 设置模型数据
		request.setAttribute("itemsList", itemsList);
		// 设置转发的视图
		request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
		// 使用此方法可以通过修改response，设置响应的数据格式，比如响应json数据
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("application/json;charset=utf-8");
//		response.getWriter().write("json串");
	}

//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// 调用service查找数据库，查找商品列表，这里使用静态数据模拟
//		List<Items> itemsList = new ArrayList<Items>();
//		Items items1 = new Items();
//		items1.setName("联想笔记本");
//		items1.setPrice(6000f);
//		items1.setDetail("ThinkPad T430");
//		
//		Items items2 = new Items();
//		items2.setName("苹果手机");
//		items2.setPrice(5000f);
//		items2.setDetail("iphone6苹果手机！");
//		
//		itemsList.add(items1);
//		itemsList.add(items2);
//		// 返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//		// 相当于request的setAttribute 在jsp页面中通过itemsList取数据
//		modelAndView.addObject("itemsList",itemsList);
//		
//		// 指定视图
//		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//		
//		return modelAndView;
//	}
	
}
