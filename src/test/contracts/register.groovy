org.springframework.cloud.contract.spec.Contract.make {
    // Definition of HTTP request part of the contract
    // (this can be a valid request or invalid depending
    // on type of contract being specified).
    request {
        method POST()
        url value(consumer(regex('/tournaments/[0-9]{1}/registration')))
        headers {
            contentType(applicationJson())
        }
        body(
                email: 'abc@abc.com',
                weight: 87,
                birthDate: '1985-03-25',
                name: 'Doe',
                firstName: 'John',
                clubName: 'Dragons',
                gender: 'M'
        )
    }

    // Definition of HTTP response part of the contract
    // (a service implementing this contract should respond
    // with following response after receiving request
    // specified in "request" part above).
    response {
        status 201
    }

    // Contract priority, which can be used for overriding
    // contracts (1 is highest). Priority is optional.
    priority 1
}
