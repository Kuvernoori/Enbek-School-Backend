package com.cozy.QuizSystem.infrastructure.persistence;
import com.cozy.QuizSystem.domain.model.User;
import com.cozy.QuizSystem.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public class UserRepositoryImpl implements UserRepository {
    private final UserJpaRepository jpaRepository;

    public UserRepositoryImpl(UserJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public User save(User user) {
        UserEntity entity = toEntity(user);
        UserEntity saved = jpaRepository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<User> findByPhone (String phone) {
        return jpaRepository.findByPhone(phone)
                .map(this::toDomain);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpaRepository.findByEmail(email)
                .map(this::toDomain);
    }

    @Override
    public boolean existsByPhone (String phone) {
        return jpaRepository.existsByPhone(phone);
    }

    private UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setPhone(user.getPhone());
        entity.setRole(user.getRole());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setSecondName(user.getSecondName());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        return entity;
    }

    private User toDomain(UserEntity entity) {
        return new User(
                entity.getId(),
                entity.getPhone(),
                entity.getRole(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getSecondName(),
                entity.getEmail(),
                entity.getPassword(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }
}
