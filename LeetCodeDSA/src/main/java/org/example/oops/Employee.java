package org.example.oops;

import java.util.Date;

final class Employee {
    private final int id;
    private final String name;
    private final Date joiningDate;

    public Employee(int id, String name, Date joiningDate) {
        this.id = id;
        this.name = name;
        this.joiningDate = new Date(joiningDate.getTime());
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }
}
