package registry2.exceptions;

import registry2.Course;

public class CourseException extends Exception {
    private Course course;
    public CourseException(Course course) {
        super();
        this.course = course;
    }

    @Override
    public String getMessage() {
        return this.course.getName();
    }
}
