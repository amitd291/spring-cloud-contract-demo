package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.MediaType

Contract.make {
    request {
        method "POST"
        url "v1/orders"
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
        body(
                "value": 399.59
        )
    }

    response {
        status CREATED()
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
        body(
                "id": $(anyUuid()),
                "value": 399.59
        )
    }
}
