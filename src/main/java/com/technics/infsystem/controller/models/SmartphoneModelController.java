package com.technics.infsystem.controller.models;

import com.technics.infsystem.controller.abstraction.AbstractModelController;
import com.technics.infsystem.entities.models.SmartphoneModel;
import com.technics.infsystem.service.models.SmartphoneModelService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "Smartphone model", description = "Basic operations with smartphone model are carried out here")
@RequestMapping("/model/smartphone/")
public class SmartphoneModelController extends AbstractModelController<SmartphoneModel, SmartphoneModelService> {

    protected SmartphoneModelController(SmartphoneModelService modelService) {
        super(modelService);
    }

}
