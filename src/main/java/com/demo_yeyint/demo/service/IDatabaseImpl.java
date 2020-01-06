package com.demo_yeyint.demo.service;

import com.demo_yeyint.demo.domain.*;
import com.demo_yeyint.demo.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class IDatabaseImpl implements IDatabase {

    private final StaffRepository staffRepository;
    private final EmergencyRepository emergencyRepository;
    private final InHouseRepository inHouseRepository;
    private final ExternalRepository externalRepository;
    private final AnimalsRepository animalsRepository;
    private final CategoryRepository categoryRepository;
    private final FoodItemRepository foodItemRepository;
    private final SupplierRepository supplierRepository;
    private final CageRepository cageRepository;

    public IDatabaseImpl(StaffRepository staffRepository, EmergencyRepository emergencyRepository, InHouseRepository inHouseRepository, ExternalRepository externalRepository, AnimalsRepository animalsRepository, CategoryRepository categoryRepository, FoodItemRepository foodItemRepository, SupplierRepository supplierRepository, CageRepository cageRepository) {
        this.staffRepository = staffRepository;
        this.emergencyRepository = emergencyRepository;
        this.inHouseRepository = inHouseRepository;
        this.externalRepository = externalRepository;
        this.animalsRepository = animalsRepository;
        this.categoryRepository = categoryRepository;
        this.foodItemRepository = foodItemRepository;
        this.supplierRepository = supplierRepository;
        this.cageRepository = cageRepository;
    }

    @Override
    @Transactional
    public void createTables() {

        Staff staff1=new Staff("Mr Arfam",23,400000, 'M');
        Staff staff2=new Staff("Mr John",23,500000, 'M');
        Staff staff3=new Staff("Mr Johnson",23,200000, 'M');
        Staff staff4=new Staff("Aye Aye Aung",23,240000, 'F');

        staffRepository.save(staff1);
        staffRepository.save(staff2);
        staffRepository.save(staff3);
        staffRepository.save(staff4);

        Emergency emergency1=new Emergency("AA","Bamboo","Somewhere");
        emergencyRepository.save(emergency1);

        InHouseVet inHouseVet1=new InHouseVet("Ye Naung",40000);
        InHouseVet inHouseVet2=new InHouseVet("Ye Thway",50000);
        InHouseVet inHouseVet3=new InHouseVet("Tun Naung",30000);

        inHouseRepository.save(inHouseVet1);
        inHouseRepository.save(inHouseVet2);
        inHouseRepository.save(inHouseVet3);

        External_Vet external_vet1=new External_Vet("Mr Scoffield","USA",5000000);
        External_Vet external_vet2=new External_Vet("Mr Micheal","England",4000000);
        External_Vet external_vet3=new External_Vet("Mr Blue","Thailand",3000000);

        externalRepository.save(external_vet1);
        externalRepository.save(external_vet2);
        externalRepository.save(external_vet3);


        Category category1=new Category("GroupA");
        Category category2=new Category("GroupB");
        Category category3=new Category("GroupC");

        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);

        Animals animals1=new Animals("Tiger",50);
        Animals animals2=new Animals("Cat",20);
        Animals animals3=new Animals("Dog",10);

        animals1.setCategory(category1);
        animals2.setCategory(category2);
        animals3.setCategory(category3);


        animalsRepository.save(animals1);
        animalsRepository.save(animals2);
        animalsRepository.save(animals3);



        Supplier supplier1=new Supplier("Aung Aung","09971763657","Yangon");
        Supplier supplier2=new Supplier("Aung Hla","0997176357","North Okkalapa yangon");
        Supplier supplier3=new Supplier("Aung Aung","0997176657","Taung gyi");

        supplierRepository.save(supplier1);
        supplierRepository.save(supplier2);
        supplierRepository.save(supplier3);

        Food_Item food_item1=new Food_Item("Pop Corn",20);
        Food_Item food_item2=new Food_Item("Banana",20);
        Food_Item food_item3=new Food_Item("Pork",20);

        food_item1.setSupplier(supplier1);
        food_item2.setSupplier(supplier2);
        food_item3.setSupplier(supplier3);
        food_item1.setSupplier(supplier2);

        foodItemRepository.save(food_item1);
        foodItemRepository.save(food_item2);
        foodItemRepository.save(food_item3);


        animals1.getFood_itemList().add(food_item1);
        animals2.getFood_itemList().add(food_item2);
        animals3.getFood_itemList().add(food_item3);


        food_item1.getAnimalsList().add(animals1);
        food_item2.getAnimalsList().add(animals2);
        food_item3.getAnimalsList().add(animals3);

        animalsRepository.save(animals1);
        animalsRepository.save(animals2);
        animalsRepository.save(animals3);


        Cage cage1=new Cage("123","South");
        Cage cage2=new Cage("12345","North");
        Cage cage3=new Cage("12365","East");

        cage1.setAnimals(animals1);
        cage2.setAnimals(animals2);
        cage3.setAnimals(animals3);

        animals1.setCage(cage1);
        animals2.setCage(cage2);
        animals3.setCage(cage3);

        cageRepository.save(cage1);
        cageRepository.save(cage2);
        cageRepository.save(cage3);












    }
}
