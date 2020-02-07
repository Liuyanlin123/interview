package 异常处理.使用log4j;
import org.apache.log4j.Logger;

public class Hello {
    private static Logger log = Logger.getLogger(Hello.class.getClass());
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("liuyanlin");
        log.info(person.getName());
        log.debug("debug****");
        log.error("error... ");
    }
}