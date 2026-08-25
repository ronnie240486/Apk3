package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    @androidx.annotation.RequiresApi(18)
    public static final class Api18 {
        private Api18() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isDeniedByServerException(@androidx.annotation.Nullable java.lang.Throwable r0) {
                boolean r0 = r0 instanceof android.media.DeniedByServerException
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isNotProvisionedException(@androidx.annotation.Nullable java.lang.Throwable r0) {
                boolean r0 = r0 instanceof android.media.NotProvisionedException
                return r0
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static final class Api21 {
        private Api21() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isMediaDrmStateException(@androidx.annotation.Nullable java.lang.Throwable r0) {
                boolean r0 = r0 instanceof android.media.MediaDrm.MediaDrmStateException
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int mediaDrmStateExceptionToErrorCode(java.lang.Throwable r0) {
                android.media.MediaDrm$MediaDrmStateException r0 = (android.media.MediaDrm.MediaDrmStateException) r0
                java.lang.String r0 = r0.getDiagnosticInfo()
                int r0 = com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(r0)
                int r0 = com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(r0)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(23)
    public static final class Api23 {
        private Api23() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isMediaDrmResetException(@androidx.annotation.Nullable java.lang.Throwable r0) {
                boolean r0 = r0 instanceof android.media.MediaDrmResetException
                return r0
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getErrorCodeForMediaDrmException(java.lang.Exception r5, int r6) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 21
            if (r0 < r1) goto L11
            boolean r1 = com.google.android.exoplayer2.drm.DrmUtil.Api21.isMediaDrmStateException(r5)
            if (r1 == 0) goto L11
            int r5 = com.google.android.exoplayer2.drm.DrmUtil.Api21.mediaDrmStateExceptionToErrorCode(r5)
            return r5
        L11:
            r1 = 23
            r2 = 6006(0x1776, float:8.416E-42)
            if (r0 < r1) goto L1e
            boolean r1 = com.google.android.exoplayer2.drm.DrmUtil.Api23.isMediaDrmResetException(r5)
            if (r1 == 0) goto L1e
            return r2
        L1e:
            r1 = 6002(0x1772, float:8.41E-42)
            r3 = 18
            if (r0 < r3) goto L2b
            boolean r4 = com.google.android.exoplayer2.drm.DrmUtil.Api18.isNotProvisionedException(r5)
            if (r4 == 0) goto L2b
            return r1
        L2b:
            if (r0 < r3) goto L36
            boolean r0 = com.google.android.exoplayer2.drm.DrmUtil.Api18.isDeniedByServerException(r5)
            if (r0 == 0) goto L36
            r5 = 6007(0x1777, float:8.418E-42)
            return r5
        L36:
            boolean r0 = r5 instanceof com.google.android.exoplayer2.drm.UnsupportedDrmException
            if (r0 == 0) goto L3d
            r5 = 6001(0x1771, float:8.409E-42)
            return r5
        L3d:
            boolean r0 = r5 instanceof com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException
            if (r0 == 0) goto L44
            r5 = 6003(0x1773, float:8.412E-42)
            return r5
        L44:
            boolean r5 = r5 instanceof com.google.android.exoplayer2.drm.KeysExpiredException
            if (r5 == 0) goto L4b
            r5 = 6008(0x1778, float:8.419E-42)
            return r5
        L4b:
            r5 = 1
            if (r6 != r5) goto L4f
            return r2
        L4f:
            r5 = 2
            if (r6 != r5) goto L55
            r5 = 6004(0x1774, float:8.413E-42)
            return r5
        L55:
            r5 = 3
            if (r6 != r5) goto L59
            return r1
        L59:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }
}
