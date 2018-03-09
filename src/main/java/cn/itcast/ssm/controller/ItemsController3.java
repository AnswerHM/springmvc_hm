/**
 * Mar 9, 2018
 */
package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

/** 
 * @ClassName: ItemsController3
 * @Description: 注解开发Handler
 * @author humin 
 * @date Mar 9, 2018 11:19:37 AM 
 *  
 */
// 使用@Controller标识它是一个控制器
@Controller
public class ItemsController3 {
	
	// 商品查询列表
	// @@RequestMapping实现对queryItems方法url进行映射，一个方法对应一个url
	// 一般建议将url和方法写成一样
	@RequestMapping("/queryItems4")
	public ModelAndView queryItems() throws Exception{
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
		// 下面的路径，如果在视图解析器中配置jsp路径的前缀和jsp的后缀，修改为：
//		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上面的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("/items/itemsList");
		
		return modelAndView;
	}
	
	// 商品的添加
	// 商品的删除
	

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
