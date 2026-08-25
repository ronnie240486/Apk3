package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultContentMetadata implements com.google.android.exoplayer2.upstream.cache.ContentMetadata {
    public static final com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata EMPTY = null;
    private int hashCode;
    private final java.util.Map<java.lang.String, byte[]> metadata;

    static {
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r0 = new com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.<init>(r1)
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.EMPTY = r0
            return
    }

    public DefaultContentMetadata() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.<init>(r0)
            return
    }

    public DefaultContentMetadata(java.util.Map<java.lang.String, byte[]> r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.metadata = r1
            return
    }

    private static void addValues(java.util.HashMap<java.lang.String, byte[]> r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            byte[] r0 = getBytes(r0)
            r2.put(r1, r0)
            goto L8
        L26:
            return
    }

    private static java.util.Map<java.lang.String, byte[]> applyMutations(java.util.Map<java.lang.String, byte[]> r1, com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r2) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.List r1 = r2.getRemovedValues()
            removeValues(r0, r1)
            java.util.Map r1 = r2.getEditedValues()
            addValues(r0, r1)
            return r0
    }

    private static byte[] getBytes(java.lang.Object r3) {
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L19
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r1 = r3.longValue()
            java.nio.ByteBuffer r3 = r0.putLong(r1)
            byte[] r3 = r3.array()
            return r3
        L19:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L26
            java.lang.String r3 = (java.lang.String) r3
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            byte[] r3 = r3.getBytes(r0)
            return r3
        L26:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L2d
            byte[] r3 = (byte[]) r3
            return r3
        L2d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }

    private static boolean isMetadataEqual(java.util.Map<java.lang.String, byte[]> r3, java.util.Map<java.lang.String, byte[]> r4) {
            int r0 = r3.size()
            int r1 = r4.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r0 = r4.get(r0)
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L14
            return r2
        L37:
            r3 = 1
            return r3
    }

    private static void removeValues(java.util.HashMap<java.lang.String, byte[]> r2, java.util.List<java.lang.String> r3) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r3.get(r0)
            r2.remove(r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final boolean contains(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, byte[]> r0 = r1.metadata
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata copyWithMutationsApplied(com.google.android.exoplayer2.upstream.cache.ContentMetadataMutations r2) {
            r1 = this;
            java.util.Map<java.lang.String, byte[]> r0 = r1.metadata
            java.util.Map r2 = applyMutations(r0, r2)
            java.util.Map<java.lang.String, byte[]> r0 = r1.metadata
            boolean r0 = isMetadataEqual(r0, r2)
            if (r0 == 0) goto Lf
            return r1
        Lf:
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r0 = new com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata
            r0.<init>(r2)
            return r0
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, byte[]>> entrySet() {
            r1 = this;
            java.util.Map<java.lang.String, byte[]> r0 = r1.metadata
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata> r0 = com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            java.util.Map<java.lang.String, byte[]> r0 = r2.metadata
            com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata r3 = (com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata) r3
            java.util.Map<java.lang.String, byte[]> r3 = r3.metadata
            boolean r3 = isMetadataEqual(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    public final long get(java.lang.String r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.String, byte[]> r0 = r1.metadata
            java.lang.Object r2 = r0.get(r2)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L13
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            long r2 = r2.getLong()
            return r2
        L13:
            return r3
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @androidx.annotation.Nullable
    public final java.lang.String get(java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, byte[]> r0 = r1.metadata
            java.lang.Object r2 = r0.get(r2)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L11
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r0 = com.google.common.base.Charsets.UTF_8
            r3.<init>(r2, r0)
        L11:
            return r3
    }

    @Override // com.google.android.exoplayer2.upstream.cache.ContentMetadata
    @androidx.annotation.Nullable
    public final byte[] get(java.lang.String r2, @androidx.annotation.Nullable byte[] r3) {
            r1 = this;
            java.util.Map<java.lang.String, byte[]> r0 = r1.metadata
            java.lang.Object r2 = r0.get(r2)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L10
            int r3 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            return r2
        L10:
            return r3
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.hashCode
            if (r0 != 0) goto L34
            r0 = 0
            java.util.Map<java.lang.String, byte[]> r1 = r4.metadata
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            java.lang.Object r2 = r2.getValue()
            byte[] r2 = (byte[]) r2
            int r2 = java.util.Arrays.hashCode(r2)
            r2 = r2 ^ r3
            int r0 = r0 + r2
            goto Lf
        L32:
            r4.hashCode = r0
        L34:
            int r0 = r4.hashCode
            return r0
    }
}
