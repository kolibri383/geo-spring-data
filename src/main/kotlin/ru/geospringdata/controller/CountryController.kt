package ru.geospringdata.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.geospringdata.model.Country
import ru.geospringdata.service.CountryService



@RestController
class CountryController(
    private val countryService: CountryService,
) {
    @GetMapping("/")
    fun getAllCountries():Iterable<Country> = countryService.getAllCountries()
}