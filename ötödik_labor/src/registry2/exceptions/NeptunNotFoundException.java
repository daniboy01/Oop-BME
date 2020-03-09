package registry2.exceptions;

import registry2.Course;

public class NeptunNotFoundException extends CourseException {
    public NeptunNotFoundException(Course course) {
        super(course);
    }
}
