package com.ssm.shop.service;

import java.util.List;

import com.ssm.shop.pojo.EasyUIDataGridResult;
import com.ssm.shop.pojo.Item;
import com.ssm.shop.pojo.PageParams;

public interface ItemService {
	Item getItemById();
	List<Item> getItemList(PageParams pageparams);
	
	List<Item> getAllItem();
	/**
	 * ������Ʒ״̬
	*/
//	TaotaoResult updateItemStatus(List<Long> ids,String method);
}
