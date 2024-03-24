package org.example

import kotlinx.coroutines.*


fun main() {
//    println("Hello World!")
    runBlocking {
//        launch {
//            doWorld()
//        }
        doWorld2()
        println("Done")
    }
}


//Coroutine Basics
suspend fun doWorld() {
    /**
     * supervisorScope and coroutineScope creates scope from outer scope,
     * but replace underlying Job
     * They provide functionality of parallel decomposition
     * They both returns until the block and all coroutine inside are finished
     * So they can be used as a blocking mechanism
     * */
    supervisorScope {


    }
    coroutineScope {
        delay(1000L)
        println("Oh, that is amazing")
    }
}

// Coroutine Basics
// example of parallel decomposition
suspend fun doWorld2() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}