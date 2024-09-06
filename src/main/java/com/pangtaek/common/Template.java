package com.pangtaek.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {
    private static SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSession() {
        if (sqlSessionFactory == null) {
            try {
                String resource = "config/mybatis-config.xml";
                InputStream inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                System.out.println("유근웅");
            }
        }

        return sqlSessionFactory.openSession(false);
    }


}
