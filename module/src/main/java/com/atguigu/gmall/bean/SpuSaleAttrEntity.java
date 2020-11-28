package com.atguigu.gmall.bean;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu销售属性
 * 
 * @author yangfan
 * @email 2361222101@qq.com
 * @date 2020-11-28 11:23:23
 */
@Data
@TableName("spu_sale_attr")
public class SpuSaleAttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号(业务中无关联)
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long spuId;
	/**
	 * 销售属性id
	 */
	private Long baseSaleAttrId;
	/**
	 * 销售属性名称(冗余)
	 */
	private String saleAttrName;

}
