package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends java.lang.Exception implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.PlaybackException> CREATOR = null;
    public static final int CUSTOM_ERROR_CODE_BASE = 1000000;
    public static final int ERROR_CODE_AUDIO_TRACK_INIT_FAILED = 5001;
    public static final int ERROR_CODE_AUDIO_TRACK_WRITE_FAILED = 5002;
    public static final int ERROR_CODE_BEHIND_LIVE_WINDOW = 1002;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 4001;
    public static final int ERROR_CODE_DECODER_QUERY_FAILED = 4002;
    public static final int ERROR_CODE_DECODING_FAILED = 4003;
    public static final int ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES = 4004;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 4005;
    public static final int ERROR_CODE_DRM_CONTENT_ERROR = 6003;
    public static final int ERROR_CODE_DRM_DEVICE_REVOKED = 6007;
    public static final int ERROR_CODE_DRM_DISALLOWED_OPERATION = 6005;
    public static final int ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED = 6004;
    public static final int ERROR_CODE_DRM_LICENSE_EXPIRED = 6008;
    public static final int ERROR_CODE_DRM_PROVISIONING_FAILED = 6002;
    public static final int ERROR_CODE_DRM_SCHEME_UNSUPPORTED = 6001;
    public static final int ERROR_CODE_DRM_SYSTEM_ERROR = 6006;
    public static final int ERROR_CODE_DRM_UNSPECIFIED = 6000;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 1004;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 2004;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 2007;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 2005;
    public static final int ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE = 2003;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 2001;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 2002;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 2006;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 2008;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 2000;
    public static final int ERROR_CODE_PARSING_CONTAINER_MALFORMED = 3001;
    public static final int ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED = 3003;
    public static final int ERROR_CODE_PARSING_MANIFEST_MALFORMED = 3002;
    public static final int ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED = 3004;
    public static final int ERROR_CODE_REMOTE_ERROR = 1001;
    public static final int ERROR_CODE_TIMEOUT = 1003;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    private static final java.lang.String FIELD_INT_ERROR_CODE = null;
    private static final java.lang.String FIELD_LONG_TIMESTAMP_MS = null;
    private static final java.lang.String FIELD_STRING_CAUSE_CLASS_NAME = null;
    private static final java.lang.String FIELD_STRING_CAUSE_MESSAGE = null;
    private static final java.lang.String FIELD_STRING_MESSAGE = null;
    public final int errorCode;
    public final long timestampMs;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    static {
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PlaybackException.FIELD_INT_ERROR_CODE = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PlaybackException.FIELD_LONG_TIMESTAMP_MS = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PlaybackException.FIELD_STRING_MESSAGE = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PlaybackException.FIELD_STRING_CAUSE_CLASS_NAME = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.PlaybackException.FIELD_STRING_CAUSE_MESSAGE = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$13
            com.google.android.exoplayer2.PlaybackException.CREATOR = r0
            return
    }

    public PlaybackException(android.os.Bundle r8) {
            r7 = this;
            java.lang.String r0 = com.google.android.exoplayer2.PlaybackException.FIELD_STRING_MESSAGE
            java.lang.String r2 = r8.getString(r0)
            java.lang.Throwable r3 = getCauseFromBundle(r8)
            java.lang.String r0 = com.google.android.exoplayer2.PlaybackException.FIELD_INT_ERROR_CODE
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r8.getInt(r0, r1)
            java.lang.String r0 = com.google.android.exoplayer2.PlaybackException.FIELD_LONG_TIMESTAMP_MS
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r8.getLong(r0, r5)
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public PlaybackException(@androidx.annotation.Nullable java.lang.String r8, @androidx.annotation.Nullable java.lang.Throwable r9, int r10) {
            r7 = this;
            com.google.android.exoplayer2.util.Clock r0 = com.google.android.exoplayer2.util.Clock.DEFAULT
            long r5 = r0.elapsedRealtime()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5)
            return
    }

    public PlaybackException(@androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.Nullable java.lang.Throwable r2, int r3, long r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.errorCode = r3
            r0.timestampMs = r4
            return
    }

    private static android.os.RemoteException createRemoteException(@androidx.annotation.Nullable java.lang.String r1) {
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            return r0
    }

    private static java.lang.Throwable createThrowable(java.lang.Class<?> r4, @androidx.annotation.Nullable java.lang.String r5) throws java.lang.Exception {
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 0
            r1[r3] = r2
            java.lang.reflect.Constructor r4 = r4.getConstructor(r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r5
            java.lang.Object r4 = r4.newInstance(r0)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            return r4
    }

    @androidx.annotation.Nullable
    private static java.lang.Throwable getCauseFromBundle(android.os.Bundle r4) {
            java.lang.String r0 = com.google.android.exoplayer2.PlaybackException.FIELD_STRING_CAUSE_CLASS_NAME
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r1 = com.google.android.exoplayer2.PlaybackException.FIELD_STRING_CAUSE_MESSAGE
            java.lang.String r4 = r4.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L31
            r1 = 1
            java.lang.Class<com.google.android.exoplayer2.PlaybackException> r3 = com.google.android.exoplayer2.PlaybackException.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            boolean r1 = r1.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2b
            java.lang.Throwable r0 = createThrowable(r0, r4)     // Catch: java.lang.Throwable -> L2d
            r2 = r0
        L2b:
            if (r2 != 0) goto L31
        L2d:
            android.os.RemoteException r2 = createRemoteException(r4)
        L31:
            return r2
    }

    public static java.lang.String getErrorCodeName(int r1) {
            r0 = 5001(0x1389, float:7.008E-42)
            if (r1 == r0) goto L85
            r0 = 5002(0x138a, float:7.009E-42)
            if (r1 == r0) goto L82
            switch(r1) {
                case 1000: goto L7f;
                case 1001: goto L7c;
                case 1002: goto L79;
                case 1003: goto L76;
                case 1004: goto L73;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 2000: goto L70;
                case 2001: goto L6d;
                case 2002: goto L6a;
                case 2003: goto L67;
                case 2004: goto L64;
                case 2005: goto L61;
                case 2006: goto L5e;
                case 2007: goto L5b;
                case 2008: goto L58;
                default: goto Le;
            }
        Le:
            switch(r1) {
                case 3001: goto L55;
                case 3002: goto L52;
                case 3003: goto L4f;
                case 3004: goto L4c;
                default: goto L11;
            }
        L11:
            switch(r1) {
                case 4001: goto L49;
                case 4002: goto L46;
                case 4003: goto L43;
                case 4004: goto L40;
                case 4005: goto L3d;
                default: goto L14;
            }
        L14:
            switch(r1) {
                case 6000: goto L3a;
                case 6001: goto L37;
                case 6002: goto L34;
                case 6003: goto L31;
                case 6004: goto L2e;
                case 6005: goto L2b;
                case 6006: goto L28;
                case 6007: goto L25;
                case 6008: goto L22;
                default: goto L17;
            }
        L17:
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 < r0) goto L1f
            java.lang.String r1 = "custom error code"
            return r1
        L1f:
            java.lang.String r1 = "invalid error code"
            return r1
        L22:
            java.lang.String r1 = "ERROR_CODE_DRM_LICENSE_EXPIRED"
            return r1
        L25:
            java.lang.String r1 = "ERROR_CODE_DRM_DEVICE_REVOKED"
            return r1
        L28:
            java.lang.String r1 = "ERROR_CODE_DRM_SYSTEM_ERROR"
            return r1
        L2b:
            java.lang.String r1 = "ERROR_CODE_DRM_DISALLOWED_OPERATION"
            return r1
        L2e:
            java.lang.String r1 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED"
            return r1
        L31:
            java.lang.String r1 = "ERROR_CODE_DRM_CONTENT_ERROR"
            return r1
        L34:
            java.lang.String r1 = "ERROR_CODE_DRM_PROVISIONING_FAILED"
            return r1
        L37:
            java.lang.String r1 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED"
            return r1
        L3a:
            java.lang.String r1 = "ERROR_CODE_DRM_UNSPECIFIED"
            return r1
        L3d:
            java.lang.String r1 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED"
            return r1
        L40:
            java.lang.String r1 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES"
            return r1
        L43:
            java.lang.String r1 = "ERROR_CODE_DECODING_FAILED"
            return r1
        L46:
            java.lang.String r1 = "ERROR_CODE_DECODER_QUERY_FAILED"
            return r1
        L49:
            java.lang.String r1 = "ERROR_CODE_DECODER_INIT_FAILED"
            return r1
        L4c:
            java.lang.String r1 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED"
            return r1
        L4f:
            java.lang.String r1 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED"
            return r1
        L52:
            java.lang.String r1 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED"
            return r1
        L55:
            java.lang.String r1 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED"
            return r1
        L58:
            java.lang.String r1 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE"
            return r1
        L5b:
            java.lang.String r1 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED"
            return r1
        L5e:
            java.lang.String r1 = "ERROR_CODE_IO_NO_PERMISSION"
            return r1
        L61:
            java.lang.String r1 = "ERROR_CODE_IO_FILE_NOT_FOUND"
            return r1
        L64:
            java.lang.String r1 = "ERROR_CODE_IO_BAD_HTTP_STATUS"
            return r1
        L67:
            java.lang.String r1 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE"
            return r1
        L6a:
            java.lang.String r1 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT"
            return r1
        L6d:
            java.lang.String r1 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED"
            return r1
        L70:
            java.lang.String r1 = "ERROR_CODE_IO_UNSPECIFIED"
            return r1
        L73:
            java.lang.String r1 = "ERROR_CODE_FAILED_RUNTIME_CHECK"
            return r1
        L76:
            java.lang.String r1 = "ERROR_CODE_TIMEOUT"
            return r1
        L79:
            java.lang.String r1 = "ERROR_CODE_BEHIND_LIVE_WINDOW"
            return r1
        L7c:
            java.lang.String r1 = "ERROR_CODE_REMOTE_ERROR"
            return r1
        L7f:
            java.lang.String r1 = "ERROR_CODE_UNSPECIFIED"
            return r1
        L82:
            java.lang.String r1 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED"
            return r1
        L85:
            java.lang.String r1 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED"
            return r1
    }

    @androidx.annotation.CallSuper
    public boolean errorInfoEquals(@androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L60
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L60
        L12:
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L3c
            if (r3 == 0) goto L3c
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = com.google.android.exoplayer2.util.Util.areEqual(r4, r5)
            if (r4 != 0) goto L2d
            return r1
        L2d:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 != 0) goto L41
            return r1
        L3c:
            if (r2 != 0) goto L60
            if (r3 == 0) goto L41
            goto L60
        L41:
            int r2 = r6.errorCode
            int r3 = r7.errorCode
            if (r2 != r3) goto L5e
            java.lang.String r2 = r6.getMessage()
            java.lang.String r3 = r7.getMessage()
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L5e
            long r2 = r6.timestampMs
            long r4 = r7.timestampMs
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L5e
            goto L5f
        L5e:
            r0 = 0
        L5f:
            return r0
        L60:
            return r1
    }

    public final java.lang.String getErrorCodeName() {
            r1 = this;
            int r0 = r1.errorCode
            java.lang.String r0 = getErrorCodeName(r0)
            return r0
    }

    @androidx.annotation.CallSuper
    public android.os.Bundle toBundle() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.PlaybackException.FIELD_INT_ERROR_CODE
            int r2 = r4.errorCode
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.PlaybackException.FIELD_LONG_TIMESTAMP_MS
            long r2 = r4.timestampMs
            r0.putLong(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.PlaybackException.FIELD_STRING_MESSAGE
            java.lang.String r2 = r4.getMessage()
            r0.putString(r1, r2)
            java.lang.Throwable r1 = r4.getCause()
            if (r1 == 0) goto L38
            java.lang.String r2 = com.google.android.exoplayer2.PlaybackException.FIELD_STRING_CAUSE_CLASS_NAME
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            r0.putString(r2, r3)
            java.lang.String r2 = com.google.android.exoplayer2.PlaybackException.FIELD_STRING_CAUSE_MESSAGE
            java.lang.String r1 = r1.getMessage()
            r0.putString(r2, r1)
        L38:
            return r0
    }
}
