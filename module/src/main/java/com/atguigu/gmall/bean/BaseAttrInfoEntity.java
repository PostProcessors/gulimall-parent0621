package com.atguigu.gmall.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性表
 * 
 * @author yangfan
 * @email 2361222101@qq.com
 * @date 2020-11-28 11:23:23
 */
@Data
@TableName("base_attr_info")
public class BaseAttrInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 属性名称
	 */
	private String attrName;
	/**
	 * 分类id
	 */
	private Long categoryId;
	/**
	 * 分类层级
	 */
	private Integer categoryLevel;

}
