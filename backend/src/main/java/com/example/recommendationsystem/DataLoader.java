package com.example.recommendationsystem;

import com.example.recommendationsystem.model.Content;
import com.example.recommendationsystem.model.User;
import com.example.recommendationsystem.repository.ContentRepository;
import com.example.recommendationsystem.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final ContentRepository contentRepository;

    public DataLoader(UserRepository userRepository, ContentRepository contentRepository) {
        this.userRepository = userRepository;
        this.contentRepository = contentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Add sample users
        if (userRepository.count() == 0) {
            userRepository.save(new User(null, "John Doe", "Sci-Fi, Action"));
            userRepository.save(new User(null, "Jane Smith", "Drama, Romance"));
        }

        // Add sample contents
        if (contentRepository.count() == 0) {
            contentRepository.save(new Content(null, "Inception", "Sci-Fi"));
            contentRepository.save(new Content(null, "The Notebook", "Romance"));
        }
    }
}

