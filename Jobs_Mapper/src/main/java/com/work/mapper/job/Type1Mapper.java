package com.work.mapper.job;

import com.work.domain.job.Type1;

public interface Type1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type1 record);

    int insertSelective(Type1 record);

    Type1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type1 record);

    int updateByPrimaryKey(Type1 record);
}