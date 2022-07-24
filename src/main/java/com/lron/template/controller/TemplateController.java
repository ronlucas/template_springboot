package com.lron.template.controller;

import com.lron.template.entities.ExampleData;
import com.lron.template.service.TemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemplateController {
    private TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping(path = "/examples")
    public List<ExampleData> getData() {
        return templateService.getExamples();
    }
}
