package com.situ.crm.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.crm.common.EasyUIDataGrideResult;
import com.situ.crm.common.ServerResponse;
import com.situ.crm.dao.ProductMapper;
import com.situ.crm.pojo.DataDic;
import com.situ.crm.pojo.Product;
import com.situ.crm.pojo.ProductExample;
import com.situ.crm.pojo.ProductExample.Criteria;
import com.situ.crm.service.IProductService;
import com.situ.crm.util.Util;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductMapper productMapper;
	@Override
	public EasyUIDataGrideResult findAll(Integer page, Integer rows, Product product) {
		EasyUIDataGrideResult result = new EasyUIDataGrideResult();
		ProductExample productExample = new ProductExample();
		//1、设置分页 
		PageHelper.startPage(page, rows);
		//2、执行查询
		//rows(分页之后的数据)
		Criteria createCriteria = productExample.createCriteria();
		if (StringUtils.isNotEmpty(product.getName())) {
			createCriteria.andNameLike(Util.formatLike(product.getName()));
		}
		if (StringUtils.isNotEmpty(product.getModel())) {
			createCriteria.andModelLike(Util.formatLike(product.getModel()));
		}
		List<Product> productList = productMapper.selectByExample(productExample);
		//total
		PageInfo<Product> pageInfo = new PageInfo<>(productList);
		int total = (int)pageInfo.getTotal();
		
		result.setTotal(total);
		result.setRows(productList);
		return result;
	}

	@Override
	public ServerResponse delete(String ids) {
		String[] idArray = ids.split(",");
		for (String id : idArray) {
			productMapper.deleteByPrimaryKey(Integer.parseInt(id));
		}
		return ServerResponse.createSuccess("数据已经成功删除");
	}

	@Override
	public ServerResponse add(Product product) {
		if(productMapper.insert(product)>0){
			return ServerResponse.createSuccess("添加成功！");
		}
		return ServerResponse.createError("添加失败！");
	}

	@Override
	public ServerResponse update(Product product) {
		if(productMapper.updateByPrimaryKey(product)>0){
			return ServerResponse.createSuccess("修改成功！");
		}
		return ServerResponse.createError("修改失败！");
	}

	@Override
	public List<Product> findProductName() {
		return productMapper.findProductName();
	}

}
