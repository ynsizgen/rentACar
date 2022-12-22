package com.project.rentACar.business.concretes;

import com.project.rentACar.business.request.CreateBrandRequest;
import com.project.rentACar.business.response.GetAllBrandsResponse;
import com.project.rentACar.business.response.GetBrandResponse;
import com.project.rentACar.entities.Brand;
import com.project.rentACar.business.abstracts.BrandService;
import com.project.rentACar.dataAccess.abstracts.BrandRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        return new DozerBeanMapper().map(brands,List.class);
    }

    @Override
    public boolean add(CreateBrandRequest createBrandRequest) {
        this.brandRepository.save(new DozerBeanMapper().map(createBrandRequest,Brand.class));
        return true;
    }

    @Override
    public GetBrandResponse getById(int id) {
        Brand brand = this.brandRepository.getById(id);
        return new DozerBeanMapper().map(brand, GetBrandResponse.class);
    }

    @Override
    public boolean delete(int id) {
        this.brandRepository.delete(this.brandRepository.getById(id));
        return true;
    }


}
