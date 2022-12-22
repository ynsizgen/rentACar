package com.project.rentACar.webApi.controllers;

import com.project.rentACar.business.abstracts.BrandService;
import com.project.rentACar.business.request.CreateBrandRequest;
import com.project.rentACar.business.response.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {

    private BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<GetAllBrandsResponse>> getAll(){
        return ResponseEntity.ok(this.brandService.getAll());
    }

    @GetMapping("/getById")
    public ResponseEntity getById(int id){
        return ResponseEntity.ok(this.brandService.getById(id));
    }

    @PostMapping("/addBrand")
    public ResponseEntity<Boolean> add(CreateBrandRequest createBrandRequest){
       return ResponseEntity.ok(this.brandService.add(createBrandRequest));
    }

    @DeleteMapping("/deleteBrand")
    public ResponseEntity<Boolean> delete(int id){
       return ResponseEntity.ok(this.brandService.delete(id));
    }
}
