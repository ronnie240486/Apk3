package com.google.android.exoplayer2.text;

/* JADX INFO: loaded from: classes3.dex */
public final class Cue implements com.google.android.exoplayer2.Bundleable {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.text.Cue> CREATOR = null;
    public static final float DIMEN_UNSET = -3.4028235E38f;
    public static final com.google.android.exoplayer2.text.Cue EMPTY = null;
    private static final java.lang.String FIELD_BITMAP = null;
    private static final java.lang.String FIELD_BITMAP_HEIGHT = null;
    private static final java.lang.String FIELD_LINE = null;
    private static final java.lang.String FIELD_LINE_ANCHOR = null;
    private static final java.lang.String FIELD_LINE_TYPE = null;
    private static final java.lang.String FIELD_MULTI_ROW_ALIGNMENT = null;
    private static final java.lang.String FIELD_POSITION = null;
    private static final java.lang.String FIELD_POSITION_ANCHOR = null;
    private static final java.lang.String FIELD_SHEAR_DEGREES = null;
    private static final java.lang.String FIELD_SIZE = null;
    private static final java.lang.String FIELD_TEXT = null;
    private static final java.lang.String FIELD_TEXT_ALIGNMENT = null;
    private static final java.lang.String FIELD_TEXT_SIZE = null;
    private static final java.lang.String FIELD_TEXT_SIZE_TYPE = null;
    private static final java.lang.String FIELD_VERTICAL_TYPE = null;
    private static final java.lang.String FIELD_WINDOW_COLOR = null;
    private static final java.lang.String FIELD_WINDOW_COLOR_SET = null;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public static final int VERTICAL_TYPE_LR = 2;
    public static final int VERTICAL_TYPE_RL = 1;

    @androidx.annotation.Nullable
    public final android.graphics.Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;

    @androidx.annotation.Nullable
    public final android.text.Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence text;

    @androidx.annotation.Nullable
    public final android.text.Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.Cue$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {

        @androidx.annotation.Nullable
        private android.graphics.Bitmap bitmap;
        private float bitmapHeight;
        private float line;
        private int lineAnchor;
        private int lineType;

        @androidx.annotation.Nullable
        private android.text.Layout.Alignment multiRowAlignment;
        private float position;
        private int positionAnchor;
        private float shearDegrees;
        private float size;

        @androidx.annotation.Nullable
        private java.lang.CharSequence text;

        @androidx.annotation.Nullable
        private android.text.Layout.Alignment textAlignment;
        private float textSize;
        private int textSizeType;
        private int verticalType;

        @androidx.annotation.ColorInt
        private int windowColor;
        private boolean windowColorSet;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.text = r0
                r2.bitmap = r0
                r2.textAlignment = r0
                r2.multiRowAlignment = r0
                r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r2.line = r0
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.lineType = r1
                r2.lineAnchor = r1
                r2.position = r0
                r2.positionAnchor = r1
                r2.textSizeType = r1
                r2.textSize = r0
                r2.size = r0
                r2.bitmapHeight = r0
                r0 = 0
                r2.windowColorSet = r0
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r2.windowColor = r0
                r2.verticalType = r1
                return
        }

        private Builder(com.google.android.exoplayer2.text.Cue r2) {
                r1 = this;
                r1.<init>()
                java.lang.CharSequence r0 = r2.text
                r1.text = r0
                android.graphics.Bitmap r0 = r2.bitmap
                r1.bitmap = r0
                android.text.Layout$Alignment r0 = r2.textAlignment
                r1.textAlignment = r0
                android.text.Layout$Alignment r0 = r2.multiRowAlignment
                r1.multiRowAlignment = r0
                float r0 = r2.line
                r1.line = r0
                int r0 = r2.lineType
                r1.lineType = r0
                int r0 = r2.lineAnchor
                r1.lineAnchor = r0
                float r0 = r2.position
                r1.position = r0
                int r0 = r2.positionAnchor
                r1.positionAnchor = r0
                int r0 = r2.textSizeType
                r1.textSizeType = r0
                float r0 = r2.textSize
                r1.textSize = r0
                float r0 = r2.size
                r1.size = r0
                float r0 = r2.bitmapHeight
                r1.bitmapHeight = r0
                boolean r0 = r2.windowColorSet
                r1.windowColorSet = r0
                int r0 = r2.windowColor
                r1.windowColor = r0
                int r0 = r2.verticalType
                r1.verticalType = r0
                float r2 = r2.shearDegrees
                r1.shearDegrees = r2
                return
        }

