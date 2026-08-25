package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes2.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private final java.lang.Object mInfo;

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void getBoundsInScreen(android.view.accessibility.AccessibilityWindowInfo r0, android.graphics.Rect r1) {
                r0.getBoundsInScreen(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityWindowInfo getChild(android.view.accessibility.AccessibilityWindowInfo r0, int r1) {
                android.view.accessibility.AccessibilityWindowInfo r0 = r0.getChild(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getChildCount(android.view.accessibility.AccessibilityWindowInfo r0) {
                int r0 = r0.getChildCount()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getId(android.view.accessibility.AccessibilityWindowInfo r0) {
                int r0 = r0.getId()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getLayer(android.view.accessibility.AccessibilityWindowInfo r0) {
                int r0 = r0.getLayer()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityWindowInfo getParent(android.view.accessibility.AccessibilityWindowInfo r0) {
                android.view.accessibility.AccessibilityWindowInfo r0 = r0.getParent()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityNodeInfo getRoot(android.view.accessibility.AccessibilityWindowInfo r0) {
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRoot()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getType(android.view.accessibility.AccessibilityWindowInfo r0) {
                int r0 = r0.getType()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isAccessibilityFocused(android.view.accessibility.AccessibilityWindowInfo r0) {
                boolean r0 = r0.isAccessibilityFocused()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isActive(android.view.accessibility.AccessibilityWindowInfo r0) {
                boolean r0 = r0.isActive()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isFocused(android.view.accessibility.AccessibilityWindowInfo r0) {
                boolean r0 = r0.isFocused()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityWindowInfo obtain() {
                android.view.accessibility.AccessibilityWindowInfo r0 = android.view.accessibility.AccessibilityWindowInfo.obtain()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityWindowInfo obtain(android.view.accessibility.AccessibilityWindowInfo r0) {
                android.view.accessibility.AccessibilityWindowInfo r0 = android.view.accessibility.AccessibilityWindowInfo.obtain(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void recycle(android.view.accessibility.AccessibilityWindowInfo r0) {
                r0.recycle()
                return
        }
    }

    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityNodeInfo getAnchor(android.view.accessibility.AccessibilityWindowInfo r0) {
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getAnchor()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getTitle(android.view.accessibility.AccessibilityWindowInfo r0) {
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getDisplayId(android.view.accessibility.AccessibilityWindowInfo r0) {
                int r0 = r0.getDisplayId()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void getRegionInScreen(android.view.accessibility.AccessibilityWindowInfo r0, android.graphics.Region r1) {
                r0.getRegionInScreen(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isInPictureInPictureMode(android.view.accessibility.AccessibilityWindowInfo r0) {
                boolean r0 = r0.isInPictureInPictureMode()
                return r0
        }
    }

    private AccessibilityWindowInfoCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mInfo = r1
            return
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain() {
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.obtain()
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain(@androidx.annotation.Nullable androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L10
        L4:
            java.lang.Object r0 = r0.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.obtain(r0)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
        L10:
            return r0
    }

    private static java.lang.String typeToString(int r1) {
            r0 = 1
            if (r1 == r0) goto L18
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L12
            r0 = 4
            if (r1 == r0) goto Lf
            java.lang.String r1 = "<UNKNOWN>"
            return r1
        Lf:
            java.lang.String r1 = "TYPE_ACCESSIBILITY_OVERLAY"
            return r1
        L12:
            java.lang.String r1 = "TYPE_SYSTEM"
            return r1
        L15:
            java.lang.String r1 = "TYPE_INPUT_METHOD"
            return r1
        L18:
            java.lang.String r1 = "TYPE_APPLICATION"
            return r1
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat wrapNonNullInstance(java.lang.Object r1) {
            if (r1 == 0) goto L8
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityWindowInfoCompat
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof androidx.core.view.accessibility.AccessibilityWindowInfoCompat
            if (r2 != 0) goto Ld
            return r1
        Ld:
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r4 = (androidx.core.view.accessibility.AccessibilityWindowInfoCompat) r4
            java.lang.Object r2 = r3.mInfo
            if (r2 != 0) goto L1a
            java.lang.Object r4 = r4.mInfo
            if (r4 != 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
        L1a:
            java.lang.Object r4 = r4.mInfo
            boolean r4 = r2.equals(r4)
            return r4
    }

    @androidx.annotation.Nullable
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getAnchor() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L13
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityNodeInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getAnchor(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    public void getBoundsInScreen(@androidx.annotation.NonNull android.graphics.Rect r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getBoundsInScreen(r0, r2)
            return
    }

    @androidx.annotation.Nullable
    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getChild(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r2 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getChild(r0, r2)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r2 = wrapNonNullInstance(r2)
            return r2
    }

    public int getChildCount() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getChildCount(r0)
            return r0
    }

    public int getDisplayId() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getDisplayId(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getId() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getId(r0)
            return r0
    }

    public int getLayer() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getLayer(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getParent() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getParent(r0)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public void getRegionInScreen(@androidx.annotation.NonNull android.graphics.Region r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Le
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getRegionInScreen(r0, r3)
            goto L1d
        Le:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.Object r1 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r1 = (android.view.accessibility.AccessibilityWindowInfo) r1
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getBoundsInScreen(r1, r0)
            r3.set(r0)
        L1d:
            return
    }

    @androidx.annotation.Nullable
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityNodeInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getRoot(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getTitle() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            java.lang.CharSequence r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getTitle(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getType() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getType(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public boolean isAccessibilityFocused() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isAccessibilityFocused(r0)
            return r0
    }

    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isActive(r0)
            return r0
    }

    public boolean isFocused() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isFocused(r0)
            return r0
    }

    public boolean isInPictureInPictureMode() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.isInPictureInPictureMode(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public void recycle() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.recycle(r0)
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.getBoundsInScreen(r1)
            java.lang.String r2 = "AccessibilityWindowInfo["
            r0.append(r2)
            java.lang.String r2 = "id="
            r0.append(r2)
            int r2 = r4.getId()
            r0.append(r2)
            java.lang.String r2 = ", type="
            r0.append(r2)
            int r2 = r4.getType()
            java.lang.String r2 = typeToString(r2)
            r0.append(r2)
            java.lang.String r2 = ", layer="
            r0.append(r2)
            int r2 = r4.getLayer()
            r0.append(r2)
            java.lang.String r2 = ", bounds="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", focused="
            r0.append(r1)
            boolean r1 = r4.isFocused()
            r0.append(r1)
            java.lang.String r1 = ", active="
            r0.append(r1)
            boolean r1 = r4.isActive()
            r0.append(r1)
            java.lang.String r1 = ", hasParent="
            r0.append(r1)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r1 = r4.getParent()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = 0
        L6a:
            r0.append(r1)
            java.lang.String r1 = ", hasChildren="
            r0.append(r1)
            int r1 = r4.getChildCount()
            if (r1 <= 0) goto L79
            goto L7a
        L79:
            r2 = 0
        L7a:
            r0.append(r2)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.accessibility.AccessibilityWindowInfo unwrap() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            return r0
    }
}
