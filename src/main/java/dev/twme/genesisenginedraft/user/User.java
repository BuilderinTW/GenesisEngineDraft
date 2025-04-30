package dev.twme.genesisenginedraft.user;

import dev.twme.genesisenginedraft.role.WorldRole;

import java.util.UUID;

public class User {
    private final String name;
    private final UUID uuid;
    private WorldRole role;

    public User(String name, UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public User setRole(WorldRole role) {
        this.role = role;
        return this;
    }

    public WorldRole getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public UUID getUUID() {
        return uuid;
    }
}
