package nLayeredDemo.Business.concretes;

import java.util.List;

import nLayeredDemo.Business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	
	private LoggerService loggerService;
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao , LoggerService loggerService) {
		// TODO Auto-generated constructor stub
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		//iş kodları
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("loglandı");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
