package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements java.lang.Comparable<com.google.android.exoplayer2.offline.StreamKey>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.offline.StreamKey> CREATOR = null;
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;

    @java.lang.Deprecated
    public final int trackIndex;


    static {
            com.google.android.exoplayer2.offline.StreamKey$1 r0 = new com.google.android.exoplayer2.offline.StreamKey$1
            r0.<init>()
            com.google.android.exoplayer2.offline.StreamKey.CREATOR = r0
            return
    }

    public StreamKey(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public StreamKey(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.periodIndex = r1
            r0.groupIndex = r2
            r0.streamIndex = r3
            r0.trackIndex = r3
            return
    }

    public StreamKey(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.periodIndex = r0
            int r0 = r2.readInt()
            r1.groupIndex = r0
            int r2 = r2.readInt()
            r1.streamIndex = r2
            r1.trackIndex = r2
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.google.android.exoplayer2.offline.StreamKey r3) {
            r2 = this;
            int r0 = r2.periodIndex
            int r1 = r3.periodIndex
            int r0 = r0 - r1
            if (r0 != 0) goto L13
            int r0 = r2.groupIndex
            int r1 = r3.groupIndex
            int r0 = r0 - r1
            if (r0 != 0) goto L13
            int r0 = r2.streamIndex
            int r3 = r3.streamIndex
            int r0 = r0 - r3
        L13:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.android.exoplayer2.offline.StreamKey r1) {
            r0 = this;
            com.google.android.exoplayer2.offline.StreamKey r1 = (com.google.android.exoplayer2.offline.StreamKey) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<com.google.android.exoplayer2.offline.StreamKey> r2 = com.google.android.exoplayer2.offline.StreamKey.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.exoplayer2.offline.StreamKey r5 = (com.google.android.exoplayer2.offline.StreamKey) r5
            int r2 = r4.periodIndex
            int r3 = r5.periodIndex
            if (r2 != r3) goto L25
            int r2 = r4.groupIndex
            int r3 = r5.groupIndex
            if (r2 != r3) goto L25
            int r2 = r4.streamIndex
            int r5 = r5.streamIndex
            if (r2 != r5) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
        L27:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.periodIndex
            int r0 = r0 * 31
            int r1 = r2.groupIndex
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.streamIndex
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.periodIndex
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            int r2 = r3.groupIndex
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.streamIndex
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.periodIndex
            r1.writeInt(r2)
            int r2 = r0.groupIndex
            r1.writeInt(r2)
            int r2 = r0.streamIndex
            r1.writeInt(r2)
            return
    }
}
