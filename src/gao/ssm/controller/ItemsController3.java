package gao.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gao.ssm.po.Items;

/**
 * 实现Controller接口的处理器，注解实现Handler
 * @author DELL
 *
 */
// 使用@Controller标识一个控制器
@Controller
public class ItemsController3 {
	// 查询商品列表
	// 一般建议将方法名和url写成一样，方便维护（由于前端控制器中配置为*.action，这里无论写不写.action，最终在浏览器中都要写上.action
	// @RequestMapping("/queryItems")实现方法和url的映射，一个方法对应一个url
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception{
		// 调用service查找数据库，查询商品列表，这里使用静态数据模拟
		List<Items> itemsList = new ArrayList<>();
		// 向list中填充静态数据
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当于request的setAttribute()方法，在jsp页面中通过itemsList来取数据
		modelAndView.addObject("itemsList", itemsList);
		// 指定视图
		// 下边的路径如果在视图解析器中配置了jsp路径的前缀和jsp路径的后缀，可以修改为
//		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上边路径中的前缀和后缀都可以去掉
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}
	
	// 可以定义其它方法
	// 商品添加
	// 商品修改

}
