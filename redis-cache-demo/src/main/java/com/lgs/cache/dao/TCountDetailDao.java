package com.lgs.cache.dao;

import com.lgs.cache.entity.TCountDetail;

public interface TCountDetailDao {

    int insertVisitCount(TCountDetail tCountDetail);
    int getVisitCount();

}