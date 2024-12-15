package personal_cloth_service.personal_cloth_service.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    private static final Map<Long, Member> memberRepository = new HashMap<>();
    private static Long sequence = 0L;

    public void save(Member member){
        memberRepository.put(++sequence, member);
    }

    public Member findBySequence(Long sequence){
        return memberRepository.get(sequence);
    }
}
