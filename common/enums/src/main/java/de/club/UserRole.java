package de.club;

public enum UserRole {
    USER(1),
    MANAGER(2),
    ADMIN_USER(3),
    SUPER_ADMIN_USER(4);

    private final int role;
    private UserRole (int role) {
        this.role= role;
    }

    public int getUserRole(){
        return this.role;
    }

}
