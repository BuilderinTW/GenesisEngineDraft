package dev.twme.genesisenginedraft.user.role.permission;

import dev.twme.genesisenginedraft.user.User;

public interface IPermission {
    String getName();

    boolean isAllow(User user);

    IPermission setAllow(boolean allow);

}
