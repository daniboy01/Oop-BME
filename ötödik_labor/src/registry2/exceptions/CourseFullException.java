package registry2.exceptions;

import registry2.Course;

public class CourseFullException extends CourseException {
    public CourseFullException(Course course) {
        super(course);
    }
}
