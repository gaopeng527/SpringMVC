package gao.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import gao.ssm.po.Items;

/**
 * ʵ��Controller�ӿڵĴ�����
 * @author DELL
 *
 */
public class ItemsController2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		// ����ģ������
		request.setAttribute("itemsList", itemsList);
		// ����ת������ͼ
		request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
		// ʹ�ô˷�������ͨ���޸�response������������Ӧ��ʽ������json����
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("application/json;charset=utf-8");
//		response.getWriter().write("json��");

	}

}
