package com.google.android.exoplayer2.metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.Metadata> CREATOR = null;
    private final com.google.android.exoplayer2.metadata.Metadata.Entry[] entries;
    public final long presentationTimeUs;


    /* JADX INFO: loaded from: classes.dex */
    public interface Entry extends android.os.Parcelable {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.Metadata$Entry$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes3.dex */
        public final /* synthetic */ class CC {
            @androidx.annotation.Nullable
            public static byte[] $default$getWrappedMetadataBytes(com.google.android.exoplayer2.metadata.Metadata.Entry r0) {
                    r0 = 0
                    return r0
            }

            @androidx.annotation.Nullable
            public static com.google.android.exoplayer2.Format $default$getWrappedMetadataFormat(com.google.android.exoplayer2.metadata.Metadata.Entry r0) {
                    r0 = 0
                    return r0
            }

            public static void $default$populateMediaMetadata(com.google.android.exoplayer2.metadata.Metadata.Entry r0, com.google.android.exoplayer2.MediaMetadata.Builder r1) {
                    return
            }
        }

        @androidx.annotation.Nullable
        byte[] getWrappedMetadataBytes();

        @androidx.annotation.Nullable
        com.google.android.exoplayer2.Format getWrappedMetadataFormat();

        void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r1);
    }

    static {
            com.google.android.exoplayer2.metadata.Metadata$1 r0 = new com.google.android.exoplayer2.metadata.Metadata$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.Metadata.CREATOR = r0
            return
    }

    public Metadata(long r2, java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry> r4) {
            r1 = this;
            r0 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r4 = (com.google.android.exoplayer2.metadata.Metadata.Entry[]) r4
            r1.<init>(r2, r4)
            return
    }

    public Metadata(long r1, com.google.android.exoplayer2.metadata.Metadata.Entry... r3) {
            r0 = this;
            r0.<init>()
            r0.presentationTimeUs = r1
            r0.entries = r3
            return
    }

    public Metadata(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            r3.entries = r0
            r0 = 0
        Lc:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r3.entries
            int r2 = r1.length
            if (r0 >= r2) goto L22
            java.lang.Class<com.google.android.exoplayer2.metadata.Metadata$Entry> r2 = com.google.android.exoplayer2.metadata.Metadata.Entry.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r4.readParcelable(r2)
            com.google.android.exoplayer2.metadata.Metadata$Entry r2 = (com.google.android.exoplayer2.metadata.Metadata.Entry) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lc
        L22:
            long r0 = r4.readLong()
            r3.presentationTimeUs = r0
            return
    }

    public Metadata(java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry> r2) {
            r1 = this;
            r0 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = (com.google.android.exoplayer2.metadata.Metadata.Entry[]) r2
            r1.<init>(r2)
            return
    }

    public Metadata(com.google.android.exoplayer2.metadata.Metadata.Entry... r3) {
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.<init>(r0, r3)
            return
    }

    public com.google.android.exoplayer2.metadata.Metadata copyWithAppendedEntries(com.google.android.exoplayer2.metadata.Metadata.Entry... r5) {
            r4 = this;
            int r0 = r5.length
            if (r0 != 0) goto L4
            return r4
        L4:
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            long r1 = r4.presentationTimeUs
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = r4.entries
            java.lang.Object[] r5 = com.google.android.exoplayer2.util.Util.nullSafeArrayConcatenation(r3, r5)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r5 = (com.google.android.exoplayer2.metadata.Metadata.Entry[]) r5
            r0.<init>(r1, r5)
            return r0
    }

    public com.google.android.exoplayer2.metadata.Metadata copyWithAppendedEntriesFrom(@androidx.annotation.Nullable com.google.android.exoplayer2.metadata.Metadata r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return r0
        L3:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r1.entries
            com.google.android.exoplayer2.metadata.Metadata r1 = r0.copyWithAppendedEntries(r1)
            return r1
    }

    public com.google.android.exoplayer2.metadata.Metadata copyWithPresentationTimeUs(long r4) {
            r3 = this;
            long r0 = r3.presentationTimeUs
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L7
            return r3
        L7:
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r3.entries
            r0.<init>(r4, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L27
            java.lang.Class<com.google.android.exoplayer2.metadata.Metadata> r2 = com.google.android.exoplayer2.metadata.Metadata.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.exoplayer2.metadata.Metadata r7 = (com.google.android.exoplayer2.metadata.Metadata) r7
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = r6.entries
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = r7.entries
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L25
            long r2 = r6.presentationTimeUs
            long r4 = r7.presentationTimeUs
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
        L27:
            return r1
    }

    public com.google.android.exoplayer2.metadata.Metadata.Entry get(int r2) {
            r1 = this;
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = r1.entries
            r2 = r0[r2]
            return r2
    }

    public int hashCode() {
            r3 = this;
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = r3.entries
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.presentationTimeUs
            int r1 = com.google.common.primitives.Longs.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public int length() {
            r1 = this;
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r0 = r1.entries
            int r0 = r0.length
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = "entries="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r6.entries
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            long r1 = r6.presentationTimeUs
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1d
            java.lang.String r1 = ""
            goto L2c
        L1d:
            java.lang.String r1 = ", presentationTimeUs="
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            long r2 = r6.presentationTimeUs
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = r4.entries
            int r6 = r6.length
            r5.writeInt(r6)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = r4.entries
            int r0 = r6.length
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto Lb
        L15:
            long r0 = r4.presentationTimeUs
            r5.writeLong(r0)
            return
    }
}
