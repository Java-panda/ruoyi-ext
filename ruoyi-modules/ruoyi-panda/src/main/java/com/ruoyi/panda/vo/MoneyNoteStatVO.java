package com.ruoyi.panda.vo;

import java.io.Serializable;

/**
 * 全部，年度，月度，周度，日度的总和，最大，最小，平均，计数的统计数据
 */
public class MoneyNoteStatVO implements Serializable {
    private Integer allSum;
    private Integer allMax;
    private Integer allMin;
    private Double allAvg;
    private Integer allCount;

    private Integer yearSum;
    private Integer yearMax;
    private Integer yearMin;
    private Double yearAvg;
    private Integer yearCount;

    private Integer monthSum;
    private Integer monthMax;
    private Integer monthMin;
    private Double monthAvg;
    private Integer monthCount;

    private Integer weekSum;
    private Integer weekMax;
    private Integer weekMin;
    private Double weekAvg;
    private Integer weekCount;

    private Integer daySum;
    private Integer dayMax;
    private Integer dayMin;
    private Double dayAvg;
    private Integer dayCount;

    public MoneyNoteStatVO() {
    }

    public Integer getAllSum() {
        return allSum;
    }

    public void setAllSum(Integer allSum) {
        this.allSum = allSum;
    }

    public Integer getAllMax() {
        return allMax;
    }

    public void setAllMax(Integer allMax) {
        this.allMax = allMax;
    }

    public Integer getAllMin() {
        return allMin;
    }

    public void setAllMin(Integer allMin) {
        this.allMin = allMin;
    }

    public Double getAllAvg() {
        return allAvg;
    }

    public void setAllAvg(Double allAvg) {
        this.allAvg = allAvg;
    }

    public Integer getAllCount() {
        return allCount;
    }

    public void setAllCount(Integer allCount) {
        this.allCount = allCount;
    }

    public Integer getYearSum() {
        return yearSum;
    }

    public void setYearSum(Integer yearSum) {
        this.yearSum = yearSum;
    }

    public Integer getYearMax() {
        return yearMax;
    }

    public void setYearMax(Integer yearMax) {
        this.yearMax = yearMax;
    }

    public Integer getYearMin() {
        return yearMin;
    }

    public void setYearMin(Integer yearMin) {
        this.yearMin = yearMin;
    }

    public Double getYearAvg() {
        return yearAvg;
    }

    public void setYearAvg(Double yearAvg) {
        this.yearAvg = yearAvg;
    }

    public Integer getYearCount() {
        return yearCount;
    }

    public void setYearCount(Integer yearCount) {
        this.yearCount = yearCount;
    }

    public Integer getMonthSum() {
        return monthSum;
    }

    public void setMonthSum(Integer monthSum) {
        this.monthSum = monthSum;
    }

    public Integer getMonthMax() {
        return monthMax;
    }

    public void setMonthMax(Integer monthMax) {
        this.monthMax = monthMax;
    }

    public Integer getMonthMin() {
        return monthMin;
    }

    public void setMonthMin(Integer monthMin) {
        this.monthMin = monthMin;
    }

    public Double getMonthAvg() {
        return monthAvg;
    }

    public void setMonthAvg(Double monthAvg) {
        this.monthAvg = monthAvg;
    }

    public Integer getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    public Integer getWeekSum() {
        return weekSum;
    }

    public void setWeekSum(Integer weekSum) {
        this.weekSum = weekSum;
    }

    public Integer getWeekMax() {
        return weekMax;
    }

    public void setWeekMax(Integer weekMax) {
        this.weekMax = weekMax;
    }

    public Integer getWeekMin() {
        return weekMin;
    }

    public void setWeekMin(Integer weekMin) {
        this.weekMin = weekMin;
    }

    public Double getWeekAvg() {
        return weekAvg;
    }

    public void setWeekAvg(Double weekAvg) {
        this.weekAvg = weekAvg;
    }

    public Integer getWeekCount() {
        return weekCount;
    }

    public void setWeekCount(Integer weekCount) {
        this.weekCount = weekCount;
    }

    public Integer getDaySum() {
        return daySum;
    }

    public void setDaySum(Integer daySum) {
        this.daySum = daySum;
    }

    public Integer getDayMax() {
        return dayMax;
    }

    public void setDayMax(Integer dayMax) {
        this.dayMax = dayMax;
    }

    public Integer getDayMin() {
        return dayMin;
    }

    public void setDayMin(Integer dayMin) {
        this.dayMin = dayMin;
    }

    public Double getDayAvg() {
        return dayAvg;
    }

    public void setDayAvg(Double dayAvg) {
        this.dayAvg = dayAvg;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    @Override
    public String toString() {
        return "MoneyNoteStatVO{" +
                "allSum=" + allSum +
                ", allMax=" + allMax +
                ", allMin=" + allMin +
                ", allAvg=" + allAvg +
                ", allCount=" + allCount +
                ", yearSum=" + yearSum +
                ", yearMax=" + yearMax +
                ", yearMin=" + yearMin +
                ", yearAvg=" + yearAvg +
                ", yearCount=" + yearCount +
                ", monthSum=" + monthSum +
                ", monthMax=" + monthMax +
                ", monthMin=" + monthMin +
                ", monthAvg=" + monthAvg +
                ", monthCount=" + monthCount +
                ", weekSum=" + weekSum +
                ", weekMax=" + weekMax +
                ", weekMin=" + weekMin +
                ", weekAvg=" + weekAvg +
                ", weekCount=" + weekCount +
                ", daySum=" + daySum +
                ", dayMax=" + dayMax +
                ", dayMin=" + dayMin +
                ", dayAvg=" + dayAvg +
                ", dayCount=" + dayCount +
                '}';
    }
}
