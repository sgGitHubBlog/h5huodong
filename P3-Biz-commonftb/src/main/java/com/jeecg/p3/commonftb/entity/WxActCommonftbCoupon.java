package com.jeecg.p3.commonftb.entity;

import java.io.File;
import java.math.BigDecimal;

import org.jeecgframework.p3.core.utils.persistence.Entity;
import org.springframework.web.multipart.MultipartFile;

import com.jeecg.p3.commonftb.annotation.Excel;

/**
 * 描述：</b>WxActCommonsjCoupon:卡券配置表<br>
 * @author pituo
 * @since：2015年12月02日 17时54分58秒 星期三 
 * @version:1.0
 */
public class WxActCommonftbCoupon implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	@Excel(exportName="卡券ID", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="卡券密码", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="卡券类型", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="商户名字", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="卡券名", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="起用金额", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="减免金额", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)    
	
	private MultipartFile  filedata;
	public MultipartFile getFiledata() {
		return filedata;
	}
	public void setFiledata(MultipartFile filedata) {
		this.filedata = filedata;
	}
	private String filedataFileName;
	public String getFiledataFileName() {
		return filedataFileName;
	}
	public void setFiledataFileName(String filedataFileName) {
		this.filedataFileName = filedataFileName;
	}  
	
}
