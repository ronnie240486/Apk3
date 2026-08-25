package com.google.common.hash;

/* JADX INFO: loaded from: classes2.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class MessageDigestHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private final int bytes;
    private final java.security.MessageDigest prototype;
    private final boolean supportsClone;
    private final java.lang.String toString;

    /* JADX INFO: renamed from: com.google.common.hash.MessageDigestHashFunction$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class MessageDigestHasher extends com.google.common.hash.AbstractByteHasher {
        private final int bytes;
        private final java.security.MessageDigest digest;
        private boolean done;

        private MessageDigestHasher(java.security.MessageDigest r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.digest = r1
                r0.bytes = r2
                return
        }

        public /* synthetic */ MessageDigestHasher(java.security.MessageDigest r1, int r2, com.google.common.hash.MessageDigestHashFunction.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
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
                int r0 = r2.bytes
                java.security.MessageDigest r1 = r2.digest
                int r1 = r1.getDigestLength()
                if (r0 != r1) goto L1e
                java.security.MessageDigest r0 = r2.digest
                byte[] r0 = r0.digest()
                int r1 = com.google.common.hash.HashCode.$r8$clinit
                com.google.common.hash.HashCode$BytesHashCode r1 = new com.google.common.hash.HashCode$BytesHashCode
                r1.<init>(r0)
                goto L31
            L1e:
                java.security.MessageDigest r0 = r2.digest
                byte[] r0 = r0.digest()
                int r1 = r2.bytes
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                int r1 = com.google.common.hash.HashCode.$r8$clinit
                com.google.common.hash.HashCode$BytesHashCode r1 = new com.google.common.hash.HashCode$BytesHashCode
                r1.<init>(r0)
            L31:
                return r1
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(byte r2) {
                r1 = this;
                r1.checkNotDone()
                java.security.MessageDigest r0 = r1.digest
                r0.update(r2)
                return
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(java.nio.ByteBuffer r2) {
                r1 = this;
                r1.checkNotDone()
                java.security.MessageDigest r0 = r1.digest
                r0.update(r2)
                return
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(byte[] r2, int r3, int r4) {
                r1 = this;
                r1.checkNotDone()
                java.security.MessageDigest r0 = r1.digest
                r0.update(r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.String algorithmName;
        private final int bytes;
        private final java.lang.String toString;

        private SerializedForm(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.algorithmName = r1
                r0.bytes = r2
                r0.toString = r3
                return
        }

        private java.lang.Object readResolve() {
                r4 = this;
                com.google.common.hash.MessageDigestHashFunction r0 = new com.google.common.hash.MessageDigestHashFunction
                java.lang.String r1 = r4.algorithmName
                int r2 = r4.bytes
                java.lang.String r3 = r4.toString
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    public MessageDigestHashFunction(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            r2.toString = r5
            java.security.MessageDigest r3 = getMessageDigest(r3)
            r2.prototype = r3
            int r5 = r3.getDigestLength()
            r0 = 4
            if (r4 < r0) goto L1c
            if (r4 > r5) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            java.lang.String r1 = "bytes (%s) must be >= 4 and < %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r4, r5)
            r2.bytes = r4
            boolean r3 = supportsClone(r3)
            r2.supportsClone = r3
            return
    }

    public MessageDigestHashFunction(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.security.MessageDigest r2 = getMessageDigest(r2)
            r1.prototype = r2
            int r0 = r2.getDigestLength()
            r1.bytes = r0
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.toString = r3
            boolean r2 = supportsClone(r2)
            r1.supportsClone = r2
            return
    }

    private static java.security.MessageDigest getMessageDigest(java.lang.String r1) {
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    private static boolean supportsClone(java.security.MessageDigest r0) {
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
            int r0 = r1.bytes
            int r0 = r0 * 8
            return r0
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
            r4 = this;
            boolean r0 = r4.supportsClone
            r1 = 0
            if (r0 == 0) goto L15
            com.google.common.hash.MessageDigestHashFunction$MessageDigestHasher r0 = new com.google.common.hash.MessageDigestHashFunction$MessageDigestHasher     // Catch: java.lang.CloneNotSupportedException -> L15
            java.security.MessageDigest r2 = r4.prototype     // Catch: java.lang.CloneNotSupportedException -> L15
            java.lang.Object r2 = r2.clone()     // Catch: java.lang.CloneNotSupportedException -> L15
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2     // Catch: java.lang.CloneNotSupportedException -> L15
            int r3 = r4.bytes     // Catch: java.lang.CloneNotSupportedException -> L15
            r0.<init>(r2, r3, r1)     // Catch: java.lang.CloneNotSupportedException -> L15
            return r0
        L15:
            com.google.common.hash.MessageDigestHashFunction$MessageDigestHasher r0 = new com.google.common.hash.MessageDigestHashFunction$MessageDigestHasher
            java.security.MessageDigest r2 = r4.prototype
            java.lang.String r2 = r2.getAlgorithm()
            java.security.MessageDigest r2 = getMessageDigest(r2)
            int r3 = r4.bytes
            r0.<init>(r2, r3, r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toString
            return r0
    }
}
