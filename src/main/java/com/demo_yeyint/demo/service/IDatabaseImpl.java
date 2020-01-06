package com.demo_yeyint.demo.service;

import com.demo_yeyint.demo.domain.Emergency;
import com.demo_yeyint.demo.domain.Staff;
import com.demo_yeyint.demo.repository.EmergencyRepository;
import com.demo_yeyint.demo.repository.StaffRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class IDatabaseImpl implements IDatabase {

    private final StaffRepository staffRepository;
    private final EmergencyRepository emergencyRepository;

    public IDatabaseImpl(StaffRepository staffRepository, EmergencyRepository emergencyRepository) {
        this.staffRepository = staffRepository;
        this.emergencyRepository = emergencyRepository;
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



    }
}
