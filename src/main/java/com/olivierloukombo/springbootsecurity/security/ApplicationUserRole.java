package com.olivierloukombo.springbootsecurity.security;

import com.google.common.collect.Sets;
import static com.olivierloukombo.springbootsecurity.security.ApplicationUserPermission.*;

import java.util.Set;


public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
    ADMIN_TRAINEE(Sets.newHashSet(COURSE_READ, STUDENT_READ));

    private final Set<ApplicationUserPermission> userPermissions;

    ApplicationUserRole(Set<ApplicationUserPermission> userPermissions) {
        this.userPermissions = userPermissions;
    }

    public Set<ApplicationUserPermission> getUserPermissions() {
        return userPermissions;
    }
}
