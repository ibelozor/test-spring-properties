package ru.ibelozor.test.classname

class ServiceBImpl: MyService {
    override fun doSomething()  {
        println("Do something implementation from ${this.javaClass.name}")
    }
}