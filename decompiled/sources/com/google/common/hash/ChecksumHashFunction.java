package com.google.common.hash;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.hash.ElementTypesAreNonnullByDefault
final class ChecksumHashFunction extends com.google.common.hash.AbstractHashFunction implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> checksumSupplier;
    private final java.lang.String toString;

    /* JADX INFO: renamed from: com.google.common.hash.ChecksumHashFunction$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class ChecksumHasher extends com.google.common.hash.AbstractByteHasher {
        private final java.util.zip.Checksum checksum;
        public final /* synthetic */ com.google.common.hash.ChecksumHashFunction this$0;

        private ChecksumHasher(com.google.common.hash.ChecksumHashFunction r1, java.util.zip.Checksum r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.zip.Checksum r1 = (java.util.zip.Checksum) r1
                r0.checksum = r1
                return
        }

        public /* synthetic */ ChecksumHasher(com.google.common.hash.ChecksumHashFunction r1, java.util.zip.Checksum r2, com.google.common.hash.ChecksumHashFunction.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.common.hash.Hasher
        public com.google.common.hash.HashCode hash() {
                r4 = this;
                java.util.zip.Checksum r0 = r4.checksum
                long r0 = r0.getValue()
                com.google.common.hash.ChecksumHashFunction r2 = r4.this$0
                int r2 = com.google.common.hash.ChecksumHashFunction.access$100(r2)
                r3 = 32
                if (r2 != r3) goto L16
                int r1 = (int) r0
                com.google.common.hash.HashCode r0 = com.google.common.hash.HashCode.fromInt(r1)
                return r0
            L16:
                com.google.common.hash.HashCode r0 = com.google.common.hash.HashCode.fromLong(r0)
                return r0
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(byte r2) {
                r1 = this;
                java.util.zip.Checksum r0 = r1.checksum
                r0.update(r2)
                return
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void update(byte[] r2, int r3, int r4) {
                r1 = this;
                java.util.zip.Checksum r0 = r1.checksum
                r0.update(r2, r3, r4)
                return
        }
    }

    public ChecksumHashFunction(com.google.common.hash.ImmutableSupplier r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.hash.ImmutableSupplier r3 = (com.google.common.hash.ImmutableSupplier) r3
            r2.checksumSupplier = r3
            r3 = 1
            java.lang.String r0 = "bits (%s) must be either 32 or 64"
            r1 = 32
            com.google.common.base.Preconditions.checkArgument(r3, r0, r1)
            r2.bits = r1
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r4)
            java.lang.String r3 = (java.lang.String) r3
            r2.toString = r3
            return
    }

    public static /* synthetic */ int access$100(com.google.common.hash.ChecksumHashFunction r0) {
            int r0 = r0.bits
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
            r3 = this;
            com.google.common.hash.ChecksumHashFunction$ChecksumHasher r0 = new com.google.common.hash.ChecksumHashFunction$ChecksumHasher
            com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum> r1 = r3.checksumSupplier
            java.lang.Object r1 = r1.get()
            java.util.zip.Checksum r1 = (java.util.zip.Checksum) r1
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.toString
            return r0
    }
}
