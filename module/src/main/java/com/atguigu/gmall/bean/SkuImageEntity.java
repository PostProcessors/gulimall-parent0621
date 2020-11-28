package com.atguigu.gmall.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存单元图片表
 * 
 * @author yangfan
 * @email 2361222101@qq.com
 * @date 2020-11-28 11:23:24
 */
@Data
@TableName("sku_image")
public class SkuImageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long skuId;
	/**
	 * 图片名称（冗余）
	 */
	private String imgName;
	/**
	 * 图片路径(冗余)
	 */
	private String imgUrl;
	/**
	 * 商品图片id
	 */
	private Long spuImgId;
	/**
	 * 是否默认
	 */
	private String isDefault;

}
