package com.mycompany.myapp.config.measures;

import com.codahale.metrics.Counter;

public class CounterMeasure extends Measure {

    private Long count;

    public CounterMeasure(String name, String timestamp, Counter counter) {
        super(name, "counter", timestamp);
        this.count = counter.getCount();
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Counter{" +
            "count=" + count +
            '}';
    }
}
