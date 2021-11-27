package ru.geospringdata.service

import ru.geospringdata.model.Country

interface CountryService {
    fun getAllCountries():Iterable<Country>

}