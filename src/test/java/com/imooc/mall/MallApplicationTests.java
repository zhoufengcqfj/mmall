package com.imooc.mall;

import com.imooc.mall.pojo.Category;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void load() {

    }

    @Test
    void contextLoads() {
        Category category = categoryMapper.queryById(100001);
        System.out.println("category=="+category.toString());
    }

}
