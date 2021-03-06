package com.github.librarian.model.entity;

import com.github.librarian.model.enums.BorrowerStatus;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BorrowerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public BorrowerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BorrowerStatus value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BorrowerStatus value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BorrowerStatus value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BorrowerStatus value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BorrowerStatus value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BorrowerStatus value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BorrowerStatus> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BorrowerStatus> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BorrowerStatus value1, BorrowerStatus value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BorrowerStatus value1, BorrowerStatus value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BORROWER
     *
     * @mbg.generated do_not_delete_during_merge Mon May 01 16:23:46 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table BORROWER
         *
         * @mbg.generated Mon May 01 16:23:46 CST 2017
         */
        public Criteria andMap(java.util.Map<String, Object> map) {
            if (map.containsKey("IdEqualTo")){
                 andIdEqualTo((Integer) map.get("IdEqualTo"));
            }
            if (map.containsKey("IdNotEqualTo")){
                 andIdNotEqualTo((Integer) map.get("IdNotEqualTo"));
            }
            if (map.containsKey("IdGreaterThan")){
                 andIdGreaterThan((Integer) map.get("IdGreaterThan"));
            }
            if (map.containsKey("IdGreaterThanOrEqualTo")){
                 andIdGreaterThanOrEqualTo((Integer) map.get("IdGreaterThanOrEqualTo"));
            }
            if (map.containsKey("IdLessThan")){
                 andIdLessThan((Integer) map.get("IdLessThan"));
            }
            if (map.containsKey("IdLessThanOrEqualTo")){
                 andIdLessThanOrEqualTo((Integer) map.get("IdLessThanOrEqualTo"));
            }
            if (map.containsKey("IdIn")){
                 andIdIn((List<Integer>) map.get("IdIn"));
            }
            if (map.containsKey("IdNotIn")){
                 andIdNotIn((List<Integer>) map.get("IdNotIn"));
            }
            if (map.containsKey("NameEqualTo")){
                 andNameEqualTo((String) map.get("NameEqualTo"));
            }
            if (map.containsKey("NameNotEqualTo")){
                 andNameNotEqualTo((String) map.get("NameNotEqualTo"));
            }
            if (map.containsKey("NameGreaterThan")){
                 andNameGreaterThan((String) map.get("NameGreaterThan"));
            }
            if (map.containsKey("NameGreaterThanOrEqualTo")){
                 andNameGreaterThanOrEqualTo((String) map.get("NameGreaterThanOrEqualTo"));
            }
            if (map.containsKey("NameLessThan")){
                 andNameLessThan((String) map.get("NameLessThan"));
            }
            if (map.containsKey("NameLessThanOrEqualTo")){
                 andNameLessThanOrEqualTo((String) map.get("NameLessThanOrEqualTo"));
            }
            if (map.containsKey("NameLike")){
                 andNameLike((String) map.get("NameLike"));
            }
            if (map.containsKey("NameNotLike")){
                 andNameNotLike((String) map.get("NameNotLike"));
            }
            if (map.containsKey("NameIn")){
                 andNameIn((List<String>) map.get("NameIn"));
            }
            if (map.containsKey("NameNotIn")){
                 andNameNotIn((List<String>) map.get("NameNotIn"));
            }
            if (map.containsKey("EmailEqualTo")){
                 andEmailEqualTo((String) map.get("EmailEqualTo"));
            }
            if (map.containsKey("EmailNotEqualTo")){
                 andEmailNotEqualTo((String) map.get("EmailNotEqualTo"));
            }
            if (map.containsKey("EmailGreaterThan")){
                 andEmailGreaterThan((String) map.get("EmailGreaterThan"));
            }
            if (map.containsKey("EmailGreaterThanOrEqualTo")){
                 andEmailGreaterThanOrEqualTo((String) map.get("EmailGreaterThanOrEqualTo"));
            }
            if (map.containsKey("EmailLessThan")){
                 andEmailLessThan((String) map.get("EmailLessThan"));
            }
            if (map.containsKey("EmailLessThanOrEqualTo")){
                 andEmailLessThanOrEqualTo((String) map.get("EmailLessThanOrEqualTo"));
            }
            if (map.containsKey("EmailLike")){
                 andEmailLike((String) map.get("EmailLike"));
            }
            if (map.containsKey("EmailNotLike")){
                 andEmailNotLike((String) map.get("EmailNotLike"));
            }
            if (map.containsKey("EmailIn")){
                 andEmailIn((List<String>) map.get("EmailIn"));
            }
            if (map.containsKey("EmailNotIn")){
                 andEmailNotIn((List<String>) map.get("EmailNotIn"));
            }
            if (map.containsKey("PasswordEqualTo")){
                 andPasswordEqualTo((String) map.get("PasswordEqualTo"));
            }
            if (map.containsKey("PasswordNotEqualTo")){
                 andPasswordNotEqualTo((String) map.get("PasswordNotEqualTo"));
            }
            if (map.containsKey("PasswordGreaterThan")){
                 andPasswordGreaterThan((String) map.get("PasswordGreaterThan"));
            }
            if (map.containsKey("PasswordGreaterThanOrEqualTo")){
                 andPasswordGreaterThanOrEqualTo((String) map.get("PasswordGreaterThanOrEqualTo"));
            }
            if (map.containsKey("PasswordLessThan")){
                 andPasswordLessThan((String) map.get("PasswordLessThan"));
            }
            if (map.containsKey("PasswordLessThanOrEqualTo")){
                 andPasswordLessThanOrEqualTo((String) map.get("PasswordLessThanOrEqualTo"));
            }
            if (map.containsKey("PasswordLike")){
                 andPasswordLike((String) map.get("PasswordLike"));
            }
            if (map.containsKey("PasswordNotLike")){
                 andPasswordNotLike((String) map.get("PasswordNotLike"));
            }
            if (map.containsKey("PasswordIn")){
                 andPasswordIn((List<String>) map.get("PasswordIn"));
            }
            if (map.containsKey("PasswordNotIn")){
                 andPasswordNotIn((List<String>) map.get("PasswordNotIn"));
            }
            if (map.containsKey("StatusEqualTo")){
                 andStatusEqualTo((BorrowerStatus) map.get("StatusEqualTo"));
            }
            if (map.containsKey("StatusNotEqualTo")){
                 andStatusNotEqualTo((BorrowerStatus) map.get("StatusNotEqualTo"));
            }
            if (map.containsKey("StatusGreaterThan")){
                 andStatusGreaterThan((BorrowerStatus) map.get("StatusGreaterThan"));
            }
            if (map.containsKey("StatusGreaterThanOrEqualTo")){
                 andStatusGreaterThanOrEqualTo((BorrowerStatus) map.get("StatusGreaterThanOrEqualTo"));
            }
            if (map.containsKey("StatusLessThan")){
                 andStatusLessThan((BorrowerStatus) map.get("StatusLessThan"));
            }
            if (map.containsKey("StatusLessThanOrEqualTo")){
                 andStatusLessThanOrEqualTo((BorrowerStatus) map.get("StatusLessThanOrEqualTo"));
            }
            if (map.containsKey("StatusIn")){
                 andStatusIn((List<BorrowerStatus>) map.get("StatusIn"));
            }
            if (map.containsKey("StatusNotIn")){
                 andStatusNotIn((List<BorrowerStatus>) map.get("StatusNotIn"));
            }
            return this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BORROWER
     *
     * @mbg.generated Mon May 01 16:23:46 CST 2017
     */
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