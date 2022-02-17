package com.technics.infsystem.controller.models;

import com.technics.infsystem.controller.abstraction.AbstractModelController;
import com.technics.infsystem.entities.models.VacuumCleanerModel;
import com.technics.infsystem.service.models.VacuumCleanerModelService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "Vacuum cleaner model", description = "Basic operations with vacuum cleaner model are carried out here")
@RequestMapping("/model/vacuumCleaner/")
public class VacuumCleanerModelController extends AbstractModelController<VacuumCleanerModel, VacuumCleanerModelService> {

    protected VacuumCleanerModelController(VacuumCleanerModelService modelService) {
        super(modelService);
    }

}
