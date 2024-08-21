package com.dangchan.dangchan.user.controller;

import com.dangchan.dangchan.user.dto.JoinDTO;
import com.dangchan.dangchan.user.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String JoinProcess(@RequestBody JoinDTO joinDTO){
        joinService.joinProcess(joinDTO);

        return "ok";
    }
}
