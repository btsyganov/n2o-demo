package com.btsyganov.n2o.demo.service.entity


import java.time.LocalDateTime
import javax.persistence.*


@Table(name = "pim_individual")
@Entity
data class Client(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column
        val surname: String? = null,

        @Column
        val name: String? = null,

        @Column
        val patrName: String? = null,

        @Column(name = "birth_dt")
        val birthDate: LocalDateTime? = null,

        @Column
        val hasCitizenship: Boolean? = null,

        @Column
        val genderId: Int? = null,

        @Column
        val nationalityId: Int? = null,

        @Column
        val vip: Boolean? = null,

        @Column
        val ethnicGroupId: Int? = null,

        @Column
        val socialGroupId: Int? = null
)