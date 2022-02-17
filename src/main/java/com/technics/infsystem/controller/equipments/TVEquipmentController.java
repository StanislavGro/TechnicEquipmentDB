package com.technics.infsystem.controller.equipments;

import com.technics.infsystem.controller.abstraction.AbstractEquipmentController;
import com.technics.infsystem.entities.equipments.TVEquipment;
import com.technics.infsystem.service.equipments.TVEquipmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Tag(name = "TV equipment", description = "Basic operations with tv equipment are carried out here")
@RequestMapping("/equipment/tv/")
public class TVEquipmentController extends AbstractEquipmentController<TVEquipment, TVEquipmentService> {

    protected TVEquipmentController(TVEquipmentService equipmentService) {
        super(equipmentService);
    }

}
