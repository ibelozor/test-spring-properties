package ru.ibelozor.test

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class AppTest {

    @Autowired
    lateinit var appProps: AppProps

    @Test
    fun contextLoads() {
        assertThat(appProps.testString).isNotNull()
    }

}
