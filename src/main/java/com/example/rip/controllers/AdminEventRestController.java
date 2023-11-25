package com.example.rip.controllers;

import com.example.rip.models.dtos.response.EventRes;
import com.example.rip.models.dtos.response.MenuElement;
import com.example.rip.services.EventService;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author Vladimir Krasnov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminEventRestController {
    private final EventService eventService;

    @DeleteMapping("/event/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable(name = "id") Integer id) {
        EventRes res = eventService.deleteEventById(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
