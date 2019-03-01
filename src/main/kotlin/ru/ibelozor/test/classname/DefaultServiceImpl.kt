package ru.ibelozor.test.classname

class DefaultServiceImpl: MyService {
    override fun doSomething() {
        println("Default service implementation from ${this.javaClass.name}")
    }
}