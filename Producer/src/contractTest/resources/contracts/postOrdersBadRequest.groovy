package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.MediaType

Contract.make {
    request {
        method "POST"
        url "/v1/orders"
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
        body([
                "value": value(
                        producer(-25.50),
                        consumer(notMatching("^(\\d{1,4}\\.+\\d*[1-9]|10{4}.0+)\$"))
                )
        ])

        bodyMatchers {
            jsonPath('$.value', byRegex("^-(\\d*\\.\\d+)\$"))
        }
    }

    response {
        status BAD_REQUEST()
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
        body([
                "error": "invalid order value, accepted values between: 0.00 - 10,000.00"
        ])
    }
}
