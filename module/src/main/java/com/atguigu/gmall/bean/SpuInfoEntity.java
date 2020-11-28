package com.atguigu.gmall.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品表
 * 
 * @author yangfan
 * @email 2361222101@qq.com
 * @date 2020-11-28 11:23:23
 */
@Data
@TableName("spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	private Long id;
	/**
	 * 商品名称
	 */
	private String spuName;
	/**
	 * 商品描述(后台简述）
	 */
	private String description;
	/**
	 * 三级分类id
	 */
	private Long category3Id;
	/**
	 * 品牌id
	 */
	private Long tmId;

}
