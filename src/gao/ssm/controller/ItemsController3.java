package gao.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gao.ssm.po.Items;

/**
 * ʵ��Controller�ӿڵĴ�������ע��ʵ��Handler
 * @author DELL
 *
 */
// ʹ��@Controller��ʶһ��������
@Controller
public class ItemsController3 {
	// ��ѯ��Ʒ�б�
	// һ�㽨�齫��������urlд��һ��������ά��������ǰ�˿�����������Ϊ*.action����������д��д.action��������������ж�Ҫд��.action
	// @RequestMapping("/queryItems")ʵ�ַ�����url��ӳ�䣬һ��������Ӧһ��url
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception{
		// ����service�������ݿ⣬��ѯ��Ʒ�б�����ʹ�þ�̬����ģ��
		List<Items> itemsList = new ArrayList<>();
		// ��list����侲̬����
		Items items_1 = new Items();
		items_1.setName("����ʼǱ�");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");

		Items items_2 = new Items();
		items_2.setName("ƻ���ֻ�");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6ƻ���ֻ���");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// ����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// �൱��request��setAttribute()��������jspҳ����ͨ��itemsList��ȡ����
		modelAndView.addObject("itemsList", itemsList);
		// ָ����ͼ
		// �±ߵ�·���������ͼ��������������jsp·����ǰ׺��jsp·���ĺ�׺�������޸�Ϊ
//		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// �ϱ�·���е�ǰ׺�ͺ�׺������ȥ��
		modelAndView.setViewName("items/itemsList");

		return modelAndView;
	}
	
	// ���Զ�����������
	// ��Ʒ���
	// ��Ʒ�޸�

}
