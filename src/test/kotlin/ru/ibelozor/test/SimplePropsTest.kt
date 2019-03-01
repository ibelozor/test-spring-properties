package ru.ibelozor.test

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import ru.ibelozor.test.simpleprops.SimpleAppProps

@RunWith(SpringRunner::class)
@SpringBootTest
class SimplePropsTest {

    @Autowired
    lateinit var appProps: SimpleAppProps

    @Test
    fun simplePropsTest() {
        assertThat(appProps.testString).isNotNull()
    }
}
