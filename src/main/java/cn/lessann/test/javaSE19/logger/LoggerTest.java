package cn.lessann.test.javaSE19.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggerTest.class);
    public static void main(String[] args) {
        LOGGER.trace("现在使用的是trace日志信息");
        LOGGER.debug("现在使用的是debug日志信息");
        LOGGER.info("现在使用的是info日志信息");
        LOGGER.warn("现在使用的是warn日志信息");
        LOGGER.error("现在使用的是error日志信息");
    }
}
