package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayCompat {
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static androidx.core.view.DisplayCompat.ModeCompat getMode(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.view.Display r2) {
                android.view.Display$Mode r0 = r2.getMode()
                android.graphics.Point r1 = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(r1, r2)
                if (r1 == 0) goto L17
                boolean r2 = physicalSizeEquals(r0, r1)
                if (r2 == 0) goto L11
                goto L17
            L11:
                androidx.core.view.DisplayCompat$ModeCompat r2 = new androidx.core.view.DisplayCompat$ModeCompat
                r2.<init>(r0, r1)
                goto L1d
            L17:
                androidx.core.view.DisplayCompat$ModeCompat r2 = new androidx.core.view.DisplayCompat$ModeCompat
                r1 = 1
                r2.<init>(r0, r1)
            L1d:
                return r2
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"ArrayReturn"})
        public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull android.view.Display r7) {
                android.view.Display$Mode[] r0 = r7.getSupportedModes()
                int r1 = r0.length
                androidx.core.view.DisplayCompat$ModeCompat[] r1 = new androidx.core.view.DisplayCompat.ModeCompat[r1]
                android.view.Display$Mode r2 = r7.getMode()
                android.graphics.Point r6 = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(r6, r7)
                r7 = 0
                if (r6 == 0) goto L39
                boolean r3 = physicalSizeEquals(r2, r6)
                if (r3 == 0) goto L19
                goto L39
            L19:
                r3 = 0
            L1a:
                int r4 = r0.length
                if (r3 >= r4) goto L4e
                r4 = r0[r3]
                boolean r4 = physicalSizeEquals(r4, r2)
                if (r4 == 0) goto L2d
                androidx.core.view.DisplayCompat$ModeCompat r4 = new androidx.core.view.DisplayCompat$ModeCompat
                r5 = r0[r3]
                r4.<init>(r5, r6)
                goto L34
            L2d:
                androidx.core.view.DisplayCompat$ModeCompat r4 = new androidx.core.view.DisplayCompat$ModeCompat
                r5 = r0[r3]
                r4.<init>(r5, r7)
            L34:
                r1[r3] = r4
                int r3 = r3 + 1
                goto L1a
            L39:
                int r6 = r0.length
                if (r7 >= r6) goto L4e
                r6 = r0[r7]
                boolean r6 = physicalSizeEquals(r6, r2)
                androidx.core.view.DisplayCompat$ModeCompat r3 = new androidx.core.view.DisplayCompat$ModeCompat
                r4 = r0[r7]
                r3.<init>(r4, r6)
                r1[r7] = r3
                int r7 = r7 + 1
                goto L39
            L4e:
                return r1
        }

        public static boolean isCurrentModeTheLargestMode(@androidx.annotation.NonNull android.view.Display r7) {
                android.view.Display$Mode r0 = r7.getMode()
                android.view.Display$Mode[] r7 = r7.getSupportedModes()
                int r1 = r7.length
                r2 = 0
                r3 = 0
            Lb:
                if (r3 >= r1) goto L28
                r4 = r7[r3]
                int r5 = r0.getPhysicalHeight()
                int r6 = r4.getPhysicalHeight()
                if (r5 < r6) goto L27
                int r5 = r0.getPhysicalWidth()
                int r4 = r4.getPhysicalWidth()
                if (r5 >= r4) goto L24
                goto L27
            L24:
                int r3 = r3 + 1
                goto Lb
            L27:
                return r2
            L28:
                r7 = 1
                return r7
        }

        public static boolean physicalSizeEquals(android.view.Display.Mode r2, android.graphics.Point r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.x
                if (r0 != r1) goto L10
                int r0 = r2.getPhysicalHeight()
                int r1 = r3.y
                if (r0 == r1) goto L20
            L10:
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.y
                if (r0 != r1) goto L22
                int r2 = r2.getPhysicalHeight()
                int r3 = r3.x
                if (r2 != r3) goto L22
            L20:
                r2 = 1
                goto L23
            L22:
                r2 = 0
            L23:
                return r2
        }

        public static boolean physicalSizeEquals(android.view.Display.Mode r2, android.view.Display.Mode r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.getPhysicalWidth()
                if (r0 != r1) goto L16
                int r2 = r2.getPhysicalHeight()
                int r3 = r3.getPhysicalHeight()
                if (r2 != r3) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ModeCompat {
        private final boolean mIsNative;
        private final android.view.Display.Mode mMode;
        private final android.graphics.Point mPhysicalSize;

        /* JADX INFO: loaded from: classes2.dex */
        @androidx.annotation.RequiresApi(23)
        public static class Api23Impl {
            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.DoNotInline
            public static int getPhysicalHeight(android.view.Display.Mode r0) {
                    int r0 = r0.getPhysicalHeight()
                    return r0
            }

            @androidx.annotation.DoNotInline
            public static int getPhysicalWidth(android.view.Display.Mode r0) {
                    int r0 = r0.getPhysicalWidth()
                    return r0
            }
        }

        public ModeCompat(@androidx.annotation.NonNull android.graphics.Point r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "physicalSize == null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                r1.mPhysicalSize = r2
                r2 = 0
                r1.mMode = r2
                r2 = 1
                r1.mIsNative = r2
                return
        }

        @androidx.annotation.RequiresApi(23)
        public ModeCompat(@androidx.annotation.NonNull android.view.Display.Mode r2, @androidx.annotation.NonNull android.graphics.Point r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "physicalSize == null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                r1.mPhysicalSize = r3
                r1.mMode = r2
                r2 = 1
                r1.mIsNative = r2
                return
        }

        @androidx.annotation.RequiresApi(23)
        public ModeCompat(@androidx.annotation.NonNull android.view.Display.Mode r4, boolean r5) {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                androidx.core.util.Preconditions.checkNotNull(r4, r0)
                android.graphics.Point r0 = new android.graphics.Point
                int r1 = androidx.core.view.DisplayCompat.ModeCompat.Api23Impl.getPhysicalWidth(r4)
                int r2 = androidx.core.view.DisplayCompat.ModeCompat.Api23Impl.getPhysicalHeight(r4)
                r0.<init>(r1, r2)
                r3.mPhysicalSize = r0
                r3.mMode = r4
                r3.mIsNative = r5
                return
        }

        public int getPhysicalHeight() {
                r1 = this;
                android.graphics.Point r0 = r1.mPhysicalSize
                int r0 = r0.y
                return r0
        }

        public int getPhysicalWidth() {
                r1 = this;
                android.graphics.Point r0 = r1.mPhysicalSize
                int r0 = r0.x
                return r0
        }

        @java.lang.Deprecated
        public boolean isNative() {
                r1 = this;
                boolean r0 = r1.mIsNative
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RequiresApi(23)
        public android.view.Display.Mode toMode() {
                r1 = this;
                android.view.Display$Mode r0 = r1.mMode
                return r0
        }
    }

    private DisplayCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Point getCurrentDisplaySizeFromWorkarounds(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.view.Display r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Le
            java.lang.String r1 = "sys.display-size"
            android.graphics.Point r1 = parsePhysicalDisplaySizeFromSystemProperties(r1, r3)
            goto L15
        Le:
            java.lang.String r1 = "vendor.display-size"
            android.graphics.Point r1 = parsePhysicalDisplaySizeFromSystemProperties(r1, r3)
        L15:
            if (r1 == 0) goto L18
            return r1
        L18:
            boolean r2 = isSonyBravia4kTv(r2)
            r1 = 0
            if (r2 == 0) goto L34
            r2 = 23
            if (r0 < r2) goto L28
            boolean r2 = androidx.core.view.DisplayCompat.Api23Impl.isCurrentModeTheLargestMode(r3)
            goto L29
        L28:
            r2 = 1
        L29:
            if (r2 == 0) goto L34
            android.graphics.Point r1 = new android.graphics.Point
            r2 = 3840(0xf00, float:5.381E-42)
            r3 = 2160(0x870, float:3.027E-42)
            r1.<init>(r2, r3)
        L34:
            return r1
    }

    @androidx.annotation.NonNull
    private static android.graphics.Point getDisplaySize(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.view.Display r1) {
            android.graphics.Point r0 = getCurrentDisplaySizeFromWorkarounds(r0, r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getRealSize(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.DisplayCompat.ModeCompat getMode(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.view.Display r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            androidx.core.view.DisplayCompat$ModeCompat r2 = androidx.core.view.DisplayCompat.Api23Impl.getMode(r2, r3)
            return r2
        Lb:
            androidx.core.view.DisplayCompat$ModeCompat r0 = new androidx.core.view.DisplayCompat$ModeCompat
            android.graphics.Point r2 = getDisplaySize(r2, r3)
            r0.<init>(r2)
            return r0
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"ArrayReturn"})
    public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.view.Display r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            androidx.core.view.DisplayCompat$ModeCompat[] r2 = androidx.core.view.DisplayCompat.Api23Impl.getSupportedModes(r2, r3)
            return r2
        Lb:
            r0 = 1
            androidx.core.view.DisplayCompat$ModeCompat[] r0 = new androidx.core.view.DisplayCompat.ModeCompat[r0]
            r1 = 0
            androidx.core.view.DisplayCompat$ModeCompat r2 = getMode(r2, r3)
            r0[r1] = r2
            return r0
    }

    @androidx.annotation.Nullable
    private static java.lang.String getSystemProperty(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            r2[r5] = r6     // Catch: java.lang.Exception -> L1f
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L1f
            return r6
        L1f:
            r6 = 0
            return r6
    }

    private static boolean isSonyBravia4kTv(@androidx.annotation.NonNull android.content.Context r2) {
            boolean r0 = isTv(r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Sony"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "BRAVIA"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L28
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }

    private static boolean isTv(@androidx.annotation.NonNull android.content.Context r1) {
            java.lang.String r0 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            if (r1 == 0) goto L14
            int r1 = r1.getCurrentModeType()
            r0 = 4
            if (r1 != r0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    private static android.graphics.Point parseDisplaySize(@androidx.annotation.NonNull java.lang.String r2) throws java.lang.NumberFormatException {
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "x"
            r1 = -1
            java.lang.String[] r2 = r2.split(r0, r1)
            int r0 = r2.length
            r1 = 2
            if (r0 != r1) goto L28
            r0 = 0
            r0 = r2[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 1
            r2 = r2[r1]
            int r2 = java.lang.Integer.parseInt(r2)
            if (r0 <= 0) goto L28
            if (r2 <= 0) goto L28
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r0, r2)
            return r1
        L28:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r2.<init>()
            throw r2
    }

    @androidx.annotation.Nullable
    private static android.graphics.Point parsePhysicalDisplaySizeFromSystemProperties(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.view.Display r2) {
            int r2 = r2.getDisplayId()
            r0 = 0
            if (r2 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = getSystemProperty(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1a
            if (r1 != 0) goto L15
            goto L1a
        L15:
            android.graphics.Point r1 = parseDisplaySize(r1)     // Catch: java.lang.NumberFormatException -> L1a
            return r1
        L1a:
            return r0
    }
}
