package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsCommentExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andNcidIsNull() {
            addCriterion("NCID is null");
            return (Criteria) this;
        }

        public Criteria andNcidIsNotNull() {
            addCriterion("NCID is not null");
            return (Criteria) this;
        }

        public Criteria andNcidEqualTo(BigDecimal value) {
            addCriterion("NCID =", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotEqualTo(BigDecimal value) {
            addCriterion("NCID <>", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThan(BigDecimal value) {
            addCriterion("NCID >", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NCID >=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThan(BigDecimal value) {
            addCriterion("NCID <", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NCID <=", value, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidIn(List<BigDecimal> values) {
            addCriterion("NCID in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotIn(List<BigDecimal> values) {
            addCriterion("NCID not in", values, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCID between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andNcidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NCID not between", value1, value2, "ncid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(BigDecimal value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(BigDecimal value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(BigDecimal value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(BigDecimal value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<BigDecimal> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<BigDecimal> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("NID is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("NID is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(BigDecimal value) {
            addCriterion("NID =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(BigDecimal value) {
            addCriterion("NID <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(BigDecimal value) {
            addCriterion("NID >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NID >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(BigDecimal value) {
            addCriterion("NID <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NID <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<BigDecimal> values) {
            addCriterion("NID in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<BigDecimal> values) {
            addCriterion("NID not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NID between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NID not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("\"TEXT\" is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("\"TEXT\" is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("\"TEXT\" =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("\"TEXT\" <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("\"TEXT\" >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("\"TEXT\" >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("\"TEXT\" <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("\"TEXT\" <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("\"TEXT\" like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("\"TEXT\" not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("\"TEXT\" in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("\"TEXT\" not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("\"TEXT\" between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("\"TEXT\" not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("COMMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("COMMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("COMMENT_DATE =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("COMMENT_DATE <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("COMMENT_DATE >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("COMMENT_DATE >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("COMMENT_DATE <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("COMMENT_DATE <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("COMMENT_DATE in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("COMMENT_DATE not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("COMMENT_DATE between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("COMMENT_DATE not between", value1, value2, "commentDate");
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