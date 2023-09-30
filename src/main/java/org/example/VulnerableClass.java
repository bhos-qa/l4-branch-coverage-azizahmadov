package org.example;

public class VulnerableClass {
    public String displayMessage(String userMessage) {
        String message = "<div>Welcome, " + userMessage + "!</div>";
        return message;
    }

    // Rest of the class...
}

