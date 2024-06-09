package gazssha.com.middleservice.application

import gazssha.com.middleservice.infrastructure.UserAccountRepository
import gazssha.com.middleservice.infrastructure.entity.UserEntity
import org.springframework.stereotype.Service

@Service
class UserAccountGateway(private val userAccountRepository: UserAccountRepository) {
  fun createUser(userEntity: UserEntity) = userAccountRepository.create(userEntity)
}
