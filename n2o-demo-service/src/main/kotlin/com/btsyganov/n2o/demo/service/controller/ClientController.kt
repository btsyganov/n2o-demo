package com.btsyganov.n2o.demo.service.controller

import com.btsyganov.n2o.demo.service.entity.Client
import com.btsyganov.n2o.demo.service.repo.ClientRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController(private val clientRepository: ClientRepository) {
    @GetMapping("/clients")
    fun findAll(@RequestParam page: Int, @RequestParam size: Int, @RequestParam(required = false) sort: String?): Page<Client> {
        val request: Pageable
        request = if (sort != null && sort.split(",").size == 2) {
            val sortField = sort.split(",")[0]
            val sortDirection = sort.split(",")[1]
            PageRequest.of(page - 1, size, Sort.by(if ("asc" == sortDirection) Sort.Direction.ASC else Sort.Direction.DESC, sortField))
        } else
            PageRequest.of(page - 1, size)

        return clientRepository.findAll(request)
    }

    @GetMapping("/clients/{id}")
    fun findById(@PathVariable id: Int): Client {
        return clientRepository.findById(id).orElseThrow()
    }
}