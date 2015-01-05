package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AdditionalServicesTests.class,
	bookingTests.class,
	DecisionSupportTests.class,
	occupancyTests.class,
	PaymentTests.class,
	roomTests.class,
	StaffAdministrationTest.class})

public class AllTests {

}