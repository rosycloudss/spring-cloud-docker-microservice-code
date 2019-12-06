package com.lw.microservicesimpleprovideruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lw.microservicesimpleprovideruser.bean.User;

/**
 * @author liwei-4
 * @description:
 * @date 2019-12-06
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
