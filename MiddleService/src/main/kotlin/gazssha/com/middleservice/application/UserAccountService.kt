package gazssha.com.middleservice.application

import gazssha.com.middleservice.application.entity.UserAccountRequest
import gazssha.com.middleservice.infrastructure.entity.UserEntity
import org.springframework.stereotype.Service

@Service
class UserAccountService(private val userAccountGateway: UserAccountGateway) {
  fun createUserAccount(userAccountRequest: UserAccountRequest) {
    val userEntity = UserEntity.from(userAccountRequest)
    userAccountGateway.createUser(userEntity)
  }
}
