package com.dash.springcloudcontractdemo.contracts

import com.dash.springcloudcontractdemo.api.OrdersController
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach
import org.mockito.InjectMocks
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
open class ContractVerifierBase {

    @Autowired
    lateinit var ordersController: OrdersController

    @BeforeEach
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(ordersController)
    }
}
