import day14_week.JunitDayOfWeekUtilityParameterizedSecondTests;
import day14_week.JunitDayOfWeekUtilityParameterizedTests;
import day14_week.JunitDayOfWeekUtilityTests;
import homework.unitTests.people.JunitAutomatedEngineerTests;
import homework.unitTests.people.JunitManualEngineerTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JunitDayOfWeekUtilityTests.class,
        JunitAutomatedEngineerTests.class,
        JunitManualEngineerTests.class,
        JunitDayOfWeekUtilityParameterizedTests.class,
        JunitDayOfWeekUtilityParameterizedSecondTests.class
})
public class JUnitTestSuite {

}
