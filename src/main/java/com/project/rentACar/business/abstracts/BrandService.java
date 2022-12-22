package com.project.rentACar.business.abstracts;

import com.project.rentACar.business.request.CreateBrandRequest;
import com.project.rentACar.business.response.GetAllBrandsResponse;
import com.project.rentACar.business.response.GetBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    boolean add(CreateBrandRequest createBrandRequest);
    GetBrandResponse getById(int id);
    boolean delete(int id);

}
