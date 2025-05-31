package de.club.service.expose;


import de.club.userservices.UserImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class HealthCheck {


    private final UserImp userImp ;

    public HealthCheck(UserImp userImp) {
        this.userImp = userImp;
    }

    @GetMapping("/v1/health")
    public ResponseEntity<Object> isHealthCheck() {
        return ResponseEntity.ok().build();
    }

}
