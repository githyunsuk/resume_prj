package kr.co.sist.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
 
  /**
   * 기업회원 로그인 페이지로 이동
   * @return
   */
  @GetMapping("/login")
  public String goCorpLoginForm() {
    return "login/login_form";
  }
    
  /**
   * 일반회원 로그인 처리
   * @return
   */
  @PostMapping("user/login")
  public String memberLoginProcess() {
    System.out.println("개인회원 로그인 처리");
    return "redirect:/user/main";
  }
  
  /**
   * 로그인 처리 후 유저 메인페이지 이동
   * @return
   */
  @GetMapping("user/main")
  public String goUserMainPage() {
    return "user/main_page";
  }
  
  /**
   * 기업회원 로그인 처리
   * @return
   */
  @PostMapping("corp/login")
  public String corpLoginProcess() {
    System.out.println("기업회원 로그인 처리");
    return "redirect:/corp/main";
  }
  
  /**
   * 기업회원 로그인 처리후 기업메인페이지 이동
   * @return
   */
  @GetMapping("corp/main")
  public String goCorpMainPage() {
    return "corp/main_page";
  }
  
  /**
   * 일반회원 가입 페이지로 이동
   * @return
   */
  @GetMapping("/user/join")
  public String goJoinUserForm() {
    return "login/joinUserForm";
  }
  
  /**
   * 기업회원 가입 페이지로 이동
   * @return
   */
  @GetMapping("/corp/join")
  public String goJoinCorpForm() {
    return "login/joinCorpForm";
  }
  
}
