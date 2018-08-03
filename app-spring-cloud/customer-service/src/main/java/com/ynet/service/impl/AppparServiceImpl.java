package com.ynet.service.impl;

import com.ynet.entity.Apppar;
import com.ynet.mapper.AppparMapper;
import com.ynet.service.AppparService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuanxu on 2018/7/24.
 */
@Service
public class AppparServiceImpl implements AppparService {

    @Autowired
    private AppparMapper mapper;

    @Override
    public Apppar selectByCode(String code) {
        return mapper.selectByPrimaryKey(code);
    }
}
