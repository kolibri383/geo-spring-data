package ru.geospringdata.model

import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
open class Country(
    @Id
    @Autowired
    val id: Int,
    val name: String,
)