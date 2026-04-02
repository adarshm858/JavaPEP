package test3;

import java.util.ArrayList;
import java.util.List;

// Main class must be public and match the filename Member.java
public class member {
    private String memberId;
    private String name;

    public member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getters (Encapsulation)
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}

// Inheritance: StudentMember extends Member
class StudentMember extends member{
    private int borrowLimit = 5;

    public StudentMember(String memberId, String name) {
        // super() calls the constructor of the parent Member class
        super(memberId, name);
    }

    public int getBorrowLimit() {
        return borrowLimit;
    }
}