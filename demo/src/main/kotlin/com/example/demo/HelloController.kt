package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HelloController {
    @GetMapping("/demo")
    fun index(model: Model): String {
				model.addAttribute("message", "千円チャーシュー　チャカメカファイヤ　Hello World!")
				return "index"
    }
}
