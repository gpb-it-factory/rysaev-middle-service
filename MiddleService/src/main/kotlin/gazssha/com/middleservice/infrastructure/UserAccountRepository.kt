package gazssha.com.middleservice.infrastructure

import gazssha.com.middleservice.infrastructure.entity.UserEntity

interface UserAccountRepository {
  fun create(userEntity: UserEntity): UserEntity
}
