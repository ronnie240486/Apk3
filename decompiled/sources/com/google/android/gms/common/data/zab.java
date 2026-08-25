package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zab extends com.google.android.gms.common.data.DataHolder.Builder {
    public zab(java.lang.String[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cannot add data to empty builder"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cannot add data to empty builder"
            r2.<init>(r0)
            throw r2
    }
}
