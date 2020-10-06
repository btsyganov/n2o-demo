package com.btsyganov.n2o.demo.service.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("pim_individual")
data class Client(
        @Id
        val id: Int,

        val surname: String? = null,

        val name: String? = null,

        val patrName: String? = null,

        @Column("birth_dt")
        val birthDate: LocalDateTime? = null,

        val hasCitizenship: Boolean? = null,

        val genderId: Int? = null,

        val nationalityId: Int? = null,

        val vip: Boolean? = null,

        val ethnicGroupId: Int? = null,

        val socialGroupId: Int? = null
)