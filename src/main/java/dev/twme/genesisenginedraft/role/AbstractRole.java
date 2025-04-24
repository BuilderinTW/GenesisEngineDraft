package dev.twme.genesisenginedraft.role;

import dev.twme.genesisenginedraft.role.permission.IPermission;

import java.util.List;

public abstract class AbstractRole {
    private String roleUID;
    private String roleDisplayName;
    private List<IPermission> permissions;

    public abstract AbstractRole setRoleUID(String roleUID);
    public abstract AbstractRole setDisplayName(String displayName);
    public abstract AbstractRole setPermissions(List<IPermission> permissions);

    public String getRoleUID() {
        return roleUID;
    }

    public String getRoleDisplayName() {
        return roleDisplayName;
    }

    public List<IPermission> getPermissions() {
        return permissions;
    }
}
