package br.com.douglas.tindevflux.routes

import br.com.douglas.tindevflux.handler.DevsHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes {

    @Autowired
    lateinit var handler: DevsHandler

    @Bean
    fun route() = router {
        ("/api").nest {
            GET("/devs", handler::findAll)
        }
    }
}