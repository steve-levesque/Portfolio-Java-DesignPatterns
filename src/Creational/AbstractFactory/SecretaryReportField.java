/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Creational.AbstractFactory;

class SecretaryReportField implements ReportField {

	@Override
	public void content() {
		System.out.println("Report of secretary outside the company.");
	}
	
}
