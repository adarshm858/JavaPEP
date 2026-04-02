package test3;

import java.util.ArrayList;
import java.util.List;


public class member {
    private String memberId;
    private String name;

    public member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

   
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}


class StudentMember extends member{
    private int borrowLimit = 5;

    public StudentMember(String memberId, String name) {
       
        super(memberId, name);
    }

    public int getBorrowLimit() {
        return borrowLimit;
    }
}
