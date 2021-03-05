package com.kobunhada.kotlin.example.eventchain

class B(nextEvent: ChainEvent?) : ChainEvent(nextEvent) {
    override fun doEvent() {
        println("B::doEvent()")
    }
}
