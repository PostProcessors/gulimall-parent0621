package com.atguigu.gmall.bean;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存单元表
 * 
 * @author yangfan
 * @email 2361222101@qq.com
 * @date 2020-11-28 11:23:24
 */
@Data
@TableName("sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 库存id(itemID)
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long spuId;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * sku名称
	 */
	private String skuName;
	/**
	 * 商品规格描述
	 */
	private String skuDesc;
	/**
	 * 重量
	 */
	private BigDecimal weight;
	/**
	 * 品牌(冗余)
	 */
	private Long tmId;
	/**
	 * 三级分类id（冗余)
	 */
	private Long category3Id;
	/**
	 * 默认显示图片(冗余)
	 */
	private String skuDefaultImg;
	/**
	 * 是否销售（1：是 0：否）
	 */
	private Integer isSale;

}
