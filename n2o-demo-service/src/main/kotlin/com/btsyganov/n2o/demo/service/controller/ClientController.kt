package com.btsyganov.n2o.demo.service.controller

import com.btsyganov.n2o.demo.service.repo.ClientRepository
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController(private val clientRepository: ClientRepository) {
    @GetMapping("/clients")
    fun findAll(@RequestParam page: Int, @RequestParam size: Int) = clientRepository.findAll(PageRequest.of(page, size))
}