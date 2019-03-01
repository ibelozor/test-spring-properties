package ru.ibelozor.test.classname

class ServiceAImpl: MyService {
    override fun doSomething()  {
        println("Do something implementation from ${this.javaClass.name}")
    }
}