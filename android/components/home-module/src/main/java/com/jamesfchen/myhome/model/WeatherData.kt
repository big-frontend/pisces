package com.jamesfchen.myhome.model

import com.jamesfchen.myhome.model.factor.Clouds
import com.jamesfchen.myhome.model.factor.Wind
import com.jamesfchen.myhome.model.weather.Coordinate
import com.jamesfchen.myhome.model.weather.Main
import com.jamesfchen.myhome.model.weather.Weather

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: hawskjamesf
 * @since: Sep/25/2018  Tue
 */
data class WeatherData(
    var id: Int,
    var name: String,
    var coord: Coordinate,

    var dt: Int,//Time of data calculation, unix, UTC
    var dt_txt:String,


    var weather: List<Weather>,
    var base: String,

    var main: Main,
    var visibility: Int,

    var wind: Wind,
    var clouds: Clouds,
    var sys: Sys,

    var code: Int
) {

}