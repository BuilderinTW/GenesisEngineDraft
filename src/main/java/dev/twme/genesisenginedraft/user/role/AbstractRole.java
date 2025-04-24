package dev.twme.genesisenginedraft.user.role;

public abstract class AbstractRole {
    private String roleUID;
    private String roleDisplayName;

    public abstract AbstractRole setRoleUID(String roleUID);
    public abstract AbstractRole setDisplayName(String displayName);

    public String getRoleUID() {
        return roleUID;
    }

    public String getRoleDisplayName() {
        return roleDisplayName;
    }
}
