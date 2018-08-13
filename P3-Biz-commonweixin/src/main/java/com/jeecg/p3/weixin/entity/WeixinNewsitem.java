package com.jeecg.p3.weixin.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>图文模板素材表<br>
 * @author weijian.zhang
 * @since：2018年07月13日 12时46分36秒 星期五 
 * @version:1.0
 */
public class WeixinNewsitem implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	//update-begin--Author:zhangweijian  Date: 20180802 for：新增media_id字段
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	/**
	//update-end--Author:zhangweijian  Date: 20180802 for：新增media_id字段
	//update-begin--Author:zhangweijian  Date: 20180726 for：新增图文类型，外部链接字段
	/**
	public String getNewType() {
		return newType;
	}
	public void setNewType(String newType) {
		this.newType = newType;
	}
	public String getExternalUrl() {
		return externalUrl;
	}
	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}
	/**
	//update-end--Author:zhangweijian  Date: 20180726 for：新增图文类型，外部链接字段
}
