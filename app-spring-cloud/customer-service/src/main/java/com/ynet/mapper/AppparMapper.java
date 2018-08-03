package com.ynet.mapper;

import com.ynet.entity.Apppar;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by yuanxu on 2018/7/24.
 */
@Mapper
public interface AppparMapper {

    Apppar selectByPrimaryKey(String code);
}
