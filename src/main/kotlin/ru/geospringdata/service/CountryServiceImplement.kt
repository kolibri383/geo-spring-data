package ru.geospringdata.service

import org.springframework.stereotype.Service
import ru.geospringdata.dao.CountryDao
import ru.geospringdata.model.Country



@Service
class CountryServiceImplement(
    private val countryDao: CountryDao,
) : CountryService {
    override fun getAllCountries(): Iterable<Country> = countryDao.findAll()
}