package net.coderdaily.controller.content;

import net.coderdaily.bean.content.ContentEntity;
import net.coderdaily.service.content.IContentService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2016/9/21 21:48
 * Blog: coderdaily.net
 */
@Controller
@RequestMapping("content")
public class ContentController {
    @Autowired
    private IContentService contentService;

    @RequestMapping(value = "/findAll",method = {RequestMethod.GET})
    public String findAll(HttpServletRequest request, Model model){
        List<ContentEntity> list = contentService.findAll();
        model.addAttribute("list",list);
        return "index";
    }
}
