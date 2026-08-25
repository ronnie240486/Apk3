package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class Cam16 {
    public static final double[][] CAM16RGB_TO_XYZ = null;
    public static final double[][] XYZ_TO_CAM16RGB = null;
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;
    private final double j;
    private final double jstar;
    private final double m;
    private final double q;
    private final double s;

    static {
            r0 = 3
            double[][] r1 = new double[r0][]
            double[] r2 = new double[r0]
            r2 = {x0038: FILL_ARRAY_DATA , data: [4600900581866978926, 4604031457306329131, -4635794904125409757} // fill-array
            r3 = 0
            r1[r3] = r2
            double[] r2 = new double[r0]
            r2 = {x0048: FILL_ARRAY_DATA , data: [-4625191989450698851, 4608103017614246721, 4586769078869824727} // fill-array
            r4 = 1
            r1[r4] = r2
            double[] r2 = new double[r0]
            r2 = {x0058: FILL_ARRAY_DATA , data: [-4656431766712308090, 4587215547722483729, 4606760224349349933} // fill-array
            r5 = 2
            r1[r5] = r2
            com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB = r1
            double[][] r1 = new double[r0][]
            double[] r2 = new double[r0]
            r2 = {x0068: FILL_ARRAY_DATA , data: [4611064827022865511, -4616138931392032233, 4594543040505068257} // fill-array
            r1[r3] = r2
            double[] r2 = new double[r0]
            r2 = {x0078: FILL_ARRAY_DATA , data: [4600652677442466630, 4603772720463705113, -4647045267811766492} // fill-array
            r1[r4] = r2
            double[] r0 = new double[r0]
            r0 = {x0088: FILL_ARRAY_DATA , data: [-4643148813942544530, -4638293581903180231, 4607407438453239198} // fill-array
            r1[r5] = r0
            com.google.android.material.color.utilities.Cam16.CAM16RGB_TO_XYZ = r1
            return
    }

    private Cam16(double r4, double r6, double r8, double r10, double r12, double r14, double r16, double r18, double r20) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.hue = r1
            r1 = r6
            r0.chroma = r1
            r1 = r8
            r0.j = r1
            r1 = r10
            r0.q = r1
            r1 = r12
            r0.m = r1
            r1 = r14
            r0.s = r1
            r1 = r16
            r0.jstar = r1
            r1 = r18
            r0.astar = r1
            r1 = r20
            r0.bstar = r1
            return
    }

    public static com.google.android.material.color.utilities.Cam16 fromInt(int r40) {
            r0 = r40
            com.google.android.material.color.utilities.ViewingConditions r1 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r2 = r2 & r0
            int r2 = r2 >> 16
            r3 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r0
            int r3 = r3 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            double r4 = com.google.android.material.color.utilities.ColorUtils.linearized(r2)
            double r2 = com.google.android.material.color.utilities.ColorUtils.linearized(r3)
            double r6 = com.google.android.material.color.utilities.ColorUtils.linearized(r0)
            r8 = 4601099658084187286(0x3fda63c2e8477c96, double:0.41233895)
            double r8 = r8 * r4
            r10 = 4600113940642081913(0x3fd6e341ae4b2c79, double:0.35762064)
            double r10 = r10 * r2
            double r10 = r10 + r8
            r8 = 4595671593572523358(0x3fc71af7273e5d5e, double:0.18051042)
            double r8 = r8 * r6
            double r8 = r8 + r10
            r10 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r10 = r10 * r4
            r12 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r12 = r12 * r2
            double r12 = r12 + r10
            r10 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r10 = r10 * r6
            double r10 = r10 + r12
            r12 = 4581226238680505381(0x3f93c8fde0401c25, double:0.01932141)
            double r4 = r4 * r12
            r12 = 4593251078828733646(0x3fbe818525c434ce, double:0.11916382)
            double r2 = r2 * r12
            double r2 = r2 + r4
            r4 = 4606735164339439408(0x3fee693974c0c730, double:0.95034478)
            double r6 = r6 * r4
            double r6 = r6 + r2
            double[][] r0 = com.google.android.material.color.utilities.Cam16.XYZ_TO_CAM16RGB
            r2 = 0
            r3 = r0[r2]
            r4 = r3[r2]
            double r4 = r4 * r8
            r3 = r0[r2]
            r12 = 1
            r13 = r3[r12]
            double r13 = r13 * r10
            double r13 = r13 + r4
            r3 = r0[r2]
            r4 = 2
            r15 = r3[r4]
            double r15 = r15 * r6
            double r15 = r15 + r13
            r3 = r0[r12]
            r13 = r3[r2]
            double r13 = r13 * r8
            r3 = r0[r12]
            r17 = r3[r12]
            double r17 = r17 * r10
            double r17 = r17 + r13
            r3 = r0[r12]
            r13 = r3[r4]
            double r13 = r13 * r6
            double r13 = r13 + r17
            r3 = r0[r4]
            r17 = r3[r2]
            double r8 = r8 * r17
            r3 = r0[r4]
            r17 = r3[r12]
            double r10 = r10 * r17
            double r10 = r10 + r8
            r0 = r0[r4]
            r8 = r0[r4]
            double r6 = r6 * r8
            double r6 = r6 + r10
            double[] r0 = r1.getRgbD()
            r2 = r0[r2]
            double r2 = r2 * r15
            double[] r0 = r1.getRgbD()
            r8 = r0[r12]
            double r8 = r8 * r13
            double[] r0 = r1.getRgbD()
            r4 = r0[r4]
            double r4 = r4 * r6
            double r6 = r1.getFl()
            double r10 = java.lang.Math.abs(r2)
            double r10 = r10 * r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r10 = r10 / r6
            r12 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r10 = java.lang.Math.pow(r10, r12)
            double r14 = r1.getFl()
            double r16 = java.lang.Math.abs(r8)
            double r16 = r16 * r14
            double r14 = r16 / r6
            double r14 = java.lang.Math.pow(r14, r12)
            double r16 = r1.getFl()
            double r18 = java.lang.Math.abs(r4)
            double r18 = r18 * r16
            r16 = r1
            double r0 = r18 / r6
            double r0 = java.lang.Math.pow(r0, r12)
            double r2 = java.lang.Math.signum(r2)
            r12 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r2 = r2 * r12
            double r2 = r2 * r10
            r17 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r10 = r10 + r17
            double r2 = r2 / r10
            double r8 = java.lang.Math.signum(r8)
            double r8 = r8 * r12
            double r8 = r8 * r14
            double r14 = r14 + r17
            double r8 = r8 / r14
            double r4 = java.lang.Math.signum(r4)
            double r4 = r4 * r12
            double r4 = r4 * r0
            double r0 = r0 + r17
            double r4 = r4 / r0
            r0 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r10 = r2 * r0
            r12 = -4600427019358961664(0xc028000000000000, double:-12.0)
            double r12 = r12 * r8
            double r12 = r12 + r10
            double r12 = r12 + r4
            double r12 = r12 / r0
            double r0 = r2 + r8
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r4 * r10
            double r0 = r0 - r14
            r14 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r0 = r0 / r14
            r14 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r17 = r2 * r14
            double r8 = r8 * r14
            double r17 = r17 + r8
            r19 = 4626604192193052672(0x4035000000000000, double:21.0)
            double r19 = r19 * r4
            double r19 = r19 + r17
            double r19 = r19 / r14
            r17 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r2 = r2 * r17
            double r2 = r2 + r8
            double r2 = r2 + r4
            double r2 = r2 / r14
            double r4 = java.lang.Math.atan2(r0, r12)
            double r4 = java.lang.Math.toDegrees(r4)
            r8 = 4645040803167600640(0x4076800000000000, double:360.0)
            r14 = 0
            int r17 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r17 >= 0) goto L15e
            double r4 = r4 + r8
            goto L163
        L15e:
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 < 0) goto L163
            double r4 = r4 - r8
        L163:
            r22 = r4
            double r4 = java.lang.Math.toRadians(r22)
            double r14 = r16.getNbb()
            double r14 = r14 * r2
            double r2 = r16.getAw()
            double r14 = r14 / r2
            double r2 = r16.getC()
            double r17 = r16.getZ()
            double r2 = r2 * r17
            double r2 = java.lang.Math.pow(r14, r2)
            double r26 = r2 * r6
            double r2 = r16.getC()
            r14 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = r14 / r2
            double r6 = r26 / r6
            double r17 = java.lang.Math.sqrt(r6)
            double r17 = r17 * r2
            double r2 = r16.getAw()
            double r2 = r2 + r14
            double r2 = r2 * r17
            double r17 = r16.getFlRoot()
            double r28 = r17 * r2
            r2 = 4626362123713081508(0x403423d70a3d70a4, double:20.14)
            int r17 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r17 >= 0) goto L1ad
            double r8 = r22 + r8
            goto L1af
        L1ad:
            r8 = r22
        L1af:
            r2 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r8 = java.lang.Math.toRadians(r8)
            double r8 = r8 + r10
            double r8 = java.lang.Math.cos(r8)
            r10 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r8 = r8 + r10
            double r8 = r8 * r2
            r2 = 4660676196825845445(0x40ae0c4ec4ec4ec5, double:3846.153846153846)
            double r8 = r8 * r2
            double r2 = r16.getNc()
            double r2 = r2 * r8
            double r8 = r16.getNcb()
            double r8 = r8 * r2
            double r0 = java.lang.Math.hypot(r12, r0)
            double r0 = r0 * r8
            r2 = 4599166011463297925(0x3fd3851eb851eb85, double:0.305)
            double r19 = r19 + r2
            double r0 = r0 / r19
            r2 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            r8 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r10 = r16.getN()
            double r8 = java.lang.Math.pow(r8, r10)
            double r2 = r2 - r8
            r8 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r2 = java.lang.Math.pow(r2, r8)
            r8 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r0 = java.lang.Math.pow(r0, r8)
            double r0 = r0 * r2
            double r2 = java.lang.Math.sqrt(r6)
            double r2 = r2 * r0
            r24 = r2
            double r6 = r16.getFlRoot()
            double r6 = r6 * r2
            r30 = r6
            r2 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r8 = r16.getC()
            double r8 = r8 * r0
            double r0 = r16.getAw()
            double r0 = r0 + r14
            double r8 = r8 / r0
            double r0 = java.lang.Math.sqrt(r8)
            double r32 = r0 * r2
            r0 = 4610334938539176756(0x3ffb333333333334, double:1.7000000000000002)
            double r0 = r0 * r26
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8 = 4574720472685930873(0x3f7cac083126e979, double:0.007)
            double r8 = r8 * r26
            double r8 = r8 + r2
            double r34 = r0 / r8
            r0 = 4631369514167189216(0x4045ee08fb823ee0, double:43.859649122807014)
            r2 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r6 = r6 * r2
            double r2 = java.lang.Math.log1p(r6)
            double r2 = r2 * r0
            double r0 = java.lang.Math.cos(r4)
            double r36 = r0 * r2
            double r0 = java.lang.Math.sin(r4)
            double r38 = r0 * r2
            com.google.android.material.color.utilities.Cam16 r0 = new com.google.android.material.color.utilities.Cam16
            r21 = r0
            r21.<init>(r22, r24, r26, r28, r30, r32, r34, r36, r38)
            return r0
    }

    private static com.google.android.material.color.utilities.Cam16 fromJchInViewingConditions(double r23, double r25, double r27, com.google.android.material.color.utilities.ViewingConditions r29) {
            r5 = r23
            r3 = r25
            r1 = r27
            double r7 = r29.getC()
            r11 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r7 = r11 / r7
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r13 = r23 / r9
            double r9 = java.lang.Math.sqrt(r13)
            double r9 = r9 * r7
            double r7 = r29.getAw()
            double r7 = r7 + r11
            double r7 = r7 * r9
            double r9 = r29.getFlRoot()
            double r7 = r7 * r9
            double r9 = r29.getFlRoot()
            double r15 = r9 * r25
            r9 = r15
            double r13 = java.lang.Math.sqrt(r13)
            double r13 = r25 / r13
            double r17 = r29.getC()
            double r17 = r17 * r13
            double r13 = r29.getAw()
            double r13 = r13 + r11
            double r17 = r17 / r13
            double r11 = java.lang.Math.sqrt(r17)
            r13 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r11 = r11 * r13
            double r17 = java.lang.Math.toRadians(r27)
            r13 = 4610334938539176756(0x3ffb333333333334, double:1.7000000000000002)
            double r13 = r13 * r23
            r19 = 4574720472685930873(0x3f7cac083126e979, double:0.007)
            double r19 = r19 * r23
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r19 = r19 + r21
            double r13 = r13 / r19
            r19 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r15 = r15 * r19
            double r15 = java.lang.Math.log1p(r15)
            r19 = 4631369514167189216(0x4045ee08fb823ee0, double:43.859649122807014)
            double r19 = r19 * r15
            double r15 = java.lang.Math.cos(r17)
            double r15 = r15 * r19
            double r17 = java.lang.Math.sin(r17)
            double r17 = r17 * r19
            com.google.android.material.color.utilities.Cam16 r19 = new com.google.android.material.color.utilities.Cam16
            r0 = r19
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r17)
            return r19
    }

    public static com.google.android.material.color.utilities.Cam16 fromUcs(double r7, double r9, double r11) {
            com.google.android.material.color.utilities.ViewingConditions r6 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            r0 = r7
            r2 = r9
            r4 = r11
            com.google.android.material.color.utilities.Cam16 r7 = fromUcsInViewingConditions(r0, r2, r4, r6)
            return r7
    }

    public static com.google.android.material.color.utilities.Cam16 fromUcsInViewingConditions(double r11, double r13, double r15, com.google.android.material.color.utilities.ViewingConditions r17) {
            double r0 = java.lang.Math.hypot(r13, r15)
            r2 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r0 = r0 * r2
            double r0 = java.lang.Math.expm1(r0)
            double r0 = r0 / r2
            double r2 = r17.getFlRoot()
            double r6 = r0 / r2
            r0 = r13
            r2 = r15
            double r0 = java.lang.Math.atan2(r2, r13)
            r2 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r0 = r0 * r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2f
            r2 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = r0 + r2
        L2f:
            r8 = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r11 - r2
            r4 = 4574720472685930873(0x3f7cac083126e979, double:0.007)
            double r2 = r2 * r4
            double r0 = r0 - r2
            double r4 = r11 / r0
            r10 = r17
            com.google.android.material.color.utilities.Cam16 r0 = fromJchInViewingConditions(r4, r6, r8, r10)
            return r0
    }

    public double getAstar() {
            r2 = this;
            double r0 = r2.astar
            return r0
    }

    public double getBstar() {
            r2 = this;
            double r0 = r2.bstar
            return r0
    }

    public double getChroma() {
            r2 = this;
            double r0 = r2.chroma
            return r0
    }

    public double getHue() {
            r2 = this;
            double r0 = r2.hue
            return r0
    }

    public double getJ() {
            r2 = this;
            double r0 = r2.j
            return r0
    }

    public double getJstar() {
            r2 = this;
            double r0 = r2.jstar
            return r0
    }

    public double getM() {
            r2 = this;
            double r0 = r2.m
            return r0
    }

    public double getQ() {
            r2 = this;
            double r0 = r2.q
            return r0
    }

    public double getS() {
            r2 = this;
            double r0 = r2.s
            return r0
    }

    public int toInt() {
            r21 = this;
            com.google.android.material.color.utilities.ViewingConditions r0 = com.google.android.material.color.utilities.ViewingConditions.DEFAULT
            double r1 = r21.getChroma()
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L26
            double r1 = r21.getJ()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L17
            goto L26
        L17:
            double r1 = r21.getChroma()
            double r7 = r21.getJ()
            double r7 = r7 / r3
            double r7 = java.lang.Math.sqrt(r7)
            double r1 = r1 / r7
            goto L27
        L26:
            r1 = r5
        L27:
            r7 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            r9 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r11 = r0.getN()
            double r9 = java.lang.Math.pow(r9, r11)
            double r7 = r7 - r9
            r9 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r7 = java.lang.Math.pow(r7, r9)
            double r1 = r1 / r7
            r7 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r1 = java.lang.Math.pow(r1, r7)
            double r7 = r21.getHue()
            double r7 = java.lang.Math.toRadians(r7)
            r9 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = r11 + r7
            double r11 = java.lang.Math.cos(r11)
            r13 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r11 = r11 + r13
            double r11 = r11 * r9
            double r9 = r0.getAw()
            double r13 = r21.getJ()
            double r13 = r13 / r3
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r17 = r0.getC()
            double r15 = r15 / r17
            double r17 = r0.getZ()
            double r3 = r15 / r17
            double r3 = java.lang.Math.pow(r13, r3)
            double r3 = r3 * r9
            r9 = 4660676196825845445(0x40ae0c4ec4ec4ec5, double:3846.153846153846)
            double r11 = r11 * r9
            double r9 = r0.getNc()
            double r9 = r9 * r11
            double r11 = r0.getNcb()
            double r11 = r11 * r9
            double r9 = r0.getNbb()
            double r3 = r3 / r9
            double r9 = java.lang.Math.sin(r7)
            double r7 = java.lang.Math.cos(r7)
            r13 = 4599166011463297925(0x3fd3851eb851eb85, double:0.305)
            double r13 = r13 + r3
            r15 = 4627167142146473984(0x4037000000000000, double:23.0)
            double r13 = r13 * r15
            double r13 = r13 * r1
            double r11 = r11 * r15
            r15 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r15 = r15 * r1
            double r15 = r15 * r7
            double r15 = r15 + r11
            r11 = 4637300241308057600(0x405b000000000000, double:108.0)
            double r1 = r1 * r11
            double r1 = r1 * r9
            double r1 = r1 + r15
            double r13 = r13 / r1
            double r7 = r7 * r13
            double r13 = r13 * r9
            r1 = 4646800021772042240(0x407cc00000000000, double:460.0)
            double r3 = r3 * r1
            r1 = 4646641692097642496(0x407c300000000000, double:451.0)
            double r1 = r1 * r7
            double r1 = r1 + r3
            r9 = 4643774165772402688(0x4072000000000000, double:288.0)
            double r9 = r9 * r13
            double r9 = r9 + r1
            r1 = 4653885274701430784(0x4095ec0000000000, double:1403.0)
            double r9 = r9 / r1
            r11 = 4651048534701768704(0x408bd80000000000, double:891.0)
            double r11 = r11 * r7
            double r11 = r3 - r11
            r15 = 4643299176749203456(0x4070500000000000, double:261.0)
            double r15 = r15 * r13
            double r11 = r11 - r15
            double r11 = r11 / r1
            r15 = 4641944578423783424(0x406b800000000000, double:220.0)
            double r7 = r7 * r15
            double r3 = r3 - r7
            r7 = 4663648937956081664(0x40b89c0000000000, double:6300.0)
            double r13 = r13 * r7
            double r3 = r3 - r13
            double r3 = r3 / r1
            double r1 = java.lang.Math.abs(r9)
            r7 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r1 = r1 * r7
            double r13 = java.lang.Math.abs(r9)
            r15 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r13 = r15 - r13
            double r1 = r1 / r13
            double r1 = java.lang.Math.max(r5, r1)
            double r9 = java.lang.Math.signum(r9)
            double r13 = r0.getFl()
            r17 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r13 = r17 / r13
            double r13 = r13 * r9
            r9 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r1 = java.lang.Math.pow(r1, r9)
            double r1 = r1 * r13
            double r13 = java.lang.Math.abs(r11)
            double r13 = r13 * r7
            double r17 = java.lang.Math.abs(r11)
            double r17 = r15 - r17
            double r13 = r13 / r17
            double r13 = java.lang.Math.max(r5, r13)
            double r11 = java.lang.Math.signum(r11)
            double r17 = r0.getFl()
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r17 = r19 / r17
            double r17 = r17 * r11
            double r11 = java.lang.Math.pow(r13, r9)
            double r11 = r11 * r17
            double r13 = java.lang.Math.abs(r3)
            double r13 = r13 * r7
            double r7 = java.lang.Math.abs(r3)
            double r15 = r15 - r7
            double r13 = r13 / r15
            double r5 = java.lang.Math.max(r5, r13)
            double r3 = java.lang.Math.signum(r3)
            double r7 = r0.getFl()
            r13 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r7 = r13 / r7
            double r7 = r7 * r3
            double r3 = java.lang.Math.pow(r5, r9)
            double r3 = r3 * r7
            double[] r5 = r0.getRgbD()
            r6 = 0
            r7 = r5[r6]
            double r1 = r1 / r7
            double[] r5 = r0.getRgbD()
            r7 = 1
            r8 = r5[r7]
            double r11 = r11 / r8
            double[] r0 = r0.getRgbD()
            r5 = 2
            r8 = r0[r5]
            double r3 = r3 / r8
            double[][] r0 = com.google.android.material.color.utilities.Cam16.CAM16RGB_TO_XYZ
            r8 = r0[r6]
            r9 = r8[r6]
            double r9 = r9 * r1
            r8 = r0[r6]
            r13 = r8[r7]
            double r13 = r13 * r11
            double r13 = r13 + r9
            r8 = r0[r6]
            r9 = r8[r5]
            double r9 = r9 * r3
            double r15 = r9 + r13
            r8 = r0[r7]
            r9 = r8[r6]
            double r9 = r9 * r1
            r8 = r0[r7]
            r13 = r8[r7]
            double r13 = r13 * r11
            double r13 = r13 + r9
            r8 = r0[r7]
            r9 = r8[r5]
            double r9 = r9 * r3
            double r17 = r9 + r13
            r8 = r0[r5]
            r9 = r8[r6]
            double r1 = r1 * r9
            r6 = r0[r5]
            r7 = r6[r7]
            double r11 = r11 * r7
            double r11 = r11 + r1
            r0 = r0[r5]
            r1 = r0[r5]
            double r3 = r3 * r1
            double r19 = r3 + r11
            int r0 = com.google.android.material.color.utilities.ColorUtils.argbFromXyz(r15, r17, r19)
            return r0
    }
}
