package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class HospitalService {

	private List<Hospital> hospitalList=new ArrayList<>(Arrays.asList(

			new Hospital(1001, "Apollo Hospital", "Chennai", 3.8),

			new Hospital(1002,"Global Hospital","Chennai", 3.5),

			new Hospital(1003,"VCare Hospital","Bangalore", 3)));



public List<Hospital> getAllHospitals(){

	return hospitalList;

}



public Hospital getHospital(int id){

	return hospitalList.stream().filter(c->c.getId()==(id)).findFirst().get();

}

public void addHospital(Hospital hospital){
 Hospital addedHospital = new Hospital();
 addedHospital.setId(hospital.getId());
  addedHospital.setName(hospital.getName());
  addedHospital.setCity(hospital.getCity());
  addedHospital.setRating(hospital.getRating());

}

public void updateHospital(Hospital hospital){

}

public void deleteHospital(Hospital hospital) {

}
}
