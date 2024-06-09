package gazssha.com.middleservice.infrastructure.entity

import gazssha.com.middleservice.application.entity.UserAccountRequest

data class UserEntity(val id: Long?, val userId: Long) {
  companion object {
    fun from(userAccountRequest: UserAccountRequest) = UserEntity(
      id = null,
      userId = userAccountRequest.userAccountId
    )
  }
}
