package com.mehmetberkan.jpa.repository;

import com.mehmetberkan.jpa.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
