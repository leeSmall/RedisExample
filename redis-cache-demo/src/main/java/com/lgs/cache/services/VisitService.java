package com.lgs.cache.services;

import com.lgs.cache.entity.TCountDetail;

public interface VisitService {
	//添加记录到数据库
	public Long addTCountDetail(TCountDetail detail, String key);
	//获取访问记录数
	public int getVisitNum(String key);

}
