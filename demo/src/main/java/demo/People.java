package demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class People {
    private UUID id;
    private String email;

    private String name;

    public People(@JsonProperty("email") String email, @JsonProperty("name") String name) {
        this.id=UUID.randomUUID();
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
