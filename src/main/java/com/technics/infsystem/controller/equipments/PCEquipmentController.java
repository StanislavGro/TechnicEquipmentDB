package com.technics.infsystem.controller.equipments;

import com.technics.infsystem.controller.abstraction.AbstractEquipmentController;
import com.technics.infsystem.entities.equipments.PCEquipment;
import com.technics.infsystem.service.equipments.PCEquipmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "PC equipment", description = "Basic operations with pc equipment are carried out here")
@RequestMapping("/equipment/pc/")
public class PCEquipmentController extends AbstractEquipmentController<PCEquipment, PCEquipmentService> {
    protected PCEquipmentController(PCEquipmentService equipmentService) {
        super(equipmentService);
    }
}
