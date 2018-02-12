package com.bridgelabz.objectOriented;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.util.Utility;

public class fix {

	public static void main(String[] args) {
		fixAppointment();
	}

	public static void fixAppointment() {
		try {
			File file = new File(
					"/home/bridgelabz/SANAworkspace/BasicProgram/src/" +
			"com/bridgelabz/objectOriented/doctors.json");
			File file1 = new File(
					"/home/bridgelabz/SANAworkspace/BasicProgram/src/" + 
			"com/bridgelabz/objectOriented/doctors.json");
			if (file.exists() && file.exists()) {
				if (file.canWrite() && file.canRead() && file1.canWrite() && file1.canRead()) {
					JSONParser parser = new JSONParser();
					FileReader doctor = new FileReader(file);
					JSONArray doctorArray = (JSONArray) parser.parse(doctor);

					FileReader patient = new FileReader(file1);
					JSONArray patientArray = (JSONArray) parser.parse(patient);
					System.out.println(patientArray.size());
					
					
					boolean check = false;
					//iterator for patient
					Iterator<?> iterator = patientArray.iterator();
					System.out.println("Enter the Patient id to get appointment");
					String patientid =Utility.getString();
					System.out.println("PId"+patientid);

					while (iterator.hasNext()) {
						JSONObject object = (JSONObject) iterator.next();
						String id = object.get("Id").toString();
						System.out.println("" +id);
						
						if (patientid.equals(id)) {
							System.out.println("Enter the doctor id to assign patient");
							String doctorid = Utility.getString();
							
							//iteartor for doctor 
							Iterator<?> iterator1 = doctorArray.iterator();

							while (iterator1.hasNext()) {
								JSONObject object1 = (JSONObject) iterator1.next();
								String id1 = object1.get("Id").toString();
								System.out.println(""+id1 );
								
								if (id1.equals(doctorid)) {

									doctorArray.add(object);
									FileWriter write = new FileWriter(file);
									write.write(JSONValue.toJSONString(doctorArray));
									write.flush();
									write.close();
									check = true;
									break;
								}
							}
						}
						break;
					}
				}
			} else {
				System.out.println("File can not read or write");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
