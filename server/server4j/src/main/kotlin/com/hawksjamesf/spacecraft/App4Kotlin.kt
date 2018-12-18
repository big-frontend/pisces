package com.hawksjamesf.spacecraft

import org.springframework.boot.runApplication
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: jf.chen
 * @since: Dec/18/2018  Tue
 */
fun main(args: Array<String>) {
    runApplication<App4Kotlin>(*args)
//    SpringApplication.run(App4Kotlin::class.java,*args)
}

class App4Kotlin {
    fun routerFuc(): RouterFunction<ServerResponse> = router {
    }
}