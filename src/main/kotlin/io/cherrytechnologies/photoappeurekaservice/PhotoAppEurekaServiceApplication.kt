package io.cherrytechnologies.photoappeurekaservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class PhotoAppEurekaServiceApplication

fun main(args: Array<String>) {
    runApplication<PhotoAppEurekaServiceApplication>(*args)
}
