package com.technics.infsystem.controller.models;

import com.technics.infsystem.controller.abstraction.AbstractModelController;
import com.technics.infsystem.entities.models.TVModel;
import com.technics.infsystem.service.models.TVModelService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "TV model", description = "Basic operations with tv model are carried out here")
@RequestMapping("/model/tv/")
public class TVModelController extends AbstractModelController<TVModel, TVModelService> {

    protected TVModelController(TVModelService modelService) {
        super(modelService);
    }

}
