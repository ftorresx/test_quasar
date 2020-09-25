package org.quasar.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.quasar.test.dto.AnswerDTO;
import org.quasar.test.dto.PositionDTO;
import org.quasar.test.utils.Utils;
import org.quasar.test.dto.QuasarDTO;
import org.quasar.test.service.IQuasarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin("*")
@Slf4j
public class QuasarController {

    @Autowired
    private IQuasarService quasarService;


    @PostMapping(path = "/topsecret", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> coordNave(@RequestBody final QuasarDTO quasarDTO) {

        Double[] distance = quasarService.getLocation(Utils.getDistances(quasarDTO));
        String message = quasarService.getMessage(Utils.getMessages(quasarDTO));

        PositionDTO positionDTO = new PositionDTO();
        positionDTO.setX(distance[0]);
        positionDTO.setY(distance[1]);
        AnswerDTO answerDTO = new AnswerDTO();
        answerDTO.setPosition(positionDTO);
        answerDTO.setMessage(message);

        return ResponseEntity.ok(answerDTO);
    }


}
