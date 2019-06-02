package web.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import services.repository.model.Journalist;
import services.impl.JournalistServiceImpl;

import java.util.List;

@RequestMapping("/api/v1")
@Api(value="Journalist Management System", description="Operations pertaining to journalist in Journalist Management System")
@Controller
public class MainController {

    private final JournalistServiceImpl service;

    @Autowired
    public MainController(JournalistServiceImpl service) {
        this.service = service;
    }

    @ApiOperation(value = "View a list of available journalists", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping("/journalists")
    public List<Journalist> getAllJournalists(){
        return service.getAll();
    }
//
//    @ApiOperation(value = "Add a new journalist")
//    @PostMapping("/journalists/create")
//    public ResponseEntity<Journalist> createJournalist(
//            @ApiParam(value = "Journalist object store in database table", required = true)
//            @Valid @RequestBody Journalist journalist)
//    {
//        return ResponseEntity.ok().body(service.createNewJournalist(journalist));
//    }
//
//    @ApiOperation(value = "Update a journalist")
//    @PutMapping("/journalists/{id}")
//    public ResponseEntity <Journalist> updateJournalist (
//            @ApiParam(value = "Update journalist object", required = true) @Valid @RequestBody Journalist journalist,
//            @ApiParam(value = "Journalist Id to update journalist object", required = true) @PathVariable(value = "id") Long id
//    ) {
//        return ResponseEntity.ok(service.updateJournalist(journalist, id));
//    }
//
//    @ApiOperation(value = "Delete a journalist")
//    @DeleteMapping("/journalists/{id}")
//    public void deleteJournalist(
//            @ApiParam(value = "Journalist Id from which journalist object will delete from database table", required = true) @PathVariable long id
//    ) {
//        service.deleteJournalist(id);
//    }
//
//    @ApiOperation(value = "Search a journalist by Id")
//    @GetMapping("/journalists/{id}")
//    public ResponseEntity<Journalist> searchJournalistById(
//            @ApiParam(value = "Journalist Id to search journalist at database table", required = true) @PathVariable long id
//    ) {
//        return ResponseEntity.ok(service.getById(id));
//    }
}
