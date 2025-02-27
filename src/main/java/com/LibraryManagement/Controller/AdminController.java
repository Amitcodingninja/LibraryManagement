package com.LibraryManagement.Controller;

import com.LibraryManagement.DTO.LoginRequestDTO;
import com.LibraryManagement.DTO.LoginResponseDTO;
import com.LibraryManagement.DTO.RegisterRequestDTO;
import com.LibraryManagement.Entity.User;
import com.LibraryManagement.Service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {
    @Autowired
    private AuthenticationService authenticationService;
@PostMapping("/registeradminuser")
    public ResponseEntity<User> registerAdminUser(@RequestBody RegisterRequestDTO registerRequestDTO) {
        return ResponseEntity.ok(authenticationService.registerAdminUser(registerRequestDTO));
    }


}
