package com.site.blog.my.core;

import com.site.blog.my.core.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBlogApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(MD5Util.MD5Encode("5260@lfs", "UTF-8"));

    }

}
