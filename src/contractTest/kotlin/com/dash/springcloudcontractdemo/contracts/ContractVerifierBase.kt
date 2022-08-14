package com.dash.springcloudcontractdemo.contracts

import com.dash.springcloudcontractdemo.api.OrdersController
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach

open class ContractVerifierBase {
    @BeforeEach
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(OrdersController())
    }
}