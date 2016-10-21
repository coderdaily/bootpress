package net.coderdaily.controller.bgsq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2016/10/20 22:01
 * Blog: coderdaily.net
 */
@Controller
@RequestMapping("voice2text")
public class VoiceInputController
{
    @RequestMapping("/index")
    public String voiceToTextIndex(){

        return "voice_to_text";
    }

}
