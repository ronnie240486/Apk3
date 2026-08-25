package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class Score {
    private static final double CUTOFF_CHROMA = 15.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final double CUTOFF_TONE = 10.0d;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    /* JADX INFO: loaded from: classes.dex */
    public static class ScoredComparator implements java.util.Comparator<java.util.Map.Entry<java.lang.Integer, java.lang.Double>> {
        public ScoredComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.util.Map.Entry<java.lang.Integer, java.lang.Double> r1, java.util.Map.Entry<java.lang.Integer, java.lang.Double> r2) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(java.util.Map.Entry<java.lang.Integer, java.lang.Double> r1, java.util.Map.Entry<java.lang.Integer, java.lang.Double> r2) {
                r0 = this;
                java.lang.Object r1 = r1.getValue()
                java.lang.Double r1 = (java.lang.Double) r1
                java.lang.Object r2 = r2.getValue()
                java.lang.Double r2 = (java.lang.Double) r2
                int r1 = r1.compareTo(r2)
                int r1 = -r1
                return r1
        }
    }

    private Score() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.List<java.lang.Integer> filter(java.util.Map<java.lang.Integer, java.lang.Double> r9, java.util.Map<java.lang.Integer, com.google.android.material.color.utilities.Cam16> r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        Ld:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.getValue()
            com.google.android.material.color.utilities.Cam16 r1 = (com.google.android.material.color.utilities.Cam16) r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r9.get(r3)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            double r5 = r1.getChroma()
            r7 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto Ld
            double r5 = com.google.android.material.color.utilities.ColorUtils.lstarFromArgb(r2)
            r7 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto Ld
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto Ld
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            goto Ld
        L5c:
            return r0
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> r13) {
            java.util.Set r0 = r13.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        Lb:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L24
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            double r5 = (double) r5
            double r3 = r3 + r5
            goto Lb
        L24:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5 = 361(0x169, float:5.06E-43)
            double[] r5 = new double[r5]
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L35:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L71
            java.lang.Object r6 = r13.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.getValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            double r8 = (double) r6
            double r8 = r8 / r3
            com.google.android.material.color.utilities.Cam16 r6 = com.google.android.material.color.utilities.Cam16.fromInt(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r7, r6)
            double r6 = r6.getHue()
            long r6 = java.lang.Math.round(r6)
            int r7 = (int) r6
            r10 = r5[r7]
            double r10 = r10 + r8
            r5[r7] = r10
            goto L35
        L71:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L7e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc0
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.getValue()
            com.google.android.material.color.utilities.Cam16 r4 = (com.google.android.material.color.utilities.Cam16) r4
            double r7 = r4.getHue()
            long r7 = java.lang.Math.round(r7)
            int r4 = (int) r7
            int r7 = r4 + (-15)
            r8 = r1
        La6:
            int r10 = r4 + 15
            if (r7 >= r10) goto Lb4
            int r10 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(r7)
            r10 = r5[r10]
            double r8 = r8 + r10
            int r7 = r7 + 1
            goto La6
        Lb4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Double r6 = java.lang.Double.valueOf(r8)
            r13.put(r4, r6)
            goto L7e
        Lc0:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lcd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L12b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r3 = r3.getValue()
            com.google.android.material.color.utilities.Cam16 r3 = (com.google.android.material.color.utilities.Cam16) r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r13.get(r5)
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r7
            r7 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r5 = r5 * r7
            double r7 = r3.getChroma()
            r9 = 4631952216750555136(0x4048000000000000, double:48.0)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L112
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            goto L117
        L112:
            r7 = 4599075939470750515(0x3fd3333333333333, double:0.3)
        L117:
            double r11 = r3.getChroma()
            double r11 = r11 - r9
            double r11 = r11 * r7
            double r11 = r11 + r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r11)
            r1.put(r3, r4)
            goto Lcd
        L12b:
            java.util.List r13 = filter(r13, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
        L138:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L15a
            java.lang.Object r3 = r13.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            java.lang.Double r3 = (java.lang.Double) r3
            r2.put(r4, r3)
            goto L138
        L15a:
            java.util.ArrayList r13 = new java.util.ArrayList
            java.util.Set r1 = r2.entrySet()
            r13.<init>(r1)
            com.google.android.material.color.utilities.Score$ScoredComparator r1 = new com.google.android.material.color.utilities.Score$ScoredComparator
            r1.<init>()
            java.util.Collections.sort(r13, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L174:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L1cb
            java.lang.Object r2 = r13.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            com.google.android.material.color.utilities.Cam16 r3 = (com.google.android.material.color.utilities.Cam16) r3
            r4 = 0
            java.util.Iterator r5 = r1.iterator()
        L199:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1be
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r6 = r0.get(r6)
            com.google.android.material.color.utilities.Cam16 r6 = (com.google.android.material.color.utilities.Cam16) r6
            double r7 = r3.getHue()
            double r9 = r6.getHue()
            double r6 = com.google.android.material.color.utilities.MathUtils.differenceDegrees(r7, r9)
            r8 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L199
            r4 = 1
        L1be:
            if (r4 == 0) goto L1c1
            goto L174
        L1c1:
            java.lang.Object r2 = r2.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1.add(r2)
            goto L174
        L1cb:
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto L1db
            r13 = -12417548(0xffffffffff4285f4, float:-2.5856576E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r1.add(r13)
        L1db:
            return r1
    }
}
