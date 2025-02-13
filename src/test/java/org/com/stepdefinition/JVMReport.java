package org.com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateReport(String jsonFile) {
		
		File f = new File(System.getProperty("user.dir") + "/JVMReports");
		Configuration c = new Configuration(f, "American express cards");
		c.addClassifications("browser","chrome");
		List<String> l =new ArrayList<String>();
		l.add(jsonFile);
		ReportBuilder report = new ReportBuilder(l, c);
		report.generateReports();
		
		
		
	}
	
	
	
	
}
