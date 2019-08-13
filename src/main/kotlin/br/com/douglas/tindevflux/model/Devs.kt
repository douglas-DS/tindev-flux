package br.com.douglas.tindevflux.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface  DevsRepository: ReactiveMongoRepository<Devs, String>

@Document
data class Devs(
        @Id val id: String,
        val name: String,
        val user: String,
        val bio: String?,
        val avatar: String,
        @CreatedDate val createdAt: Date,
        val updatedAt: Date)