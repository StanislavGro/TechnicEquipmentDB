package com.technics.infsystem.controller.models;

import com.technics.infsystem.controller.abstraction.AbstractModelController;
import com.technics.infsystem.entities.models.RefrigeratorModel;
import com.technics.infsystem.service.models.RefrigeratorModelService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "Refrigerator model", description = "Basic operations with refrigerator model are carried out here")
@RequestMapping("/model/refrigerator/")
public class RefrigeratorModelController extends AbstractModelController<RefrigeratorModel, RefrigeratorModelService> {

    protected RefrigeratorModelController(RefrigeratorModelService modelService) {
        super(modelService);
    }
}
