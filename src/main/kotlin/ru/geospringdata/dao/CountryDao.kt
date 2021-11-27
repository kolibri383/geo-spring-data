package ru.geospringdata.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.geospringdata.model.Country

@Repository
interface CountryDao: CrudRepository<Country, Int>