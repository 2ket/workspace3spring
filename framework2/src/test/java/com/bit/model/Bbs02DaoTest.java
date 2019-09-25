package com.bit.model;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import com.bit.model.entity.Bbs02Vo;

public class Bbs02DaoTest {
   
   @org.junit.Test
   public void testGetConnection() throws SQLException {
      
     try{Bbs02Dao dao=new Bbs02Dao();
      Connection conn=dao.getConnection();
     }catch (SQLException e) {
        Assert.assertFalse(true); //널이아님 성공
   }
      
   }

   
   @Test
   public void testInsertOne() throws SQLException {
      Bbs02Vo bean=new Bbs02Vo();
      bean.setName("tester");
      bean.setSub("testData");
      bean.setContent("test");
      Bbs02Dao dao=new Bbs02Dao();
      Assert.assertSame(1, dao.insertOne(bean));
   }
      
//      Assert.assertNotNull(dao); //널이면 성공
//      Assert.assertEquals(1, 1); // 같으면성공
//      Assert.assertSame(1, 1); // 같으면 성공
//      Assert.assertNotSame(1, 2); // 같지않으면 성공
//      Assert.assertTrue(true); // true면 성공
//      Assert.assertFalse(false); //false면 성공
      
}