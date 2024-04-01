package com.ohgoraffers.section01.user;

public class MemberService {

    public void signUpMember(){
        Member[] members= new Member[5];
        members[0] = new Member(1, "user01","pass01","이래원",20,'남');
        members[1] = new Member(2, "user02","pass02","최창식",19,'남');
        members[2] = new Member(3, "user03","pass03","홍유람",45,'여');
        members[3] = new Member(4, "user04","pass04","송윤섭",58,'남');
        members[4] = new Member(5, "user05","pass05","강태구",31,'남');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);

    }

    public void showAllMember(){

        MemberFinder finder = new MemberFinder();

        for (Member member : finder.findAllMembers()) {
            if (member != null) {
                System.out.println(member.getInformation());
            }
        }

        System.out.println("-------------------------------------------");

    }

}
