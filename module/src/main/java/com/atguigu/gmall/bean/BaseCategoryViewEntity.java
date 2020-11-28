package com.atguigu.gmall.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * VIEW
 * 
 * @author yangfan
 * @email 2361222101@qq.com
 * @date 2020-11-28 11:23:24
 */
@Data
@TableName("base_category_view")
public class BaseCategoryViewEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
	private Long category1Id;
	/**
	 * 分类名称
	 */
	private String category1Name;
	/**
	 * 编号
	 */
	private Long category2Id;
	/**
	 * 二级分类名称
	 */
	private String category2Name;
	/**
	 * 编号
	 */
	private Long category3Id;
	/**
	 * 三级分类名称
	 */
	private String category3Name;

}
