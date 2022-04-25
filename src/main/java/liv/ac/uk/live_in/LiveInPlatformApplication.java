package liv.ac.uk.live_in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class LiveInPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiveInPlatformApplication.class, args);
    }
}
