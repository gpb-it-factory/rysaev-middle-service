package gazssha.com.middleservice.infrastructure.impl

import gazssha.com.middleservice.infrastructure.UserAccountRepository
import gazssha.com.middleservice.infrastructure.entity.UserEntity
import java.util.concurrent.CopyOnWriteArrayList
import org.springframework.stereotype.Repository

@Repository
class DefaultUserAccountRepository : UserAccountRepository {
  private val dataBase = CopyOnWriteArrayList<UserEntity>()
  override fun create(userEntity: UserEntity): UserEntity {
    dataBase.add(userEntity)
    return UserEntity(dataBase.indexOf(userEntity).toLong(), userEntity.userId)
  }
}
