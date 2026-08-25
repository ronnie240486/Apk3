package androidx.core.content.res;

/* JADX INFO: loaded from: classes2.dex */
final class CamUtils {
    public static final float[][] CAM16RGB_TO_XYZ = null;
    public static final float[][] SRGB_TO_XYZ = null;
    public static final float[] WHITE_POINT_D65 = null;
    public static final float[][] XYZ_TO_CAM16RGB = null;

    static {
            r0 = 3
            float[][] r1 = new float[r0][]
            float[] r2 = new float[r0]
            r2 = {x0058: FILL_ARRAY_DATA , data: [1053652383, 1059484093, -1118648123} // fill-array
            r3 = 0
            r1[r3] = r2
            float[] r2 = new float[r0]
            r2 = {x0062: FILL_ARRAY_DATA , data: [-1098898655, 1067067965, 1027330407} // fill-array
            r4 = 1
            r1[r4] = r2
            float[] r2 = new float[r0]
            r2 = {x006c: FILL_ARRAY_DATA , data: [-1157087275, 1028162020, 1064566818} // fill-array
            r5 = 2
            r1[r5] = r2
            androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB = r1
            float[][] r1 = new float[r0][]
            float[] r2 = new float[r0]
            r2 = {x0076: FILL_ARRAY_DATA , data: [1072584765, -1082036021, 1041810539} // fill-array
            r1[r3] = r2
            float[] r2 = new float[r0]
            r2 = {x0080: FILL_ARRAY_DATA , data: [1053190625, 1059002158, -1139603558} // fill-array
            r1[r4] = r2
            float[] r2 = new float[r0]
            r2 = {x008a: FILL_ARRAY_DATA , data: [-1132345847, -1123302273, 1065772348} // fill-array
            r1[r5] = r2
            androidx.core.content.res.CamUtils.CAM16RGB_TO_XYZ = r1
            float[] r1 = new float[r0]
            r1 = {x0094: FILL_ARRAY_DATA , data: [1119754256, 1120403456, 1121567769} // fill-array
            androidx.core.content.res.CamUtils.WHITE_POINT_D65 = r1
            float[][] r1 = new float[r0][]
            float[] r2 = new float[r0]
            r2 = {x009e: FILL_ARRAY_DATA , data: [1054023191, 1052187149, 1043912633} // fill-array
            r1[r3] = r2
            float[] r2 = new float[r0]
            r2 = {x00a8: FILL_ARRAY_DATA , data: [1046066128, 1060575065, 1033100696} // fill-array
            r1[r4] = r2
            float[] r0 = new float[r0]
            r0 = {x00b2: FILL_ARRAY_DATA , data: [1017006063, 1039404073, 1064520140} // fill-array
            r1[r5] = r0
            androidx.core.content.res.CamUtils.SRGB_TO_XYZ = r1
            return
    }

    private CamUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int intFromLStar(float r15) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r15
        L9:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r15 = -1
            return r15
        L11:
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r15 + r0
            r2 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 / r2
            r3 = 1147261687(0x4461d2f7, float:903.2963)
            r4 = 1007753895(0x3c111aa7, float:0.008856452)
            r5 = 1090519040(0x41000000, float:8.0)
            r6 = 1
            r7 = 0
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 <= 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            if (r5 == 0) goto L30
            float r15 = r1 * r1
            float r15 = r15 * r1
            goto L31
        L30:
            float r15 = r15 / r3
        L31:
            float r5 = r1 * r1
            float r5 = r5 * r1
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            if (r4 == 0) goto L40
            r8 = r5
            goto L44
        L40:
            float r8 = r1 * r2
            float r8 = r8 - r0
            float r8 = r8 / r3
        L44:
            if (r4 == 0) goto L47
            goto L4c
        L47:
            float r1 = r1 * r2
            float r1 = r1 - r0
            float r5 = r1 / r3
        L4c:
            float[] r0 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            r1 = r0[r7]
            float r8 = r8 * r1
            double r9 = (double) r8
            r1 = r0[r6]
            float r15 = r15 * r1
            double r11 = (double) r15
            r15 = 2
            r15 = r0[r15]
            float r5 = r5 * r15
            double r13 = (double) r5
            int r15 = androidx.core.graphics.ColorUtils.XYZToColor(r9, r11, r13)
            return r15
    }

    public static float linearized(int r5) {
            float r5 = (float) r5
            r0 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            r1 = 1025879782(0x3d25aee6, float:0.04045)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L14
            r1 = 1095678034(0x414eb852, float:12.92)
            float r5 = r5 / r1
        L11:
            float r5 = r5 * r0
            return r5
        L14:
            r1 = 1029785518(0x3d6147ae, float:0.055)
            float r5 = r5 + r1
            r1 = 1065814589(0x3f870a3d, float:1.055)
            float r5 = r5 / r1
            double r1 = (double) r5
            r3 = 4612586738567610368(0x4003333340000000, double:2.4000000953674316)
            double r1 = java.lang.Math.pow(r1, r3)
            float r5 = (float) r1
            goto L11
    }

    public static float yFromLStar() {
            r0 = 1112014848(0x42480000, float:50.0)
            double r0 = (double) r0
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 + r2
            r2 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r0 = r0 / r2
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            return r0
    }
}
