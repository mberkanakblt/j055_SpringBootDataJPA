package com.mehmetberkan.jpa.controller;

import com.mehmetberkan.jpa.entity.UserProfile;
import com.mehmetberkan.jpa.service.UserProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user- profile")
public class UserProfileController {

    private final UserProfileService userProfileService;
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }
    @GetMapping("/default-create-user")
    public void defaultUserCreate(){

    }
    @GetMapping("/get-all")
    public ResponseEntity<List<UserProfile>> getAll(){
        List<UserProfile> allProfiles = userProfileService.getAll();
        return ResponseEntity.ok(allProfiles);
    }
}
