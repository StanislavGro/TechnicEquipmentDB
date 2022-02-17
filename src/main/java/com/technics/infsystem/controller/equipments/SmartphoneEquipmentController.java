package com.technics.infsystem.controller.equipments;

import com.technics.infsystem.controller.abstraction.AbstractEquipmentController;
import com.technics.infsystem.entities.equipments.SmartphoneEquipment;
import com.technics.infsystem.service.equipments.SmartphoneEquipmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "Smartphone equipment", description = "Basic operations with smartphone equipment are carried out here")
@RequestMapping("/equipment/smartphone/")
public class SmartphoneEquipmentController extends AbstractEquipmentController<SmartphoneEquipment, SmartphoneEquipmentService> {
    protected SmartphoneEquipmentController(SmartphoneEquipmentService equipmentService) {
        super(equipmentService);
    }
}
