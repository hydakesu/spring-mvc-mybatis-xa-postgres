package com.demo.dao.demoDataSourceDao;

import java.util.List;
import com.demo.entity.demoDataSourceEntity.User1;

public interface Demo1TableDao {

    List<User1> getAllDemo1();

    int addDemo1(User1 user);

}
