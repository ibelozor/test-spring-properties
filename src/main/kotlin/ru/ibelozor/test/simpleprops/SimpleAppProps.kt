package ru.ibelozor.test.simpleprops

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.stereotype.Component

/**
 * Application properties
 */
@Component
@ConfigurationProperties(prefix = "testapp")
data class SimpleAppProps (
        /**
         * Test string description.
         */
        var testString: String? = null,
        /**
         * booolean description
         */
        var isYes: Boolean = true,
        /**
         * nested props description
         */
        @NestedConfigurationProperty
        var nestedProp: Nested = Nested()
        ) {
    data class Nested (
            var int_val: Int = 0,
            /**
             * enum value description
             */
            var enumVal: EnumVal? = null
    )
}