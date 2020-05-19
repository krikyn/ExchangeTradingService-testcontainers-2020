package com.kirill.vakhrushev.tradingservice.account.model

import kotlinx.serialization.Serializable

@Serializable
data class AccountStocks(val company: String, val count: Long, val price: Long)
