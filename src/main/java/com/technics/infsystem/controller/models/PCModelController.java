package com.technics.infsystem.controller.models;

import com.technics.infsystem.controller.abstraction.AbstractModelController;
import com.technics.infsystem.entities.models.PCModel;
import com.technics.infsystem.service.models.PCModelService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "PC model", description = "Basic operations with pc model are carried out here")
@RequestMapping("/model/computer/")
public class PCModelController extends AbstractModelController<PCModel, PCModelService> {

    protected PCModelController(PCModelService modelService) {
        super(modelService);
    }

}
