package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements androidx.versionedparcelable.VersionedParcelable {
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int FLAG_HW_AV_SYNC = 16;
    private static final int[] SDK_USAGES = null;
    private static final int SUPPRESSIBLE_CALL = 2;
    private static final int SUPPRESSIBLE_NOTIFICATION = 1;
    private static final android.util.SparseIntArray SUPPRESSIBLE_USAGES = null;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    public static boolean sForceLegacyBehavior;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.media.AudioAttributesImpl mImpl;

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface AttributeContentType {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface AttributeUsage {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class AudioManagerHidden {
        public static final int STREAM_ACCESSIBILITY = 10;
        public static final int STREAM_BLUETOOTH_SCO = 6;
        public static final int STREAM_SYSTEM_ENFORCED = 7;
        public static final int STREAM_TTS = 9;

        private AudioManagerHidden() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {
        public final androidx.media.AudioAttributesImpl.Builder mBuilderImpl;

        public Builder() {
                r2 = this;
                r2.<init>()
                boolean r0 = androidx.media.AudioAttributesCompat.sForceLegacyBehavior
                if (r0 == 0) goto Lf
                androidx.media.AudioAttributesImplBase$Builder r0 = new androidx.media.AudioAttributesImplBase$Builder
                r0.<init>()
                r2.mBuilderImpl = r0
                goto L24
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L1d
                androidx.media.AudioAttributesImplApi26$Builder r0 = new androidx.media.AudioAttributesImplApi26$Builder
                r0.<init>()
                r2.mBuilderImpl = r0
                goto L24
            L1d:
                androidx.media.AudioAttributesImplApi21$Builder r0 = new androidx.media.AudioAttributesImplApi21$Builder
                r0.<init>()
                r2.mBuilderImpl = r0
            L24:
                return
        }

        public Builder(androidx.media.AudioAttributesCompat r3) {
                r2 = this;
                r2.<init>()
                boolean r0 = androidx.media.AudioAttributesCompat.sForceLegacyBehavior
                if (r0 == 0) goto Lf
                androidx.media.AudioAttributesImplBase$Builder r0 = new androidx.media.AudioAttributesImplBase$Builder
                r0.<init>(r3)
                r2.mBuilderImpl = r0
                goto L2c
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L21
                androidx.media.AudioAttributesImplApi26$Builder r0 = new androidx.media.AudioAttributesImplApi26$Builder
                java.lang.Object r3 = r3.unwrap()
                r0.<init>(r3)
                r2.mBuilderImpl = r0
                goto L2c
            L21:
                androidx.media.AudioAttributesImplApi21$Builder r0 = new androidx.media.AudioAttributesImplApi21$Builder
                java.lang.Object r3 = r3.unwrap()
                r0.<init>(r3)
                r2.mBuilderImpl = r0
            L2c:
                return
        }

        public androidx.media.AudioAttributesCompat build() {
                r2 = this;
                androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
                androidx.media.AudioAttributesImpl$Builder r1 = r2.mBuilderImpl
                androidx.media.AudioAttributesImpl r1 = r1.build()
                r0.<init>(r1)
                return r0
        }

        public androidx.media.AudioAttributesCompat.Builder setContentType(int r2) {
                r1 = this;
                androidx.media.AudioAttributesImpl$Builder r0 = r1.mBuilderImpl
                r0.setContentType(r2)
                return r1
        }

        public androidx.media.AudioAttributesCompat.Builder setFlags(int r2) {
                r1 = this;
                androidx.media.AudioAttributesImpl$Builder r0 = r1.mBuilderImpl
                r0.setFlags(r2)
                return r1
        }

        public androidx.media.AudioAttributesCompat.Builder setLegacyStreamType(int r2) {
                r1 = this;
                androidx.media.AudioAttributesImpl$Builder r0 = r1.mBuilderImpl
                r0.setLegacyStreamType(r2)
                return r1
        }

        public androidx.media.AudioAttributesCompat.Builder setUsage(int r2) {
                r1 = this;
                androidx.media.AudioAttributesImpl$Builder r0 = r1.mBuilderImpl
                r0.setUsage(r2)
                return r1
        }
    }

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            androidx.media.AudioAttributesCompat.SUPPRESSIBLE_USAGES = r0
            r1 = 5
            r2 = 1
            r0.put(r1, r2)
            r1 = 6
            r3 = 2
            r0.put(r1, r3)
            r1 = 7
            r0.put(r1, r3)
            r1 = 8
            r0.put(r1, r2)
            r1 = 9
            r0.put(r1, r2)
            r1 = 10
            r0.put(r1, r2)
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16} // fill-array
            androidx.media.AudioAttributesCompat.SDK_USAGES = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public AudioAttributesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public AudioAttributesCompat(androidx.media.AudioAttributesImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static void setForceLegacyBehavior(boolean r0) {
            androidx.media.AudioAttributesCompat.sForceLegacyBehavior = r0
            return
    }

    public static int toVolumeStreamType(boolean r3, int r4, int r5) {
            r0 = r4 & 1
            r1 = 1
            if (r0 != r1) goto La
            if (r3 == 0) goto L8
            goto L9
        L8:
            r1 = 7
        L9:
            return r1
        La:
            r0 = 4
            r4 = r4 & r0
            r2 = 0
            if (r4 != r0) goto L14
            if (r3 == 0) goto L12
            goto L13
        L12:
            r2 = 6
        L13:
            return r2
        L14:
            r4 = 3
            switch(r5) {
                case 0: goto L2a;
                case 1: goto L2a;
                case 2: goto L29;
                case 3: goto L24;
                case 4: goto L23;
                case 5: goto L21;
                case 6: goto L1f;
                case 7: goto L21;
                case 8: goto L21;
                case 9: goto L21;
                case 10: goto L21;
                case 11: goto L1c;
                case 12: goto L2a;
                case 13: goto L1b;
                case 14: goto L2a;
                case 15: goto L18;
                case 16: goto L2a;
                default: goto L18;
            }
        L18:
            if (r3 != 0) goto L2b
            return r4
        L1b:
            return r1
        L1c:
            r3 = 10
            return r3
        L1f:
            r3 = 2
            return r3
        L21:
            r3 = 5
            return r3
        L23:
            return r0
        L24:
            if (r3 == 0) goto L27
            goto L29
        L27:
            r2 = 8
        L29:
            return r2
        L2a:
            return r4
        L2b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unknown usage value "
            java.lang.String r0 = " in audio attributes"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r5, r0)
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.Nullable
    public static androidx.media.AudioAttributesCompat wrap(@androidx.annotation.NonNull java.lang.Object r2) {
            boolean r0 = androidx.media.AudioAttributesCompat.sForceLegacyBehavior
            if (r0 == 0) goto L6
            r2 = 0
            return r2
        L6:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L19
            androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
            androidx.media.AudioAttributesImplApi26 r1 = new androidx.media.AudioAttributesImplApi26
            android.media.AudioAttributes r2 = (android.media.AudioAttributes) r2
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        L19:
            androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
            androidx.media.AudioAttributesImplApi21 r1 = new androidx.media.AudioAttributesImplApi21
            android.media.AudioAttributes r2 = (android.media.AudioAttributes) r2
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.media.AudioAttributesCompat
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.media.AudioAttributesCompat r3 = (androidx.media.AudioAttributesCompat) r3
            androidx.media.AudioAttributesImpl r0 = r2.mImpl
            if (r0 != 0) goto L12
            androidx.media.AudioAttributesImpl r3 = r3.mImpl
            if (r3 != 0) goto L11
            r1 = 1
        L11:
            return r1
        L12:
            androidx.media.AudioAttributesImpl r3 = r3.mImpl
            boolean r3 = r0.equals(r3)
            return r3
    }

    public int getContentType() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getContentType()
            return r0
    }

    public int getFlags() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getFlags()
            return r0
    }

    public int getLegacyStreamType() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getLegacyStreamType()
            return r0
    }

    public int getUsage() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getUsage()
            return r0
    }

    public int getVolumeControlStream() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.getVolumeControlStream()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object unwrap() {
            r1 = this;
            androidx.media.AudioAttributesImpl r0 = r1.mImpl
            java.lang.Object r0 = r0.getAudioAttributes()
            return r0
    }
}
