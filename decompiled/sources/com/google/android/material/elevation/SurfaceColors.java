package com.google.android.material.elevation;

/* JADX INFO: loaded from: classes2.dex */
public final enum SurfaceColors extends java.lang.Enum<com.google.android.material.elevation.SurfaceColors> {
    private static final /* synthetic */ com.google.android.material.elevation.SurfaceColors[] $VALUES = null;
    public static final com.google.android.material.elevation.SurfaceColors SURFACE_0 = null;
    public static final com.google.android.material.elevation.SurfaceColors SURFACE_1 = null;
    public static final com.google.android.material.elevation.SurfaceColors SURFACE_2 = null;
    public static final com.google.android.material.elevation.SurfaceColors SURFACE_3 = null;
    public static final com.google.android.material.elevation.SurfaceColors SURFACE_4 = null;
    public static final com.google.android.material.elevation.SurfaceColors SURFACE_5 = null;
    private final int elevationResId;

    static {
            com.google.android.material.elevation.SurfaceColors r0 = new com.google.android.material.elevation.SurfaceColors
            int r1 = com.google.android.material.R.dimen.m3_sys_elevation_level0
            java.lang.String r2 = "SURFACE_0"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.google.android.material.elevation.SurfaceColors.SURFACE_0 = r0
            com.google.android.material.elevation.SurfaceColors r1 = new com.google.android.material.elevation.SurfaceColors
            int r2 = com.google.android.material.R.dimen.m3_sys_elevation_level1
            java.lang.String r4 = "SURFACE_1"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.google.android.material.elevation.SurfaceColors.SURFACE_1 = r1
            com.google.android.material.elevation.SurfaceColors r2 = new com.google.android.material.elevation.SurfaceColors
            int r4 = com.google.android.material.R.dimen.m3_sys_elevation_level2
            java.lang.String r6 = "SURFACE_2"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.google.android.material.elevation.SurfaceColors.SURFACE_2 = r2
            com.google.android.material.elevation.SurfaceColors r4 = new com.google.android.material.elevation.SurfaceColors
            int r6 = com.google.android.material.R.dimen.m3_sys_elevation_level3
            java.lang.String r8 = "SURFACE_3"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.google.android.material.elevation.SurfaceColors.SURFACE_3 = r4
            com.google.android.material.elevation.SurfaceColors r6 = new com.google.android.material.elevation.SurfaceColors
            int r8 = com.google.android.material.R.dimen.m3_sys_elevation_level4
            java.lang.String r10 = "SURFACE_4"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.google.android.material.elevation.SurfaceColors.SURFACE_4 = r6
            com.google.android.material.elevation.SurfaceColors r8 = new com.google.android.material.elevation.SurfaceColors
            int r10 = com.google.android.material.R.dimen.m3_sys_elevation_level5
            java.lang.String r12 = "SURFACE_5"
            r13 = 5
            r8.<init>(r12, r13, r10)
            com.google.android.material.elevation.SurfaceColors.SURFACE_5 = r8
            r10 = 6
            com.google.android.material.elevation.SurfaceColors[] r10 = new com.google.android.material.elevation.SurfaceColors[r10]
            r10[r3] = r0
            r10[r5] = r1
            r10[r7] = r2
            r10[r9] = r4
            r10[r11] = r6
            r10[r13] = r8
            com.google.android.material.elevation.SurfaceColors.$VALUES = r10
            return
    }

    private SurfaceColors(@androidx.annotation.DimenRes java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.elevationResId = r3
            return
    }

    @androidx.annotation.ColorInt
    public static int getColorForElevation(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.Dimension float r4) {
            com.google.android.material.elevation.ElevationOverlayProvider r0 = new com.google.android.material.elevation.ElevationOverlayProvider
            r0.<init>(r3)
            int r1 = com.google.android.material.R.attr.colorSurface
            r2 = 0
            int r3 = com.google.android.material.color.MaterialColors.getColor(r3, r1, r2)
            int r3 = r0.compositeOverlay(r3, r4)
            return r3
    }

    public static com.google.android.material.elevation.SurfaceColors valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.material.elevation.SurfaceColors> r0 = com.google.android.material.elevation.SurfaceColors.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.material.elevation.SurfaceColors r1 = (com.google.android.material.elevation.SurfaceColors) r1
            return r1
    }

    public static com.google.android.material.elevation.SurfaceColors[] values() {
            com.google.android.material.elevation.SurfaceColors[] r0 = com.google.android.material.elevation.SurfaceColors.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.android.material.elevation.SurfaceColors[] r0 = (com.google.android.material.elevation.SurfaceColors[]) r0
            return r0
    }

    @androidx.annotation.ColorInt
    public int getColor(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            android.content.res.Resources r0 = r3.getResources()
            int r1 = r2.elevationResId
            float r0 = r0.getDimension(r1)
            int r3 = getColorForElevation(r3, r0)
            return r3
    }
}
