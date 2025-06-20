package homework.log4j2.taf.runners;
import homework.log4j2.taf.tests.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BookingHoverTests.class,
        BookingLondonTests.class,
        BookingParisTests.class,
        BookingPragueTests.class,
        DemoQATests.class,
        W3SchoolTests.class
})
public class JUnitRunner {
}
