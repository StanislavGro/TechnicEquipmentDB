package com.technics.infsystem.controller.equipments;

import com.technics.infsystem.controller.abstraction.AbstractEquipmentController;
import com.technics.infsystem.entities.equipments.RefrigeratorEquipment;
import com.technics.infsystem.service.equipments.RefrigeratorEquipmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "Refrigerator equipment", description = "Basic operations with refrigerator equipment are carried out here")
@RequestMapping("/equipment/refrigerator/")
public class RefrigeratorEquipmentController extends AbstractEquipmentController<RefrigeratorEquipment, RefrigeratorEquipmentService> {
    protected RefrigeratorEquipmentController(RefrigeratorEquipmentService equipmentService) {
        super(equipmentService);
    }
}
