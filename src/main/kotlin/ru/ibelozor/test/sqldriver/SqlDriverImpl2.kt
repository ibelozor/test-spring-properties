package ru.ibelozor.test.sqldriver

import java.sql.Connection
import java.sql.DriverPropertyInfo
import java.util.*
import java.util.logging.Logger

class SqlDriverImpl2: java.sql.Driver {
    override fun getMinorVersion(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getParentLogger(): Logger {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPropertyInfo(url: String?, info: Properties?): Array<DriverPropertyInfo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun jdbcCompliant(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun acceptsURL(url: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun connect(url: String?, info: Properties?): Connection {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMajorVersion(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}