package gazssha.com.middleservice.presentation.controller

import gazssha.com.middleservice.presentation.dto.CreateUserRequest
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class UserController {



  @PostMapping(
    value = ["/register"],
    produces = [MediaType.APPLICATION_JSON_VALUE],
    consumes = [MediaType.APPLICATION_JSON_VALUE]
  )
  fun registerUser(createUserRequest: CreateUserRequest): ResponseEntity<> {

  }
}
