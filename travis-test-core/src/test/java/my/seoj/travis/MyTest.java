package my.seoj.travis;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class MyTest
{
    private static final Logger LOGGER = LogManager.getLogger(MyTest.class);

    @Test
    public void test()
    {
        LOGGER.debug("hello world");
    }
}
