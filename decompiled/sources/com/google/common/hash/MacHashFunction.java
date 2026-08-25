package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class MacHashFunction extends com.google.common.hash.AbstractHashFunction {
    private final int bits;
    private final java.security.Key key;
    private final javax.crypto.Mac prototype;
    private final boolean supportsClone;
    private final java.lang.String toString;

    /* JADX INFO: renamed from: com.google.common.hash.MacHashFunction$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class MacHasher extends com.google.common.hash.AbstractByteHasher {
        private boolean done;
        private final javax.crypto.Mac mac;

        private MacHasher(javax.crypto.Mac r1) {
                r0 = this;
                r0.<init>()
                r0.mac = r1
                return
        }

        public /* synthetic */ MacHasher(javax.crypto.Mac r1, com.google.common.hash.MacHashFunction.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void checkNotDone() {
                r2 = this;
                boolean r0 = r2.done
                r0 = r0 ^ 1
                java.lang.String r1 = "Cannot re-use a Hasher after calling hash() on it"
                com.google.common.base.Preconditions.checkState(r0, r1)
                return
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
                r2 = this;
                r2.checkNotDone()
                r0 = 1
                r2.done = r0
                javax.crypto.Mac r0 = r2.mac
                byte[] r0 = r0.doFinal()
                int r1 = com.google.common.hash.HashCode.$r8$clinit
                com.google.common.hash.HashCode$BytesHashCode r1 = new com.google.common.hash.HashCode$BytesHashCode
                r1.<init>(r0)
                return r1
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(byte r2) {
                r1 = this;
                r1.checkNotDone()
                javax.crypto.Mac r0 = r1.mac
                r0.update(r2)
                return
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.checkNotDone()
                com.google.common.base.Preconditions.checkNotNull(r2)
                javax.crypto.Mac r0 = r1.mac
                r0.update(r2)
                return
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(byte[] r2) {
                r1 = this;
                r1.checkNotDone()
                javax.crypto.Mac r0 = r1.mac
                r0.update(r2)
                return
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(byte[] r2, int r3, int r4) {
                r1 = this;
                r1.checkNotDone()
                javax.crypto.Mac r0 = r1.mac
                r0.update(r2, r3, r4)
                return
        }
    }

    public MacHashFunction(java.lang.String r1, java.security.Key r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            javax.crypto.Mac r1 = getMac(r1, r2)
            r0.prototype = r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.security.Key r2 = (java.security.Key) r2
            r0.key = r2
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.String r2 = (java.lang.String) r2
            r0.toString = r2
            int r2 = r1.getMacLength()
            int r2 = r2 * 8
            r0.bits = r2
            boolean r1 = supportsClone(r1)
            r0.supportsClone = r1
            return
    }

    private static javax.crypto.Mac getMac(java.lang.String r0, java.security.Key r1) {
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r0)     // Catch: java.security.InvalidKeyException -> L8 java.security.NoSuchAlgorithmException -> Lf
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L8 java.security.NoSuchAlgorithmException -> Lf
            return r0
        L8:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        Lf:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    private static boolean supportsClone(javax.crypto.Mac r0) {
            r0.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
            r1 = this;
            int r0 = r1.bits
            return r0
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r4 = this;
            boolean r0 = r4.supportsClone
            r1 = 0
            if (r0 == 0) goto L13
            com.google.common.hash.MacHashFunction$MacHasher r0 = new com.google.common.hash.MacHashFunction$MacHasher     // Catch: java.lang.CloneNotSupportedException -> L13
            javax.crypto.Mac r2 = r4.prototype     // Catch: java.lang.CloneNotSupportedException -> L13
            java.lang.Object r2 = r2.clone()     // Catch: java.lang.CloneNotSupportedException -> L13
            javax.crypto.Mac r2 = (javax.crypto.Mac) r2     // Catch: java.lang.CloneNotSupportedException -> L13
            r0.<init>(r2, r1)     // Catch: java.lang.CloneNotSupportedException -> L13
            return r0
        L13:
            com.google.common.hash.MacHashFunction$MacHasher r0 = new com.google.common.hash.MacHashFunction$MacHasher
            javax.crypto.Mac r2 = r4.prototype
            java.lang.String r2 = r2.getAlgorithm()
            java.security.Key r3 = r4.key
            javax.crypto.Mac r2 = getMac(r2, r3)
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toString
            return r0
    }
}
