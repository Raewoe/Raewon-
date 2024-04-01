package com.ohgoraffers.section01.user;

public class MemberFinder {

    public Member[] findAllMembers(){
        return MemberRepository.findAllMembers();

    }

}
