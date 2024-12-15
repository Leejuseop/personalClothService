package personal_cloth_service.personal_cloth_service.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    String memberId;
    String memberPw;
    String memberName;

    public Member(){}

    public Member(String memberId, String memberPw, String memberName){
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
    }

    public Member(String memberId, String memberPw){
        this.memberId = memberId;
        this.memberPw = memberPw;
    }

    public Member(String memberName){
        this.memberName = memberName;
    }


}
