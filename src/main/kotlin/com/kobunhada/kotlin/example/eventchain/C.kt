package com.kobunhada.kotlin.example.eventchain

class C : ChainEvent() {
    override fun doEvent() {
        println("C::doEvent()")
    }
}
