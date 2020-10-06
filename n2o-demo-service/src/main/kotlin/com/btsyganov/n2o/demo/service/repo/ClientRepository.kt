package com.btsyganov.n2o.demo.service.repo

import com.btsyganov.n2o.demo.service.entity.Client
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Flux

interface ClientRepository : R2dbcRepository<Client, Int> {
    @Query("select * from pim_individual order by :field :direction offset :offset limit :limit")
    fun findAll(limit: Int, offset: Int, field: String, direction: String): Flux<Client>
}


