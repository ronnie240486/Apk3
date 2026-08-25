package com.google.common.math;

/* JADX INFO: loaded from: classes2.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public class BigDecimalMath {

    /* JADX INFO: loaded from: classes3.dex */
    public static class BigDecimalToDoubleRounder extends com.google.common.math.ToDoubleRounder<java.math.BigDecimal> {
        public static final com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder INSTANCE = null;

        static {
                com.google.common.math.BigDecimalMath$BigDecimalToDoubleRounder r0 = new com.google.common.math.BigDecimalMath$BigDecimalToDoubleRounder
                r0.<init>()
                com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder.INSTANCE = r0
                return
        }

        private BigDecimalToDoubleRounder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final java.lang.Number minus(java.lang.Number r1, java.lang.Number r2) {
                r0 = this;
                java.math.BigDecimal r1 = (java.math.BigDecimal) r1
                java.math.BigDecimal r2 = (java.math.BigDecimal) r2
                java.math.BigDecimal r1 = r1.subtract(r2)
                return r1
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final double roundToDoubleArbitrarily(java.lang.Number r3) {
                r2 = this;
                java.math.BigDecimal r3 = (java.math.BigDecimal) r3
                double r0 = r3.doubleValue()
                return r0
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final int sign(java.lang.Number r1) {
                r0 = this;
                java.math.BigDecimal r1 = (java.math.BigDecimal) r1
                int r1 = r1.signum()
                return r1
        }

        @Override // com.google.common.math.ToDoubleRounder
        public final java.lang.Number toX(double r1, java.math.RoundingMode r3) {
                r0 = this;
                java.math.BigDecimal r3 = new java.math.BigDecimal
                r3.<init>(r1)
                return r3
        }
    }

    private BigDecimalMath() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double roundToDouble(java.math.BigDecimal r1, java.math.RoundingMode r2) {
            com.google.common.math.BigDecimalMath$BigDecimalToDoubleRounder r0 = com.google.common.math.BigDecimalMath.BigDecimalToDoubleRounder.INSTANCE
            double r1 = r0.roundToDouble(r1, r2)
            return r1
    }
}
