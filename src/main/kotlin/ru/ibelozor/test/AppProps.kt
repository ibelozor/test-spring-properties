package ru.ibelozor.test

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * настройки приложения
 */
@Component
@ConfigurationProperties(prefix = "testapp")
data class AppProps (
        /**
         * Test string description.
         */
        var testString: String? = null,
        /**
         * вопрос-ответ
         */
        var isYes: Boolean = true,
        var int_val: Int = 0
        )