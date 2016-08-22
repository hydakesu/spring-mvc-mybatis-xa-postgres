package com.demo.dao.rc1DataSourceDao;

import java.util.List;

import com.demo.entity.rc1DataSourceEntity.Config;

//@Repository
public interface Rc1TableDao {

    List<Config> getAllConfigs();



    int addConfig(Config config);

}
