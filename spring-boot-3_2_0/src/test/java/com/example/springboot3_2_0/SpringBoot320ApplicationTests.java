package com.example.springboot3_2_0;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;
import static org.springframework.data.repository.config.BootstrapMode.LAZY;

@DataJpaTest(bootstrapMode = LAZY)
@AutoConfigureTestDatabase(replace = NONE)
@ImportTestcontainers(Containers.class)
class SpringBoot320ApplicationTests {

    @Test
    void contextLoads() {
    }

}
