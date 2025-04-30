package dev.twme.genesisenginedraft.space.world;

import dev.twme.genesisenginedraft.space.world.state.WorldVisibility;
import dev.twme.genesisenginedraft.user.User;

public abstract class GEWorldData {
    protected String worldID;
    protected String worldDisplayName;
    protected String worldGeneratorID;
    protected String worldDescription;

    protected User worldOwner;

    protected int seed;

    protected WorldVisibility worldVisibility;

    /**
     * Get the world ID
     * @return The world ID
     */
    public String id(){
        return worldID;
    }

    /**
     * Get the world display name
     * @return The world display name
     */
    public String display(){
        return worldDisplayName;
    }

    /**
     * Get the world generator ID
     * @return The world generator ID
     */
    public String description(){
        return worldDescription;
    }

    /**
     * Get the world generator ID
     * @return The world generator ID
     */
    public String generator() {
        return worldGeneratorID;
    }

    /**
     * Get the world seed
     * @return The world seed
     */
    public int seed() {
        return seed;
    }

}
