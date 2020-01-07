package com.solt.demo.service;

import com.solt.demo.domain.*;
import com.solt.demo.repository.*;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DatabaseImpl implements IDatabase {
    private final AnimalRepository animalRepository;
    private final CageRepository cageRepository;
    private final StaffRepository staffRepository;
    private final EmergencyRepository emergencyRepository;
    private final InHouseVetRepository inHouseVetRepository;
    private final ExternalVetRepository externalVetRepository;
    private final CategoryRepository categoryRepository;
    private final SupplierRepository supplierRepository;

    public DatabaseImpl(AnimalRepository animalRepository, CageRepository cageRepository, StaffRepository staffRepository, EmergencyRepository emergencyRepository, InHouseVetRepository inHouseVetRepository, ExternalVetRepository externalVetRepository, CategoryRepository categoryRepository, SupplierRepository supplierRepository) {
        this.animalRepository = animalRepository;
        this.cageRepository = cageRepository;
        this.staffRepository = staffRepository;
        this.emergencyRepository = emergencyRepository;
        this.inHouseVetRepository = inHouseVetRepository;
        this.externalVetRepository = externalVetRepository;
        this.categoryRepository = categoryRepository;
        this.supplierRepository = supplierRepository;
    }

    @Override
    @Transactional
    public void createTable() {
        Animal animal1 = new Animal("Fish",10);
        Animal animal2 = new Animal("Mammals",10);

        Cage cage1 = new Cage(1,"London");
        Cage cage2 = new Cage(2,"Paris");

        Staff staff1 = new Staff("Thaw Thaw",25, Gender.FEMALE);
        Staff staff2 = new Staff("Maw Maw",23, Gender.MALE);

        Emergency emergency = new Emergency("Medical","Triple Zero","bad");

        ExternalVet externalVet = new ExternalVet("Thaw Thaw","Head","Japan",500000);
        InHouseVet inHouseVet = new InHouseVet("Maw Maw","Heart",400000);

        Category category1 = new Category("Fish");
        Category category2 = new Category("Mammals");

        FootItem footItem1 = new FootItem("Orange",10L);
        FootItem footItem2 = new FootItem("Apple",30L);

        Supplier supplier = new Supplier("Zaw Zaw",3,"Yangon");

        footItem1.setSupplier(supplier);
        footItem2.setSupplier(supplier);

        cage1.setAnimal(animal1);
        cage2.setAnimal(animal2);

        animal1.setCage(cage1);
        animal2.setCage(cage2);

        animal1.setCategory(category1);
        animal2.setCategory(category2);

        animal1.getFootItems().add(footItem1);
        animal1.getFootItems().add(footItem2);

        cageRepository.save(cage1);
        cageRepository.save(cage2);

        animalRepository.save(animal1);
        animalRepository.save(animal2);

        categoryRepository.save(category1);
        categoryRepository.save(category2);


        staffRepository.save(staff1);
        staffRepository.save(staff2);

        emergencyRepository.save(emergency);
        inHouseVetRepository.save(inHouseVet);
        externalVetRepository.save(externalVet);
        supplierRepository.save(supplier);
    }
}
