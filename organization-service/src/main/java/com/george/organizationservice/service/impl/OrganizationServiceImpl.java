package com.george.organizationservice.service.impl;

import com.george.organizationservice.dto.OrganizationDto;
import com.george.organizationservice.entity.Organization;
import com.george.organizationservice.mapper.OrganizationMapper;
import com.george.organizationservice.repository.OrganizationRepository;
import com.george.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository repository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = repository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationsByCode(String code) {
        Organization organization = repository.findByOrganizationCode(code);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
