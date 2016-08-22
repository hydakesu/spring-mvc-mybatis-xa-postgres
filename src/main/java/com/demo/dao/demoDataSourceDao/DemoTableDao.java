package com.demo.dao.demoDataSourceDao;

import java.util.List;
import com.demo.entity.demoDataSourceEntity.User;

public interface DemoTableDao {

    List<User> getAllUsers();

    int addUser(User user);

}
