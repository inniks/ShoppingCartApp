package onlineshoppingportal.dao;

import java.util.List;

import onlineshoppingportal.model.CartInfo;
import onlineshoppingportal.model.OrderDetailInfo;
import onlineshoppingportal.model.OrderInfo;
import onlineshoppingportal.model.PaginationResult;

public interface OrderDAO {
	 public void saveOrder(CartInfo cartInfo);
	 public PaginationResult<OrderInfo> listOrderInfo(int page,
	            int maxResult, int maxNavigationPage);
	 public OrderInfo getOrderInfo(String orderId);
	 public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
