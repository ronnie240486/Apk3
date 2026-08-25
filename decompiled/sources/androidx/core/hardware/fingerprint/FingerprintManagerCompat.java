package androidx.core.hardware.fingerprint;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class FingerprintManagerCompat {
    private final android.content.Context mContext;


    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
        @androidx.annotation.DoNotInline
        public static void authenticate(java.lang.Object r6, java.lang.Object r7, android.os.CancellationSignal r8, int r9, java.lang.Object r10, android.os.Handler r11) {
                r0 = r6
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                r1 = r7
                android.hardware.fingerprint.FingerprintManager$CryptoObject r1 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r1
                r4 = r10
                android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r4 = (android.hardware.fingerprint.FingerprintManager.AuthenticationCallback) r4
                r2 = r8
                r3 = r9
                r5 = r11
                r0.authenticate(r1, r2, r3, r4, r5)
                return
        }

        @androidx.annotation.DoNotInline
        public static android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager$AuthenticationResult r0 = (android.hardware.fingerprint.FingerprintManager.AuthenticationResult) r0
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = r0.getCryptoObject()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(android.content.Context r2) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 != r1) goto Lf
                java.lang.Class<android.hardware.fingerprint.FingerprintManager> r0 = android.hardware.fingerprint.FingerprintManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                android.hardware.fingerprint.FingerprintManager r2 = (android.hardware.fingerprint.FingerprintManager) r2
                return r2
            Lf:
                if (r0 <= r1) goto L26
                android.content.pm.PackageManager r0 = r2.getPackageManager()
                java.lang.String r1 = "android.hardware.fingerprint"
                boolean r0 = r0.hasSystemFeature(r1)
                if (r0 == 0) goto L26
                java.lang.Class<android.hardware.fingerprint.FingerprintManager> r0 = android.hardware.fingerprint.FingerprintManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                android.hardware.fingerprint.FingerprintManager r2 = (android.hardware.fingerprint.FingerprintManager) r2
                return r2
            L26:
                r2 = 0
                return r2
        }

        @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
        @androidx.annotation.DoNotInline
        public static boolean hasEnrolledFingerprints(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.hasEnrolledFingerprints()
                return r0
        }

        @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
        @androidx.annotation.DoNotInline
        public static boolean isHardwareDetected(java.lang.Object r0) {
                android.hardware.fingerprint.FingerprintManager r0 = (android.hardware.fingerprint.FingerprintManager) r0
                boolean r0 = r0.isHardwareDetected()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject unwrapCryptoObject(java.lang.Object r2) {
                android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = (android.hardware.fingerprint.FingerprintManager.CryptoObject) r2
                r0 = 0
                if (r2 != 0) goto L6
                return r0
            L6:
                javax.crypto.Cipher r1 = r2.getCipher()
                if (r1 == 0) goto L16
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                javax.crypto.Cipher r2 = r2.getCipher()
                r0.<init>(r2)
                return r0
            L16:
                java.security.Signature r1 = r2.getSignature()
                if (r1 == 0) goto L26
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                java.security.Signature r2 = r2.getSignature()
                r0.<init>(r2)
                return r0
            L26:
                javax.crypto.Mac r1 = r2.getMac()
                if (r1 == 0) goto L35
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject
                javax.crypto.Mac r2 = r2.getMac()
                r0.<init>(r2)
            L35:
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r2) {
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                javax.crypto.Cipher r1 = r2.getCipher()
                if (r1 == 0) goto L14
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Cipher r2 = r2.getCipher()
                r0.<init>(r2)
                return r0
            L14:
                java.security.Signature r1 = r2.getSignature()
                if (r1 == 0) goto L24
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                java.security.Signature r2 = r2.getSignature()
                r0.<init>(r2)
                return r0
            L24:
                javax.crypto.Mac r1 = r2.getMac()
                if (r1 == 0) goto L33
                android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = new android.hardware.fingerprint.FingerprintManager$CryptoObject
                javax.crypto.Mac r2 = r2.getMac()
                r0.<init>(r2)
            L33:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class AuthenticationCallback {
        public AuthenticationCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onAuthenticationError(int r1, java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        public void onAuthenticationFailed() {
                r0 = this;
                return
        }

        public void onAuthenticationHelp(int r1, java.lang.CharSequence r2) {
                r0 = this;
                return
        }

        public void onAuthenticationSucceeded(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class AuthenticationResult {
        private final androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject mCryptoObject;

        public AuthenticationResult(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r1) {
                r0 = this;
                r0.<init>()
                r0.mCryptoObject = r1
                return
        }

        public androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject getCryptoObject() {
                r1 = this;
                androidx.core.hardware.fingerprint.FingerprintManagerCompat$CryptoObject r0 = r1.mCryptoObject
                return r0
        }
    }

    public static class CryptoObject {
        private final javax.crypto.Cipher mCipher;
        private final javax.crypto.Mac mMac;
        private final java.security.Signature mSignature;

        public CryptoObject(@androidx.annotation.NonNull java.security.Signature r1) {
                r0 = this;
                r0.<init>()
                r0.mSignature = r1
                r1 = 0
                r0.mCipher = r1
                r0.mMac = r1
                return
        }

        public CryptoObject(@androidx.annotation.NonNull javax.crypto.Cipher r1) {
                r0 = this;
                r0.<init>()
                r0.mCipher = r1
                r1 = 0
                r0.mSignature = r1
                r0.mMac = r1
                return
        }

        public CryptoObject(@androidx.annotation.NonNull javax.crypto.Mac r1) {
                r0 = this;
                r0.<init>()
                r0.mMac = r1
                r1 = 0
                r0.mCipher = r1
                r0.mSignature = r1
                return
        }

        @androidx.annotation.Nullable
        public javax.crypto.Cipher getCipher() {
                r1 = this;
                javax.crypto.Cipher r0 = r1.mCipher
                return r0
        }

        @androidx.annotation.Nullable
        public javax.crypto.Mac getMac() {
                r1 = this;
                javax.crypto.Mac r0 = r1.mMac
                return r0
        }

        @androidx.annotation.Nullable
        public java.security.Signature getSignature() {
                r1 = this;
                java.security.Signature r0 = r1.mSignature
                return r0
        }
    }

    private FingerprintManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.hardware.fingerprint.FingerprintManagerCompat from(@androidx.annotation.NonNull android.content.Context r1) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(23)
    private static android.hardware.fingerprint.FingerprintManager getFingerprintManagerOrNull(@androidx.annotation.NonNull android.content.Context r0) {
            android.hardware.fingerprint.FingerprintManager r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.getFingerprintManagerOrNull(r0)
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    private static android.hardware.fingerprint.FingerprintManager.AuthenticationCallback wrapCallback(androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r1) {
            androidx.core.hardware.fingerprint.FingerprintManagerCompat$1 r0 = new androidx.core.hardware.fingerprint.FingerprintManagerCompat$1
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    private static android.hardware.fingerprint.FingerprintManager.CryptoObject wrapCryptoObject(androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r0) {
            android.hardware.fingerprint.FingerprintManager$CryptoObject r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.wrapCryptoObject(r0)
            return r0
    }

    @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public void authenticate(@androidx.annotation.Nullable androidx.core.hardware.fingerprint.FingerprintManagerCompat.CryptoObject r8, int r9, @androidx.annotation.Nullable androidx.core.os.CancellationSignal r10, @androidx.annotation.NonNull androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback r11, @androidx.annotation.Nullable android.os.Handler r12) {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L26
            android.content.Context r0 = r7.mContext
            android.hardware.fingerprint.FingerprintManager r1 = getFingerprintManagerOrNull(r0)
            if (r1 == 0) goto L26
            if (r10 == 0) goto L17
            java.lang.Object r10 = r10.getCancellationSignalObject()
            android.os.CancellationSignal r10 = (android.os.CancellationSignal) r10
            goto L18
        L17:
            r10 = 0
        L18:
            r3 = r10
            android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = wrapCryptoObject(r8)
            android.hardware.fingerprint.FingerprintManager$AuthenticationCallback r5 = wrapCallback(r11)
            r4 = r9
            r6 = r12
            androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.authenticate(r1, r2, r3, r4, r5, r6)
        L26:
            return
    }

    @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean hasEnrolledFingerprints() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L16
            android.content.Context r0 = r3.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L16
            boolean r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.hasEnrolledFingerprints(r0)
            if (r0 == 0) goto L16
            r1 = 1
        L16:
            return r1
    }

    @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean isHardwareDetected() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L16
            android.content.Context r0 = r3.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L16
            boolean r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.isHardwareDetected(r0)
            if (r0 == 0) goto L16
            r1 = 1
        L16:
            return r1
    }
}
