import com.google.common.base.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Created by Loon on 2014/12/12.
 */
public class Teacher {
    @NotNull
    private String name;
    @NotNull
    private int age;
    @Past
    private Date birthday;
    @Future
    private Date eventDate;
    @Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}")
    private String phoneNumber;

    public Teacher() {
    }

    public Teacher(String name, int age, Date birthday, Date eventDate, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.eventDate = eventDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .add("birthday", birthday)
                .add("eventDate", eventDate)
                .add("phoneNumber", phoneNumber)
                .toString();
    }
}
