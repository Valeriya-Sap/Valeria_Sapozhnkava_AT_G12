package homework.taf.runners;
import homework.taf.tests.junit.*;
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
