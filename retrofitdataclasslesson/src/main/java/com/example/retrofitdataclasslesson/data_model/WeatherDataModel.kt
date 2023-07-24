package com.example.retrofitdataclasslesson.data_model

data class WeatherDataModel(
    val location: LocalModel,
    val current: CurrentModel,
    val forecast: ForecastModel
)
data class LocalModel(
    val name: String,
    val localtime : String
)
data class CurrentModel(
    val last_updated: String,
    val temp_c: String,
    val condition: ConditionModel
)
data class ConditionModel(
    val text: String,
    val icon: String
)
