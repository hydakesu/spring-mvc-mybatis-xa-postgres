package com.demo.dao.rc1DataSourceDao;

import java.util.List;

import com.demo.entity.rc1DataSourceEntity.Config2;

//@Repository
public interface Rc2TableDao {

    List<Config2> getAllRc2();

    int addRc2(Config2 config);

}
