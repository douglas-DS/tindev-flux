package br.com.douglas.tindevflux.handler

import br.com.douglas.tindevflux.model.Devs
import br.com.douglas.tindevflux.model.DevsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class DevsHandler {

    @Autowired
    lateinit var repository: DevsRepository

    fun findAll(req: ServerRequest): Mono<ServerResponse> {
        val devs: Flux<Devs> = repository.findAll()
        return ok().contentType(APPLICATION_JSON).body(devs)
    }

//    fun save(req: ServerRequest): Mono<ServerResponse> {
//        val user: Mono<String> = req.bodyToMono(String::class.java)
//        val webClient: WebClient = WebClient.create("https://api.github.com/users/$user")
//        return
//    }

}