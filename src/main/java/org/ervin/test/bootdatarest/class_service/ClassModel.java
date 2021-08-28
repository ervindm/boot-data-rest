package org.ervin.test.bootdatarest.class_service;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

import org.ervin.test.bootdatarest.service.ServiceModel;
import org.ervin.test.bootdatarest.customer.Customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity(name="Class")
@Table(name="Class")
@DiscriminatorValue("Class")
@Getter @Setter @NoArgsConstructor
public class ClassModel extends ServiceModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Long classDuration;

    @ManyToMany(mappedBy = "classes", fetch = FetchType.EAGER)
	Set<Customer> students;
}
