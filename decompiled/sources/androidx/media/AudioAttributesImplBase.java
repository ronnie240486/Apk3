package androidx.media;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBase implements androidx.media.AudioAttributesImpl {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int mContentType;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int mFlags;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int mLegacyStream;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int mUsage;

    /* JADX INFO: loaded from: classes.dex */
    public static class Builder implements androidx.media.AudioAttributesImpl.Builder {
        private int mContentType;
        private int mFlags;
        private int mLegacyStream;
        private int mUsage;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mUsage = r0
                r1.mContentType = r0
                r1.mFlags = r0
                r0 = -1
                r1.mLegacyStream = r0
                return
        }

        public Builder(androidx.media.AudioAttributesCompat r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mUsage = r0
                r1.mContentType = r0
                r1.mFlags = r0
                r0 = -1
                r1.mLegacyStream = r0
                int r0 = r2.getUsage()
                r1.mUsage = r0
                int r0 = r2.getContentType()
                r1.mContentType = r0
                int r0 = r2.getFlags()
                r1.mFlags = r0
                androidx.media.AudioAttributesImpl r2 = r2.mImpl
                int r2 = r2.getRawLegacyStreamType()
                r1.mLegacyStream = r2
                return
        }

        private androidx.media.AudioAttributesImplBase.Builder setInternalLegacyStreamType(int r6) {
                r5 = this;
                r0 = 2
                r1 = 1
                r2 = 4
                switch(r6) {
                    case 0: goto L48;
                    case 1: goto L45;
                    case 2: goto L42;
                    case 3: goto L3f;
                    case 4: goto L3c;
                    case 5: goto L39;
                    case 6: goto L31;
                    case 7: goto L2b;
                    case 8: goto L28;
                    case 9: goto L25;
                    case 10: goto L22;
                    default: goto L6;
                }
            L6:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid stream type "
                r3.append(r4)
                r3.append(r6)
                java.lang.String r4 = " for AudioAttributesCompat"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "AudioAttributesCompat"
                android.util.Log.e(r4, r3)
                goto L4a
            L22:
                r5.mContentType = r1
                goto L4a
            L25:
                r5.mContentType = r2
                goto L4a
            L28:
                r5.mContentType = r2
                goto L4a
            L2b:
                int r3 = r5.mFlags
                r3 = r3 | r1
                r5.mFlags = r3
                goto L45
            L31:
                r5.mContentType = r1
                int r3 = r5.mFlags
                r3 = r3 | r2
                r5.mFlags = r3
                goto L4a
            L39:
                r5.mContentType = r2
                goto L4a
            L3c:
                r5.mContentType = r2
                goto L4a
            L3f:
                r5.mContentType = r0
                goto L4a
            L42:
                r5.mContentType = r2
                goto L4a
            L45:
                r5.mContentType = r2
                goto L4a
            L48:
                r5.mContentType = r1
            L4a:
                switch(r6) {
                    case 0: goto L5e;
                    case 1: goto L5c;
                    case 2: goto L5a;
                    case 3: goto L58;
                    case 4: goto L56;
                    case 5: goto L54;
                    case 6: goto L5e;
                    case 7: goto L5c;
                    case 8: goto L52;
                    case 9: goto L4d;
                    case 10: goto L4f;
                    default: goto L4d;
                }
            L4d:
                r0 = 0
                goto L5e
            L4f:
                r0 = 11
                goto L5e
            L52:
                r0 = 3
                goto L5e
            L54:
                r0 = 5
                goto L5e
            L56:
                r0 = 4
                goto L5e
            L58:
                r0 = 1
                goto L5e
            L5a:
                r0 = 6
                goto L5e
            L5c:
                r0 = 13
            L5e:
                r5.mUsage = r0
                return r5
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImpl build() {
                r5 = this;
                androidx.media.AudioAttributesImplBase r0 = new androidx.media.AudioAttributesImplBase
                int r1 = r5.mContentType
                int r2 = r5.mFlags
                int r3 = r5.mUsage
                int r4 = r5.mLegacyStream
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setContentType(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplBase$Builder r1 = r0.setContentType(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplBase.Builder setContentType(int r2) {
                r1 = this;
                if (r2 == 0) goto L12
                r0 = 1
                if (r2 == r0) goto L12
                r0 = 2
                if (r2 == r0) goto L12
                r0 = 3
                if (r2 == r0) goto L12
                r0 = 4
                if (r2 == r0) goto L12
                r2 = 0
                r1.mContentType = r2
                goto L14
            L12:
                r1.mContentType = r2
            L14:
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setFlags(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplBase$Builder r1 = r0.setFlags(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplBase.Builder setFlags(int r2) {
                r1 = this;
                r2 = r2 & 1023(0x3ff, float:1.434E-42)
                int r0 = r1.mFlags
                r2 = r2 | r0
                r1.mFlags = r2
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setLegacyStreamType(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplBase$Builder r1 = r0.setLegacyStreamType(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplBase.Builder setLegacyStreamType(int r2) {
                r1 = this;
                r0 = 10
                if (r2 == r0) goto Lb
                r1.mLegacyStream = r2
                androidx.media.AudioAttributesImplBase$Builder r2 = r1.setInternalLegacyStreamType(r2)
                return r2
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ androidx.media.AudioAttributesImpl.Builder setUsage(int r1) {
                r0 = this;
                androidx.media.AudioAttributesImplBase$Builder r1 = r0.setUsage(r1)
                return r1
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        @androidx.annotation.NonNull
        public androidx.media.AudioAttributesImplBase.Builder setUsage(int r1) {
                r0 = this;
                switch(r1) {
                    case 0: goto Lc;
                    case 1: goto Lc;
                    case 2: goto Lc;
                    case 3: goto Lc;
                    case 4: goto Lc;
                    case 5: goto Lc;
                    case 6: goto Lc;
                    case 7: goto Lc;
                    case 8: goto Lc;
                    case 9: goto Lc;
                    case 10: goto Lc;
                    case 11: goto Lc;
                    case 12: goto Lc;
                    case 13: goto Lc;
                    case 14: goto Lc;
                    case 15: goto Lc;
                    case 16: goto L7;
                    default: goto L3;
                }
            L3:
                r1 = 0
                r0.mUsage = r1
                goto Le
            L7:
                r1 = 12
                r0.mUsage = r1
                goto Le
            Lc:
                r0.mUsage = r1
            Le:
                return r0
        }
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mUsage = r0
            r1.mContentType = r0
            r1.mFlags = r0
            r0 = -1
            r1.mLegacyStream = r0
            return
    }

    public AudioAttributesImplBase(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.mContentType = r1
            r0.mFlags = r2
            r0.mUsage = r3
            r0.mLegacyStream = r4
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.media.AudioAttributesImplBase
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.media.AudioAttributesImplBase r4 = (androidx.media.AudioAttributesImplBase) r4
            int r0 = r3.mContentType
            int r2 = r4.getContentType()
            if (r0 != r2) goto L27
            int r0 = r3.mFlags
            int r2 = r4.getFlags()
            if (r0 != r2) goto L27
            int r0 = r3.mUsage
            int r2 = r4.getUsage()
            if (r0 != r2) goto L27
            int r0 = r3.mLegacyStream
            int r4 = r4.mLegacyStream
            if (r0 != r4) goto L27
            r1 = 1
        L27:
            return r1
    }

    @Override // androidx.media.AudioAttributesImpl
    @androidx.annotation.Nullable
    public java.lang.Object getAudioAttributes() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
            r1 = this;
            int r0 = r1.mContentType
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
            r3 = this;
            int r0 = r3.mFlags
            int r1 = r3.getLegacyStreamType()
            r2 = 6
            if (r1 != r2) goto Lc
            r0 = r0 | 4
            goto L11
        Lc:
            r2 = 7
            if (r1 != r2) goto L11
            r0 = r0 | 1
        L11:
            r0 = r0 & 273(0x111, float:3.83E-43)
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
            r3 = this;
            int r0 = r3.mLegacyStream
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            int r1 = r3.mFlags
            int r2 = r3.mUsage
            int r0 = androidx.media.AudioAttributesCompat.toVolumeStreamType(r0, r1, r2)
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
            r1 = this;
            int r0 = r1.mLegacyStream
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
            r1 = this;
            int r0 = r1.mUsage
            return r0
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
            r3 = this;
            int r0 = r3.mFlags
            int r1 = r3.mUsage
            r2 = 1
            int r0 = androidx.media.AudioAttributesCompat.toVolumeStreamType(r2, r0, r1)
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.mContentType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.mFlags
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.mUsage
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r1 = r3.mLegacyStream
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AudioAttributesCompat:"
            r0.<init>(r1)
            int r1 = r3.mLegacyStream
            r2 = -1
            if (r1 == r2) goto L1b
            java.lang.String r1 = " stream="
            r0.append(r1)
            int r1 = r3.mLegacyStream
            r0.append(r1)
            java.lang.String r1 = " derived"
            r0.append(r1)
        L1b:
            java.lang.String r1 = " usage="
            r0.append(r1)
            int r1 = r3.mUsage
            int r2 = androidx.media.AudioAttributesCompat.CONTENT_TYPE_UNKNOWN
            switch(r1) {
                case 0: goto L5c;
                case 1: goto L59;
                case 2: goto L56;
                case 3: goto L53;
                case 4: goto L50;
                case 5: goto L4d;
                case 6: goto L4a;
                case 7: goto L47;
                case 8: goto L44;
                case 9: goto L41;
                case 10: goto L3e;
                case 11: goto L3b;
                case 12: goto L38;
                case 13: goto L35;
                case 14: goto L32;
                case 15: goto L27;
                case 16: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.String r2 = "unknown usage "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1)
            goto L5e
        L2f:
            java.lang.String r1 = "USAGE_ASSISTANT"
            goto L5e
        L32:
            java.lang.String r1 = "USAGE_GAME"
            goto L5e
        L35:
            java.lang.String r1 = "USAGE_ASSISTANCE_SONIFICATION"
            goto L5e
        L38:
            java.lang.String r1 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"
            goto L5e
        L3b:
            java.lang.String r1 = "USAGE_ASSISTANCE_ACCESSIBILITY"
            goto L5e
        L3e:
            java.lang.String r1 = "USAGE_NOTIFICATION_EVENT"
            goto L5e
        L41:
            java.lang.String r1 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"
            goto L5e
        L44:
            java.lang.String r1 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"
            goto L5e
        L47:
            java.lang.String r1 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"
            goto L5e
        L4a:
            java.lang.String r1 = "USAGE_NOTIFICATION_RINGTONE"
            goto L5e
        L4d:
            java.lang.String r1 = "USAGE_NOTIFICATION"
            goto L5e
        L50:
            java.lang.String r1 = "USAGE_ALARM"
            goto L5e
        L53:
            java.lang.String r1 = "USAGE_VOICE_COMMUNICATION_SIGNALLING"
            goto L5e
        L56:
            java.lang.String r1 = "USAGE_VOICE_COMMUNICATION"
            goto L5e
        L59:
            java.lang.String r1 = "USAGE_MEDIA"
            goto L5e
        L5c:
            java.lang.String r1 = "USAGE_UNKNOWN"
        L5e:
            r0.append(r1)
            java.lang.String r1 = " content="
            r0.append(r1)
            int r1 = r3.mContentType
            r0.append(r1)
            java.lang.String r1 = " flags=0x"
            r0.append(r1)
            int r1 = r3.mFlags
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = r1.toUpperCase()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
