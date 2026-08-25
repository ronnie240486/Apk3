package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final java.lang.String TAG = "AudioManCompat";

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isVolumeFixed(android.media.AudioManager r0) {
                boolean r0 = r0.isVolumeFixed()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int abandonAudioFocusRequest(android.media.AudioManager r0, android.media.AudioFocusRequest r1) {
                int r0 = r0.abandonAudioFocusRequest(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int requestAudioFocus(android.media.AudioManager r0, android.media.AudioFocusRequest r1) {
                int r0 = r0.requestAudioFocus(r1)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getStreamMinVolume(android.media.AudioManager r0, int r1) {
                int r0 = r0.getStreamMinVolume(r1)
                return r0
        }
    }

    private AudioManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int abandonAudioFocusRequest(@androidx.annotation.NonNull android.media.AudioManager r2, @androidx.annotation.NonNull androidx.media.AudioFocusRequestCompat r3) {
            if (r2 == 0) goto L24
            if (r3 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            android.media.AudioFocusRequest r3 = r3.getAudioFocusRequest()
            int r2 = androidx.media.AudioManagerCompat.Api26Impl.abandonAudioFocusRequest(r2, r3)
            return r2
        L13:
            android.media.AudioManager$OnAudioFocusChangeListener r3 = r3.getOnAudioFocusChangeListener()
            int r2 = r2.abandonAudioFocus(r3)
            return r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "AudioFocusRequestCompat must not be null"
            r2.<init>(r3)
            throw r2
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "AudioManager must not be null"
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.IntRange(from = 0)
    public static int getStreamMaxVolume(@androidx.annotation.NonNull android.media.AudioManager r0, int r1) {
            int r0 = r0.getStreamMaxVolume(r1)
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public static int getStreamMinVolume(@androidx.annotation.NonNull android.media.AudioManager r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.media.AudioManagerCompat.Api28Impl.getStreamMinVolume(r2, r3)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean isVolumeFixed(@androidx.annotation.NonNull android.media.AudioManager r0) {
            boolean r0 = androidx.media.AudioManagerCompat.Api21Impl.isVolumeFixed(r0)
            return r0
    }

    public static int requestAudioFocus(@androidx.annotation.NonNull android.media.AudioManager r2, @androidx.annotation.NonNull androidx.media.AudioFocusRequestCompat r3) {
            if (r2 == 0) goto L30
            if (r3 == 0) goto L28
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            android.media.AudioFocusRequest r3 = r3.getAudioFocusRequest()
            int r2 = androidx.media.AudioManagerCompat.Api26Impl.requestAudioFocus(r2, r3)
            return r2
        L13:
            android.media.AudioManager$OnAudioFocusChangeListener r0 = r3.getOnAudioFocusChangeListener()
            androidx.media.AudioAttributesCompat r1 = r3.getAudioAttributesCompat()
            int r1 = r1.getLegacyStreamType()
            int r3 = r3.getFocusGain()
            int r2 = r2.requestAudioFocus(r0, r1, r3)
            return r2
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "AudioFocusRequestCompat must not be null"
            r2.<init>(r3)
            throw r2
        L30:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "AudioManager must not be null"
            r2.<init>(r3)
            throw r2
    }
}
