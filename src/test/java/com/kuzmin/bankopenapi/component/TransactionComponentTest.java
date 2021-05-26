package com.kuzmin.bankopenapi.component;

import com.kuzmin.bankopenapi.controller.TransactionController;
import com.kuzmin.bankopenapi.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@SpringBootTest()
public class TransactionComponentTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    void getAllByAccName() {
                given().
                        standaloneSetup(new TransactionController(transactionService))
                        .params("accountNumber", "abc").
                when().
                        get("/transactions").
                then().
                        statusCode(200);
    }
}
