package com.example.appmicroservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql({
        "classpath:sql/data.sql"
})
class AppMicroserviceApplicationTests {

    @Test
    void contextLoads() {
    }

}
