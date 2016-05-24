import com.loon.exp001.Teacher;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    private static Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test() {

        Teacher teacher = new Teacher();
        teacher.setAge(0);
        teacher.setBirthday(DateTime.parse("2015-12-12", ISODateTimeFormat.yearMonthDay()).toDate());
        teacher.setEventDate(DateTime.now().minusDays(100).toDate());
        teacher.setName("test");
        teacher.setPhoneNumber("1");

        Set<ConstraintViolation<Teacher>> constraintViolations = validator.validate(teacher);

        assertEquals(0, constraintViolations.size());
    }
}