package com.mycompany.myapp.config.measures;

import com.codahale.metrics.Gauge;

public class GaugeMeasure extends Measure {

    private Object value;

    public GaugeMeasure(String name, Long timestamp, Gauge gauge) {
        super(name, "gauge", timestamp);
        this.value = gauge.getValue();
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GaugeMeasure{" +
            "value=" + value +
            '}';
    }
}