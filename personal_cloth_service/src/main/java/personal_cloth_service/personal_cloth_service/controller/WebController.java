package personal_cloth_service.personal_cloth_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import personal_cloth_service.personal_cloth_service.member.Member;
import personal_cloth_service.personal_cloth_service.member.MemberRepository;


@Controller
@Slf4j
public class WebController {

    private final MemberRepository memberRepository;

    @Autowired
    public WebController(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @GetMapping("/")
    public String loginForm(){
        return "loginForm.html";
    }

    @PostMapping("/loginSuccess")
    public String loginSuccesForm(){
        return "loginSuccess";
    }

    @GetMapping("/signUp1IdPw")
    public String signUp1IdPwForm(){
        return "signUp1IdPw";
    }

    @PostMapping("/signUp2Name")
    public String signUp2NameForm(@ModelAttribute("member") Member member){
        memberRepository.save(member);
        return "signUp2Name";
    }
}
