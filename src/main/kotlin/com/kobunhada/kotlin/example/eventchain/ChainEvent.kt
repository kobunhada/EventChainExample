package com.kobunhada.kotlin.example.eventchain

abstract class ChainEvent {

    private var nextEvent: ChainEvent? = null

    constructor() {}
    constructor(nextEvent: ChainEvent?) {
        this.nextEvent = nextEvent
    }

    protected abstract fun doEvent()
    fun execute() {
        doEvent()
        if (nextEvent != null) {
            nextEvent!!.execute()
        }
    }

}