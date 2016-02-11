package tn.esprit.tft.delegate;

import java.util.List;

import tn.esprit.tft.domain.Doctor;
import tn.esprit.tft.locator.ServiceLocator;
import tn.esprit.tft.services.doctor.ManageDoctorRemote;
public class doctorManagementDelegate {
	
	private static final String jndi="tft/ManageDoctor!tn.esprit.tft.services.doctor.ManageDoctorRemote";

	private static ManageDoctorRemote getProxy(){
		return (ManageDoctorRemote) ServiceLocator.getInstance().getProxy(jndi);
	}
	
	public static Boolean doAddDoctor(Doctor doctor){
		return getProxy().addDoctor(doctor);
	}
	public static Boolean doupdateDoctor(Doctor doctor){
		return getProxy().updateDoctor(doctor);
	}
	public static Boolean doDeleteDoctor(Doctor doctor){
		return getProxy().deleteDoctor(doctor);
	}
	public static List<Doctor> doFindAllDoctor(){
		return getProxy().findAllDoctors();
	}
}
