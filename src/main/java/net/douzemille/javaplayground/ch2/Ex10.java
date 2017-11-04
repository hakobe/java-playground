package net.douzemille.javaplayground.ch2;

import java.util.stream.Stream;

public class Ex10 {
    public static Double average(Stream<Double> st) {
        return st.<Ex10.Acc>reduce(new Ex10.Acc(), (acc, aDouble) -> {
            acc.accept(aDouble);
            return acc;
        }, (acc1, acc2) -> {
            return acc1.combine(acc2);
        }).average();
    }

    public static class Acc {
        private double count = 0;
        private double sum = 0;

        public void accept(Double d) {
            sum = sum + d;
            count+=1;
        }

        public Acc combine(Acc other) {
            Acc res = new Acc();
            res.count = this.count + other.count;
            res.sum = this.sum + other.sum;
            return res;
        }

        public Double average() {
            return this.sum / this.count;
        }
    }
}
