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
                        producer(399.59),
                        consumer(matching("^(\\d{1,4}\\.+\\d*[1-9]|10{4}.0+)\$"))
                )
        ])
        bodyMatchers {
            jsonPath('$.value', byRegex("^(\\d{1,4}\\.+\\d*[1-9]|10{4}.0+)\$"))
        }
    }

    response {
        status CREATED()
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
        body([
                "id"   : $(anyUuid()),
                "value": fromRequest().body('$.value')
        ])
    }
}
