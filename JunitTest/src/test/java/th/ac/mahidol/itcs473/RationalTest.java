package th.ac.mahidol.itcs473;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    TestDefaultConstructor.class,
    TestConstructor.class,
    TestToString.class,
    TestToString.class,
    TestAdd.class,
    TestSubstract.class,
    TestMultiply.class,
    TestDivide.class,
    TestEquals.class,
    TestCompareTo.class
})

public class RationalTest {
}
