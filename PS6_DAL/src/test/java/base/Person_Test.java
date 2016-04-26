package base;

import java.util.UUID;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.StringProperty;

public class Person_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PersonDomainModel Joe=new PersonDomainModel();
		Joe.setFirstName("Joe");
		Joe.setLastName("Miller");
		Joe.setStreet("Main");
		Joe.setPostalCode(30);
		Joe.setCity("Big");
		Joe.setBirthday(null);
		UUID JoeID=UUID.randomUUID();
		Joe.setID(JoeID);
		PersonDAL JoeDAL=new PersonDAL();
		JoeDAL.addPerson(Joe);
		JoeDAL.getPersons();
		JoeDAL.updatePerson(Joe);
		JoeDAL.deletePerson(JoeID);
		
	}

}
