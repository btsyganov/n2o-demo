package com.btsyganov.n2o.demo.service.repo

import com.btsyganov.n2o.demo.service.entity.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository : JpaRepository<Client, Int>