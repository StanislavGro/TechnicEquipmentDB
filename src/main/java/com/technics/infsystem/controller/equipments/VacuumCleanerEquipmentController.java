package com.technics.infsystem.controller.equipments;

import com.technics.infsystem.controller.abstraction.AbstractEquipmentController;
import com.technics.infsystem.entities.equipments.VacuumCleanerEquipment;
import com.technics.infsystem.service.equipments.VacuumCleanerEquipmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "Vacuum cleaner equipment", description = "Basic operations with vacuum cleaner equipment are carried out here")
@RequestMapping("/equipments/vacuumcleaner/")
public class VacuumCleanerEquipmentController extends AbstractEquipmentController<VacuumCleanerEquipment, VacuumCleanerEquipmentService> {
    protected VacuumCleanerEquipmentController(VacuumCleanerEquipmentService equipmentService) {
        super(equipmentService);
    }
}
