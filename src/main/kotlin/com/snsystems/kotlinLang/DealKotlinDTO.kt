package com.snsystems.kotlinLang

data class DealKotlinDTO(
    var dealId: Int = 0,
    var dealCode: String,
    var dealName: String,
    var status: String = "Active")