package org.example.demo8.Model;

import java.time.LocalDateTime;

/// /////
public class Comment {
    private User commenter;
    private String text;
    private LocalDateTime timestamp;

    public Comment(User commenter, String text) {
        this.commenter = commenter;
        this.text = text;
        this.timestamp = LocalDateTime.now();
    }

    public User getCommenter() {
        return commenter;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
