package com.google.common.math;

import java.lang.Comparable;
import java.lang.Number;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.math.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
abstract class ToDoubleRounder<X extends java.lang.Number & java.lang.Comparable<X>> {

    /* JADX INFO: renamed from: com.google.common.math.ToDoubleRounder$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode = null;

        static {
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L1d
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L28
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L33
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L3e
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L49
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L54
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode     // Catch: java.lang.NoSuchFieldError -> L60
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }
    }

    public ToDoubleRounder() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract X minus(X r1, X r2);

    public final double roundToDouble(X r14, java.math.RoundingMode r15) {
            r13 = this;
            java.lang.String r0 = "x"
            com.google.common.base.Preconditions.checkNotNull(r14, r0)
            java.lang.String r0 = "mode"
            com.google.common.base.Preconditions.checkNotNull(r15, r0)
            double r0 = r13.roundToDoubleArbitrarily(r14)
            boolean r2 = java.lang.Double.isInfinite(r0)
            r3 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r5 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            if (r2 == 0) goto L5a
            int[] r2 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r7 = r15.ordinal()
            r2 = r2[r7]
            r7 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            switch(r2) {
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L52;
                case 5: goto L4c;
                case 6: goto L41;
                case 7: goto L40;
                case 8: goto L2a;
                default: goto L29;
            }
        L29:
            goto L5a
        L2a:
            java.lang.ArithmeticException r15 = new java.lang.ArithmeticException
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r0 = r14.length()
            int r0 = r0 + 44
            java.lang.String r1 = " cannot be represented precisely as a double"
            java.lang.String r14 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r14, r1)
            r15.<init>(r14)
            throw r15
        L40:
            return r0
        L41:
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 != 0) goto L46
            goto L4b
        L46:
            r5 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
        L4b:
            return r5
        L4c:
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 != 0) goto L51
            r3 = r7
        L51:
            return r3
        L52:
            int r14 = r13.sign(r14)
            double r14 = (double) r14
            double r14 = r14 * r7
            return r14
        L5a:
            java.math.RoundingMode r2 = java.math.RoundingMode.UNNECESSARY
            java.lang.Number r2 = r13.toX(r0, r2)
            r7 = r14
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r7 = r7.compareTo(r2)
            int[] r8 = com.google.common.math.ToDoubleRounder.AnonymousClass1.$SwitchMap$java$math$RoundingMode
            int r9 = r15.ordinal()
            r9 = r8[r9]
            java.lang.String r10 = "impossible"
            switch(r9) {
                case 1: goto L119;
                case 2: goto La9;
                case 3: goto La9;
                case 4: goto La9;
                case 5: goto La1;
                case 6: goto L99;
                case 7: goto L83;
                case 8: goto L7a;
                default: goto L74;
            }
        L74:
            java.lang.AssertionError r14 = new java.lang.AssertionError
            r14.<init>(r10)
            throw r14
        L7a:
            if (r7 != 0) goto L7e
            r14 = 1
            goto L7f
        L7e:
            r14 = 0
        L7f:
            com.google.common.math.MathPreconditions.checkRoundingUnnecessary(r14)
            return r0
        L83:
            int r14 = r13.sign(r14)
            if (r14 < 0) goto L91
            if (r7 > 0) goto L8c
            goto L90
        L8c:
            double r0 = java.lang.Math.nextUp(r0)
        L90:
            return r0
        L91:
            if (r7 < 0) goto L94
            goto L98
        L94:
            double r0 = com.google.common.math.DoubleUtils.nextDown(r0)
        L98:
            return r0
        L99:
            if (r7 > 0) goto L9c
            goto La0
        L9c:
            double r0 = java.lang.Math.nextUp(r0)
        La0:
            return r0
        La1:
            if (r7 < 0) goto La4
            goto La8
        La4:
            double r0 = com.google.common.math.DoubleUtils.nextDown(r0)
        La8:
            return r0
        La9:
            if (r7 < 0) goto Lbb
            double r3 = java.lang.Math.nextUp(r0)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto Lb4
            return r0
        Lb4:
            java.math.RoundingMode r5 = java.math.RoundingMode.CEILING
            java.lang.Number r5 = r13.toX(r3, r5)
            goto Lcf
        Lbb:
            double r5 = com.google.common.math.DoubleUtils.nextDown(r0)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto Lc4
            return r0
        Lc4:
            java.math.RoundingMode r3 = java.math.RoundingMode.FLOOR
            java.lang.Number r3 = r13.toX(r5, r3)
            r11 = r5
            r5 = r2
            r2 = r3
            r3 = r0
            r0 = r11
        Lcf:
            java.lang.Number r2 = r13.minus(r14, r2)
            java.lang.Number r5 = r13.minus(r5, r14)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r5)
            if (r2 >= 0) goto Le0
            return r0
        Le0:
            if (r2 <= 0) goto Le3
            return r3
        Le3:
            int r15 = r15.ordinal()
            r15 = r8[r15]
            r2 = 2
            if (r15 == r2) goto L109
            r2 = 3
            if (r15 == r2) goto L100
            r2 = 4
            if (r15 != r2) goto Lfa
            int r14 = r13.sign(r14)
            if (r14 < 0) goto Lf9
            r0 = r3
        Lf9:
            return r0
        Lfa:
            java.lang.AssertionError r14 = new java.lang.AssertionError
            r14.<init>(r10)
            throw r14
        L100:
            int r14 = r13.sign(r14)
            if (r14 < 0) goto L107
            goto L108
        L107:
            r0 = r3
        L108:
            return r0
        L109:
            long r14 = java.lang.Double.doubleToRawLongBits(r0)
            r5 = 1
            long r14 = r14 & r5
            r5 = 0
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 != 0) goto L117
            goto L118
        L117:
            r0 = r3
        L118:
            return r0
        L119:
            int r14 = r13.sign(r14)
            if (r14 < 0) goto L127
            if (r7 < 0) goto L122
            goto L126
        L122:
            double r0 = com.google.common.math.DoubleUtils.nextDown(r0)
        L126:
            return r0
        L127:
            if (r7 > 0) goto L12a
            goto L12e
        L12a:
            double r0 = java.lang.Math.nextUp(r0)
        L12e:
            return r0
    }

    public abstract double roundToDoubleArbitrarily(X r1);

    public abstract int sign(X r1);

    public abstract X toX(double r1, java.math.RoundingMode r3);
}
