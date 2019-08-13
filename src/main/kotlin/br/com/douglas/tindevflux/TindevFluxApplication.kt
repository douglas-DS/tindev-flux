package br.com.douglas.tindevflux

import org.springframework.boot.Banner.Mode.OFF
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TindevFluxApplication

fun main(args: Array<String>) {
	runApplication<TindevFluxApplication>(*args) { setBannerMode(OFF) }
}
