package com.demo.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.demoDataSourceDao.DemoTableDao;
import com.demo.dao.rc1DataSourceDao.Rc1TableDao;
import com.demo.entity.demoDataSourceEntity.User;
import com.demo.entity.rc1DataSourceEntity.Config;

@Service
public class DemoService {

    @Autowired
    private DemoTableDao demoTableDao;

    @Autowired
    private Rc1TableDao rc1TableDao;

    public void registerDemo(int cnt1, int cnt2) {

        Config conf2 = new Config();
        Random ra =new Random();
        conf2.setId(ra.nextInt(10000) + 1);
        conf2.setName("rc1:" + getRandomString(cnt1));
        rc1TableDao.addConfig(conf2);

        User u = new User();
        u.setId(ra.nextInt(10000) + 1);
        u.setName("demo:" + getRandomString(cnt2));
        demoTableDao.addUser(u);

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
