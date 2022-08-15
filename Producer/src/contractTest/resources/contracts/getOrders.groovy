package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.MediaType

Contract.make {
    request {
        method "GET"
        url "v1/orders"
        headers {
            accept(MediaType.APPLICATION_JSON_VALUE)
        }
    }

    response {
        status OK()
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
        body([
                [
                        "id"   : $(anyUuid()),
                        "value": $(anyDouble())
                ]
        ])
        bodyMatchers {
            jsonPath('$[*].id', byRegex(uuid()))
            jsonPath('$[*].value', byRegex(aDouble()))
        }
    }
}
