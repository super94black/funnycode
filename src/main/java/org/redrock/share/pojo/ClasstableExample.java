package org.redrock.share.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClasstableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClasstableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNull() {
            addCriterion("stu_num is null");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNotNull() {
            addCriterion("stu_num is not null");
            return (Criteria) this;
        }

        public Criteria andStuNumEqualTo(String value) {
            addCriterion("stu_num =", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotEqualTo(String value) {
            addCriterion("stu_num <>", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThan(String value) {
            addCriterion("stu_num >", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThanOrEqualTo(String value) {
            addCriterion("stu_num >=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThan(String value) {
            addCriterion("stu_num <", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThanOrEqualTo(String value) {
            addCriterion("stu_num <=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLike(String value) {
            addCriterion("stu_num like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotLike(String value) {
            addCriterion("stu_num not like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumIn(List<String> values) {
            addCriterion("stu_num in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotIn(List<String> values) {
            addCriterion("stu_num not in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumBetween(String value1, String value2) {
            addCriterion("stu_num between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotBetween(String value1, String value2) {
            addCriterion("stu_num not between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(String value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(String value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(String value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(String value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(String value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(String value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLike(String value) {
            addCriterion("week like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotLike(String value) {
            addCriterion("week not like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<String> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<String> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(String value1, String value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(String value1, String value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andJieshuIsNull() {
            addCriterion("jieshu is null");
            return (Criteria) this;
        }

        public Criteria andJieshuIsNotNull() {
            addCriterion("jieshu is not null");
            return (Criteria) this;
        }

        public Criteria andJieshuEqualTo(String value) {
            addCriterion("jieshu =", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuNotEqualTo(String value) {
            addCriterion("jieshu <>", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuGreaterThan(String value) {
            addCriterion("jieshu >", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuGreaterThanOrEqualTo(String value) {
            addCriterion("jieshu >=", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuLessThan(String value) {
            addCriterion("jieshu <", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuLessThanOrEqualTo(String value) {
            addCriterion("jieshu <=", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuLike(String value) {
            addCriterion("jieshu like", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuNotLike(String value) {
            addCriterion("jieshu not like", value, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuIn(List<String> values) {
            addCriterion("jieshu in", values, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuNotIn(List<String> values) {
            addCriterion("jieshu not in", values, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuBetween(String value1, String value2) {
            addCriterion("jieshu between", value1, value2, "jieshu");
            return (Criteria) this;
        }

        public Criteria andJieshuNotBetween(String value1, String value2) {
            addCriterion("jieshu not between", value1, value2, "jieshu");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("class_num is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("class_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(String value) {
            addCriterion("class_num =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(String value) {
            addCriterion("class_num <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(String value) {
            addCriterion("class_num >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(String value) {
            addCriterion("class_num >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(String value) {
            addCriterion("class_num <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(String value) {
            addCriterion("class_num <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLike(String value) {
            addCriterion("class_num like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotLike(String value) {
            addCriterion("class_num not like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<String> values) {
            addCriterion("class_num in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<String> values) {
            addCriterion("class_num not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(String value1, String value2) {
            addCriterion("class_num between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(String value1, String value2) {
            addCriterion("class_num not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNull() {
            addCriterion("course_num is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNotNull() {
            addCriterion("course_num is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumEqualTo(String value) {
            addCriterion("course_num =", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotEqualTo(String value) {
            addCriterion("course_num <>", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThan(String value) {
            addCriterion("course_num >", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThanOrEqualTo(String value) {
            addCriterion("course_num >=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThan(String value) {
            addCriterion("course_num <", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThanOrEqualTo(String value) {
            addCriterion("course_num <=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLike(String value) {
            addCriterion("course_num like", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotLike(String value) {
            addCriterion("course_num not like", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIn(List<String> values) {
            addCriterion("course_num in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotIn(List<String> values) {
            addCriterion("course_num not in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumBetween(String value1, String value2) {
            addCriterion("course_num between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotBetween(String value1, String value2) {
            addCriterion("course_num not between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCoursePointIsNull() {
            addCriterion("course_point is null");
            return (Criteria) this;
        }

        public Criteria andCoursePointIsNotNull() {
            addCriterion("course_point is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePointEqualTo(String value) {
            addCriterion("course_point =", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointNotEqualTo(String value) {
            addCriterion("course_point <>", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointGreaterThan(String value) {
            addCriterion("course_point >", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointGreaterThanOrEqualTo(String value) {
            addCriterion("course_point >=", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointLessThan(String value) {
            addCriterion("course_point <", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointLessThanOrEqualTo(String value) {
            addCriterion("course_point <=", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointLike(String value) {
            addCriterion("course_point like", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointNotLike(String value) {
            addCriterion("course_point not like", value, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointIn(List<String> values) {
            addCriterion("course_point in", values, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointNotIn(List<String> values) {
            addCriterion("course_point not in", values, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointBetween(String value1, String value2) {
            addCriterion("course_point between", value1, value2, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andCoursePointNotBetween(String value1, String value2) {
            addCriterion("course_point not between", value1, value2, "coursePoint");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNull() {
            addCriterion("class_type is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("class_type is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(String value) {
            addCriterion("class_type =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(String value) {
            addCriterion("class_type <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(String value) {
            addCriterion("class_type >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("class_type >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(String value) {
            addCriterion("class_type <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(String value) {
            addCriterion("class_type <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLike(String value) {
            addCriterion("class_type like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotLike(String value) {
            addCriterion("class_type not like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<String> values) {
            addCriterion("class_type in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<String> values) {
            addCriterion("class_type not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(String value1, String value2) {
            addCriterion("class_type between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(String value1, String value2) {
            addCriterion("class_type not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andClassTimeIsNull() {
            addCriterion("class_time is null");
            return (Criteria) this;
        }

        public Criteria andClassTimeIsNotNull() {
            addCriterion("class_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassTimeEqualTo(String value) {
            addCriterion("class_time =", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotEqualTo(String value) {
            addCriterion("class_time <>", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeGreaterThan(String value) {
            addCriterion("class_time >", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeGreaterThanOrEqualTo(String value) {
            addCriterion("class_time >=", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeLessThan(String value) {
            addCriterion("class_time <", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeLessThanOrEqualTo(String value) {
            addCriterion("class_time <=", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeLike(String value) {
            addCriterion("class_time like", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotLike(String value) {
            addCriterion("class_time not like", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeIn(List<String> values) {
            addCriterion("class_time in", values, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotIn(List<String> values) {
            addCriterion("class_time not in", values, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeBetween(String value1, String value2) {
            addCriterion("class_time between", value1, value2, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotBetween(String value1, String value2) {
            addCriterion("class_time not between", value1, value2, "classTime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andTermTimeIsNull() {
            addCriterion("term_time is null");
            return (Criteria) this;
        }

        public Criteria andTermTimeIsNotNull() {
            addCriterion("term_time is not null");
            return (Criteria) this;
        }

        public Criteria andTermTimeEqualTo(String value) {
            addCriterion("term_time =", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeNotEqualTo(String value) {
            addCriterion("term_time <>", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeGreaterThan(String value) {
            addCriterion("term_time >", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeGreaterThanOrEqualTo(String value) {
            addCriterion("term_time >=", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeLessThan(String value) {
            addCriterion("term_time <", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeLessThanOrEqualTo(String value) {
            addCriterion("term_time <=", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeLike(String value) {
            addCriterion("term_time like", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeNotLike(String value) {
            addCriterion("term_time not like", value, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeIn(List<String> values) {
            addCriterion("term_time in", values, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeNotIn(List<String> values) {
            addCriterion("term_time not in", values, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeBetween(String value1, String value2) {
            addCriterion("term_time between", value1, value2, "termTime");
            return (Criteria) this;
        }

        public Criteria andTermTimeNotBetween(String value1, String value2) {
            addCriterion("term_time not between", value1, value2, "termTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}