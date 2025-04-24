package dev.twme.genesisenginedraft.user;

import java.util.UUID;

public class User {
    private final String name;
    private final UUID uuid;

    public User(String name, UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public UUID getUUID() {
        return uuid;
    }
}
