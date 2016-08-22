package com.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.demoDataSourceDao.Demo1TableDao;
import com.demo.dao.demoDataSourceDao.DemoTableDao;
import com.demo.dao.rc1DataSourceDao.Rc1TableDao;
import com.demo.dao.rc1DataSourceDao.Rc2TableDao;
import com.demo.entity.demoDataSourceEntity.User;
import com.demo.entity.demoDataSourceEntity.User1;
import com.demo.entity.rc1DataSourceEntity.Config;
import com.demo.entity.rc1DataSourceEntity.Config2;

@Service
public class DemoService {

    @Autowired
    private DemoTableDao demoTableDao;

    @Autowired
    private Demo1TableDao demo1TableDao;
    
    @Autowired
    private Rc1TableDao rc1TableDao;

    @Autowired
    private Rc2TableDao rc2TableDao;
    
    public void registerDemo(int cnt1, int cnt2) {

    	Boolean type = true;
        Config conf = new Config();
        Random ra =new Random();
        conf.setId(ra.nextInt(10000) + 1);
        conf.setName("rc1:" + getRandomString(cnt1));
        rc1TableDao.addConfig(conf);

        Config2 conf2 = new Config2();

        conf2.setId(ra.nextInt(10000) + 1);
        conf2.setName("rc2:" + getRandomString(cnt1));
        conf2.setOrg(getRandomString(5));
        rc2TableDao.addRc2(conf2);
        
        User user = new User();
        user.setId(ra.nextInt(10000) + 1);
        user.setName("demo:" + getRandomString(cnt2));
        demoTableDao.addUser(user);

        type = false;
        User1 user1 = new User1();
        user1.setId(ra.nextInt(10000) + 1);
        user1.setName("demo1:" + getRandomString(cnt2));
        user1.setOrg(getRandomString(5));
        demo1TableDao.addDemo1(user1);

        System.out.println("demo service");
    }

    public Integer getCnt() {
    	Integer resultCnt = 0;
    	List<User> configs = demoTableDao.getAllUsers();
    	resultCnt = configs.size();

    	List<Config> users = rc1TableDao.getAllConfigs();
    	resultCnt += users.size();
    	
        return resultCnt;
    }
    
    private static String getRandomString(int length) { //length表示生成字符串的长度  
        String base = "abcdefghijklmnopqrstuvwxyz0123456789あいうえおかきくけこさしすせそなにぬねの";     
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
     }
}
