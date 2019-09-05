package com.example.demo.web.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Validated
@Api(value = "Custom", description = "the Custom API")
public interface CustomApi {


    @ApiOperation(value = "", nickname = "getCustom")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation")})
    @RequestMapping(value = "/custom",
            produces = {"application/json"},
            method = RequestMethod.GET)
    default ResponseEntity<String> getCustom() {
        return ResponseEntity.ok("custom");
    }

}
