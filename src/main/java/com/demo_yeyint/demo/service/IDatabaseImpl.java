package com.demo_yeyint.demo.service;

import com.demo_yeyint.demo.domain.Emergency;
import com.demo_yeyint.demo.domain.External_Vet;
import com.demo_yeyint.demo.domain.InHouseVet;
import com.demo_yeyint.demo.domain.Staff;
import com.demo_yeyint.demo.repository.EmergencyRepository;
import com.demo_yeyint.demo.repository.ExternalRepository;
import com.demo_yeyint.demo.repository.InHouseRepository;
import com.demo_yeyint.demo.repository.StaffRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class IDatabaseImpl implements IDatabase {

    private final StaffRepository staffRepository;
    private final EmergencyRepository emergencyRepository;

    private final InHouseRepository inHouseRepository;
    private final ExternalRepository externalRepository;

    public IDatabaseImpl(StaffRepository staffRepository, EmergencyRepository emergencyRepository, InHouseRepository inHouseRepository, ExternalRepository externalRepository) {
        this.staffRepository = staffRepository;
        this.emergencyRepository = emergencyRepository;
        this.inHouseRepository = inHouseRepository;
        this.externalRepository = externalRepository;
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









    }
}
