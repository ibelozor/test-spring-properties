package ru.ibelozor.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.ibelozor.test.classname.MyService
import ru.ibelozor.test.classname.MyServiceProps

@Configuration
class TestConfig
@Autowired constructor(private val props: MyServiceProps) {

    @Bean
    fun getMyService(): MyService {
        return props.getService()
    }
}