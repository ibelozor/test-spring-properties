package ru.ibelozor.test.classname

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.stereotype.Component

/**
 * Service properties
 */
@Component
@ConfigurationProperties(prefix = "service")
data class MyServiceProps (
        /**
         * Device driver class name
         */
        var className: String = "ru.ibelozor.test.classname.DefaultServiceImpl"

) {
        fun getService(): MyService {
                val serviceClass = Class.forName(className)
                return MyService::class.java.cast(serviceClass.newInstance())
        }
}