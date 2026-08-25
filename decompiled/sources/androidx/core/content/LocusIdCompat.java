package androidx.core.content;

/* JADX INFO: loaded from: classes3.dex */
public final class LocusIdCompat {
    private final java.lang.String mId;
    private final android.content.LocusId mWrapped;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public static android.content.LocusId create(@androidx.annotation.NonNull java.lang.String r1) {
                android.content.LocusId r0 = new android.content.LocusId
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public static java.lang.String getId(@androidx.annotation.NonNull android.content.LocusId r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }
    }

    public LocusIdCompat(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "id cannot be empty"
            java.lang.CharSequence r0 = androidx.core.util.Preconditions.checkStringNotEmpty(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.mId = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1a
            android.content.LocusId r3 = androidx.core.content.LocusIdCompat.Api29Impl.create(r3)
            r2.mWrapped = r3
            goto L1d
        L1a:
            r3 = 0
            r2.mWrapped = r3
        L1d:
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String getSanitizedId() {
            r2 = this;
            java.lang.String r0 = r2.mId
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_chars"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(29)
    public static androidx.core.content.LocusIdCompat toLocusIdCompat(@androidx.annotation.NonNull android.content.LocusId r2) {
            java.lang.String r0 = "locusId cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            androidx.core.content.LocusIdCompat r0 = new androidx.core.content.LocusIdCompat
            java.lang.String r2 = androidx.core.content.LocusIdCompat.Api29Impl.getId(r2)
            java.lang.String r1 = "id cannot be empty"
            java.lang.CharSequence r2 = androidx.core.util.Preconditions.checkStringNotEmpty(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r2)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<androidx.core.content.LocusIdCompat> r2 = androidx.core.content.LocusIdCompat.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            androidx.core.content.LocusIdCompat r5 = (androidx.core.content.LocusIdCompat) r5
            java.lang.String r2 = r4.mId
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.mId
            if (r5 != 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            java.lang.String r5 = r5.mId
            boolean r5 = r2.equals(r5)
            return r5
    }

    @androidx.annotation.NonNull
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.mId
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r1 = r1 + r0
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(29)
    public android.content.LocusId toLocusId() {
            r1 = this;
            android.content.LocusId r0 = r1.mWrapped
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "LocusIdCompat["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r3.getSanitizedId()
            java.lang.String r2 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
