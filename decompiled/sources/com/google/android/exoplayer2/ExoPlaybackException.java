package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlaybackException extends com.google.android.exoplayer2.PlaybackException {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.ExoPlaybackException> CREATOR = null;
    private static final java.lang.String FIELD_IS_RECOVERABLE = null;
    private static final java.lang.String FIELD_RENDERER_FORMAT = null;
    private static final java.lang.String FIELD_RENDERER_FORMAT_SUPPORT = null;
    private static final java.lang.String FIELD_RENDERER_INDEX = null;
    private static final java.lang.String FIELD_RENDERER_NAME = null;
    private static final java.lang.String FIELD_TYPE = null;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final boolean isRecoverable;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @androidx.annotation.Nullable
    public final java.lang.String rendererName;
    public final int type;

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public static /* synthetic */ com.google.android.exoplayer2.ExoPlaybackException $r8$lambda$mXbXdGG_PHMarv0ObcHmIhB4uIw(android.os.Bundle r1) {
            com.google.android.exoplayer2.ExoPlaybackException r0 = new com.google.android.exoplayer2.ExoPlaybackException
            r0.<init>(r1)
            return r0
    }

    static {
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$3
            com.google.android.exoplayer2.ExoPlaybackException.CREATOR = r0
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ExoPlaybackException.FIELD_TYPE = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_NAME = r0
            r0 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_INDEX = r0
            r0 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_FORMAT = r0
            r0 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_FORMAT_SUPPORT = r0
            r0 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.ExoPlaybackException.FIELD_IS_RECOVERABLE = r0
            return
    }

    private ExoPlaybackException(int r11, java.lang.Throwable r12, int r13) {
            r10 = this;
            r3 = 0
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 4
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private ExoPlaybackException(int r15, @androidx.annotation.Nullable java.lang.Throwable r16, @androidx.annotation.Nullable java.lang.String r17, int r18, @androidx.annotation.Nullable java.lang.String r19, int r20, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r21, int r22, boolean r23) {
            r14 = this;
            r0 = r15
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.String r2 = deriveMessage(r0, r1, r2, r3, r4, r5)
            long r11 = android.os.SystemClock.elapsedRealtime()
            r10 = 0
            r1 = r14
            r3 = r16
            r4 = r18
            r5 = r15
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r13 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            return
    }

    private ExoPlaybackException(android.os.Bundle r4) {
            r3 = this;
            r3.<init>(r4)
            java.lang.String r0 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_TYPE
            r1 = 2
            int r0 = r4.getInt(r0, r1)
            r3.type = r0
            java.lang.String r0 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_NAME
            java.lang.String r0 = r4.getString(r0)
            r3.rendererName = r0
            java.lang.String r0 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_INDEX
            r1 = -1
            int r0 = r4.getInt(r0, r1)
            r3.rendererIndex = r0
            java.lang.String r0 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_FORMAT
            android.os.Bundle r0 = r4.getBundle(r0)
            r1 = 0
            if (r0 != 0) goto L28
            r0 = r1
            goto L30
        L28:
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.Format> r2 = com.google.android.exoplayer2.Format.CREATOR
            com.google.android.exoplayer2.Bundleable r0 = r2.fromBundle(r0)
            com.google.android.exoplayer2.Format r0 = (com.google.android.exoplayer2.Format) r0
        L30:
            r3.rendererFormat = r0
            java.lang.String r0 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_FORMAT_SUPPORT
            r2 = 4
            int r0 = r4.getInt(r0, r2)
            r3.rendererFormatSupport = r0
            java.lang.String r0 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_IS_RECOVERABLE
            r2 = 0
            boolean r4 = r4.getBoolean(r0, r2)
            r3.isRecoverable = r4
            r3.mediaPeriodId = r1
            return
    }

    private ExoPlaybackException(java.lang.String r10, @androidx.annotation.Nullable java.lang.Throwable r11, int r12, int r13, @androidx.annotation.Nullable java.lang.String r14, int r15, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r16, int r17, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaPeriodId r18, long r19, boolean r21) {
            r9 = this;
            r6 = r9
            r7 = r13
            r8 = r21
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r19
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L16
            if (r7 != r1) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            if (r11 != 0) goto L1f
            r2 = 3
            if (r7 != r2) goto L20
        L1f:
            r0 = 1
        L20:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r6.type = r7
            r0 = r14
            r6.rendererName = r0
            r0 = r15
            r6.rendererIndex = r0
            r0 = r16
            r6.rendererFormat = r0
            r0 = r17
            r6.rendererFormatSupport = r0
            r0 = r18
            r6.mediaPeriodId = r0
            r6.isRecoverable = r8
            return
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForRemote(java.lang.String r11) {
            com.google.android.exoplayer2.ExoPlaybackException r10 = new com.google.android.exoplayer2.ExoPlaybackException
            r1 = 3
            r2 = 0
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 4
            r9 = 0
            r0 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForRenderer(java.lang.Throwable r11, java.lang.String r12, int r13, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r14, int r15, boolean r16, int r17) {
            com.google.android.exoplayer2.ExoPlaybackException r10 = new com.google.android.exoplayer2.ExoPlaybackException
            if (r14 != 0) goto L7
            r0 = 4
            r8 = 4
            goto L8
        L7:
            r8 = r15
        L8:
            r1 = 1
            r3 = 0
            r0 = r10
            r2 = r11
            r4 = r17
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForSource(java.io.IOException r2, int r3) {
            com.google.android.exoplayer2.ExoPlaybackException r0 = new com.google.android.exoplayer2.ExoPlaybackException
            r1 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.ExoPlaybackException createForUnexpected(java.lang.RuntimeException r1) {
            r0 = 1000(0x3e8, float:1.401E-42)
            com.google.android.exoplayer2.ExoPlaybackException r1 = createForUnexpected(r1, r0)
            return r1
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForUnexpected(java.lang.RuntimeException r2, int r3) {
            com.google.android.exoplayer2.ExoPlaybackException r0 = new com.google.android.exoplayer2.ExoPlaybackException
            r1 = 2
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static java.lang.String deriveMessage(int r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3, int r4, @androidx.annotation.Nullable com.google.android.exoplayer2.Format r5, int r6) {
            if (r1 == 0) goto L37
            r0 = 1
            if (r1 == r0) goto Le
            r3 = 3
            if (r1 == r3) goto Lb
            java.lang.String r1 = "Unexpected runtime error"
            goto L39
        Lb:
            java.lang.String r1 = "Remote error"
            goto L39
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " error, index="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ", format="
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = ", format_supported="
            r1.append(r3)
            java.lang.String r3 = com.google.android.exoplayer2.util.Util.getFormatSupportString(r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L39
        L37:
            java.lang.String r1 = "Source error"
        L39:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L45
            java.lang.String r3 = ": "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
        L45:
            return r1
    }

    @androidx.annotation.CheckResult
    public final com.google.android.exoplayer2.ExoPlaybackException copyWithMediaPeriodId(@androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaPeriodId r15) {
            r14 = this;
            com.google.android.exoplayer2.ExoPlaybackException r13 = new com.google.android.exoplayer2.ExoPlaybackException
            java.lang.String r0 = r14.getMessage()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Throwable r2 = r14.getCause()
            int r3 = r14.errorCode
            int r4 = r14.type
            java.lang.String r5 = r14.rendererName
            int r6 = r14.rendererIndex
            com.google.android.exoplayer2.Format r7 = r14.rendererFormat
            int r8 = r14.rendererFormatSupport
            long r10 = r14.timestampMs
            boolean r12 = r14.isRecoverable
            r0 = r13
            r9 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r13
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(@androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r4) {
            r3 = this;
            boolean r0 = super.errorInfoEquals(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r4 = com.google.android.exoplayer2.util.Util.castNonNull(r4)
            com.google.android.exoplayer2.ExoPlaybackException r4 = (com.google.android.exoplayer2.ExoPlaybackException) r4
            int r0 = r3.type
            int r2 = r4.type
            if (r0 != r2) goto L45
            java.lang.String r0 = r3.rendererName
            java.lang.String r2 = r4.rendererName
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 == 0) goto L45
            int r0 = r3.rendererIndex
            int r2 = r4.rendererIndex
            if (r0 != r2) goto L45
            com.google.android.exoplayer2.Format r0 = r3.rendererFormat
            com.google.android.exoplayer2.Format r2 = r4.rendererFormat
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 == 0) goto L45
            int r0 = r3.rendererFormatSupport
            int r2 = r4.rendererFormatSupport
            if (r0 != r2) goto L45
            com.google.android.exoplayer2.source.MediaPeriodId r0 = r3.mediaPeriodId
            com.google.android.exoplayer2.source.MediaPeriodId r2 = r4.mediaPeriodId
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 == 0) goto L45
            boolean r0 = r3.isRecoverable
            boolean r4 = r4.isRecoverable
            if (r0 != r4) goto L45
            r1 = 1
        L45:
            return r1
    }

    public java.lang.Exception getRendererException() {
            r2 = this;
            int r0 = r2.type
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            java.lang.Throwable r0 = r2.getCause()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.Exception r0 = (java.lang.Exception) r0
            return r0
    }

    public java.io.IOException getSourceException() {
            r1 = this;
            int r0 = r1.type
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.lang.Throwable r0 = r1.getCause()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.io.IOException r0 = (java.io.IOException) r0
            return r0
    }

    public java.lang.RuntimeException getUnexpectedException() {
            r2 = this;
            int r0 = r2.type
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            java.lang.Throwable r0 = r2.getCause()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            return r0
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = super.toBundle()
            java.lang.String r1 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_TYPE
            int r2 = r3.type
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_NAME
            java.lang.String r2 = r3.rendererName
            r0.putString(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_INDEX
            int r2 = r3.rendererIndex
            r0.putInt(r1, r2)
            com.google.android.exoplayer2.Format r1 = r3.rendererFormat
            if (r1 == 0) goto L26
            java.lang.String r2 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_FORMAT
            android.os.Bundle r1 = r1.toBundle()
            r0.putBundle(r2, r1)
        L26:
            java.lang.String r1 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_RENDERER_FORMAT_SUPPORT
            int r2 = r3.rendererFormatSupport
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.ExoPlaybackException.FIELD_IS_RECOVERABLE
            boolean r2 = r3.isRecoverable
            r0.putBoolean(r1, r2)
            return r0
    }
}
