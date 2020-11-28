package com.atguigu.gmall.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku平台属性值关联表
 * 
 * @author yangfan
 * @email 2361222101@qq.com
 * @date 2020-11-28 11:23:23
 */
@Data
@TableName("sku_attr_value")
public class SkuAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 属性id（冗余)
	 */
	private Long attrId;
	/**
	 * 属性值id
	 */
	private Long valueId;
	/**
	 * skuid
	 */
	private Long skuId;

}
