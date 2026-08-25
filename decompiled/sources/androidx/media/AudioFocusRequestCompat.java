package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioFocusRequestCompat {
    public static final androidx.media.AudioAttributesCompat FOCUS_DEFAULT_ATTR = null;
    private final androidx.media.AudioAttributesCompat mAudioAttributesCompat;
    private final android.os.Handler mFocusChangeHandler;
    private final int mFocusGain;
    private final java.lang.Object mFrameworkAudioFocusRequest;
    private final android.media.AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private final boolean mPauseOnDuck;

    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.media.AudioFocusRequest createInstance(int r1, android.media.AudioAttributes r2, boolean r3, android.media.AudioManager.OnAudioFocusChangeListener r4, android.os.Handler r5) {
                android.media.AudioFocusRequest$Builder r0 = new android.media.AudioFocusRequest$Builder
                r0.<init>(r1)
                android.media.AudioFocusRequest$Builder r1 = r0.setAudioAttributes(r2)
                android.media.AudioFocusRequest$Builder r1 = r1.setWillPauseWhenDucked(r3)
                android.media.AudioFocusRequest$Builder r1 = r1.setOnAudioFocusChangeListener(r4, r5)
                android.media.AudioFocusRequest r1 = r1.build()
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {
        private androidx.media.AudioAttributesCompat mAudioAttributesCompat;
        private android.os.Handler mFocusChangeHandler;
        private int mFocusGain;
        private android.media.AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
        private boolean mPauseOnDuck;

        public Builder(int r2) {
                r1 = this;
                r1.<init>()
                androidx.media.AudioAttributesCompat r0 = androidx.media.AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR
                r1.mAudioAttributesCompat = r0
                r1.setFocusGain(r2)
                return
        }

        public Builder(@androidx.annotation.NonNull androidx.media.AudioFocusRequestCompat r2) {
                r1 = this;
                r1.<init>()
                androidx.media.AudioAttributesCompat r0 = androidx.media.AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR
                r1.mAudioAttributesCompat = r0
                if (r2 == 0) goto L28
                int r0 = r2.getFocusGain()
                r1.mFocusGain = r0
                android.media.AudioManager$OnAudioFocusChangeListener r0 = r2.getOnAudioFocusChangeListener()
                r1.mOnAudioFocusChangeListener = r0
                android.os.Handler r0 = r2.getFocusChangeHandler()
                r1.mFocusChangeHandler = r0
                androidx.media.AudioAttributesCompat r0 = r2.getAudioAttributesCompat()
                r1.mAudioAttributesCompat = r0
                boolean r2 = r2.willPauseWhenDucked()
                r1.mPauseOnDuck = r2
                return
            L28:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "AudioFocusRequestCompat to copy must not be null"
                r2.<init>(r0)
                throw r2
        }

        private static boolean isValidFocusGain(int r2) {
                r0 = 1
                if (r2 == r0) goto Le
                r1 = 2
                if (r2 == r1) goto Le
                r1 = 3
                if (r2 == r1) goto Le
                r1 = 4
                if (r2 == r1) goto Le
                r2 = 0
                return r2
            Le:
                return r0
        }

        public androidx.media.AudioFocusRequestCompat build() {
                r7 = this;
                android.media.AudioManager$OnAudioFocusChangeListener r0 = r7.mOnAudioFocusChangeListener
                if (r0 == 0) goto L15
                androidx.media.AudioFocusRequestCompat r0 = new androidx.media.AudioFocusRequestCompat
                int r2 = r7.mFocusGain
                android.media.AudioManager$OnAudioFocusChangeListener r3 = r7.mOnAudioFocusChangeListener
                android.os.Handler r4 = r7.mFocusChangeHandler
                androidx.media.AudioAttributesCompat r5 = r7.mAudioAttributesCompat
                boolean r6 = r7.mPauseOnDuck
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L15:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Can't build an AudioFocusRequestCompat instance without a listener"
                r0.<init>(r1)
                throw r0
        }

        @androidx.annotation.NonNull
        public androidx.media.AudioFocusRequestCompat.Builder setAudioAttributes(@androidx.annotation.NonNull androidx.media.AudioAttributesCompat r2) {
                r1 = this;
                java.lang.String r0 = "Illegal null AudioAttributes"
                java.util.Objects.requireNonNull(r2, r0)
                r1.mAudioAttributesCompat = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.media.AudioFocusRequestCompat.Builder setFocusGain(int r3) {
                r2 = this;
                boolean r0 = isValidFocusGain(r3)
                if (r0 == 0) goto L9
                r2.mFocusGain = r3
                return r2
            L9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Illegal audio focus gain type "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
        }

        @androidx.annotation.NonNull
        public androidx.media.AudioFocusRequestCompat.Builder setOnAudioFocusChangeListener(@androidx.annotation.NonNull android.media.AudioManager.OnAudioFocusChangeListener r3) {
                r2 = this;
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                androidx.media.AudioFocusRequestCompat$Builder r3 = r2.setOnAudioFocusChangeListener(r3, r0)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.media.AudioFocusRequestCompat.Builder setOnAudioFocusChangeListener(@androidx.annotation.NonNull android.media.AudioManager.OnAudioFocusChangeListener r1, @androidx.annotation.NonNull android.os.Handler r2) {
                r0 = this;
                if (r1 == 0) goto L11
                if (r2 == 0) goto L9
                r0.mOnAudioFocusChangeListener = r1
                r0.mFocusChangeHandler = r2
                return r0
            L9:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Handler must not be null"
                r1.<init>(r2)
                throw r1
            L11:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "OnAudioFocusChangeListener must not be null"
                r1.<init>(r2)
                throw r1
        }

        @androidx.annotation.NonNull
        public androidx.media.AudioFocusRequestCompat.Builder setWillPauseWhenDucked(boolean r1) {
                r0 = this;
                r0.mPauseOnDuck = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class OnAudioFocusChangeListenerHandlerCompat implements android.os.Handler.Callback, android.media.AudioManager.OnAudioFocusChangeListener {
        private static final int FOCUS_CHANGE = 2782386;
        private final android.os.Handler mHandler;
        private final android.media.AudioManager.OnAudioFocusChangeListener mListener;

        public OnAudioFocusChangeListenerHandlerCompat(@androidx.annotation.NonNull android.media.AudioManager.OnAudioFocusChangeListener r1, @androidx.annotation.NonNull android.os.Handler r2) {
                r0 = this;
                r0.<init>()
                r0.mListener = r1
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = r2.getLooper()
                r1.<init>(r2, r0)
                r0.mHandler = r1
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 2782386(0x2a74b2, float:3.898953E-39)
                if (r0 != r1) goto L10
                android.media.AudioManager$OnAudioFocusChangeListener r0 = r2.mListener
                int r3 = r3.arg1
                r0.onAudioFocusChange(r3)
                r3 = 1
                return r3
            L10:
                r3 = 0
                return r3
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int r4) {
                r3 = this;
                android.os.Handler r0 = r3.mHandler
                r1 = 2782386(0x2a74b2, float:3.898953E-39)
                r2 = 0
                android.os.Message r4 = android.os.Message.obtain(r0, r1, r4, r2)
                r0.sendMessage(r4)
                return
        }
    }

    static {
            androidx.media.AudioAttributesCompat$Builder r0 = new androidx.media.AudioAttributesCompat$Builder
            r0.<init>()
            r1 = 1
            androidx.media.AudioAttributesCompat$Builder r0 = r0.setUsage(r1)
            androidx.media.AudioAttributesCompat r0 = r0.build()
            androidx.media.AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR = r0
            return
    }

    public AudioFocusRequestCompat(int r5, android.media.AudioManager.OnAudioFocusChangeListener r6, android.os.Handler r7, androidx.media.AudioAttributesCompat r8, boolean r9) {
            r4 = this;
            r4.<init>()
            r4.mFocusGain = r5
            r4.mFocusChangeHandler = r7
            r4.mAudioAttributesCompat = r8
            r4.mPauseOnDuck = r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L23
            android.os.Looper r2 = r7.getLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 == r3) goto L23
            androidx.media.AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat r2 = new androidx.media.AudioFocusRequestCompat$OnAudioFocusChangeListenerHandlerCompat
            r2.<init>(r6, r7)
            r4.mOnAudioFocusChangeListener = r2
            goto L25
        L23:
            r4.mOnAudioFocusChangeListener = r6
        L25:
            r6 = 0
            if (r0 < r1) goto L39
            if (r8 == 0) goto L30
            java.lang.Object r6 = r8.unwrap()
            android.media.AudioAttributes r6 = (android.media.AudioAttributes) r6
        L30:
            android.media.AudioManager$OnAudioFocusChangeListener r8 = r4.mOnAudioFocusChangeListener
            android.media.AudioFocusRequest r5 = androidx.media.AudioFocusRequestCompat.Api26Impl.createInstance(r5, r6, r9, r8, r7)
            r4.mFrameworkAudioFocusRequest = r5
            goto L3b
        L39:
            r4.mFrameworkAudioFocusRequest = r6
        L3b:
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.media.AudioFocusRequestCompat
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.media.AudioFocusRequestCompat r5 = (androidx.media.AudioFocusRequestCompat) r5
            int r1 = r4.mFocusGain
            int r3 = r5.mFocusGain
            if (r1 != r3) goto L37
            boolean r1 = r4.mPauseOnDuck
            boolean r3 = r5.mPauseOnDuck
            if (r1 != r3) goto L37
            android.media.AudioManager$OnAudioFocusChangeListener r1 = r4.mOnAudioFocusChangeListener
            android.media.AudioManager$OnAudioFocusChangeListener r3 = r5.mOnAudioFocusChangeListener
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
            if (r1 == 0) goto L37
            android.os.Handler r1 = r4.mFocusChangeHandler
            android.os.Handler r3 = r5.mFocusChangeHandler
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r3)
            if (r1 == 0) goto L37
            androidx.media.AudioAttributesCompat r1 = r4.mAudioAttributesCompat
            androidx.media.AudioAttributesCompat r5 = r5.mAudioAttributesCompat
            boolean r5 = androidx.core.util.ObjectsCompat.equals(r1, r5)
            if (r5 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.media.AudioAttributesCompat getAudioAttributesCompat() {
            r1 = this;
            androidx.media.AudioAttributesCompat r0 = r1.mAudioAttributesCompat
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    public final android.media.AudioFocusRequest getAudioFocusRequest() {
            r1 = this;
            java.lang.Object r0 = r1.mFrameworkAudioFocusRequest
            android.media.AudioFocusRequest r0 = (android.media.AudioFocusRequest) r0
            return r0
    }

    @androidx.annotation.NonNull
    public android.os.Handler getFocusChangeHandler() {
            r1 = this;
            android.os.Handler r0 = r1.mFocusChangeHandler
            return r0
    }

    public int getFocusGain() {
            r1 = this;
            int r0 = r1.mFocusGain
            return r0
    }

    @androidx.annotation.NonNull
    public android.media.AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
            r1 = this;
            android.media.AudioManager$OnAudioFocusChangeListener r0 = r1.mOnAudioFocusChangeListener
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.mFocusGain
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            android.media.AudioManager$OnAudioFocusChangeListener r1 = r3.mOnAudioFocusChangeListener
            r2 = 1
            r0[r2] = r1
            android.os.Handler r1 = r3.mFocusChangeHandler
            r2 = 2
            r0[r2] = r1
            androidx.media.AudioAttributesCompat r1 = r3.mAudioAttributesCompat
            r2 = 3
            r0[r2] = r1
            boolean r1 = r3.mPauseOnDuck
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            int r0 = androidx.core.util.ObjectsCompat.hash(r0)
            return r0
    }

    public boolean willPauseWhenDucked() {
            r1 = this;
            boolean r0 = r1.mPauseOnDuck
            return r0
    }
}
