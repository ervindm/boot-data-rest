package org.ervin.test.bootdatarest.class_service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "classes", path = "classes")
public interface ClassRepository extends PagingAndSortingRepository<ClassModel, Long> {

}
