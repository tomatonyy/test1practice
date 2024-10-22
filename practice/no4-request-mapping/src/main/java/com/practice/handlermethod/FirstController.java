package com.practice.handlermethod;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
/* @Controller, @RequestMap, @GetMapping, @PostMapping */
@Controller
@RequestMapping("/first/")
public class FirstController {

@GetMapping("regist")
    public void regist() {}
    /* WebRequest로 요청 파라미터 전달받기
    * 파라미터 선언부에 WebRequest 타입을 선언하면 해당 메소드 호출 시 인자로 값을 전달해줌
    * */
@PostMapping("regist")
public String registMenu(Model model, WebRequest request) {

    String name = request.getParameter("name");
    int age = Integer.parseInt(request.getParameter("age"));
    int groupCode = Integer.parseInt(request.getParameter("groupCode"));

    String message = name + "을(를) 신규 그룹반 목록의 " + groupCode + " 번 그룹반에 " + age + "살로 등록하셨습니다.";
    System.out.println("message = " + message);

    model.addAttribute("message", message);

    return "first/messagePrinter";
}
/* 여기까지 만든 파일: FirstController, MemberDTO, index, regist, messagePrinter */

@GetMapping("modify")
public void modify() {}

@PostMapping("modify")
public String modifyAge(Model model,
                        @RequestParam(required = false) String modifyName,
                        @RequestParam(defaultValue = "0") int modifyAge) {
    String message = modifyName + " 어린이의 나이를 " + modifyAge + "살로 변경하였습니다.";
    System.out.println("message = " + message);

    model.addAttribute("message", message);

    return "first/messagePrinter";
}

/* 여기까지 추가된 것: FirstController(PostMapping, GetMapping "modify"추가), index, modify */

}
