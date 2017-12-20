package org.springframework.samples.petclinic.health;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HealthController {

    @GetMapping("/health")
    public String showHealth() {
        return "welcome";
    }
}
