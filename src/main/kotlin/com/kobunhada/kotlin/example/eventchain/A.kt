package com.kobunhada.kotlin.example.eventchain

class A : ChainEvent(B(C())) {
    override fun doEvent() {
        println("")
        println("A::doEvent()")
    }
}
