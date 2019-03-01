package ru.ibelozor.test

import org.assertj.core.api.Assertions
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import ru.ibelozor.test.classname.MyService
import ru.ibelozor.test.simpleprops.SimpleAppProps

@RunWith(SpringRunner::class)
@SpringBootTest
class ClassNamePropsTest {

    @Autowired
    lateinit var myService: MyService

    @Test
    fun simplePropsTest() {
        Assertions.assertThat(myService).isNotNull()
        myService.doSomething()
    }

}