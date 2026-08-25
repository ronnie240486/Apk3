package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributes implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.audio.AudioAttributes> CREATOR = null;
    public static final com.google.android.exoplayer2.audio.AudioAttributes DEFAULT = null;
    private static final java.lang.String FIELD_ALLOWED_CAPTURE_POLICY = null;
    private static final java.lang.String FIELD_CONTENT_TYPE = null;
    private static final java.lang.String FIELD_FLAGS = null;
    private static final java.lang.String FIELD_SPATIALIZATION_BEHAVIOR = null;
    private static final java.lang.String FIELD_USAGE = null;
    public final int allowedCapturePolicy;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.AudioAttributes.AudioAttributesV21 audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int spatializationBehavior;
    public final int usage;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioAttributes$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @androidx.annotation.RequiresApi(29)
    public static final class Api29 {
        private Api29() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAllowedCapturePolicy(android.media.AudioAttributes.Builder r0, int r1) {
                r0.setAllowedCapturePolicy(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(32)
    public static final class Api32 {
        private Api32() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setSpatializationBehavior(android.media.AudioAttributes.Builder r0, int r1) {
                r0.setSpatializationBehavior(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(com.google.android.exoplayer2.audio.AudioAttributes r4) {
                r3 = this;
                r3.<init>()
                android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
                r0.<init>()
                int r1 = r4.contentType
                android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
                int r1 = r4.flags
                android.media.AudioAttributes$Builder r0 = r0.setFlags(r1)
                int r1 = r4.usage
                android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
                int r1 = com.google.android.exoplayer2.util.Util.SDK_INT
                r2 = 29
                if (r1 < r2) goto L25
                int r2 = r4.allowedCapturePolicy
                com.google.android.exoplayer2.audio.AudioAttributes.Api29.setAllowedCapturePolicy(r0, r2)
            L25:
                r2 = 32
                if (r1 < r2) goto L2e
                int r4 = r4.spatializationBehavior
                com.google.android.exoplayer2.audio.AudioAttributes.Api32.setSpatializationBehavior(r0, r4)
            L2e:
                android.media.AudioAttributes r4 = r0.build()
                r3.audioAttributes = r4
                return
        }

        public /* synthetic */ AudioAttributesV21(com.google.android.exoplayer2.audio.AudioAttributes r1, com.google.android.exoplayer2.audio.AudioAttributes.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder {
        private int allowedCapturePolicy;
        private int contentType;
        private int flags;
        private int spatializationBehavior;
        private int usage;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.contentType = r0
                r2.flags = r0
                r1 = 1
                r2.usage = r1
                r2.allowedCapturePolicy = r1
                r2.spatializationBehavior = r0
                return
        }

        public com.google.android.exoplayer2.audio.AudioAttributes build() {
                r8 = this;
                com.google.android.exoplayer2.audio.AudioAttributes r7 = new com.google.android.exoplayer2.audio.AudioAttributes
                int r1 = r8.contentType
                int r2 = r8.flags
                int r3 = r8.usage
                int r4 = r8.allowedCapturePolicy
                int r5 = r8.spatializationBehavior
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.AudioAttributes.Builder setAllowedCapturePolicy(int r1) {
                r0 = this;
                r0.allowedCapturePolicy = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.AudioAttributes.Builder setContentType(int r1) {
                r0 = this;
                r0.contentType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.AudioAttributes.Builder setFlags(int r1) {
                r0 = this;
                r0.flags = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.AudioAttributes.Builder setSpatializationBehavior(int r1) {
                r0 = this;
                r0.spatializationBehavior = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.audio.AudioAttributes.Builder setUsage(int r1) {
                r0 = this;
                r0.usage = r1
                return r0
        }
    }

    public static /* synthetic */ com.google.android.exoplayer2.audio.AudioAttributes $r8$lambda$Hsm865OCX9SfmXIbNUEMkp8KZVk(android.os.Bundle r0) {
            com.google.android.exoplayer2.audio.AudioAttributes r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.audio.AudioAttributes$Builder r0 = new com.google.android.exoplayer2.audio.AudioAttributes$Builder
            r0.<init>()
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r0.build()
            com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.audio.AudioAttributes.FIELD_CONTENT_TYPE = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.audio.AudioAttributes.FIELD_FLAGS = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.audio.AudioAttributes.FIELD_USAGE = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.audio.AudioAttributes.FIELD_ALLOWED_CAPTURE_POLICY = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.audio.AudioAttributes.FIELD_SPATIALIZATION_BEHAVIOR = r0
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r0 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$21
            com.google.android.exoplayer2.audio.AudioAttributes.CREATOR = r0
            return
    }

    private AudioAttributes(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.contentType = r1
            r0.flags = r2
            r0.usage = r3
            r0.allowedCapturePolicy = r4
            r0.spatializationBehavior = r5
            return
    }

    public /* synthetic */ AudioAttributes(int r1, int r2, int r3, int r4, int r5, com.google.android.exoplayer2.audio.AudioAttributes.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private static /* synthetic */ com.google.android.exoplayer2.audio.AudioAttributes lambda$static$0(android.os.Bundle r3) {
            com.google.android.exoplayer2.audio.AudioAttributes$Builder r0 = new com.google.android.exoplayer2.audio.AudioAttributes$Builder
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_CONTENT_TYPE
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L14
            int r1 = r3.getInt(r1)
            r0.setContentType(r1)
        L14:
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_FLAGS
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L23
            int r1 = r3.getInt(r1)
            r0.setFlags(r1)
        L23:
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_USAGE
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L32
            int r1 = r3.getInt(r1)
            r0.setUsage(r1)
        L32:
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_ALLOWED_CAPTURE_POLICY
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L41
            int r1 = r3.getInt(r1)
            r0.setAllowedCapturePolicy(r1)
        L41:
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_SPATIALIZATION_BEHAVIOR
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L50
            int r3 = r3.getInt(r1)
            r0.setSpatializationBehavior(r3)
        L50:
            com.google.android.exoplayer2.audio.AudioAttributes r3 = r0.build()
            return r3
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class<com.google.android.exoplayer2.audio.AudioAttributes> r2 = com.google.android.exoplayer2.audio.AudioAttributes.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            com.google.android.exoplayer2.audio.AudioAttributes r5 = (com.google.android.exoplayer2.audio.AudioAttributes) r5
            int r2 = r4.contentType
            int r3 = r5.contentType
            if (r2 != r3) goto L31
            int r2 = r4.flags
            int r3 = r5.flags
            if (r2 != r3) goto L31
            int r2 = r4.usage
            int r3 = r5.usage
            if (r2 != r3) goto L31
            int r2 = r4.allowedCapturePolicy
            int r3 = r5.allowedCapturePolicy
            if (r2 != r3) goto L31
            int r2 = r4.spatializationBehavior
            int r5 = r5.spatializationBehavior
            if (r2 != r5) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            return r1
    }

    @androidx.annotation.RequiresApi(21)
    public com.google.android.exoplayer2.audio.AudioAttributes.AudioAttributesV21 getAudioAttributesV21() {
            r2 = this;
            com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21 r0 = r2.audioAttributesV21
            if (r0 != 0) goto Lc
            com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21 r0 = new com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21
            r1 = 0
            r0.<init>(r2, r1)
            r2.audioAttributesV21 = r0
        Lc:
            com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21 r0 = r2.audioAttributesV21
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.contentType
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.flags
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.usage
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.allowedCapturePolicy
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.spatializationBehavior
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_CONTENT_TYPE
            int r2 = r3.contentType
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_FLAGS
            int r2 = r3.flags
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_USAGE
            int r2 = r3.usage
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_ALLOWED_CAPTURE_POLICY
            int r2 = r3.allowedCapturePolicy
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.exoplayer2.audio.AudioAttributes.FIELD_SPATIALIZATION_BEHAVIOR
            int r2 = r3.spatializationBehavior
            r0.putInt(r1, r2)
            return r0
    }
}
