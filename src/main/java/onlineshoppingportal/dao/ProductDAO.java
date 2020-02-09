package onlineshoppingportal.dao;

import onlineshoppingportal.entity.Product;
import onlineshoppingportal.model.PaginationResult;
import onlineshoppingportal.model.ProductInfo;

public interface ProductDAO {
	public Product findProduct(String code);

	public ProductInfo findProductInfo(String code);

	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage);

	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage, String likeName);

	public void save(ProductInfo productInfo);
}
