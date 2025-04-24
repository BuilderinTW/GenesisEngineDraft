package dev.twme.genesisenginedraft.role.permission;

import dev.twme.genesisenginedraft.user.User;

public interface IPermission {
    String id();

    boolean isAllow(User user);

    IPermission setAllow(boolean allow);

}
