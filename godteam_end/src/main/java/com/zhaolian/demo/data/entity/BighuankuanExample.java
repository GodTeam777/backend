package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BighuankuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BighuankuanExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(BigDecimal value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(BigDecimal value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(BigDecimal value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(BigDecimal value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<BigDecimal> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<BigDecimal> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andBoidIsNull() {
            addCriterion("boid is null");
            return (Criteria) this;
        }

        public Criteria andBoidIsNotNull() {
            addCriterion("boid is not null");
            return (Criteria) this;
        }

        public Criteria andBoidEqualTo(BigDecimal value) {
            addCriterion("boid =", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotEqualTo(BigDecimal value) {
            addCriterion("boid <>", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidGreaterThan(BigDecimal value) {
            addCriterion("boid >", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("boid >=", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidLessThan(BigDecimal value) {
            addCriterion("boid <", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("boid <=", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidIn(List<BigDecimal> values) {
            addCriterion("boid in", values, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotIn(List<BigDecimal> values) {
            addCriterion("boid not in", values, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boid between", value1, value2, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("boid not between", value1, value2, "boid");
            return (Criteria) this;
        }

        public Criteria andLiushuiIsNull() {
            addCriterion("liushui is null");
            return (Criteria) this;
        }

        public Criteria andLiushuiIsNotNull() {
            addCriterion("liushui is not null");
            return (Criteria) this;
        }

        public Criteria andLiushuiEqualTo(BigDecimal value) {
            addCriterion("liushui =", value, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiNotEqualTo(BigDecimal value) {
            addCriterion("liushui <>", value, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiGreaterThan(BigDecimal value) {
            addCriterion("liushui >", value, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("liushui >=", value, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiLessThan(BigDecimal value) {
            addCriterion("liushui <", value, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("liushui <=", value, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiIn(List<BigDecimal> values) {
            addCriterion("liushui in", values, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiNotIn(List<BigDecimal> values) {
            addCriterion("liushui not in", values, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("liushui between", value1, value2, "liushui");
            return (Criteria) this;
        }

        public Criteria andLiushuiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("liushui not between", value1, value2, "liushui");
            return (Criteria) this;
        }

        public Criteria andOrdercardIsNull() {
            addCriterion("ordercard is null");
            return (Criteria) this;
        }

        public Criteria andOrdercardIsNotNull() {
            addCriterion("ordercard is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercardEqualTo(BigDecimal value) {
            addCriterion("ordercard =", value, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardNotEqualTo(BigDecimal value) {
            addCriterion("ordercard <>", value, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardGreaterThan(BigDecimal value) {
            addCriterion("ordercard >", value, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ordercard >=", value, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardLessThan(BigDecimal value) {
            addCriterion("ordercard <", value, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ordercard <=", value, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardIn(List<BigDecimal> values) {
            addCriterion("ordercard in", values, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardNotIn(List<BigDecimal> values) {
            addCriterion("ordercard not in", values, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordercard between", value1, value2, "ordercard");
            return (Criteria) this;
        }

        public Criteria andOrdercardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ordercard not between", value1, value2, "ordercard");
            return (Criteria) this;
        }

        public Criteria andZhifutypeIsNull() {
            addCriterion("zhifutype is null");
            return (Criteria) this;
        }

        public Criteria andZhifutypeIsNotNull() {
            addCriterion("zhifutype is not null");
            return (Criteria) this;
        }

        public Criteria andZhifutypeEqualTo(String value) {
            addCriterion("zhifutype =", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotEqualTo(String value) {
            addCriterion("zhifutype <>", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeGreaterThan(String value) {
            addCriterion("zhifutype >", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeGreaterThanOrEqualTo(String value) {
            addCriterion("zhifutype >=", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeLessThan(String value) {
            addCriterion("zhifutype <", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeLessThanOrEqualTo(String value) {
            addCriterion("zhifutype <=", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeLike(String value) {
            addCriterion("zhifutype like", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotLike(String value) {
            addCriterion("zhifutype not like", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeIn(List<String> values) {
            addCriterion("zhifutype in", values, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotIn(List<String> values) {
            addCriterion("zhifutype not in", values, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeBetween(String value1, String value2) {
            addCriterion("zhifutype between", value1, value2, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotBetween(String value1, String value2) {
            addCriterion("zhifutype not between", value1, value2, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andHuanDateIsNull() {
            addCriterion("huan_date is null");
            return (Criteria) this;
        }

        public Criteria andHuanDateIsNotNull() {
            addCriterion("huan_date is not null");
            return (Criteria) this;
        }

        public Criteria andHuanDateEqualTo(Date value) {
            addCriterion("huan_date =", value, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateNotEqualTo(Date value) {
            addCriterion("huan_date <>", value, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateGreaterThan(Date value) {
            addCriterion("huan_date >", value, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("huan_date >=", value, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateLessThan(Date value) {
            addCriterion("huan_date <", value, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateLessThanOrEqualTo(Date value) {
            addCriterion("huan_date <=", value, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateIn(List<Date> values) {
            addCriterion("huan_date in", values, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateNotIn(List<Date> values) {
            addCriterion("huan_date not in", values, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateBetween(Date value1, Date value2) {
            addCriterion("huan_date between", value1, value2, "huanDate");
            return (Criteria) this;
        }

        public Criteria andHuanDateNotBetween(Date value1, Date value2) {
            addCriterion("huan_date not between", value1, value2, "huanDate");
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