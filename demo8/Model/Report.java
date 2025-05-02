package org.example.demo8.Model;

import java.time.LocalDateTime;

class Report {
    private User reporter;
    private int idOfContent;
    private String reason;
    private LocalDateTime timestamp;
    private boolean isHandled;

    public Report(User reporter, int idOfContent, String reason) {
        this.reporter = reporter;
        this.idOfContent = idOfContent;
        this.reason = reason;
        this.timestamp = LocalDateTime.now();
        this.isHandled = false;
    }

    public void markHandled() {
        isHandled = true;
    }

    public boolean isHandled() {
        return isHandled;
    }

    public User getReporter() {
        return reporter;
    }

    public int getReportedContent() {
        return idOfContent;
    }

    public String getReason() {
        return reason;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