        public /* synthetic */ Builder(com.google.android.exoplayer2.text.Cue r1, com.google.android.exoplayer2.text.Cue.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.google.android.exoplayer2.text.Cue build() {
                r22 = this;
                r0 = r22
                com.google.android.exoplayer2.text.Cue r20 = new com.google.android.exoplayer2.text.Cue
                r1 = r20
                java.lang.CharSequence r2 = r0.text
                android.text.Layout$Alignment r3 = r0.textAlignment
                android.text.Layout$Alignment r4 = r0.multiRowAlignment
                android.graphics.Bitmap r5 = r0.bitmap
                float r6 = r0.line
                int r7 = r0.lineType
                int r8 = r0.lineAnchor
                float r9 = r0.position
                int r10 = r0.positionAnchor
                int r11 = r0.textSizeType
                float r12 = r0.textSize
                float r13 = r0.size
                float r14 = r0.bitmapHeight
                boolean r15 = r0.windowColorSet
                r21 = r1
                int r1 = r0.windowColor
                r16 = r1
                int r1 = r0.verticalType
                r17 = r1
                float r1 = r0.shearDegrees
                r18 = r1
                r19 = 0
                r1 = r21
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return r20
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder clearWindowColor() {
                r1 = this;
                r0 = 0
                r1.windowColorSet = r0
                return r1
        }

        @androidx.annotation.Nullable
        @org.checkerframework.dataflow.qual.Pure
        public android.graphics.Bitmap getBitmap() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.bitmap
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getBitmapHeight() {
                r1 = this;
                float r0 = r1.bitmapHeight
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getLine() {
                r1 = this;
                float r0 = r1.line
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getLineAnchor() {
                r1 = this;
                int r0 = r1.lineAnchor
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getLineType() {
                r1 = this;
                int r0 = r1.lineType
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getPosition() {
                r1 = this;
                float r0 = r1.position
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getPositionAnchor() {
                r1 = this;
                int r0 = r1.positionAnchor
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getSize() {
                r1 = this;
                float r0 = r1.size
                return r0
        }

        @androidx.annotation.Nullable
        @org.checkerframework.dataflow.qual.Pure
        public java.lang.CharSequence getText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.text
                return r0
        }

        @androidx.annotation.Nullable
        @org.checkerframework.dataflow.qual.Pure
        public android.text.Layout.Alignment getTextAlignment() {
                r1 = this;
                android.text.Layout$Alignment r0 = r1.textAlignment
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public float getTextSize() {
                r1 = this;
                float r0 = r1.textSize
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getTextSizeType() {
                r1 = this;
                int r0 = r1.textSizeType
                return r0
        }

        @org.checkerframework.dataflow.qual.Pure
        public int getVerticalType() {
                r1 = this;
                int r0 = r1.verticalType
                return r0
        }

        @androidx.annotation.ColorInt
        @org.checkerframework.dataflow.qual.Pure
        public int getWindowColor() {
                r1 = this;
                int r0 = r1.windowColor
                return r0
        }

        public boolean isWindowColorSet() {
                r1 = this;
                boolean r0 = r1.windowColorSet
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setBitmap(android.graphics.Bitmap r1) {
                r0 = this;
                r0.bitmap = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setBitmapHeight(float r1) {
                r0 = this;
                r0.bitmapHeight = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setLine(float r1, int r2) {
                r0 = this;
                r0.line = r1
                r0.lineType = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setLineAnchor(int r1) {
                r0 = this;
                r0.lineAnchor = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setMultiRowAlignment(@androidx.annotation.Nullable android.text.Layout.Alignment r1) {
                r0 = this;
                r0.multiRowAlignment = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setPosition(float r1) {
                r0 = this;
                r0.position = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setPositionAnchor(int r1) {
                r0 = this;
                r0.positionAnchor = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setShearDegrees(float r1) {
                r0 = this;
                r0.shearDegrees = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setSize(float r1) {
                r0 = this;
                r0.size = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setText(java.lang.CharSequence r1) {
                r0 = this;
                r0.text = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setTextAlignment(@androidx.annotation.Nullable android.text.Layout.Alignment r1) {
                r0 = this;
                r0.textAlignment = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setTextSize(float r1, int r2) {
                r0 = this;
                r0.textSize = r1
                r0.textSizeType = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setVerticalType(int r1) {
                r0 = this;
                r0.verticalType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.text.Cue.Builder setWindowColor(@androidx.annotation.ColorInt int r1) {
                r0 = this;
                r0.windowColor = r1
                r1 = 1
                r0.windowColorSet = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    public static /* synthetic */ com.google.android.exoplayer2.text.Cue $r8$lambda$o3x3kjwGDIu2jZovhv4J976cJFc(android.os.Bundle r0) {
            com.google.android.exoplayer2.text.Cue r0 = fromBundle(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.text.Cue$Builder r0 = new com.google.android.exoplayer2.text.Cue$Builder
            r0.<init>()
            java.lang.String r1 = ""
            com.google.android.exoplayer2.text.Cue$Builder r0 = r0.setText(r1)
            com.google.android.exoplayer2.text.Cue r0 = r0.build()
            com.google.android.exoplayer2.text.Cue.EMPTY = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_TEXT = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_TEXT_ALIGNMENT = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_MULTI_ROW_ALIGNMENT = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_BITMAP = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_LINE = r0
            r0 = 5
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_LINE_TYPE = r0
            r0 = 6
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_LINE_ANCHOR = r0
            r0 = 7
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_POSITION = r0
            r0 = 8
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_POSITION_ANCHOR = r0
            r0 = 9
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_TEXT_SIZE_TYPE = r0
            r0 = 10
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_TEXT_SIZE = r0
            r0 = 11
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_SIZE = r0
            r0 = 12
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_BITMAP_HEIGHT = r0
            r0 = 13
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_WINDOW_COLOR = r0
            r0 = 14
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_WINDOW_COLOR_SET = r0
            r0 = 15
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_VERTICAL_TYPE = r0
            r0 = 16
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.text.Cue.FIELD_SHEAR_DEGREES = r0
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$21
            com.google.android.exoplayer2.text.Cue.CREATOR = r0
            return
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence r10) {
            r9 = this;
            r2 = 0
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence r12, @androidx.annotation.Nullable android.text.Layout.Alignment r13, float r14, int r15, int r16, float r17, int r18, float r19) {
            r11 = this;
            r9 = 0
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence r19, @androidx.annotation.Nullable android.text.Layout.Alignment r20, float r21, int r22, int r23, float r24, int r25, float r26, int r27, float r28) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r12 = r26
            r10 = r27
            r11 = r28
            r3 = 0
            r4 = 0
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r14 = 0
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    @java.lang.Deprecated
    public Cue(java.lang.CharSequence r19, @androidx.annotation.Nullable android.text.Layout.Alignment r20, float r21, int r22, int r23, float r24, int r25, float r26, boolean r27, int r28) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r12 = r26
            r14 = r27
            r15 = r28
            r3 = 0
            r4 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    private Cue(@androidx.annotation.Nullable java.lang.CharSequence r5, @androidx.annotation.Nullable android.text.Layout.Alignment r6, @androidx.annotation.Nullable android.text.Layout.Alignment r7, @androidx.annotation.Nullable android.graphics.Bitmap r8, float r9, int r10, int r11, float r12, int r13, int r14, float r15, float r16, float r17, boolean r18, int r19, int r20, float r21) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r8
            r4.<init>()
            if (r1 != 0) goto Lc
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r8)
            goto L14
        Lc:
            if (r2 != 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r3)
        L14:
            boolean r3 = r1 instanceof android.text.Spanned
            if (r3 == 0) goto L20
            android.text.SpannedString r1 = android.text.SpannedString.valueOf(r5)
            r0.text = r1
        L1e:
            r1 = r6
            goto L2d
        L20:
            if (r1 == 0) goto L29
            java.lang.String r1 = r5.toString()
            r0.text = r1
            goto L1e
        L29:
            r1 = 0
            r0.text = r1
            goto L1e
        L2d:
            r0.textAlignment = r1
            r1 = r7
            r0.multiRowAlignment = r1
            r0.bitmap = r2
            r1 = r9
            r0.line = r1
            r1 = r10
            r0.lineType = r1
            r1 = r11
            r0.lineAnchor = r1
            r1 = r12
            r0.position = r1
            r1 = r13
            r0.positionAnchor = r1
            r1 = r16
            r0.size = r1
            r1 = r17
            r0.bitmapHeight = r1
            r1 = r18
            r0.windowColorSet = r1
            r1 = r19
            r0.windowColor = r1
            r1 = r14
            r0.textSizeType = r1
            r1 = r15
            r0.textSize = r1
            r1 = r20
            r0.verticalType = r1
            r1 = r21
            r0.shearDegrees = r1
            return
    }

    public /* synthetic */ Cue(java.lang.CharSequence r1, android.text.Layout.Alignment r2, android.text.Layout.Alignment r3, android.graphics.Bitmap r4, float r5, int r6, int r7, float r8, int r9, int r10, float r11, float r12, float r13, boolean r14, int r15, int r16, float r17, com.google.android.exoplayer2.text.Cue.AnonymousClass1 r18) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    private static final com.google.android.exoplayer2.text.Cue fromBundle(android.os.Bundle r4) {
            com.google.android.exoplayer2.text.Cue$Builder r0 = new com.google.android.exoplayer2.text.Cue$Builder
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT
            java.lang.CharSequence r1 = r4.getCharSequence(r1)
            if (r1 == 0) goto L10
            r0.setText(r1)
        L10:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT_ALIGNMENT
            java.io.Serializable r1 = r4.getSerializable(r1)
            android.text.Layout$Alignment r1 = (android.text.Layout.Alignment) r1
            if (r1 == 0) goto L1d
            r0.setTextAlignment(r1)
        L1d:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_MULTI_ROW_ALIGNMENT
            java.io.Serializable r1 = r4.getSerializable(r1)
            android.text.Layout$Alignment r1 = (android.text.Layout.Alignment) r1
            if (r1 == 0) goto L2a
            r0.setMultiRowAlignment(r1)
        L2a:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_BITMAP
            android.os.Parcelable r1 = r4.getParcelable(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L37
            r0.setBitmap(r1)
        L37:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_LINE
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L52
            java.lang.String r2 = com.google.android.exoplayer2.text.Cue.FIELD_LINE_TYPE
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L52
            float r1 = r4.getFloat(r1)
            int r2 = r4.getInt(r2)
            r0.setLine(r1, r2)
        L52:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_LINE_ANCHOR
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L61
            int r1 = r4.getInt(r1)
            r0.setLineAnchor(r1)
        L61:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_POSITION
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L70
            float r1 = r4.getFloat(r1)
            r0.setPosition(r1)
        L70:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_POSITION_ANCHOR
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L7f
            int r1 = r4.getInt(r1)
            r0.setPositionAnchor(r1)
        L7f:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT_SIZE
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L9a
            java.lang.String r2 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT_SIZE_TYPE
            boolean r3 = r4.containsKey(r2)
            if (r3 == 0) goto L9a
            float r1 = r4.getFloat(r1)
            int r2 = r4.getInt(r2)
            r0.setTextSize(r1, r2)
        L9a:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_SIZE
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto La9
            float r1 = r4.getFloat(r1)
            r0.setSize(r1)
        La9:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_BITMAP_HEIGHT
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto Lb8
            float r1 = r4.getFloat(r1)
            r0.setBitmapHeight(r1)
        Lb8:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_WINDOW_COLOR
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto Lc7
            int r1 = r4.getInt(r1)
            r0.setWindowColor(r1)
        Lc7:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_WINDOW_COLOR_SET
            r2 = 0
            boolean r1 = r4.getBoolean(r1, r2)
            if (r1 != 0) goto Ld3
            r0.clearWindowColor()
        Ld3:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_VERTICAL_TYPE
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto Le2
            int r1 = r4.getInt(r1)
            r0.setVerticalType(r1)
        Le2:
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_SHEAR_DEGREES
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto Lf1
            float r4 = r4.getFloat(r1)
            r0.setShearDegrees(r4)
        Lf1:
            com.google.android.exoplayer2.text.Cue r4 = r0.build()
            return r4
    }

    public com.google.android.exoplayer2.text.Cue.Builder buildUpon() {
            r2 = this;
            com.google.android.exoplayer2.text.Cue$Builder r0 = new com.google.android.exoplayer2.text.Cue$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L99
            java.lang.Class<com.google.android.exoplayer2.text.Cue> r2 = com.google.android.exoplayer2.text.Cue.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            goto L99
        L11:
            com.google.android.exoplayer2.text.Cue r5 = (com.google.android.exoplayer2.text.Cue) r5
            java.lang.CharSequence r2 = r4.text
            java.lang.CharSequence r3 = r5.text
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L97
            android.text.Layout$Alignment r2 = r4.textAlignment
            android.text.Layout$Alignment r3 = r5.textAlignment
            if (r2 != r3) goto L97
            android.text.Layout$Alignment r2 = r4.multiRowAlignment
            android.text.Layout$Alignment r3 = r5.multiRowAlignment
            if (r2 != r3) goto L97
            android.graphics.Bitmap r2 = r4.bitmap
            if (r2 != 0) goto L32
            android.graphics.Bitmap r2 = r5.bitmap
            if (r2 != 0) goto L97
            goto L3c
        L32:
            android.graphics.Bitmap r3 = r5.bitmap
            if (r3 == 0) goto L97
            boolean r2 = r2.sameAs(r3)
            if (r2 == 0) goto L97
        L3c:
            float r2 = r4.line
            float r3 = r5.line
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L97
            int r2 = r4.lineType
            int r3 = r5.lineType
            if (r2 != r3) goto L97
            int r2 = r4.lineAnchor
            int r3 = r5.lineAnchor
            if (r2 != r3) goto L97
            float r2 = r4.position
            float r3 = r5.position
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L97
            int r2 = r4.positionAnchor
            int r3 = r5.positionAnchor
            if (r2 != r3) goto L97
            float r2 = r4.size
            float r3 = r5.size
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L97
            float r2 = r4.bitmapHeight
            float r3 = r5.bitmapHeight
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L97
            boolean r2 = r4.windowColorSet
            boolean r3 = r5.windowColorSet
            if (r2 != r3) goto L97
            int r2 = r4.windowColor
            int r3 = r5.windowColor
            if (r2 != r3) goto L97
            int r2 = r4.textSizeType
            int r3 = r5.textSizeType
            if (r2 != r3) goto L97
            float r2 = r4.textSize
            float r3 = r5.textSize
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L97
            int r2 = r4.verticalType
            int r3 = r5.verticalType
            if (r2 != r3) goto L97
            float r2 = r4.shearDegrees
            float r5 = r5.shearDegrees
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L97
            goto L98
        L97:
            r0 = 0
        L98:
            return r0
        L99:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 17
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.CharSequence r1 = r3.text
            r2 = 0
            r0[r2] = r1
            android.text.Layout$Alignment r1 = r3.textAlignment
            r2 = 1
            r0[r2] = r1
            android.text.Layout$Alignment r1 = r3.multiRowAlignment
            r2 = 2
            r0[r2] = r1
            android.graphics.Bitmap r1 = r3.bitmap
            r2 = 3
            r0[r2] = r1
            float r1 = r3.line
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r1 = r3.lineType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            int r1 = r3.lineAnchor
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            float r1 = r3.position
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 7
            r0[r2] = r1
            int r1 = r3.positionAnchor
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 8
            r0[r2] = r1
            float r1 = r3.size
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            float r1 = r3.bitmapHeight
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 10
            r0[r2] = r1
            boolean r1 = r3.windowColorSet
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 11
            r0[r2] = r1
            int r1 = r3.windowColor
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 12
            r0[r2] = r1
            int r1 = r3.textSizeType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 13
            r0[r2] = r1
            float r1 = r3.textSize
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 14
            r0[r2] = r1
            int r1 = r3.verticalType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 15
            r0[r2] = r1
            float r1 = r3.shearDegrees
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 16
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT
            java.lang.CharSequence r2 = r3.text
            r0.putCharSequence(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT_ALIGNMENT
            android.text.Layout$Alignment r2 = r3.textAlignment
            r0.putSerializable(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_MULTI_ROW_ALIGNMENT
            android.text.Layout$Alignment r2 = r3.multiRowAlignment
            r0.putSerializable(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_BITMAP
            android.graphics.Bitmap r2 = r3.bitmap
            r0.putParcelable(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_LINE
            float r2 = r3.line
            r0.putFloat(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_LINE_TYPE
            int r2 = r3.lineType
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_LINE_ANCHOR
            int r2 = r3.lineAnchor
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_POSITION
            float r2 = r3.position
            r0.putFloat(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_POSITION_ANCHOR
            int r2 = r3.positionAnchor
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT_SIZE_TYPE
            int r2 = r3.textSizeType
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_TEXT_SIZE
            float r2 = r3.textSize
            r0.putFloat(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_SIZE
            float r2 = r3.size
            r0.putFloat(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_BITMAP_HEIGHT
            float r2 = r3.bitmapHeight
            r0.putFloat(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_WINDOW_COLOR_SET
            boolean r2 = r3.windowColorSet
            r0.putBoolean(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_WINDOW_COLOR
            int r2 = r3.windowColor
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_VERTICAL_TYPE
            int r2 = r3.verticalType
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.text.Cue.FIELD_SHEAR_DEGREES
            float r2 = r3.shearDegrees
            r0.putFloat(r1, r2)
            return r0
    }
}
